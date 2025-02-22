## Parte Teórica
## ¿CUÁLES SON LOS TIPOS DE DATOS PRIMITIVOS EN JAVA?
En Java, hay ocho tipos de datos primitivos:
A.	byte (8 bits, valores de -128 a 127)
B.	short (16 bits, valores de -32,768 a 32,767)
C.	int (32 bits, valores de -2,147,483,648 a 2,147,483,647)
D.	long (64 bits, valores muy grandes)
E.	float (32 bits, punto flotante, precisión simple)
F.	double (64 bits, punto flotante, precisión doble)
G.	char (16 bits, almacena un solo carácter Unicode)
H.	boolean (1 bit, solo true o false)

## ¿CÓMO FUNCIONAN LAS ESTRUCTURAS DE CONTROL DE FLUJO COMO IF, ELSE, SWITCH Y BUCLES EN JAVA?
 Condicionales:
•	if-else: Ejecuta un bloque de código si una condición es verdadera.
•	switch: Evalúa una variable contra múltiples valores (case) y ejecuta el código correspondiente.
 Bucles:
•	for: Repite un bloque de código un número específico de veces.
•	while: Repite mientras una condición sea verdadera.
•	do-while: Similar a while, pero ejecuta al menos una vez antes de evaluar la condición.

## ¿POR QUÉ ES IMPORTANTE USAR NOMBRES SIGNIFICATIVOS PARA VARIABLES Y MÉTODOS?
El uso de nombres descriptivos mejora la legibilidad, mantenibilidad y comprensión del código. Facilita la colaboración y reduce errores al hacer que el código sea más intuitivo.

## ¿QUÉ ES LA PROGRAMACIÓN ORIENTADA A OBJETOS (POO)?
Es un paradigma de programación basado en objetos, que combinan datos (atributos) y comportamientos (métodos). Permite modelar entidades del mundo real en código.

## ¿CUÁLES SON LOS CUATRO PILARES DE LA PROGRAMACIÓN ORIENTADA A OBJETOS?
•  Encapsulación: Protección de los datos mediante modificadores de acceso.
•  Herencia: Reutilización de código a través de clases derivadas.
•  Polimorfismo: Capacidad de usar métodos de diferentes formas según el contexto.
•  Abstracción: Ocultar detalles innecesarios y exponer solo lo esencial.

## ¿QUÉ ES LA HERENCIA EN POO Y CÓMO SE UTILIZA EN JAVA?
  La herencia permite que una clase (subclase) herede atributos y métodos de otra   (superclase).
Se usa con extends:
class Animal { void hacerSonido() { System.out.println("Sonido genérico"); } }
class Perro extends Animal { void hacerSonido() { System.out.println("Ladrido"); } }

## ¿QUÉ SON LOS MODIFICADORES DE ACCESO Y CUÁLES SON LOS MÁS COMUNES EN JAVA?
   Controlan la visibilidad de clases, métodos y atributos: 
•	public: Accesible desde cualquier lugar.
•	private: Solo accesible dentro de la misma clase.
•	protected: Accesible en la misma clase, paquete y subclases.
•	(Sin modificador, "default"): Accesible solo dentro del mismo paquete.

## ¿QUÉ ES UNA VARIABLE DE ENTORNO Y POR QUÉ SON IMPORTANTES PARA JAVA O LA PROGRAMACIÓN EN GENERAL?
Una variable de entorno es una configuración del sistema que almacena información clave, como rutas de ejecución (JAVA_HOME). Son importantes porque permiten configurar programas sin modificar el código fuente, facilitando la portabilidad y configuración del entorno de desarrollo.

# Ejercicios de Programación
Este repositorio contiene tres ejercicios básicos en Java que permiten practicar conceptos fundamentales del lenguaje, como el manejo de operadores, estructuras de control y manipulación de cadenas.
## Contenido

- Calculadora Básica
  Este programa permite realizar operaciones matemáticas básicas: suma, resta, multiplicación y división. Solicita al usuario ingresar dos números y elegir la operación deseada. Luego, muestra el resultado correspondiente.
Temas aplicados:
Entrada y salida de datos
Uso de condicionales (switch o if-else)
Operaciones aritméticas

- Contador de Vocales y Consonantes
  Este programa recibe una cadena ingresada por el usuario y cuenta cuántas vocales y consonantes contiene. Luego, muestra los resultados en pantalla.
Temas aplicados:
Manipulación de cadenas
Uso de bucles (for o while)
Condicionales para clasificar caracteres

- Invertir una Cadena
  Este programa permite al usuario ingresar una cadena de texto y la muestra invertida. Es útil para practicar la manipulación de strings y el uso de estructuras de control.
Temas aplicados:
Manipulación de cadenas
Uso de bucles para recorrer y modificar el texto
Métodos de la clase String
