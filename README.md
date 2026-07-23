# Catálogo de Malos Olores de Código (Code Smells) y Refactorización en Java

Este repositorio reúne un catálogo didáctico de ejemplos en **Java** sobre **Malos Olores de Código (*Code Smells*)** basados en la clasificación de **Refactoring Guru** (Martin Fowler).

Cada carpeta contiene el código con el mal olor (`Before...java`) y su respectiva solución aplicando **Técnicas de Refactorización (*Refactoring*)** (`After...java`).

---

## Índice de Categorías y Code Smells

### 1. Dispensables (Prescindibles)
Elementos innecesarios cuya eliminación hace que el código sea más limpio, ligero y fácil de entender.

| Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|
| **Comments** | *Rename Method / Extract Method* | Código confuso cubierto de comentarios explicativos innecesarios. |
| **Duplicate Code** | *Extract Method* | Mismo fragmento de código repetido en múltiples partes del sistema. |
| **Lazy Class** | *Inline Class* | Clase que casi no tiene responsabilidades y no justifica su existencia. |
| **Data Class** | *Move Method / Encapsulate Field* | Clase "tonta" con solo getters/setters manipulada totalmente desde fuera. |
| **Dead Code** | *Remove Dead Code* | Métodos, variables o parámetros en desuso que ensucian el proyecto. |
| **Speculative Generality** | *Collapse Hierarchy / Remove Parameter* | Abstracciones e interfaces sobre-diseñadas "por si acaso". |

---

### 2. Object-Orientation Abusers (Abusadores de la OO)
Casos donde los principios de la Programación Orientada a Objetos se aplicaron de forma errónea o incompleta.

| Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|
| **Switch Statements** | *Replace Conditional with Polymorphism* | Condicionales o switches rígidos evaluando tipos en lugar de usar polimorfismo. |
| **Temporary Field** | *Extract Class / Method Object* | Atributos de clase que solo se usan durante un cálculo temporal específico. |
| **Refused Bequest** | *Replace Inheritance with Delegation* | Subclase que hereda de una superclase pero ignora o anula la mayoría de sus métodos. |

---

### 3. Bloaters (Acaparadores)
Código, métodos y clases que han crecido tanto que se han vuelto gigantescos y difíciles de mantener.

| Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|
| **Long Method** | *Extract Method* | Métodos con excesivas líneas de código y múltiples responsabilidades. |
| **Large Class** | *Extract Class* | Clases "Dios" que intentan controlar demasiados aspectos del sistema. |
| **Primitive Obsession** | *Replace Primitive with Object* | Uso de primitivos sueltos en lugar de Value Objects del dominio. |
| **Long Parameter List** | *Introduce Parameter Object* | Métodos que reciben más de 3 o 4 parámetros sueltos en su firma. |
| **Data Clumps** | *Extract Class* | Grupos de variables que siempre viajan juntas por el código. |

---

### 4. Couplers (Acopladores)
Alto acoplamiento e interacción excesiva entre clases que debería mantenerse encapsulada.

| Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|
| **Feature Envy** | *Move Method* | Un método que usa más los datos de otra clase que los de la suya propia. |
| **Message Chains** | *Hide Delegate* | Cadenas largas de llamadas (`a.getB().getC()`) que violan la Ley de Deméter. |
| **Middle Man** | *Remove Middle Man* | Clase que no aporta valor y solo delega trabajo a otra instancia. |

---

### 5. Change Preventers (Preventores del Cambio)
Síntomas que provocan que un cambio simple en el sistema requiera modificaciones complejas y costosas.

| Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|
| **Divergent Change** | *Extract Class* | Una sola clase cambia frecuentemente por motivos completamente distintos (viola SRP). |
| **Shotgun Surgery** | *Move Method / Move Field* | Un solo cambio conceptual obliga a tocar código disperso en muchas clases. |

---

## Estructura del Proyecto

```text
.
├── 01-dispensables/
│   ├── Data Class/
│   ├── DeadCode/
│   ├── Duplicate Code/
│   ├── LazyClass/
│   ├── comments/
│   └── SpeculativeGenerality/
├── 02-abusers/
│   ├── RefusedBequest/
│   ├── Temporary Field/
│   └── switchStatements/
├── 03-bloaters/
│   ├── DataClumps/
│   ├── LargeClass/
│   ├── LongMethod/
│   ├── LongParameterList/
│   └── PrimitiveObsession/
├── 04-couplers/
│   ├── FeatureEnvy/
│   ├── Message Chains/
│   └── MiddleMan/
├── 05-change-preventers/
│   ├── DivergentChange/
│   └── ShotgunSurgery/
└── README.md
