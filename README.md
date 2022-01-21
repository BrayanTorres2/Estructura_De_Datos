# Estructura_De_Datos

## Introducción A Kotlin
En este tutorial te mostraremos una introducción a Kotlin. Verás en breve: que es el lenguaje Kotlin, a que plataformas apunta, los beneficios de codificar con él y en que IDEs podemos crear programas con este lenguaje.
## ¿Qué Es Kotlin ?
Kotlin es un lenguaje de propósito general que soporta tanto programación funcional como orientada a objetos.
A su vez es un proyecto de código abierto desarrollado por la compañía JetBrains , la cual es su principal conductor, con la ayuda de la comunidad.
Usa un tipado estático como Java, pero también puede omitir los tipos pareciéndose a los lenguajes tipados dinámicamente.
Nace con la necesidad de mejorar la legibilidad y expresiones que Java usa

## ¿Por Qué Usar Kotlin?
Usando Kotlin te beneficiarás de:
<li> Menos código: JetBrains estima que puedes reducir hasta un 40% de líneas de código en comparación a Java.</li>
<li> Código más seguro: Reduce la aparición de excepciones de nulos al usar tipos no anulables.</li>
<li> Interoperabilidad: Kotlin es 100% interoperable con Java. Lo que significa que puedes llamar código Java desde Kotlin y viceversa. </li>
<li> Corrutinas: Las corrutinas de Kotlin simplifican la ejecución de tareas asíncronas</li>
<li> Desarrollo Multiplataforma: Con Kotlin puedes desarrollar aplicaciones Android, iOS y aplicaciones web. Con el fin de compartir código en común entre ellas.</li>

# Variables En Kotlin
En este este repositorio aprenderás a declarar y usar variables en Kotlin para almacenar datos en memoria. Verás que existen variables de solo lectura (read-only) y mutables, además de la inferencia que el compilador de Kotlin realiza

## Variables De Solo Lectura
Una variable de solo lectura (read-only) es una variable que no puede ser reasignada.
Para declararlas, usa la palabra reservada val. y especifica su tipo de dato a su derecha con dos puntos (:)
O declárala con su tipo y asígnala en una línea futura.

val xPos: Int = 1 // Asignación junto a declaración<br>
val yPos: Int   // Declaración<br>
yPos = 5    // Asignación<br>
