# Programa que verifica que un numero es par o impar
numero = int(input('Ingrese cualquier numero: '))
# si el numero ingresado por el usuario tiene de residuo 0 sera par
if numero % 2 == 0:
    print('El numero es par')
else:
    print('El numero es impar')
