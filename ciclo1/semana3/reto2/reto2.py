from sys import exit
# Reto 2
'''
Programa que pide nombre y apellido edad,
puntaje y numero de salarios minimos y te da
un descuento en base a esos datos 
'''

# Piden datos personales de los candidatos
apellidos = input('Ingrese los apellidos del candidato: ')
nombres = input('Ingrese el nombre o los nombres del candidato: ')
edad = int(input('Ingrese la edad del candidato: '))
sueldo = float(input('Ingrese el numero de salarios minimos que tiene de ingreso familiar el candidato'))

# Piden un examen de aptitud academica y se tendra que escribir la nota final que obtuvo
notaExamen = int(input('Ingresa la nota del examen(del 0 al 100): '))

# Calcula el porcentaje del descuento de la matricula en base a esos datos
# Primero se calcula un descuento en base a la edad
if edad >= 15 and edad <= 18:
    dctoEdad = 25
elif edad >= 19 and edad <= 21:
    dctoEdad = 15
elif edad >= 22 and edad <= 25:
    dctoEdad = 10
else:
    dctoEdad = 0

# Luego se calcula el descuento en base a los salarios minimos del ingreso familiar
if sueldo <= 1:
    dctoIngresos = 30
elif sueldo > 1 and sueldo <= 2:
    dctoIngresos = 20
elif sueldo > 2 and sueldo <= 3:
    dctoIngresos = 10
elif sueldo > 3 and sueldo <= 4:
    dctoIngresos = 5
else:
    dctoIngresos = 0

# Luego se calcula el descuento en base a el puntaje adquirido en la prueba de aptitud
if notaExamen >= 0 and notaExamen <= 100:
    if notaExamen >= 80 and notaExamen < 86:
        dctoExamen = 30
    elif notaExamen >= 86 and notaExamen < 91:
        dctoExamen = 35
    elif notaExamen >= 91 and notaExamen < 96:
        dctoExamen = 40
    elif notaExamen >= 96:
        dctoExamen = 45
    else:
        dctoExamen = 0
else:
    print('No es un caracter valido')
    sys.exit()

# Se muestra en pantalla los diferentes descuentos y al final se suman
print(f'Apellidos del candidato: {apellidos}')
print(f'Nombres del candidato: {nombres}')
print(f'Edad del candidato: {edad} años')
print(f'Porcentaje de descuento por edad del candidato: {dctoEdad}%')
print(f'Porcentaje de descuento por ingreso familiar del candidato: {dctoIngresos}%')
print(f'Porcentaje de descuento por nota en examen de aptitud del candidato: {dctoExamen}%')

# Se calcula el descuento final del candidato en variable descuento definitivo
dctoDefinitivo = dctoEdad + dctoIngresos + dctoExamen

# se imprime en pantalla el descuento final del candidato
print(f'Descuento definitivo por matricula: {dctoDefinitivo}%')
