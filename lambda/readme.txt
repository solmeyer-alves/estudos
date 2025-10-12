# 🚀 Projeto Lambda — Programação Funcional em Java

Este projeto tem como objetivo explorar os fundamentos da **programação funcional em Java**, com foco em **expressões lambda** e nas principais **interfaces funcionais** da linguagem. A proposta é demonstrar como essas ferramentas tornam o código mais conciso, legível e poderoso, especialmente na manipulação de coleções e fluxos de dados.

---

## 🧠 Interfaces Funcionais em Ação

🔹 `Predicate<T>` — Filtragem com lógica booleana

A interface `Predicate` representa uma função que recebe um argumento e retorna um valor booleano. É amplamente usada para **filtrar elementos** em coleções.

Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
list.removeIf(predicate);

🔹 Consumer<T> — Executando ações sem retorno
A interface Consumer define uma operação que aceita um argumento e não retorna nada. Ideal para aplicar modificações ou executar ações sobre elementos.

Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);
list.forEach(consumer);

🔹 Function<T, R> — Transformações e mapeamentos
A interface Function representa uma função que recebe um argumento e retorna um resultado. É perfeita para transformar dados e realizar mapeamentos.

Function<Product, String> function = p -> p.getName().toUpperCase();
List<String> names = list.stream().map(function).collect(Collectors.toList());

⚙️ Variações de Implementação
As interfaces funcionais podem ser utilizadas de diversas formas:

✅ Classe que implementa a interface

✅ Expressão lambda declarada

✅ Expressão lambda inline

✅ Referência de método (method reference)

✅ Classe anônima

Essa flexibilidade permite adaptar o estilo de codificação às necessidades do projeto e à preferência do desenvolvedor.

🎯 Benefícios da Programação Funcional
🔸 Redução de código repetitivo

🔸 Maior expressividade e clareza

🔸 Facilidade na manipulação de coleções

🔸 Integração fluida com Streams API

🔸 Estímulo ao uso de funções puras e imutabilidade
