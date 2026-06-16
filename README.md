# 🎬 Sistema de Ingressos para Cinema

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de aplicar conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, utilizando herança, polimorfismo, encapsulamento e sobrescrita de métodos.

A aplicação simula um sistema de venda de ingressos para cinema, permitindo trabalhar com diferentes tipos de ingressos a partir de uma classe base comum.

Foram implementados três tipos de ingresso:

- 🎟️ Ingresso Normal
- 🎓 Ingresso Meia Entrada
- 👨‍👩‍👧‍👦 Ingresso Família

Cada tipo possui uma regra específica para cálculo do valor final.

---

# 🎯 Objetivos da Atividade

Criar uma hierarquia de classes capaz de representar diferentes modalidades de ingressos de cinema.

Aplicar conceitos de:

- Herança
- Polimorfismo
- Encapsulamento
- Sobrescrita de métodos
- Reutilização de código
- Classes e Objetos

---

# 🏗️ Estrutura do Projeto

```text
src/
│
├── Ingresso.java
├── IngressoMeia.java
├── IngressoFamilia.java
└── IngressoCinema.java
```

---

# 🎟️ Classe Base: Ingresso

A classe `Ingresso` representa o ingresso padrão do sistema.

## Atributos

```java
valor
nomeFilme
tipoAudio
```

### Descrição

| Atributo | Descrição |
|-----------|-----------|
| valor | Valor base do ingresso |
| nomeFilme | Nome do filme |
| tipoAudio | Dublado ou Legendado |

---

## Método Principal

```java
getValorReal()
```

Responsável por retornar o valor efetivo do ingresso.

No ingresso comum, retorna o valor original.

```java
public double getValorReal(){
    return valor;
}
```

---

# 🎓 Classe IngressoMeia

A classe `IngressoMeia` herda da classe `Ingresso`.

```java
public class IngressoMeia extends Ingresso
```

---

## Regra de Negócio

O ingresso de meia entrada deve custar metade do valor do ingresso normal.

### Implementação

```java
@Override
public double getValorReal() {
    return valor / 2;
}
```

---

## Exemplo

Valor original:

```text
R$ 30,00
```

Valor da meia:

```text
R$ 15,00
```

---

# 👨‍👩‍👧‍👦 Classe IngressoFamilia

A classe `IngressoFamilia` também herda da classe `Ingresso`.

```java
public class IngressoFamilia extends Ingresso
```

---

## Atributo Adicional

```java
numeroPessoas
```

Representa a quantidade de pessoas da família.

---

## Regra de Negócio

O valor final é calculado através da multiplicação do valor do ingresso pela quantidade de pessoas.

```java
valor × numeroPessoas
```

---

### Desconto Especial

Quando houver mais de 3 pessoas, é aplicado um desconto de 5%.

```java
if(numeroPessoas >= 3){
    total = total * 0.95;
}
```

---

## Exemplo

Valor do ingresso:

```text
R$ 30,00
```

Quantidade:

```text
4 pessoas
```

Cálculo:

```text
30 × 4 = R$ 120,00
```

Aplicando desconto:

```text
120 × 0,95 = R$ 114,00
```

---

# 🔄 Polimorfismo

O método:

```java
getValorReal()
```

foi sobrescrito nas classes filhas.

Isso permite que cada tipo de ingresso calcule seu valor de forma diferente.

### Ingresso Normal

```java
R$ 30,00
```

### Meia Entrada

```java
R$ 15,00
```

### Família (4 pessoas)

```java
R$ 114,00
```

---

# 🖥️ Classe Principal

A classe:

```java
IngressoCinema
```

é responsável por executar o programa.

Ela cria exemplos de:

- Ingresso Normal
- Ingresso Meia Entrada
- Ingresso Família

e exibe suas informações no console.

---

# 📋 Exemplo de Saída

```text
INGRESSO NORMAL

Filme: Avatar
Audio: Dublado
Valor real: R$ 30,00

===================

INGRESSO MEIA

Filme: Avatar
Audio: Legendado
Valor real: R$ 15,00

===================

INGRESSO FAMILIA

Filme: Avatar
Audio: Dublado
Valor real: R$ 114,00
```

---

# 🧠 Conceitos Aplicados

## Programação Orientada a Objetos

### Classes

- Ingresso
- IngressoMeia
- IngressoFamilia

---

### Herança

```java
extends Ingresso
```

Permitiu reutilizar atributos e métodos da classe base.

---

### Polimorfismo

Uso da sobrescrita do método:

```java
getValorReal()
```

---

### Encapsulamento

Utilização de:

```java
getters
setters
```

para controle dos atributos.

---

### Reutilização de Código

As classes filhas aproveitam toda a estrutura da classe pai.

---

# 🛠️ Tecnologias Utilizadas

<div align="center">

<img src="https://skillicons.dev/icons?i=java,git,github" />

</div>

### Ferramentas

- Java
- Programação Orientada a Objetos (POO)
- NetBeans
- Git
- GitHub

---

# 🎓 Aprendizados

Durante o desenvolvimento deste projeto foram praticados:

- Criação de classes e objetos
- Herança
- Sobrescrita de métodos
- Polimorfismo
- Encapsulamento
- Estruturação de projetos Java
- Aplicação de regras de negócio através de classes especializadas

---

# 👨‍💻 Autor

<div align="center">

<a href="https://github.com/PedroGiffoni">
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white">
</a>

<a href="https://www.linkedin.com/in/pedrogiffoni/">
<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">
</a>

<a href="mailto:pedrotonimelo@gmail.com">
<img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white">
</a>

</div>

---

# ⭐ Projeto Acadêmico

Projeto desenvolvido para praticar os conceitos de Programação Orientada a Objetos em Java através da construção de uma hierarquia de classes para gerenciamento de ingressos de cinema, explorando herança, polimorfismo e reutilização de código.
