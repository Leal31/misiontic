def leerArchivo(nombreArchivo):
    try:
        archivo = open(nombreArchivo)
    except:
        print('No se puede abrir el archivo')

def ingresarNombre(nombreArchivo):
    leerArchivo()
    nombre = input('Ingrese un nombre: ')





archivo = input('Ingrese el nombre del archivo a trabajar: ')


lectura = open(archivo, 'w')
contador = 0
while True:
    nombre = input('Ingrese su nombre')

    if nombre == '0':
        break
    archivo.write(f'{nombre}\n')
    contador = contador + 1

print(f'El archivo tiene {contador} lineas de texto')

archivo = open('cuento.txt')
caracteres = archivo.read()

print(f'El archivo tiene {len(caracteres)} caracteres')

archivo = open('cuento.txt')
contador1 = 0
for l in archivo:
    if l.find('E'):
        contador1 = contador1 + 1

print(f'Las veces que se encuentra la letra E es {contador1}')
