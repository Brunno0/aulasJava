<div align="center">

# ☕ Linguagem de Programação I em Java

**Material de aula: conteúdo, exemplos de código e exercícios**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Aulas](https://img.shields.io/badge/Aulas-6-blue?style=for-the-badge)
![Markdown](https://img.shields.io/badge/Material-Markdown-083fa1?style=for-the-badge&logo=markdown&logoColor=white)

</div>

---

## 📑 Sumário

| # | Aula | Tema |
|:-:|------|------|
| 1 | [Apresentação da disciplina](#-aula-1--apresentação-da-disciplina) | Ementa, avaliação e bibliografia |
| 2 | [Paradigmas e introdução ao Java](#-aula-2--paradigmas-de-programação-e-introdução-ao-java) | Paradigmas, JDK e JVM |
| 3 | [Introdução à sintaxe Java](#-aula-3--introdução-à-sintaxe-java) | Primeiro programa e `Scanner` |
| 4 | [Condicionais I e II](#-aula-4--condicionais-i-e-ii) | `if`, `else`, `switch` |
| 5 | [Laços de repetição](#-aula-5--laços-de-repetição) | `while`, `for`, `do while` |
| 6 | [Arrays](#-aula-6--arrays) | Vetores, percursos e buscas |

---

## 📘 Aula 1 — Apresentação da disciplina

Apresentação do programa de **Linguagem de Programação I**, com visão geral do conteúdo distribuído em **três unidades**: introdução ao Java, orientação a objetos, coleções, interface gráfica e manipulação de arquivos.

**O que será apresentado**

- 📋 Ementa e objetivos
- 🎯 Habilidades a desenvolver
- ⏱️ Carga horária
- 🧭 Metodologia
- ✅ Critérios de avaliação
- 📚 Bibliografia

---

## 🧩 Aula 2 — Paradigmas de programação e introdução ao Java

Estudo dos paradigmas de programação e das formas como cada um organiza a solução de problemas. Introdução à história e à portabilidade do Java.

**Paradigmas estudados**

`Imperativo` · `Procedural` · `Estruturado` · `Declarativo` · `Orientado a objetos`

**Tópicos**

- 🕰️ História e portabilidade da linguagem Java
- 🔀 Diferenças em relação a C
- ⚙️ Papel do **JDK** e da **JVM** na compilação e execução dos programas

---

## ✍️ Aula 3 — Introdução à sintaxe Java

Estudo das regras básicas da linguagem e da estrutura do primeiro programa.

**Convenções de nomes**

| Convenção | Usada em | Exemplo |
|-----------|----------|---------|
| `camelCase` | variáveis e métodos | `notaFinal`, `calcularMedia()` |
| `PascalCase` | classes | `IntroducaoSintaxe` |

**Entrada de dados com `Scanner`**

- Importação da classe
- Criação do objeto leitor com `new`
- Uso de `System.in`
- Métodos de leitura de textos e números

```java
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá, " + nome + "!");
    }
}
```

---

## 🔀 Aula 4 — Condicionais I e II

Estudo das estruturas de decisão em Java.

**Operadores e estruturas**

| Categoria | Itens |
|-----------|-------|
| Operadores | relacionais e lógicos |
| Estruturas | `if`, `else`, `else if`, `switch` |

**Também inclui**

- 🔤 Comparação de textos
- ⌨️ Leitura de dados com `Scanner`
- 📝 Três questões para responder durante **Condicionais I**

---

## 🔁 Aula 5 — Laços de repetição

Introdução às estruturas de repetição, com explicações sobre variáveis de controle, contadores e acumuladores.

**Estruturas**

`while` · `for` · `do while`

**Exemplos abordados**

- 📥 Leitura repetida de dados
- 🛡️ Validação de entradas
- 🚩 Uso de sentinela
- ⏹️ Controle da repetição com `break` e `continue`

---

## 📦 Aula 6 — Arrays

Estudo da declaração, criação e utilização de arrays em Java, incluindo índices, acesso aos elementos e o atributo `length`.

**Tópicos**

- 🔄 Percursos com laços
- ⌨️ Leitura de valores com `Scanner`
- 🧮 Cálculo de média
- 📊 Identificação do maior e do menor valor
- 🔢 Contagem e busca de elementos

---

## 🚀 Como usar este repositório

Cada pasta de aula contém um `README.md` com o conteúdo, uma pasta `exemplos/` com arquivos `.java` e uma pasta `exercicios/` com as atividades.

Os exemplos podem ser copiados para um compilador online, como o [Programiz](https://www.programiz.com/java-programming/online-compiler/), ou executados em uma IDE, como o VS Code com o *Extension Pack for Java*.

> 💡 **Dica:** em Java, o nome do arquivo deve ser igual ao nome da classe `public`. A classe `IntroducaoSintaxe` fica em `IntroducaoSintaxe.java`.
