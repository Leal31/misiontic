# Programa que detecta los dias de pico y placa para las placas terminadas en 1 y 2
Placa = int(input('Ingrese su numero de placa: '))
# si el numero de placa es 1 o 2 sera pico y placa los dias lunes y jueves
if Placa == 1 or Placa == 2:
    print('El dia de pico y placa para usted son los dias lunes y jueves')
else:
    print('Los dias lunes y jueves no son su pico y placa')
