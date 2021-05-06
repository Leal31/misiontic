Algoritmo areas
	// entrada
	// definir variables
	definir base, altura, lado1, lado2, radio, areaTriangulo, areaCirculo, areaRectangulo Como Real
	// Procedimiento
	Escribir 'Ingresa la base: '
	Leer base
	Escribir 'Ingrese la altura: '
	Leer altura
	Escribir 'Ingrese el tamaño del lado 1: '
	Leer lado1
	Escribir 'Ingrese el tamaño del lado 2: '
	Leer lado2
	Escribir 'Ingrese el radio: '
	Leer radio
	areaTriangulo <- base * altura / 2
	areaCirculo <- 3.1416 * radio ^ 2
	areaRectangulo <- lado1 * lado2
	// Salida
	Escribir 'En base a las medidas que ha dado...'
	Escribir 'El area de un triangulo es ', areaTriangulo, 'cm2'
	escribir 'El area de un circulo es', areaCirculo, 'cm2'
	Escribir 'El area de un rectangulo es ', areaRectangulo, 'cm2' 
FinAlgoritmo
