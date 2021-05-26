import sys

opcion = 1
def mayorcero():
    numero = int(input('Ingrese un numero: '))
    if numero > 0:
        print(f'{numero} es mayor que 0')
    else:
        print(f'{numero} es menor que 0')

def primo():
    numero = 2
    acumulado = 0
    divisor = 0
    while numero >= 2 and numero <= 20:
        divisor = 2
        while numero % divisor != 0:
            divisor += 1
        if numero == divisor:
            acumulado = acumulado + numero
        numero = numero + 1
    return acumulado

def primo2():
    numero = 2
    acumulado = 0
    divisor = 0
    primo = 0
    while numero >= 2 and numero <= 20:
        divisor = 2
        while numero % divisor != 0:
            divisor += 1
        if numero == divisor:
            primo = primo + 1
            acumulado = acumulado + numero
        numero = numero + 1
    return primo, acumulado



def parimpar():
    numero = int(input('Ingrese un numero: '))
    if numero % 2 == 0:
        par = True
    else:
        par = False

    return par

def tablaMultiplicar(tabla, valorInicial, valorFinal):
    tabla = int(input('Ingrese una tabla a usar: '))
    valorInicial = int(input('Ingrese desde cuando se empezara a multiplicar: '))
    valorFinal = int(input('Ingrese hasta cuando se multiplicara: '))

    for i in range(valorInicial, valorFinal + 1, 1):
        resultado = tabla * i
        print(f'{tabla} x {i} tiene un resultado de {resultado}')

def mayusculaminuscula(texto):
    texto = input('Ingresa tu nombre: ')
    texto = texto.upper()
    return texto

while opcion >= 1 and opcion <= 8:
    print('1. Numero mayor que 0')
    print('2. suma de numeros primos')
    print('3. Retorno de booleano')
    print('4. indicar cuantos numeros primos y la suma')
    print('5. Tablas de multiplicar')
    print('6. Nombre a mayusculas')
    print('7. fibonacci')
    print('8. Salir')
    opcion = int(input('Ingresa una opcion: '))
    if opcion >= 1 and opcion <= 8:
        if opcion == 1:
            mayorcero()
        elif opcion == 2:
            print('La suma de numeros primos entre 2 y 20 es: ', primo())
        elif opcion == 3:
            if parimpar() == True:
                print('Es par')
            else:
                print('Es impar')
        elif opcion == 4:
            print('La cantidad de numeros enteros y la suma de estos es: ', primo2())
        elif opcion == 5:
            tabla = 0
            valorInicial = 0
            valorFinal = 0
            tablaMultiplicar(tabla, valorInicial, valorFinal)
        elif opcion == 6:
            texto = ''
            print('Tu nombre transformado en mayusculas es', mayusculaminuscula(texto))
        elif opcion == 7:
            
        elif opcion == 8:
            sys.exit()

else:
    print('opcion no valida')
