Algoritmo Reto1
	// Ingresa un Algoritmo que pida articulo comprado, codigo y cantidad de articulos y precio, se pediran maximo 3 articulos
	// Entradas
	// Declaracion de variables
	definir articulo1, articulo2, articulo3 Como Caracter
	definir codigo1, codigo2, codigo3 Como Entero
	definir cantidadArticulo1, cantidadArticulo2, cantidadArticulo3 Como Entero
	definir precioArticulo1, precioArticulo2, precioArticulo3, totalPago Como Real
	// En el caso que hayan menos de 3 articulos, se dejara en blanco la casilla del articulo siguiente
	// procedimientos
	escribir 'Inscribe el articulo 1: '
	leer articulo1
	escribir 'Inscribe codigo del articulo 1: '
	leer codigo1
	escribir 'Inscribe la cantidad del articulo 1: '
	leer cantidadArticulo1
	escribir 'Inscribe el precio del articulo 1: '
	leer precioArticulo1
	escribir 'Inscribe el articulo 2: '
	leer articulo2
	escribir 'Inscribe codigo del articulo 2: '
	leer codigo2
	escribir 'Inscribe la cantidad del articulo 2: '
	leer cantidadArticulo2
	escribir 'Inscribe el precio del articulo 2: '
	leer precioArticulo2
	escribir 'Inscribe el articulo 3: '
	leer articulo3
	escribir 'Inscribe codigo del articulo 3: '
	leer codigo3
	escribir 'Inscribe la cantidad del articulo 3: '
	leer cantidadArticulo3
	escribir 'Inscribe el precio del articulo 3: '
	leer precioArticulo3
	// tomando en cuenta los datos solicitados se hara el total del pago de siguiente manera
	totalPago <- (precioArticulo1 * cantidadArticulo1) + (precioArticulo2 * cantidadArticulo2) + (precioArticulo3 * cantidadArticulo3)
	// Salidas
	escribir 'Nombre del articulo: ',articulo1 ,' --- Codigo: ',codigo1, ' --- Cantidad: ',cantidadArticulo1, ' --- Precio: ', precioArticulo1
	escribir 'Nombre del articulo: ',articulo2 ,' --- Codigo: ',codigo2, ' --- Cantidad: ',cantidadArticulo2, ' --- Precio: ', precioArticulo2
	escribir 'Nombre del articulo: ',articulo3 ,' --- Codigo: ',codigo3, ' --- Cantidad: ',cantidadArticulo3, ' --- Precio: ', precioArticulo3
	escribir 'El total a pagar es: ', totalPago
FinAlgoritmo
