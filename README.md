# 📦 Cadastro de Produtos

Aplicação Android nativa desenvolvida para gerenciamento de estoque. O projeto foca na implementação de operações de banco de dados local utilizando a biblioteca **Room**, garantindo persistência de dados e uma interface intuitiva para o usuário.

## 🚀 Funcionalidades

* **Cadastro de Produtos:** Interface validada para inserção de nome e valor decimal.
* **Persistência com Room:** Armazenamento local robusto utilizando SQLite através da biblioteca Jetpack.
* **Relatórios Dinâmicos:** Listagem automatizada de registros com atualização de interface em tempo real.


## 🛠️ Tecnologias utilizadas

* **Linguagem:** Java
* **Framework:** Android SDK
* **Banco de Dados:** Room Persistence Library
* **Layout:** XML com Material Design
* **Arquitetura:** Padrão DAO (Data Access Object)

## 🏛️ Estrutura do Banco de Dados

O projeto utiliza a biblioteca **Room** para abstrair a camada do SQLite, dividida em três pilares fundamentais:

1.  **Entity (`Product.java`):** Classe que define a estrutura da tabela no banco de dados.
2.  **DAO (`ProductDao.java`):** Interface que contém os métodos de acesso aos dados (Insert, Query).
3.  **Database (`ProductDatabase.java`):** Classe abstrata que gerencia a instância do banco de dados.


 ## ⚙️ Instalação e Execução
* Clone este repositório:
```
git clone https://github.com/RafaelaMichelin/provaMobile.git
```
* Importe o projeto no Android Studio.

* Aguarde a sincronização do Gradle.

* Execute o app em um emulador ou dispositivo físico com Android 9.0 (API 28) ou superior.

## Demonstração da tela
  <img width="310" height="573" alt="Captura de tela 2026-04-15 215107" src="https://github.com/user-attachments/assets/8cd7fe46-7b14-4810-997e-c0b839d4d1db" />


### Feito por: Rafaela Michelin
