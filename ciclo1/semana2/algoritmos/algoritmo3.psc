Algoritmo sueldo
	// entrada
	// declaramos variables
	definir nombreEmpleado Como Caracter
	definir valorHora, horasTrabajadas, sueldoBruto, dctoSalud, dctoPension, sueldoNeto Como Real
	// procedimiento
	escribir 'Ingresa el nombre del empleado: '
	leer nombreEmpleado
	escribir 'Ingresa el valor de una hora en una empresa: '
	leer valorHora
	escribir 'Ingresa cuantas horas se trabajaron en un dia: '
	leer horasTrabajadas
	sueldoBruto <- (valorHora * horasTrabajadas) * 30
	dctoSalud <- sueldoBruto * 0.04
	dctoPension <- sueldoBruto * 0.04
	sueldoNeto <- sueldoBruto - (dctoPension + dctoSalud)
	// salida
	escribir 'Nombre de Empleado: ', nombreEmpleado
	escribir 'Sueldo Bruto Mensual: ', sueldoBruto
	escribir 'Sueldo Neto Mensual: ', sueldoNeto	
FinAlgoritmo
