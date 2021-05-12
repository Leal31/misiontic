# Programa que pide un numero y te dice que dia de la semana es
dia = int(input('Ingrese un numero del 1 al 7: '))
'''
Compara del 1 al 7 encacillando en cada dia
un numero y si se sale del rango especificado
se dice directamente que no es caracter valido
'''

if dia == 1:
    print('El dia es Lunes')
else:
    if dia == 2:
        print('El dia es Martes')
    else:
        if dia == 3:
            print('El dia es Miercoles')
        else:
            if dia == 4:
                print('El dia es Jueves')
            else:
                if dia == 5:
                    print('El dia es Viernes')
                else:
                    if dia == 6:
                        print('El dia es Sabado')
                    else:
                        if dia == 7:
                            print('El dia es Domingo')
                        else:
                            print('No es caracter valido')
