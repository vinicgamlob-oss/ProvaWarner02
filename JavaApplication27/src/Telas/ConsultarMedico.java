/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Telas;

import dal.moduloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinicius
 */
public class ConsultarMedico extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarMedico
     */
    public ConsultarMedico() {
         initComponents();
        conexao = moduloConexao.connector();
        populaTable();
    }

        
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
     public void populaTable (){
    
        String sql = "SELECT * FROM medicos";

try {
    pst = conexao.prepareStatement(sql);
    rs = pst.executeQuery();

    // Pegando o modelo da sua tabela Tbtelinha
    DefaultTableModel model = (DefaultTableModel) tbConsultarMedico.getModel();
    
    // Limpa a tabela antes de preencher para não duplicar dados
    model.setNumRows(0);

    while (rs.next()) {
        
        model.addRow(new Object[]{
            rs.getString("id_medico"),      
            rs.getString("nome"),
            rs.getString("especialidade"),
        });
    }

} catch (Exception e) {
    // Usando o JOptionPane que corrigimos antes
    JOptionPane.showMessageDialog(null, "Erro ao carregar tabela: " + e);
}
    
        
    
    
    }
     
     public void deletar() {
    // No DELETE não se usa o "*"
    String sql = "DELETE FROM medico WHERE id_medico = ?";
    
    try {
        pst = conexao.prepareStatement(sql);
        pst.setString(1, txtIDmedico.getText());
        
        // Para comandos que alteram o banco (DELETE, UPDATE, INSERT), use executeUpdate
        int apagado = pst.executeUpdate();
        
        if (apagado > 0) {
            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!");
            // Limpa o campo após deletar
            txtIDmedico.setText(null);
            populaTable();
        }
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultarMedico = new javax.swing.JTable();
        btnDeletarMedico = new javax.swing.JButton();
        txtIDmedico = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Medico");

        tbConsultarMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbConsultarMedico);

        btnDeletarMedico.setText("Deletar");
        btnDeletarMedico.addActionListener(this::btnDeletarMedicoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIDmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletarMedico))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletarMedico)
                    .addComponent(txtIDmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbConsultarMedico;
    private javax.swing.JTextField txtIDmedico;
    // End of variables declaration//GEN-END:variables
}
