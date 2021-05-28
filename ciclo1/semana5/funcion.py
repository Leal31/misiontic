import sys
# Se determina opcion 1 para que el ciclo pueda ser ejecutado
opcion = 1
# Se declara una funcion por cada opcion posible
# En este caso es determinar si un numero es mayor o menor que 0
def mayorcero():
    numero = int(input('Ingrese un numero: '))
    if numero > 0:
        print(f'{numero} es mayor que 0')
    else:
        print(f'{numero} es menor que 0')
# En este caso se determina la suma de todos los numeros primos entre 2 y 20
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
# En este caso se determina cuantos numeros primos hay entre el 2 y el 20 y se muestra la suma de estos
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


# En este caso se determina si un numero es par o impar mediante booleanos
def parimpar():
    numero = int(input('Ingrese un numero: '))
    if numero % 2 == 0:
        par = True
    else:
        par = False

    return par
# En este caso se va a imprimir las tablas de multiplicar ingresando parametros como la tabla desde cuando hasta cuando
def tablaMultiplicar(tabla, valorInicial, valorFinal):
    tabla = int(input('Ingrese una tabla a usar: '))
    valorInicial = int(input('Ingrese desde cuando se empezara a multiplicar: '))
    valorFinal = int(input('Ingrese hasta cuando se multiplicara: '))

    for i in range(valorInicial, valorFinal + 1, 1):
        resultado = tabla * i
        print(f'{tabla} x {i} = {resultado}')
# Ingresas un texto y te lo regresa en mayusculas
def mayusculaminuscula(texto):
    texto = input('Ingresa cualquier texto: ')
    texto = texto.upper()
    return texto
# Los numeros de fibonacci
def fib(numero):
    if numero == 0:
        return 0
    elif numero == 1:
        return 1
    else:
        return fib(numero - 1) + fib(numero - 2)
# Bucle que se repite para que sea el usuario el que decide cuando salirse
while opcion >= 1 and opcion <= 8:
    # Se imprimen todas las opciones
    print('\n1. Numero mayor que 0')
    print('2. suma de numeros primos')
    print('3. Retorno de booleano')
    print('4. indicar cuantos numeros primos y la suma')
    print('5. Tablas de multiplicar')
    print('6. Nombre a mayusculas')
    print('7. fibonacci')
    print('8. Salir')
    # El usuario decide que opcion va a poner
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
            print('El texto ingresado convertido a mayusculas es: ', mayusculaminuscula(texto))
        elif opcion == 7:
            numero = int(input('Ingresa un numero: '))
            for i in range(0, numero + 1, 1):
                if i == 0:
                    continue
                fibonacci = fib(i)
                print(fibonacci, end=' ')
        elif opcion == 8:
            sys.exit()
else:
    print('opcion no valida')
