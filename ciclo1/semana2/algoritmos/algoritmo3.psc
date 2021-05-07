Algoritmo sueldo
	// entrada
	// declaramos variables
	definir nombreEmpleado1, nombreEmpleado2, nombreEmpleado3 Como Caracter
	definir valorHora Como Real
	definir horasTrabajadas1, horasTrabajadas2, horasTrabajadas3 Como Real
	definir sueldoBruto1, sueldoBruto2, sueldoBruto3 Como Real
	definir dctoSalud1, dctoSalud2, dctoSalud3, dctoPension1, dctoPension2, dctoPension3 Como Real
	definir sueldoNeto1, sueldoNeto2, sueldoNeto3 Como Real
	definir sueldoTotal Como Real
	// procedimiento
	escribir 'Ingresa el nombre del empleado 1: '
	leer nombreEmpleado1
	escribir 'Ingresa el nombre del empleado 2: '
	leer nombreEmpleado2
	escribir 'Ingrese nombre del empleado 3: '
	leer nombreEmpleado3
	escribir 'Ingresa el valor de una hora en una empresa: '
	leer valorHora
	escribir 'Ingresa cuantas horas se trabajaron en un dia por el empleado 1: '
	leer horasTrabajadas1
	escribir 'Ingresa cuantas horas se trabajaron en un dia por el empleado 2: '
	leer horasTrabajadas2
	escribir 'Ingresa cuantas horas se trabajaron en un dia por el empleado 3: '
	leer horasTrabajadas3
	// Iniciamos el calculo del salario bruto 
	sueldoBruto1 <- (valorHora * horasTrabajadas1) * 30
	sueldoBruto2 <- (valorHora * horasTrabajadas1) * 30
	sueldoBruto3 <- (valorHora * horasTrabajadas3) * 30
	// Calculamos los descuentos por salud y por pension
	dctoSalud1 <- sueldoBruto1 * 0.04
	dctoPension1 <- sueldoBruto1 * 0.04
	dctoSalud2 <- sueldoBruto2 * 0.04
	dctoPension2 <- sueldoBruto2 * 0.04
	dctoSalud3 <- sueldoBruto3 * 0.04
	dctoPension3 <- sueldoBruto3 * 0.04
	// Calculamos los salarios netos de los empleados
	sueldoNeto1 <- sueldoBruto1 - (dctoPension1 + dctoSalud1)
	sueldoNeto2 <- sueldoBruto2 - (dctoPension2 + dctoSalud2)
	sueldoNeto3 <- sueldoBruto3 - (dctoPension3 + dctoPension3)
	sueldoTotal <- sueldoBruto1 + sueldoBruto2 + sueldoBruto3
	// salida
	escribir 'Nombre de Empleado: ', nombreEmpleado1
	escribir 'Sueldo Bruto Mensual: ', sueldoBruto1
	escribir 'Sueldo Neto Mensual: ', sueldoNeto1
	escribir 'Nombre de Empleado: ', nombreEmpleado2
	escribir 'Sueldo Bruto Mensual: ', sueldoBruto2
	escribir 'Sueldo Neto Mensual: ', sueldoNeto2	
	escribir 'Nombre de Empleado: ', nombreEmpleado3
	escribir 'Sueldo Bruto Mensual: ', sueldoBruto3
	escribir 'Sueldo Neto Mensual: ', sueldoNeto3
	escribir 'El total a pagar por lasempresa es: ', sueldoTotal 

FinAlgoritmo
