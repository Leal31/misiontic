Algoritmo pseintmomento
	// Entrada
	// declaro variables
	definir nombre, asignatura Como Caracter
	definir nota1, nota2, nota3, definitiva Como Real
	// Procedimientos
	escribir 'Ingrese su nombre: '
	leer nombre
	escribir 'Ingrese la asignatura: '
	leer asignatura
	escribir 'Ingrese la nota 1: '
	leer nota1
	escribir 'Ingrese la nota 2: '
	leer nota2
	escribir 'Ingrese la nota 3: '
	leer nota3
	definitiva <- (nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.4)
	//Salida
	escribir 'El estudiante ', nombre, ' en la asignatura ', asignatura, ' tiene una nota definitiva de ' , definitiva 
FinAlgoritmo
