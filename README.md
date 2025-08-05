# 🧑‍💻 Sistema de Gerenciamento de Usuários (Console)

Este projeto é um sistema simples de gerenciamento de usuários via terminal, utilizando Java com JDBC para conexão com um banco de dados **MySQL**. A aplicação permite cadastrar e visualizar usuários.

---

## 📁 Estrutura do Projeto

src/
├── org.example/
│ ├── Main.java # Classe principal que executa o sistema
│ ├── UsuarioDAO.java # Classe de acesso ao banco de dados
│ ├── Conexao.java # Classe para conexão com o banco de dados
├── service/
│ └── Gerenciamento.java # Lógica de gerenciamento das ações do menu
└── view/
└── Interface.java # Interface com o usuário (console)

yaml
Copiar
Editar

---

## 🚀 Funcionalidades

- 📥 **Cadastrar usuário** (nome e e-mail)
- 📄 **Visualizar usuários cadastrados**
- 🗑️ *(a opção "Deletar" aparece no menu mas ainda não está implementada)*

---

## 🧠 Como funciona?

1. A aplicação inicia no `Main.java`.
2. O usuário visualiza um menu com opções.
3. O sistema recebe a entrada via `Scanner` e executa o que for solicitado:
   - Cadastrar usuário: solicita nome e e-mail e salva no banco de dados.
   - Visualizar usuários: exibe todos os registros presentes no banco.
4. A lógica de controle é feita na classe `Gerenciamento`.

---

## 💾 Requisitos

- Java 8+
- MySQL Server ativo
- Biblioteca JDBC do MySQL adicionada ao projeto

---

## ⚙️ Configuração do Banco

Certifique-se de criar o banco e a tabela antes de rodar a aplicação:

```sql
CREATE DATABASE MYSQLTESTE;

USE MYSQLTESTE;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255)
);
🔑 O login e senha do banco estão configurados como root e mysqlPW no código (classe Conexao). Altere conforme necessário.

🧪 Exemplo de uso
bash
Copiar
Editar
============================
||      Boas Vindas       ||
||------------------------||
||1 - Cadastrar           ||
||2 - Vizualizar          ||
||3 - Deletar             ||  
||------------------------||
||Insira  sua resposta: 1
||------------------------||
||Insira  o nome de usuário: João
||-------------------------||
||Insira  o email de usuário: joao@email.com
🔧 Melhorias sugeridas


🗑️ Implementar funcionalidade de deletar usuário

📋 Validar entradas (evitar campos vazios)

🧪 Criar testes automatizados

🎨 Interface gráfica futuramente?

🤝 Contribuição
Sinta-se livre para clonar, modificar e enviar melhorias! Este é um projeto simples ideal para aprender:

Java básico

Interação com o console

Integração com banco de dados MySQL

🧑‍🏫 Autor
Desenvolvido por Sigma Boy 🚀

css
Copiar
Editar

Se quiser, posso gerar esse arquivo `.md` para você baixar direto. Deseja que eu faça isso?
