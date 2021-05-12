from math import sqrt
# Ecuacion de segundo grado
# Declaramos variables
a = int(input('Ingrese el valor de a: '))
b = int(input('Ingrese el valor de b: '))
c = int(input('Ingrese el valor de c: '))

# discriminante d
d = b * 2 - 4 * a * c 

# Verificamos que ningun numero sea 0 y si es verdad se dice que es una ecuacion incompleta
if a == 0:
    print('Es una ecuacion incompleta')
elif b == 0:
    print('Es una ecuacion incompleta')
elif c == 0:
    print('Es una ecuacion incompleta')
else:
    print('Es una ecuacion completa')

'''
si d es igual a 0 no se haran raices cuadradas
por lo tanto ese paso se omitira en las variables x1 y x2
'''
if d == 0:

    # Soluciones 1 y 2
    x1 = -b / (2 * a)
    x2 = -b / (2 * a)

    # Ecuaciones determinadas por las soluciones x1 y x2
    ecuacion1 = a * x1 ** 2 + b * x1 + c
    ecuacion2 = a * x2 ** 2 + b * x2 + c

    print('Debido a que la discriminante es 0 se omitira la cuadratica')
    
    #se dicen explicitamente los valores d y la solucion a las dos ecuaciones
    print(f'El valor de d es: {d}\ny la solucion numero 1 de la ecuacion es {ecuacion1}\ny la solucion numero 2 de la ecuacion es {ecuacion2}')

    '''
    En este punto se empezara a hacer una condicional donde se tendra en cuenta
    la ecuacion 1 y la ecuacion 2, en la cual si ambos valores son negativos
    se sumara la ecuacion 1 con la ecuacion 2 y viceversa, si son positivos ambos
    valores se restara en vez de sumar, y si uno es positivo y uno es negativo primero
    se restara la ecuacion 1 con la ecuacion 2 y se sumara la ecuacion 1 con la ecuacion 2
    y por ultimo se tendra en cuenta si la ecuacion 1 es negativo y ecuacion 2 es positivo
    se va a sumar la ecuacion 1 con la ecuacion 2 y se restara la ecuacion 1 con la ecuacion 2
    '''
    if ecuacion1 > 0 and ecuacion2 > 0:
        ecuaciondef = (ecuacion1 - ecuacion2) * (ecuacion2 - ecuacion2)
    elif ecuacion1 < 0 and ecuacion2 < 0:
        ecuaciondef = (ecuacion1 + abs(ecuacion2)) * (ecuacion2 + abs(ecuacion1))
    elif ecuacion1 > 0 and ecuacion2 < 0:
        ecuaciondef = (ecuacion1 - ecuacion2) * (ecuacion2 + ecuacion1)
    else:
        ecuaciondef = (ecuacion1 + ecuacion2) * (ecuacion2 - ecuacion1)

    '''
    Independientemente de cual condicion sea, se va a mostrar en pantalla
    la ecuacion definitiva que si todo va bien debe ser 0
    '''
    print(f'Asi que la solucion definitiva es {ecuaciondef}')

    '''
    Condicional donde se verifica que d sea mayor que 0 lo cual
    en teoria debe ser la mayoria de casos
    '''
