# 🚀 SISMED - Sistema Integrado de Gerenciamento para Clínicas Médicas


## Autores
* Ana Beatriz de Oliveira Elias 
* Elisa da Silva Ortiz de Godoy 
* Guilherme Paiva Bueno de Aquino 
* Larissa dos Santos Oliveira 
* Vinícius Gama Bittencourt Lobo  

## Sobre o Projeto

Sismed : Sistema Integrado de Gerenciamento para Clínicas Médicas

Uma solução completa e intuitiva desenvolvida para otimizar a gestão operacional de clínicas e consultórios de saúde. O software centraliza o controle de fluxos essenciais — como agendamento de consultas, históricos de atendimentos e gestão de pessoal — garantindo segurança de dados através de um sistema de autenticação robusto. Com foco na experiência do usuário, a plataforma conta com interfaces independentes e dedicadas para cada módulo, simplificando o cotidiano de secretários, médicos e administradores.

## ⚙️ Funcionalidades

- [ ] **Sistema de Autenticação:** Login seguro para controle de acesso de usuários e funcionários.
- [ ] **Interfaces Independentes:** Telas dedicadas e exclusivas para cada módulo do sistema, melhorando a usabilidade.
- [ ] **Gerenciamento de Pacientes (CRUD):** Cadastro, consulta, atualização e exclusão de dados pessoais e históricos dos pacientes.
- [ ] **Gerenciamento de Funcionários e Médicos (CRUD):** Cadastro e controle completo de profissionais da saúde e equipe administrativa.
- [ ] **Controle de Usuários (CRUD):** Administração de perfis com acesso ao sistema.
- [ ] **Agendamento e Consulta de Horários:** Painel dinâmico para visualizar a agenda médica e marcar consultas de forma organizada.
- [ ] **Módulo de Busca Avançada:** Telas específicas para a consulta rápida de pacientes, médicos, horários e usuários cadastrados.

## 🛠️ Tecnologias Utilizadas

As principais ferramentas e linguagens usadas no desenvolvimento:

- **Linguagem:** Java
- **Interface Gráfica (GUI):** Java Swing
- **Banco de Dados:** MySQL
- **Ambiente de Desenvolvimento (IDE):** NetBeans


## 🚀 Como Executar o Projeto

### Pré-requisitos

* [Git](https://git-scm.com) 
* [Apache NetBeans IDE](https://netbeans.apache.org/) 
* [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) (Versão 17 ou superior, necessária para compilar o Java)
* [MySQL Server](https://dev.mysql.com/downloads/installer/) 


### 🤖 Passo a Passo

1. **Clonando o Repositório:**
 * Acesse o [LINK](https://github.com/vinicgamlob-oss/ProvaWarner02) e  clone o repositorio
2. **Abra o Apache NetBeans IDE**.
 * No menu superior, vá em **File (Arquivo)** > **Open Project (Abrir Projeto)**.
 * Navegue até a pasta onde você clonou o repositório e selecione o projeto **JavaApplication27**.

3. **Configuração do Banco de Dados (MySQL):**
 * Certifique-se de que o seu serviço do MySQL Server esteja ativo. 
 * Abra o seu gerenciador de banco de dados de preferência (MySQL Workbench, phpMyAdmin ou o próprio terminal).
 * Importe e execute o script SQL que está localizado na pasta `/BancoDeDadosSql` deste repositório para criar o banco e as tabelas da clínica automaticamente.
 * Se necessário, abra a classe de conexão no NetBeans e altere o usuário e a senha para corresponderem às credenciais do seu MySQL local.
4. **Iniciando o Sistema**:
   *  Pressione **F6** ou clique no botão **Run (Executar)** no topo da IDE para iniciar o sistema da clínica.