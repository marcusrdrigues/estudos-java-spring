<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:000000,100:241773&height=120&section=header&text=Estudos%20Java%20%26%20Spring&fontColor=FFFFFF&fontSize=34&fontAlignY=38" width="100%" />
</div>

<p align="center">
  <img src="https://img.shields.io/badge/Java_21-0A0A0A?style=for-the-badge&logo=openjdk&logoColor=A78BFA" />
  <img src="https://img.shields.io/badge/Spring_Boot-0A0A0A?style=for-the-badge&logo=springboot&logoColor=A78BFA" />
  <img src="https://img.shields.io/badge/PostgreSQL-0A0A0A?style=for-the-badge&logo=postgresql&logoColor=A78BFA" />
  <img src="https://img.shields.io/badge/MongoDB-0A0A0A?style=for-the-badge&logo=mongodb&logoColor=A78BFA" />
  <img src="https://img.shields.io/badge/Docker-0A0A0A?style=for-the-badge&logo=docker&logoColor=A78BFA" />
</p>

<p align="center">
  Minha trilha em <b>Java</b>, da Programação Orientada a Objetos no console até APIs REST com <b>Spring Boot</b>, autenticação JWT e persistência poliglota.<br/>
  Projetos desenvolvidos na formação <b>Java WebDeveloper FullStack</b> da <a href="https://www.cotiinformatica.com.br">Coti Informática</a> (ago/2025 – jan/2026).
</p>

---

## 🗺️ A trilha

```text
POO no console ──► 1ª API REST ──► Persistência em arquivo ──► Autenticação JWT ──► JDBC puro ──► JPA + MongoDB
     01                02                  03                       04                  06              07
```

| # | Projeto | Quando | O que estudei |
|:-:|---|:-:|---|
| 01 | [`poo-controle-funcionarios`](./01-poo-controle-funcionarios) | ago/2025 | Fundamentos de POO: classes, objetos, associação (Funcionário ↔ Endereço) e separação em camadas (controller, repository) |
| 02 | [`produtos-api`](./02-produtos-api) | ago/2025 | Primeira API REST com Spring Boot 3.5: controllers, modelagem de entidades, Lombok, documentação com Swagger/OpenAPI e `docker-compose` |
| 03 | [`poo-cadastro-clientes`](./03-poo-cadastro-clientes) | set/2025 | Encapsulamento, tratamento de exceções, UUID e persistência em arquivos `.txt` |
| 04 | [`autenticacao-api`](./04-autenticacao-api) | set/2025 | Cadastro e login com **JWT**, criptografia de senha, Spring Data JPA + PostgreSQL, Bean Validation, *exception handlers*, CORS e **testes automatizados** |
| 05 | [`poo-controle-funcionarios-v2`](./05-poo-controle-funcionarios-v2) | set/2025 | Nova versão do projeto 01 (Funcionário + Endereço), reestruturando controller e repository 🚧 |
| 06 | [`crud-jdbc-produtos`](./06-crud-jdbc-produtos) | nov/2025 | Acesso a dados **sem framework**: JDBC puro com PostgreSQL, *Connection Factory* e *Repository* |
| 07 | [`financas-api`](./07-financas-api) | dez/2025 | Spring Boot 4 com **persistência poliglota**: JPA + PostgreSQL para movimentações e **MongoDB para logs**, services com interfaces e relacionamentos entre entidades |

---

## 💡 O que essa trilha me ensinou

- **Entender antes de abstrair.** Fazer CRUD com JDBC puro (06) depois de já usar JPA me mostrou o que o framework faz por baixo dos panos.
- **Segurança desde o início.** Na `autenticacao-api` vi na prática hash de senha, emissão e validação de token e tratamento de erros sem vazar detalhes internos.
- **O banco certo para cada dado.** Na `financas-api` os dados transacionais ficam no PostgreSQL e o histórico de logs no MongoDB.
- **Documentar faz parte da entrega.** Swagger em todas as APIs, para quem for consumir não precisar adivinhar contratos.

---

## ▶️ Como rodar

Cada pasta é um projeto independente.

```bash
# APIs Spring Boot (02, 04, 07)
cd 04-autenticacao-api
docker compose up -d        # sobe o banco, quando houver docker-compose.yml
./mvnw spring-boot:run      # ou rode pela IDE
# Swagger: http://localhost:8080/swagger-ui.html
```

Os projetos de console (01, 03, 05, 06) rodam pela classe `Main` na IDE (IntelliJ ou Eclipse).

> ℹ️ As credenciais nos arquivos de configuração são de **bancos locais de estudo**. Em produção, ficariam em variáveis de ambiente ou num cofre de segredos.

---

<p align="center">
  Repositório organizado a partir dos repositórios originais de cada projeto, com o <b>histórico de commits preservado</b>.<br/>
  <a href="https://github.com/marcusrdrigues">← Voltar ao perfil</a>
</p>

<div align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:241773,100:000000&height=90&section=footer" width="100%" />
</div>
