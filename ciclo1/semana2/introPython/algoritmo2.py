# Programa para calcular definitiva por prioridades
# Entradas
# Declaracion de variables
nombre = input('Ingresa el nombre del estudiante: ')
asignatura = input('Ingresa la asignatura: ')
nota1 = float(input('Ingresa la primera nota: '))
nota2 = float(input('Ingresa la segunda nota: '))
nota3 = float(input('Ingresa la tercera nota: '))

# procedimientos
definitiva = (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4)

# salida
print(f'El estudiante {nombre} en la asignatura {asignatura} tiene una nota definitiva de {definitiva}')
