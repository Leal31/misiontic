# Abrir archivos con python

archivo = open('mbox.txt')

# Contar lineas del archivo
contador=0

for l in archivo:
    contador = contador + 1
print('Contador de lineas: ', contador)

# contar caracteres del archivo
archivo = open('mbox.txt')
caracter = archivo.read()
print(f'Los caracteres del archivo son: {len(caracter)}')


print(caracter[: 300])
