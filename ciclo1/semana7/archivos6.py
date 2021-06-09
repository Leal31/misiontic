archivo = input('Ingrese el nombre del archivo: ')
nuevo = open(archivo)
contador = 0
for l in nuevo:
    if l.startswith('Subject:'):
        contador = contador + 1
print(f'Hay {contador} lineas de asunto en {archivo}')
