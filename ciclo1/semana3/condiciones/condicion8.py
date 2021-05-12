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
