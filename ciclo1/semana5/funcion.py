import sys

opcion = 1
def opcion1():
    numero = int(input('Ingrese un numero: '))
    if numero > 0:
        print(f'{numero} es mayor que 0')
    else:
        print(f'{numero} es menor que 0')

def opcion2():
    numero = 2
    acumulado = 0
    divisor = 0
    while numero > 1 and numero < 20:
        numero += 1
        divisor = 2
        while numero % divisor != 0:
            divisor += 1
        if numero == divisor:
            acumulado += numero

    return acumulado


def opcion3():
    numero = int(input('Ingrese un numero: '))
    if numero % 2 == 0:
        par = True
    else:
        par = False

    return par


while opcion >= 1 and opcion <= 4:
    print('1. Numero mayor que 0')
    print('2. suma de numeros primos')
    print('3. Retorno de booleano')
    print('4. Salir')
    opcion = int(input('Ingresa una opcion: '))
    if opcion >= 1 and opcion <= 4:
        if opcion == 1:
            opcion1()
        elif opcion == 2:
            print('el resultado es: ', opcion2())
        elif opcion == 3:
            print(opcion3())
        elif opcion == 4:
            sys.exit()

else:
    print('opcion no valida')
