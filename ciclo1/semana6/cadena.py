fruta = 'banana'
print(fruta, end = ' ')
letra = fruta[2]
print(letra)

indice = 0
while indice < len(fruta):
    letra = fruta[indice]
    print(letra, end = ' ')
    indice = indice + 1
print('\n')


nueva = fruta.upper()
print(nueva, end = ' ')
