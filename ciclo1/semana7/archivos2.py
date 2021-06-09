archivo = open('mbox.txt')

# Buscar dentro del archivo
contador = 0
for l in archivo:
    if l.startswith('From'):
        print(l)
