# Curso de Java - ArrayLists

Este repositório contém exemplos práticos sobre ArrayLists em Java, explorando collections dinâmicas, iteradores, autoboxing/unboxing e operações avançadas de manipulação de listas.

## 📚 Conceitos Fundamentais

### 🗂️ O que são ArrayLists?
ArrayList é uma implementação redimensionável da interface List, parte do Java Collections Framework. Diferentemente dos arrays tradicionais, ArrayLists podem crescer e diminuir dinamicamente.

```java
ArrayList<String> nomes = new ArrayList<>();
nomes.add("Alice");     // Adiciona elemento
nomes.add("Bob");       // Lista cresce automaticamente
```

### 📊 Características dos ArrayLists:
- **Tamanho dinâmico**: Cresce/diminui conforme necessário
- **Índices**: Baseados em zero (0, 1, 2, ...)
- **Tipo genérico**: `<T>` define o tipo dos elementos
- **Ordenação**: Mantém a ordem de inserção
- **Duplicatas**: Permite elementos duplicados

## 🔄 ArrayList vs Array Tradicional

| Aspecto | Array | ArrayList |
|---------|-------|-----------|
| **Tamanho** | Fixo (`new int[5]`) | Dinâmico |
| **Sintaxe** | `array[index]` | `list.get(index)` |
| **Redimensionamento** | Impossível | Automático |
| **Métodos** | Limitados | Muitos (`add`, `remove`, etc.) |
| **Performance** | Ligeiramente melhor | Muito boa |
| **Memória** | Uso eficiente | Overhead mínimo |

## 🛠️ Exemplos Práticos

### 1. **Operações Básicas com ArrayLists**
Demonstra criação, adição, remoção e acesso a elementos.

```java
ArrayList<String> frutas = new ArrayList<>();
frutas.add("Maçã");                    // Adiciona no final
frutas.add(1, "Laranja");             // Insere na posição específica
String primeira = frutas.get(0);      // Acessa elemento
frutas.remove(1);                     // Remove por índice
int tamanho = frutas.size();          // Obtém tamanho
```

### 2. **Sistema de Gerenciamento de Estudantes**
Aplicação prática demonstrando manipulação completa de listas.

**Funcionalidades:**
- Adição de estudantes
- Inserção em posições específicas
- Remoção por índice
- Exibição do estado da lista
- Controle dinâmico do tamanho

### 3. **Filtros com Iterator**
Remove elementos durante iteração de forma segura.

**Características:**
- Uso de `Iterator` para percorrer
- Remoção segura durante iteração
- Filtragem de números pares
- Prevenção de `ConcurrentModificationException`

### 4. **Autoboxing e Unboxing**
Demonstra conversão automática entre tipos primitivos e wrapper classes.

**Conceitos:**
- **Autoboxing**: `int` → `Integer` automaticamente
- **Unboxing**: `Integer` → `int` automaticamente
- Operações matemáticas com wrapper classes

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE Java ou terminal

### Executando o Projeto

1. **Clone o repositório:**
```bash
git clone <url-do-repositorio>
cd java-arraylist-course
```

2. **Compile:**
```bash
javac -d out src/main/java/org/example/Main.java
```

3. **Execute:**
```bash
java -cp out org.example.Main
```

### 🔧 Testando Diferentes Exemplos

Para testar exemplos específicos, descomente as seções correspondentes:

- **Exemplo 1 - Operações Básicas**: Descomente linhas 11-31
- **Exemplo 2 - Estudantes**: Descomente linhas 33-52
- **Exemplo 3 - Iterator**: Descomente linhas 54-72
- **Exemplo 4 - Autoboxing**: Já está ativo (linhas 74-89)

## 📋 Principais Métodos do ArrayList

### ✅ Adição de Elementos:
```java
list.add(elemento);              // Adiciona no final
list.add(index, elemento);       // Insere na posição específica
list.addAll(outraLista);        // Adiciona todos os elementos
```

### ✅ Remoção de Elementos:
```java
list.remove(index);              // Remove por índice
list.remove(objeto);             // Remove primeira ocorrência
list.removeAll(outraLista);      // Remove todos os elementos especificados
list.clear();                    // Remove todos os elementos
```

### ✅ Acesso e Busca:
```java
elemento = list.get(index);      // Obtém elemento por índice
list.set(index, novoElemento);   // Substitui elemento
boolean existe = list.contains(elemento);  // Verifica existência
int posicao = list.indexOf(elemento);      // Encontra posição
```

### ✅ Informações da Lista:
```java
int tamanho = list.size();       // Número de elementos
boolean vazia = list.isEmpty();  // Verifica se está vazia
Object[] array = list.toArray(); // Converte para array
```

## 🔄 Tipos de Iteração

### 1. **For-Each (Enhanced For):**
```java
for (String item : lista) {
    System.out.println(item);
}
```

### 2. **Iterator:**
```java
Iterator<String> iterator = lista.iterator();
while (iterator.hasNext()) {
    String item = iterator.next();
    // iterator.remove(); // Remoção segura
}
```

