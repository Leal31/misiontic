archivo = open('hola.txt', 'w')

linea1 = 'Aqui esta el zarzo,\n'
archivo.write(linea1)

linea2 = 'El proceso de linea escritura con estas dos lineas'
archivo.write(linea2)

archivo.close()
