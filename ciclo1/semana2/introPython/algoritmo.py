# programa para calcular la definitiva de un estudiante
# entrada
# declaracion de variables
nombre = input('Ingresa tu nombre por favor: ')
asignatura = input('Ingresa el nombre de la asignatura: ')
nota1 = float(input('Ingresa la primera nota: '))
nota2 = float(input('Ingresa la segunda nota: '))
# procedimientos
definitiva = (nota1 + nota2) / 2
# salida
print('El estudiante ', nombre, ' de la asignatura ', asignatura, ' tiene una nota definitiva de ', definitiva)
