
# 🛠️ Sistema CREA - Documentação

## 📋 Visão Geral

O **Sistema CREA** é uma aplicação Java simples desenvolvida para registrar engenheiros e seus números de registro no CREA (Conselho Regional de Engenharia e Agronomia). O programa permite ao usuário escolher entre dois tipos de engenheiro: **Engenheiro Civil** ou **Engenheiro de Produção**, inserindo seus dados e exibindo as informações no console.

---

## 📦 Estrutura de Pacotes

```
aula_5.CREA
│
├── Crea.java
├── Engenheiro.java (interface)
├── EngenheiroCivil.java
├── EngenheiroProducao.java
└── inicio.java (classe principal)
```

---

## 🧱 Componentes do Sistema

### ✅ `Crea.java`

```java
public class Crea {
    private int numero;

    public Crea(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void exibirDados() {
        System.out.println("Número do CREA: " + numero);
    }
}
```

- **Descrição:** Representa o número de registro CREA de um engenheiro.
- **Atributos:** 
  - `numero` — número do CREA.
- **Métodos:**
  - `getNumero()` — retorna o número.
  - `exibirDados()` — imprime o número no console.

---

### ✅ `Engenheiro.java` (interface)

```java
public interface Engenheiro {
    void exibirDados();
}
```

- **Descrição:** Interface comum para engenheiros de qualquer especialidade.
- **Método obrigatório:** 
  - `exibirDados()` — exibição das informações do engenheiro.

---

### ✅ `EngenheiroCivil.java`

```java
public class EngenheiroCivil implements Engenheiro {
    private String nome;
    private Crea crea;

    public EngenheiroCivil(String nome, Crea crea) {
        this.nome = nome;
        this.crea = crea;
    }

    @Override
    public void exibirDados() {
        System.out.println("Engenheiro Civil: " + nome);
        crea.exibirDados();
    }
}
```

- **Descrição:** Classe que representa um engenheiro civil.
- **Atributos:**
  - `nome` — nome do engenheiro.
  - `crea` — objeto `Crea` associado.
- **Método:** 
  - `exibirDados()` — imprime o nome e número do CREA.

---

### ✅ `EngenheiroProducao.java`

```java
public class EngenheiroProducao implements Engenheiro {
    private String nome;
    private Crea crea;

    public EngenheiroProducao(String nome, Crea crea) {
        this.nome = nome;
        this.crea = crea;
    }

    @Override
    public void exibirDados() {
        System.out.println("Engenheiro de Produção: " + nome);
        crea.exibirDados();
    }
}
```

- **Descrição:** Representa um engenheiro da área de produção.
- **Atributos e métodos** são semelhantes à classe `EngenheiroCivil`.

---

### ✅ `inicio.java`

```java
public class inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do CREA: ");
        int creaNum = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do engenheiro: ");
        String nome = sc.nextLine();

        System.out.println("Escolha o tipo de engenheiro:");
        System.out.println("1 - Civil");
        System.out.println("2 - Produção");
        int opcao = sc.nextInt();

        Crea crea = new Crea(creaNum);
        Engenheiro engenheiro;

        if (opcao == 1) {
            engenheiro = new EngenheiroCivil(nome, crea);
        } else if (opcao == 2) {
            engenheiro = new EngenheiroProducao(nome, crea);
        } else {
            System.out.println("Opção inválida.");
            sc.close();
            return;
        }

        engenheiro.exibirDados();
        sc.close();
    }
}
```

- **Função:** Ponto de entrada do programa.
- **Etapas executadas:**
  1. Solicita o número do CREA e nome do engenheiro.
  2. Permite escolher entre engenheiro civil ou de produção.
  3. Cria o objeto correspondente.
  4. Exibe os dados no console.

---

## ▶️ Como Executar o Programa

1. Compile os arquivos:
   ```bash
   javac aula_5/CREA/*.java
   ```

2. Execute a classe principal:
   ```bash
   java aula_5.CREA.inicio
   ```

---

## 👨‍💻 Exemplo de Uso

```plaintext
Digite o número do CREA: 123456
Digite o nome do engenheiro: João Silva
Escolha o tipo de engenheiro:
1 - Civil
2 - Produção
1
Engenheiro Civil: João Silva
Número do CREA: 123456
```

---

## 🧩 Conceitos Utilizados

- Programação orientada a objetos (POO).
- Interface e polimorfismo.
- Encapsulamento.
- Entrada de dados via `Scanner`.

---


