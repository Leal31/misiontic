def abrirArchivo(archivoUso, metodo):
    global nuevo
    if metodo == 'w':

        nuevo = open(archivoUso, 'w')
    elif metodo == 'r':
        nuevo = open(archivoUso)

def ponerNombre(nombre, archivoUsado):
   
    archivoUsado.write(f'{nombre}\n')

archivo = input('Ingresa el archivo a usar: ')

abrirArchivo(archivo, 'w')

contador = 0

while True:
    ponNombre = input('Ingresa cualquier nombre: ')
    if ponNombre == '0':
        break
    ponerNombre(ponNombre, nuevo)
    contador += 1

print(f'La cantidad de lineas que hay en el archivo son {contador}')

abrirArchivo(archivo, 'r')
caracteres = nuevo.read()

print(f'La cantidad de caracteres que tiene el archivo son {len(caracteres)}')

abrirArchivo(archivo, 'r')
contador = 0
for l in nuevo:
    if l.count('E'):
        contador += 1
print(f'Las veces que se encuentra la letra E es {contador}')
