def abrirArchivo(archivoUso, metodo):
    global nuevo
    if metodo == 'w':

        nuevo = open(archivoUso, 'w')
    elif metodo == 'r':
        nuevo = open(archivoUso, 'r')

def contarLineas(archivoAbierto):
    contador = 0
    for i in archivoAbierto:
        contador += 1

    return contador

def contarCaracteres(archivoAbierto):

    abrirArchivo(archivo, 'r')
    caracteres = nuevo.read()

    return caracteres

def contarPalabras(palabra):
    contador = 0
    abrirArchivo(archivo, 'r')
    for l in nuevo:
        l.rstrip()
        

    return contador

archivo = input('Ingresa el archivo a usar: ')

abrirArchivo(archivo, 'r')

print(f'La cantidad de lineas que tiene el archivo {archivo} son {contarLineas(nuevo)}')

print(f'La cantidad de caracteres que tiene el archivo {archivo} son {len(contarCaracteres(nuevo))}')

palabra = input('Ingrese que palabra quiere que se cuente en el texto: ')

print(f'Las veces que se encuentra la palabra "{palabra}" son {contarPalabras(palabra)}')
