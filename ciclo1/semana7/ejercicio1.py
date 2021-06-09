archivo = open('cuento.txt')
contador = 0
for l in archivo:
    contador += 1
print('El archivo tiene ', contador, 'lineas')

archivo = open('cuento.txt')
caracter = archivo.read()
print('Los caracteres del cuento son', len(caracter))

archivo = open('cuento.txt')
contador1 = 0
contador2 = 0
for l in archivo:
    if l.find('Le'):
        contador1 = contador1 + 1
    if l.find('su'):
        contador2 = contador2 + 1

print(f'Las veces que se encuentra la palabra Le es {contador1}')
print(f'Las veces que se encuentra la palabra su es {contador2}')
