# Projeto Lambda 🚀

Este projeto tem como objetivo explorar os conceitos de **programação funcional em Java**, com ênfase no uso de **expressões lambda** e **interfaces funcionais** como `Predicate`, `Consumer` e `Function`.

---

## 📘 Estudo com Interfaces Predicate, Consumer e Function

### 🔹 Predicate<T>
Interface funcional que representa uma **função booleana** de um argumento.

```java
Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
list.removeIf(predicate);
```

### 🔹 Consumer<T>
Interface funcional que representa uma operação que aceita um argumento e não retorna nada.

```java
Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);
list.forEach(consumer);
```

### 🔹 Function<T, R>
Interface funcional que representa uma função que recebe um argumento e retorna um resultado.

```java
Function<Product, String> function = p -> p.getName().toUpperCase();
List<String> names = list.stream().map(function).collect(Collectors.toList());
```
