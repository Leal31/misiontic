# Se van a registrar todas las temperaturas de los dias en los que se estuvo en el campus
temperaturaMinimaError = 0
temperaturaMaximaError = 0
temperaturaMinimaTotal = 0
temperaturaMaximaTotal = 0
temperaturaError = 0
diaRegistrado = 0

# Bucle infinito
while True:

    # Se ingresa la temperatura minima y maxima por cada vez que se inicie el ciclo
    temperaturaMaxima = float(input('Ingrese la temperatura maxima registrada: '))
    temperaturaMinima = float(input('Ingrese la temperatura minima de ese dia: '))
    # Si ambas temperaturas son 0 se rompe el ciclo
    if temperaturaMinima == 0 and temperaturaMaxima == 0:
        break
    # Si la tempatura maxima y minima dan error osea son mayores que 35 y menor que 5 se da error general
    elif temperaturaMinima < 5 and temperaturaMaxima > 35:
        # Cuando hay un error general no se cuenta el dia
        temperaturaError = temperaturaError + 1
    elif temperaturaMinima < 5:
        temperaturaMinimaError = temperaturaMinimaError + 1
    elif temperaturaMaxima > 35:
        temperaturaMaximaError = temperaturaMaximaError + 1
        
    else:
        temperaturaMinimaTotal = temperaturaMinimaTotal + temperaturaMinima
        temperaturaMaximaTotal = temperaturaMaximaTotal + temperaturaMaxima
    diaRegistrado = diaRegistrado + 1
    

diasErrores = temperaturaMinimaError + temperaturaMaximaError + temperaturaError
diaSinError = diaRegistrado - diasErrores
promedioTemperaturaMaxima = temperaturaMaximaTotal / diaSinError
promedioTemperaturaMinima = temperaturaMinimaTotal / diaSinError
porcentajeErrores = diasErrores * 100 / diaRegistrado

print('--------------------EN BASE A ESTOS DATOS--------------------')
print(f'Los dias que la salida de campo duro fueron: {diaRegistrado}')
print(f'Las veces que se reportaron errores fueron: {diasErrores}')
print(f'Las veces que se reportaron errores con temperaturas menores a 5 grados fueron: {temperaturaMinimaError}')
print(f'Las veces que se reportaron errores con temperaturas mayores a 35 grados fueron: {temperaturaMaximaError}')
print(f'Las veces que se reportaron errores con ambas temperaturas fueron: {temperaturaError}')
print(f'La temperatura media maxima que se obtuvo es de {promedioTemperaturaMaxima} grados')
print(f'La temperatura media minima que se obtuvo es de {promedioTemperaturaMinima} grados')
print(f'El porcentaje de veces que se obtuvo errores respecto al total de dias fue del {porcentajeErrores}%')

