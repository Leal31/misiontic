import sys
while True:
    divisor = 2
    numero = int(input('Ingrese un numero: '))
    if numero > 1:
        while numero % divisor != 0:
            divisor = divisor + 1
        if numero  == divisor:
            print('Es primo')
        else:
            print('No Es primo')
        decision = input('Ingresara otro numero?(S/N)')
        if decision.upper() == 'N':
            sys.exit()
