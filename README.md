# Método Simplex - Problema de Programação Linear

Este arquivo descreve um problema de programação linear que deve ser resolvido usando o método simplex. As instruções a seguir explicam o formato dos dados de entrada e como interpretar cada linha para construir a tabela inicial do método simplex.

## Descrição do Formato do Arquivo de Entrada

O problema é descrito por uma série de valores em um arquivo de texto, organizado da seguinte forma:

1. **Primeira Linha**: Um valor numérico que identifica o tipo de problema:
   - `1` indica que é um problema de **maximização**.
   - `-1` indica que é um problema de **minimização**.
   
   No exemplo, a primeira linha é `1`, então estamos tratando de um problema de **maximização**.

2. **Segunda Linha**: Um valor numérico `x` que representa o número de **variáveis de decisão** do problema.
   
   No exemplo, a segunda linha é `2`, indicando que há **2 variáveis** de decisão (\( x_1 \) e \( x_2 \)).

3. **Terceira Linha**: `x` valores numéricos que identificam os **coeficientes da função objetivo**.
   
   No exemplo, a terceira linha é `3 5`, o que significa que a função objetivo é maximizar Z = 3x_1 + 5x_2

5. **Linhas a partir da Quarta**: Cada linha contém `x + 1` valores que representam as **restrições** do problema. Os primeiros `x` valores são os coeficientes das variáveis e o último valor é o **termo independente**.

No exemplo, temos três restrições:
- `3 2 30` corresponde à restrição `3x_1 + 2x_2 <= 30`
- `1 1 20` corresponde à restrição `1x_1 + 1x_2 <= 20`
- `3 -1 15` corresponde à restrição `3x_1 - 1x_2 <= 15`

## Resumo do Problema

Com base nos dados de entrada, o problema de programação linear é definido como:

### Função Objetivo: Maximizar Z = 3x_1 + 5x_2

### Restrições:
3x_1 + 2x_2 <= 30 1x_1 + 1x_2 <= 20 3x_1 - 1x_2 <= 15 x_1, x_2 >= 0
