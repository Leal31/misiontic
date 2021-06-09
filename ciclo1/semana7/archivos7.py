import sys
archivo = input('Ingresa nombre del archivo: ')
try:
    nuevo = open(archivo)
except:
    print('No se puede abrir el archivo')
    sys.exit()
contador = 0
for l in nuevo:
    if l.startswith('Subject:'):
        contador = contador + 1
print(f'Hay {contador} lineas en el archivo {archivo}')
