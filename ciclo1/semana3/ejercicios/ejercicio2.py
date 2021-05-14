from sys import exit
from math import sqrt
print('----------MENU DE FUNDAMENTOS DE INFORMACION----------')
print('Ingrese una de las siguientes opciones')
print('1.  Numero mayor que cero')
print('2.  Numero par o impar')
print('3.  subsidio de transporte')
print('4.  Notas estudiantes')
print('5.  Pico y placa')
print('6.  Producto')
print('7.  Ecuacion de segundo grado')
print('8.  Bolita')
print('9.  Cuadrado - cubo - raiz')
print('10. Dia de la semana')
print('11. salir')

opcion = int(input('Ingrese cualquiera de las opciones mostradas: '))

if opcion >= 1 and opcion <= 11:
    if opcion == 1:
        # Ingresar un numero y verificar que sea mayor que 0
        numero = int(input('Ingrese cualquier numero: '))
        # si el numero ingresado es mayor que 0 se indica
        if numero > 0:
            print('El numero ', numero, 'es mayor que 0')
        else:
            print('El numero ', numero, 'no es mayor que 0')
    elif opcion == 2:
        # Programa que verifica que un numero es par o impar
        numero = int(input('Ingrese cualquier numero: '))
        # si el numero ingresado por el usuario tiene de residuo 0 sera par
        if numero % 2 == 0:
            print('El numero es par')
        else:
            print('El numero es impar')
    elif opcion == 3:
        # Programa que permite saber si un empleado merece o no subsidio de Transporte
        # definimos variables
        nombre = input('Ingrese nombre de empleado: ')
        salarioBruto = float(input('Ingrese salario del empleado: '))
        salarioMinimo = 908526
        # Se descuenta un total del 8% de salud y pension
        dctoPension = salarioBruto * 0.04
        dctoSalud = salarioBruto * 0.04
        '''
        si el salario del empleado es menor o igual a dos salarios
        minimos se tendra auxilio de transporte
        '''
        if salarioBruto <= (salarioMinimo * 2):
            auxilioTransporte = 106454
            salarioNeto = (salarioBruto + auxilioTransporte) - (dctoSalud + dctoPension)
            print('Tiene auxilio de Transporte')
        else:
            salarioNeto = salarioBruto - (dctoSalud + dctoPension)
            print('No tiene auxilio de Transporte')
        # Se imprime el total del salario que ganara el empleado al mes
        print(f'Nombre de empleado: {nombre}\nsalario Neto mensual de: {salarioNeto}')
    elif opcion == 4:
        # Programa que permite saber el promedio de un estudiante
        nombre = input('Ingrese nombre del estudiante: ')
        asignatura = input('Ingrese el nombre de la asignatura: ')
        nota1 = int(input('Ingrese la primera nota: '))
        nota2 = int(input('Ingrese la segunda nota: '))
        nota3 = int(input('Ingrese la tercera nota: '))
        # Teniendo en cuenta las notas se va a sacar el promedio en base a estos parametros
        # nota1 tiene un valor de 30%
        # nota2 tiene un valor de 30%
        # nota3 tiene un valor de 30%
        notaFinal = (nota1 * 0.30) + (nota2 * 0.30) + (nota * 0.40)
        if notaFinal >= 3.0:
            print(f'El estudiante {nombre} con una nota definitiva de {notaFinal} aprobó la materia de {asignatura}')
        else:
            print(f'El estudiante {nombre} con una nota definitiva de {notaFinal} reprobó la materia de {asignatura}')
    elif opcion == 5:
        # Programa que detecta los dias de pico y placa para las placas terminadas en 1 y 2
        Placa = int(input('Ingrese su numero de placa: '))
        # si el numero de placa es 1 o 2 sera pico y placa los dias lunes y jueves
        if Placa == 1 or Placa == 2:
            print('El dia de pico y placa para usted son los dias lunes y jueves')
        else:
            print('Los dias lunes y jueves no son su pico y placa')
    elif opcion == 6:
        # Programa que permite saber si un cliente merece un descuento o no por su compra
        # definimos variables
        producto = input('Ingrese el nombre del producto: ')
        precio = float(input('Ingrese el precio del producto: '))
        cantidad = int(input('Ingrese la cantidad del producto: '))
        totalPago = (precio * cantidad)
        # si la cantidad del producto es mayor a 50 unidades se tendra descuento
        if cantidad > 50:
            dcto = totalPago * 0.30
            totalPago = totalPago - dcto
            print(f'Se aplica descuento de 30%\nDescuento Total: {dcto}')
        else:
            dcto = 0
            totalPago = totalPago - dcto
            print('No se aplica descuento')
        # imprimimos el total a pagar independientemente de si esa condicion es falsa o verdadera
        print(f'El total a pagar es: {totalPago}')
    elif opcion == 7:
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
    elif opcion == 8:
        # Programa de descuentos
        nombre = input('Ingrese su nombre: ')
        producto = input('Ingrese el nombre del producto: ')
        precio = float(input('Ingrese el precio del producto: '))
        cantidad = int(input('Ingrese la cantidad del producto: '))
        bolita = input('Meta la mano en esta bolsa y saque una bolita, de que color salio?').lower()

        if bolita == 'negro':
            totalBruto = precio * cantidad
            dcto = totalBruto * 0.40
            totalNeto = totalBruto - dcto
            print('Tiene un descuento del 40%')
        elif bolita == 'rojo':
            totalBruto = precio * cantidad
            dcto = totalBruto * 0.30
            totalNeto = totalBruto - dcto
            print('Tiene un descuento del 30%')
        elif bolita == 'verde':
            totalBruto = precio * cantidad
            dcto = totalBruto * 0.60
            totalNeto = totalBruto - dcto
            print('Tiene un descuento del 60%')
        elif bolita == 'azul':
            totalBruto = precio * cantidad
            dcto = totalBruto * 0.50
            totalNeto = totalBruto - dcto
            print('Tiene un descuento del 50%')
        elif bolita == 'amarillo':
            totalBruto = precio * cantidad
            dcto = totalBruto * 0.20
            totalNeto = totalBruto - dcto
            print('Tiene un descuento del 20%')
        elif bolita == 'blanco':
            totalBruto = precio * cantidad
            dcto = 0
            totalNeto = totalBruto - dcto
            print('No tiene ningun descuento')
        else:
            print('No es un color de bola valido')

        print(f'Nombre Cliente: {nombre}\nProducto: {producto}\nPrecio del Producto: {precio}\nCantidad del producto: {cantidad}\nBola que salio: {bolita}\nTotal sin descuento: {totalBruto}\nDescuento: {dcto}\nTotal con Descuento: {totalNeto}')
    elif opcion == 9:
        '''
        Programa que te pide un numero y si es menor que 0 se le sacara potencia
        al cubo, si esta entre 0 y 100 se le saca potencia al cuadrado y si es mayor que eso
        se le saca raiz cuadrada
        '''
        numero = float(input('Ingresa un numero: '))
        if numero < 0:
            numero = numero ** 3
            print(f'Debido a que el numero es menor que 0: \nEl cubo del numero ingresado es {numero}')
        elif numero >= 0 and numero <= 100:
            numero = numero ** 2
            print(f'Debido a que el numero esta entre el 0 y el 100: \nEl cuadrado del numero ingresado es {numero}')
        else:
            numero = sqrt(numero)
            print(f'Debido a que el numero es mayor que 100: \nLa raiz cuadrada del numero ingresado es {numero}')
    elif opcion == 10:
        # Programa que pide un numero y te dice que dia de la semana es
        dia = int(input('Ingresa un numero del 1 al 7: '))
        '''
        Compara del 1 al 7 encacillando en cada dia
        un numero y si se sale del rango especificado
        se dice directamente que no es caracter valido
        '''
        if dia == 1:
            print('El dia de la semana es Lunes')
        elif dia == 2:
            print('El dia de la semana es Martes')
        elif dia == 3:
            print('El dia de la semana es Miercoles')
        elif dia == 4:
            print('El dia de la semana es Jueves')
        elif dia == 5:
            print('El dia de la semana es Viernes')
        elif dia == 6:
            print('El dia de la semana es Sabado')
        elif dia == 7:
            print('El dia de la semana es Domingo')
        else:
            print('No es un numero o caracter valido')
    elif opcion == 11:
        print('Adios')
        exit()
else:
    print('No es una opcion valida')
    exit()
print('Gracias por visitarnos')
exit()
