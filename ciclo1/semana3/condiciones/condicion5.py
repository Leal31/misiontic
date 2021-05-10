nombre = input('Ingrese nombre de empleado: ')
salarioBruto = float(input('Ingrese salario del empleado: '))
salarioMinimo = 908526

if salarioBruto <= (salarioMinimo * 2):
    auxilioTransporte = 106454
    salarioBruto = salarioBruto + auxilioTransporte
    print('Tiene auxilio de Transporte')
else:
    print('No tiene auxilio de Transporte')
dctoPension = salarioBruto * 0.04
dctoSalud = salarioBruto * 0.04
salarioNeto = salarioBruto - (dctoSalud + dctoPension)

print(f'Nombre de empleado: {nombre}\nsalario Neto mensual de: {salarioNeto}')
