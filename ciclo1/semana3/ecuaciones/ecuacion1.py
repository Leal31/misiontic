from math import sqrt
# Programa para sacar una ecuacion de segundo grado
a = int(input('Ingrese el valor de a: '))
b = int(input('Ingrese el valor de b: '))
c = int(input('Ingrese el valor de c: '))
if a == 0:
    print('No es una ecuacion cuadratica')
    exit()
else:
    # Variable discriminante
    d = (b ** 2) - (4 * a * c)
    if d == 0:
        x1 = (-b / (2 * a))
        x2 = x1
        print(f'X1 = {x1} y X2 = {x2}')
    elif d > 0:
        x1 = (-b + sqrt(d)) / (2 * a)
        x2 = (-b - sqrt(d)) / (2 * a)
        print(f'X1 = {x1} y X2 = {x2}')
    else:
        Real = -b / (2 * a)
        Imaginario = sqrt(abs(d)) / (2 * a)
        print(f'X1 = {Real} + {Imaginario}j')
        print(f'X2 = {Real} - {Imaginario}j')
