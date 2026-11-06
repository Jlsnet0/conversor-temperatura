# Conversor de Temperaturas

Aplicação de console em Java que converte temperaturas entre **Celsius**, **Fahrenheit** e **Kelvin**.

## Funcionalidades

- Menu interativo no terminal
- 6 conversões: °C → °F, °C → K, °F → °C, °F → K, K → °C e K → °F
- Resultado com 2 casas decimais
- Aviso de erro para opções inválidas do menu

## Exemplo de uso

```
Conversor de temperaturas.
Menu de opções:
1 - Conversões em Celsius
2 - Conversões em Fahrenheit
3 - Conversões em Kelvin
4 - Sair
Digite sua opção: 1
Menu de conversões Celsius
1 - Celsius para Fahrenheit
2 - Celsius para Kelvin
Digite sua opção: 1
Insira a temperatura: 100
Conversão: 212,00°F
```

## Como executar

**Requisito:** JDK 25 ou superior (o `main` do projeto usa a forma simplificada, disponível a partir do Java 25).

Na pasta do projeto:

```bash
javac -d out src/application/Program.java src/util/TempConverter.java src/exceptions/DomainException.java
java -cp out application.Program
```

Ou abra a pasta no IntelliJ IDEA e execute a classe `Program`.

## Estrutura

```
src/
├── application/
│   └── Program.java          # menu e interação com o usuário
├── util/
│   └── TempConverter.java    # fórmulas de conversão
└── exceptions/
    └── DomainException.java  # erro para opções inválidas
```

## Fórmulas

| Conversão | Fórmula |
|---|---|
| °C → °F | (C × 9/5) + 32 |
| °C → K | C + 273,15 |
| °F → °C | (F − 32) × 5/9 |
| °F → K | (F − 32) / 1,8 + 273,15 |
| K → °C | K − 273,15 |
| K → °F | (K − 273,15) × 1,8 + 32 |

## O que este projeto pratica

- Entrada e saída no console com `Scanner`
- Classe utilitária com métodos estáticos
- Exceção personalizada (`DomainException`)
- Organização do código em pacotes