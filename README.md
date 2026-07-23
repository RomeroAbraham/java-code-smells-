# 🧼 Catálogo de Malos Olores de Código (Code Smells) y Refactorización en Java

Este repositorio reúne un catálogo completo de ejemplos prácticos en **Java** sobre **Malos Olores de Código (*Code Smells*)** basados en la clasificación oficial de **Refactoring Guru** (Martin Fowler). 

Cada carpeta contiene el ejemplo con el mal olor (`Before...java`) y su respectiva solución aplicando **Técnicas de Refactorización (*Refactoring*)** (`After...java`).

---

## 📌 Índice de Categorías y Code Smells

### 1. 🗑️ Dispensables (Prescindibles)
Elementos innecesarios cuya eliminación hace que el código sea más limpio, ligero y fácil de entender.

| # | Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|---|
| 1.1 | **Comments** | *Rename Method / Extract Method* | Código oscuro cubierto de comentarios explicativos innecesarios. |
| 1.2 | **Duplicate Code** | *Extract Method* | Mismo fragmento de código repetido en múltiples partes del sistema. |
| 1.3 | **Lazy Class** | *Inline Class* | Clase que casi no hace nada y no justifica su existencia. |
| 1.4 | **Data Class** | *Move Method / Encapsulate Field* | Clase "tonta" con solo getters/setters manipulada totalmente desde fuera. |
| 1.5 | **Dead Code** | *Remove Dead Code* | Métodos, variables o parámetros en desuso que ensucian el proyecto. |

---

### 2. 🧩 Object-Orientation Abusers (Abusadores de la OO)
Casos donde los principios de la Programación Orientada a Objetos se aplicaron de forma incompleta o errónea.

| # | Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|---|
| 2.1 | **Switch Statements** | *Replace Conditional with Polymorphism* | Condicionales o switches rígidos evaluando tipos en lugar de usar polimorfismo. |
| 2.2 | **Temporary Field** | *Extract Class / Method Object* | Atributos de clase que solo se usan durante un cálculo temporal específico. |
| 2.3 | **Refused Bequest** | *Replace Inheritance with Delegation* | Subclase que hereda de una superclase pero ignora o anula la mayoría de sus métodos. |

---

### 3. 🎈 Bloaters (Acaparadores)
Código, métodos y clases que han crecido tanto que se han vuelto gigantescos y difíciles de mantener.

| # | Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|---|
| 3.1 | **Long Method** | *Extract Method* | Métodos con excesivas líneas de código y múltiples responsabilidades. |
| 3.2 | **Large Class** | *Extract Class* | Clases "Dios" que intentan controlar demasiados aspectos del sistema. |
| 3.3 | **Primitive Obsession** | *Replace Primitive with Object* | Uso de primitivos sueltos en lugar de Value Objects del dominio. |
| 3.4 | **Long Parameter List** | *Introduce Parameter Object* | Métodos que reciben más de 3 o 4 parámetros sueltos en su firma. |
| 3.5 | **Data Clumps** | *Extract Class* | Grupos de variables que siempre viajan juntas por el código. |

---

### 4. 🔗 Couplers (Acopladores)
Alto acoplamiento e interacción excesiva entre clases que debería mantenerse encapsulada.

| # | Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|---|
| 4.1 | **Feature Envy** | *Move Method* | Un método que usa más los datos de otra clase que los de la suya propia. |
| 4.2 | **Message Chains** | *Hide Delegate* | Cadenas largas de llamadas (`a.getB().getC().getD()`) que violan la Ley de Deméter. |
| 4.3 | **Middle Man** | *Remove Middle Man* | Clase que no aporta valor y solo delega trabajo a otra instancia. |

---

### 5. 🛠️ Change Preventers (Preventores del Cambio)
Sintomas que provocan que un cambio simple en el sistema requiera modificaciones complejas y costosas.

| # | Code Smell | Técnica de Refactorización | Descripción breve |
|---|---|---|---|
| 5.1 | **Divergent Change** | *Extract Class* | Una sola clase cambia frecuentemente por motivos completamente distintos (viola SRP). |
| 5.2 | **Shotgun Surgery** | *Move Method / Move Field* | Un solo cambio conceptual obliga a tocar código disperso en muchas clases. |
| 5.3 | **Parallel Inheritance** | *Move Method / Move Field* | Crear una subclase en una jerarquía obliga a crear otra subclase en una jerarquía paralela. |

---

## 📂 Estructura del Proyecto

```text
.
├── 01-dispensables/
│   ├── 01-comments/
│   ├── 02-duplicate-code/
│   ├── 03-lazy-class/
│   ├── 04-data-class/
│   ├── 05-dead-code/
│   └── 06-speculative-generality/
├── 02-oo-abusers/
│   ├── 01-switch-statements/
│   ├── 02-temporary-field/
│   ├── 03-refused-bequest/
│   └── 04-alternative-classes/
├── 03-bloaters/
│   ├── 01-long-method/
│   ├── 02-large-class/
│   ├── 03-primitive-obsession/
│   ├── 04-long-parameter-list/
│   └── 05-data-clumps/
├── 04-couplers/
│   ├── 01-feature-envy/
│   ├── 02-inappropriate-intimacy/
│   ├── 03-message-chains/
│   └── 04-middle-man/
├── 05-change-preventers/
│   ├── 01-divergent-change/
│   ├── 02-shotgun-surgery/
│   └── 03-parallel-inheritance-hierarchies/
└── README.md