### 3. **ListIterator (Bidirecional):**
```java
ListIterator<String> listIterator = lista.listIterator();
// Percorre para frente
while (listIterator.hasNext()) {
    System.out.println(listIterator.next());
}
// Percorre para trás
while (listIterator.hasPrevious()) {
    System.out.println(listIterator.previous());
}
```

### 4. **For Tradicional:**
```java
for (int i = 0; i < lista.size(); i++) {
    System.out.println(lista.get(i));
}
```

## 💡 Exemplos de Saída

### Operações Básicas:
```
Maçã
2
Maçã
Banana
```

### Sistema de Estudantes:
```
Estudantes: [Alice, Bob, Cindy, David]
Tamanho da lista: 4
Estudantes após modificações: [Nick, Mike, Alice, Cindy, David]
Tamanho da lista: 5
```

### Filtro com Iterator:
```
Lista original: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Lista após remoção dos pares: [1, 3, 5, 7, 9]
```

### Autoboxing/Unboxing:
```
Lista de números: [1, 2, 3, 4, 5]
Soma dos números: 15
```

## 🎯 Autoboxing e Unboxing

### 🔄 Autoboxing (Primitivo → Wrapper):
```java
ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(10);        // int 10 → Integer 10 (automático)
numeros.add(20);        // int 20 → Integer 20 (automático)
```

### 🔄 Unboxing (Wrapper → Primitivo):
```java
Integer objetoInteger = numeros.get(0);  // Obtém Integer
int primitivoInt = objetoInteger;        // Integer → int (automático)
int soma = numeros.get(0) + numeros.get(1); // Unboxing automático
```

### 📊 Tabela de Wrapper Classes:
| Primitivo | Wrapper Class |
|-----------|---------------|
| `int` | `Integer` |
| `double` | `Double` |
| `float` | `Float` |
| `boolean` | `Boolean` |
| `char` | `Character` |
| `byte` | `Byte` |
| `short` | `Short` |
| `long` | `Long` |

## ⚠️ Cuidados Importantes

### 🚨 ConcurrentModificationException:
```java
// ❌ EVITE - Remoção durante for-each
for (String item : lista) {
    if (condicao) {
        lista.remove(item); // ERRO!
    }
}

// ✅ CORRETO - Use Iterator
Iterator<String> it = lista.iterator();
while (it.hasNext()) {
    if (condicao) {
        it.remove(); // Seguro
    }
}
```

### 🚨 IndexOutOfBoundsException:
```java
ArrayList<String> lista = new ArrayList<>();
// String item = lista.get(0); // ❌ ERRO - Lista vazia
if (!lista.isEmpty()) {
    String item = lista.get(0); // ✅ Seguro
}
```

### 🚨 Performance com Primitivos:
```java
// ❌ Menos eficiente
ArrayList<Integer> numeros = new ArrayList<>();
for (int i = 0; i < 1000000; i++) {
    numeros.add(i); // Autoboxing a cada iteração
}

// ✅ Mais eficiente para grandes volumes
int[] numerosArray = new int[1000000];
for (int i = 0; i < 1000000; i++) {
    numerosArray[i] = i; // Sem boxing
}
```

## 🎯 Boas Práticas

### ✅ Recomendações:
- Use generics para type safety: `ArrayList<String>`
- Especifique capacidade inicial se souber o tamanho: `new ArrayList<>(100)`
- Use Iterator para remoções durante iteração
- Prefira for-each quando possível
- Considere `LinkedList` para muitas inserções/remoções no meio

### ✅ Inicialização com Elementos:
```java
// Java 9+
List<String> lista = List.of("item1", "item2", "item3");

// Versões anteriores
ArrayList<String> lista = new ArrayList<>(Arrays.asList("item1", "item2", "item3"));
```

## 🔍 Métodos Úteis Avançados

### ✅ Operações de Bulk:
```java
lista1.addAll(lista2);           // Adiciona todos de lista2
lista1.removeAll(lista2);        // Remove elementos que estão em lista2
lista1.retainAll(lista2);        // Mantém apenas elementos que estão em lista2
```

### ✅ Busca e Comparação:
```java
Collections.sort(lista);         // Ordena a lista
Collections.reverse(lista);      // Inverte a ordem
Collections.shuffle(lista);      // Embaralha elementos
```

## 📖 Objetivos de Aprendizagem

Ao estudar este código, você aprenderá:

- 🎯 Diferenças fundamentais entre Arrays e ArrayLists
- 🔄 Como usar diferentes tipos de iteradores
- 💻 Aplicações práticas de listas dinâmicas
- 🛡️ Tratamento seguro de modificações durante iteração
- 📊 Conceitos de autoboxing e unboxing
- 🔧 Boas práticas com Collections
- ⚠️ Armadilhas comuns e como evitá-las

## 🤝 Contribuição

Este é um projeto educacional. Contribuições com novos exemplos e exercícios são bem-vindas!

## 📚 Próximos Passos

- LinkedList e comparação de performance
- HashMap e HashSet
- Collections Framework completo
- Streams API para processamento de listas
- Algoritmos de ordenação personalizados

---

**Autor**: Vinícius Santos Briches  
**Curso**: Fundamentos Java  
**Versão**: 1.0  
**Data**: 2025