elif d > 0:

    # Se da las variables x1 y x2 siendo practicamente iguales cambiando solo el signo de + y -
    x1 = (-b + sqrt(d)) / 2 * a
    x2 = (-b - sqrt(d)) / 2 * a

    # Se hace la ecuacion teniendo en cuenta los valores de x1 y x2
    ecuacion1 = a * x1 ** 2 + b * x1 + c
    ecuacion2 = a * x2 ** 2 + b * x2 + c 
    print('la discriminante es mayor que 0')
    # Se muestra explicitamente el valor de d y el valor de la ecuacion con x1 y con x2
    print(f'El valor de d es: {d} y la solucion numero 1 de la ecuacion es {ecuacion1} y la solucion numero 2 de la ecuacion es {ecuacion2}')
    
    '''
    En este punto se empezara a hacer una condicional donde se tendra en cuenta
    la ecuacion 1 y la ecuacion 2, en la cual si ambos valores son negativos
    se sumara la ecuacion 1 con la ecuacion 2 y viceversa, si son positivos ambos
    valores se restara en vez de sumar, y si uno es positivo y uno es negativo primero
    se restara la ecuacion 1 con la ecuacion 2 y se sumara la ecuacion 1 con la ecuacion 2
    y por ultimo se tendra en cuenta si la ecuacion 1 es negativo y ecuacion 2 es positivo
    se va a sumar la ecuacion 1 con la ecuacion 2 y se restara la ecuacion 1 con la ecuacion 2
    '''
    if ecuacion1 > 0 and ecuacion2 > 0:
        ecuaciondef = (ecuacion1 - ecuacion2) * (ecuacion2 - ecuacion2)
    elif ecuacion1 < 0 and ecuacion2 < 0:
        ecuaciondef = (ecuacion1 + ecuacion2) * (ecuacion2 + ecuacion1)
    elif ecuacion1 > 0 and ecuacion2 < 0:
        ecuaciondef = (ecuacion1 - ecuacion2) * (ecuacion2 + ecuacion1)
    else:
        ecuaciondef = (ecuacion1 + ecuacion2) * (ecuacion2 - ecuacion1)

    '''
    Independientemente de la condicion verdadera se mostrara el valor de 
    la ecuacion definitiva
    '''
    print(f'Por lo tanto la solucion definitiva es {ecuaciondef}')

# Condicional si la discriminante es negativa
else:
    
    # debido a que a los numeros negativos no se les saca raiz cuadrada no sera una solucion real
    solucionReal1 = -b / (2 * a)
    solucionReal2 = -b / (2 * a)
    solucionImaginaria1 = (-b + sqrt(abs(d))) / (2 * a)
    solucionImaginaria2 = (-b - sqrt(abs(d))) / (2 * a)
    print(f'La solucion no puede ser real por lo que se daran resultados imaginarios:\nLa solucion real 1 es {solucionReal1}\nY la solucion imaginaria 1 es {solucionImaginaria1}\nLa solucion real 2 es {solucionReal2} y la solucion imaginaria es {solucionImaginaria2}')

    '''
    En este punto se empezara a hacer una condicional donde se tendra en cuenta
    la ecuacion 1 y la ecuacion 2, en la cual si ambos valores son negativos
    se sumara la ecuacion 1 con la ecuacion 2 y viceversa, si son positivos ambos
    valores se restara en vez de sumar, y si uno es positivo y uno es negativo primero
    se restara la ecuacion 1 con la ecuacion 2 y se sumara la ecuacion 1 con la ecuacion 2
    y por ultimo se tendra en cuenta si la ecuacion 1 es negativo y ecuacion 2 es positivo
    se va a sumar la ecuacion 1 con la ecuacion 2 y se restara la ecuacion 1 con la ecuacion 2
    '''
    if solucionImaginaria1 > 0 and solucionImaginaria2 > 0:
        ecuaciondef = (solucionImaginaria1 - solucionImaginaria2) * (solucionImaginaria1 - solucionImaginaria2)
    elif solucionImaginaria1 < 0 and solucionImaginaria2 < 0:
        ecuaciondef = (solucionImaginaria1 + solucionImaginaria2) * (solucionImaginaria1 + solucionImaginaria2)
    elif solucionImaginaria1 > 0 and solucionImaginaria2 < 0:
        ecuaciondef = (solucionImaginaria1 - solucionImaginaria2) * (solucionImaginaria1 + solucionImaginaria2)
    else:
        ecuaciondef = (solucionImaginaria1 + solucionImaginaria2) * (solucionImaginaria1 - solucionImaginaria2)
    print(f'El resultado de la ecuacion definitiva es {ecuaciondef}')



