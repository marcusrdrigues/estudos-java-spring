# Projeto Aula 01 - Sistema de Cadastro de Clientes

Este projeto foi desenvolvido como parte da formação **Java WebDeveloper FullStack**, na disciplina de **POO – Programação Orientada a Objetos em Java**.

O objetivo é construir um sistema simples de **cadastro de clientes** utilizando conceitos básicos de **Java**, **classes**, **objetos**, **encapsulamento** e **tratamento de exceções**.

---

## 🚀 Funcionalidades

- Cadastrar clientes com os seguintes dados:
  - ID (UUID gerado automaticamente pelo sistema)
  - Nome
  - Email
  - Telefone
  - Data e hora do cadastro (gerado automaticamente)
- Armazenar os dados dos clientes em arquivos `.txt` na máquina do usuário
- Exibir no console os dados cadastrados

---

## 🛠️ Tecnologias utilizadas

- **Java 21**
- **Eclipse IDE for Enterprise Java and Web Developers**

---

## 📂 Estrutura do projeto



src/
├── entidades/
│    └── Cliente.java        # Classe de entidade (modela os dados do cliente)
├── repositorios/
│    └── ClienteRepositorio.java   # Classe responsável por gravar dados em arquivo TXT
└── principal/
└── Main.java           # Classe principal que executa o sistema
---

## ▶️ Como executar

1. Certifique-se de ter o **JDK 21** instalado e configurado.
2. Importe o projeto no **Eclipse** (ou outra IDE de sua preferência).
3. Execute a classe `Main.java`.
4. Informe os dados solicitados no console.
5. Confira o arquivo `.txt` gerado com os dados do cliente.

---

## 📚 Conceitos abordados

- Programação Orientada a Objetos (POO)
- Encapsulamento (Getters e Setters)
- Instanciação de objetos
- Uso da classe `Scanner` para entrada de dados
- Escrita de arquivos com `PrintWriter`
- Tratamento de exceções (`try/catch`)
- Organização de pacotes no Java

---

## ✍️ Autor

Desenvolvido por **Marcus Rodrigues** como parte do curso *Java WebDeveloper FullStack*.
