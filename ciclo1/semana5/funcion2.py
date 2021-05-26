def tablaMultiplicar(tabla, valorInicial, valorFinal):
    for i in range(valorInicial, valorFinal + 1, 1):
        resultado = tabla * i
        print(f'{tabla} x {i} tiene un resultado de {resultado}')

tabla = int(input('Ingrese una tabla a usar: '))
valorInicial = int(input('Ingrese desde cuando se empezara a multiplicar: '))
valorFinal = int(input('Ingrese hasta cuando se multiplicara: '))

tablaMultiplicar(tabla, valorInicial, valorFinal)
