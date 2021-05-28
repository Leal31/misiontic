def hanoi(h):
    numeroIntentos = 2 ** h - 1
    return numeroIntentos

numeroDiscos = int(input('Ingrese el numero de discos del hanoi: '))
intentos = hanoi(numeroDiscos)
print('El numero de intentos posibles son', intentos)
