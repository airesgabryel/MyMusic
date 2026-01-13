# MyMusic 🎵


O **MyMusic** é uma aplicação Java desenvolvida como parte do desafio técnico do programa **Oracle Next Education (ONE)** em parceria com a **Alura**. O projeto consiste em um sistema de gerenciamento de mídia sonora que aplica conceitos fundamentais de Programação Orientada a Objetos (POO) para organizar e classificar conteúdos.

## 🚀 Funcionalidades

A aplicação permite a gestão de diferentes tipos de áudio com as seguintes características:

* [cite_start]**Classe Audio:** Define a estrutura base com título, total de reproduções, total de curtidas e classificação[cite: 1].
* **Gestão de Músicas:** Permite registrar álbuns, cantores e gêneros específicos.
* **Gestão de Podcasts:** Permite o registro de apresentadores e descrições detalhadas.
* **Sistema de Preferidas:** Uma lógica de seleção que identifica conteúdos de sucesso com base na sua classificação técnica.

## 🛠️ Regras de Classificação (Polimorfismo)

O sistema utiliza polimorfismo para definir a qualidade do conteúdo de formas distintas:

* **Músicas:** Recebem classificação máxima (10) se ultrapassarem 200 reproduções.
* **Podcasts:** Recebem classificação máxima (10) se possuírem mais de 500 curtidas.

## 💻 Tecnologias e Estrutura

* **Linguagem:** Java (Versão 25).
* **IDE:** IntelliJ IDEA.
* **Estrutura de Pacotes:** Organizado em `modelos` para as classes de dados e `principal` para a execução.

## 📦 Como Executar

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/seu-usuario/MyMusic.git](https://github.com/seu-usuario/MyMusic.git)
    ```
2.  Importe o projeto em sua IDE (IntelliJ, Eclipse ou VS Code).
3.  Execute a classe `Principal.java` para simular a criação e interação com os áudios.

---

### Autor
Desenvolvido por **Gabryel Aires** como parte da formação técnica em Java no programa Oracle Next Education.