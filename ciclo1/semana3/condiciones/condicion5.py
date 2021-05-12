# Programa que permite saber si un empleado merece o no subsidio de Transporte
# definimos variables
nombre = input('Ingrese nombre de empleado: ')
salarioBruto = float(input('Ingrese salario del empleado: '))
salarioMinimo = 908526
# Se descuenta un total del 8% de salud y pension
dctoPension = salarioBruto * 0.04
dctoSalud = salarioBruto * 0.04
'''
si el salario del empleado es menor o igual a dos salarios
minimos se tendra auxilio de transporte
'''
if salarioBruto <= (salarioMinimo * 2):
    auxilioTransporte = 106454
    salarioNeto = (salarioBruto + auxilioTransporte) - (dctoSalud + dctoPension)
    print('Tiene auxilio de Transporte')
else:
    salarioNeto = salarioBruto - (dctoSalud + dctoPension)
    print('No tiene auxilio de Transporte')
# Se imprime el total del salario que ganara el empleado al mes
print(f'Nombre de empleado: {nombre}\nsalario Neto mensual de: {salarioNeto}')
