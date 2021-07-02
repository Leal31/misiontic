from sys import exit
# Se nombraran a continuacion todas las opciones posibles dentro de funciones
'''
En primer lugar se va a hacer la funcion de crear archivo, la cual
consiste en crear un archivo y mediante ese archivo ingresar los datos
iniciales los cuales deben ser minimo 10
'''
def crearArchivo():
    '''
    Se crearan 3 listas las cuales se definiran como globales
    y se guardaran dentro todos los elementos para poder manipularlos
    con mas facilidad
    '''
    
    archivo = open(nombreArchivo, 'w')
    
    cantidad = int(input('Ingresa cuanta gente quieres ingresar: '))
    # bucle en el cual se ingresaran los datos que el cliente desee
    while cantidad >= 1:

        nombre = input('Ingresa un nombre: ')
        # Se verificara la cedula de modo que no haya una igual
        while True:
            cedula = input('Ingresa un numero de cedula: ')
            if (f'{cedula}\n') in cedulaLista:
                print('Ya se ingreso esa cedula vuelva a intentarlo')
            elif (f'{cedula}\n') not in cedulaLista:
                break
        celular = input('Ingresa un numero de celular: ')
        # Finalmente se escribira en el documento creado
        archivo.write(nombre)
        archivo.write('\n')
        archivo.write(cedula)
        archivo.write('\n')
        archivo.write(celular)
        archivo.write('\n')
        
        # Se ingresaran los datos de igual forma en la lista recientemente creada
        nombreLista.append(f'{nombre}\n')
        cedulaLista.append(f'{cedula}\n')
        celularLista.append(f'{celular}\n')
        cantidad = cantidad - 1

'''
La funcion buscar archivo se basa en buscar un celular en base al nombre
y mediante la posicion obtenida de ese nombre se regresara el celular 
correspondiente
'''
def buscarArchivo():
    archivo = open(nombreArchivo, 'w')

    buscarNombre = input('Ingrese un nombre para buscar: ')

    relNombre = nombreLista.index(f'{buscarNombre}\n')

    print(celularLista[relNombre])

'''
La funcion añadir archivo se basa en añadir un archivo al final
del documento usando el metodo append representado con 'a' para 
el archivo, se hara lo mismo que en la primera funcion pero teniendo
en cuenta que no sera con un bucle sera algo de una vez
'''
def añadirArchivo():
    
    archivo = open(nombreArchivo, 'a')

    nombre = input('Ingresa un nuevo nombre: ')
    while True:
        cedula = input('Ingresa una nueva cedula: ')
        if cedula in cedulaLista:
            print('Esa cedula ya existe')
        else:
            break
    celular = input('Ingresa un nuevo celular: ')

    archivo.write(nombre)
    archivo.write('\n')
    archivo.write(cedula)
    archivo.write('\n')
    archivo.write(celular)
    archivo.write('\n')

    nombreLista.append(f'{nombre}\n')
    cedulaLista.append(f'{cedula}\n')
    celularLista.append(f'{celular}\n')

'''
En la funcion borrar archivo se plantea borrar un archivo del archivo
ayudandonos en las listas creadas, puesto que se pretende borrar ese archivo
de la lista y reescribir el documento teniendo en cuenta los elementos de la
lista usando un bucle para ello
'''
def borrarArchivo():
    
    borrar = input('Ingrese la cedula del archivo que quiere borrar: ')
    # en base a la cedula del archivo se borrara tal archivo en la lista

    pos = cedulaLista.index(f'{borrar}\n')
    # se borra el archivo
    nombreLista.pop(pos)
    cedulaLista.pop(pos)
    celularLista.pop(pos)

    archivo = open(nombreArchivo, 'w')
    '''
    en base a los archivos actuales de la lista se reescribira
    sin el archivo borrado
    '''
    for i in range(len(nombreLista)):

        archivo.write(nombreLista[i])
        archivo.write(cedulaLista[i])
        archivo.write(celularLista[i])

'''
La funcion mostrar archivos va a mostrar todos los registros del archivo
creado lo que dara una base para las otras funciones
''' 
def mostrarArchivos():

    archivo = open(nombreArchivo, 'r')

    texto = archivo.read()

    return texto
'''
La funcion mostrar archivo va a buscar un archido de la lista en base a 
la primera letra con la que inicia lo que va a mostrar en el documento los
registros encontrados mediante la posicion en la cual tales elementos
se encuentren en la lista
'''
def mostrarArchivo():

    archivo = open(nombreArchivo, 'r')
    letra = input('Ingrese contactos que empiezan con las letras: ')

    for l in archivo:
        if not l.startswith(letra):
            continue
        pos = nombreLista.index(l)
        print(nombreLista[pos])
        print(cedulaLista[pos])
        print(celularLista[pos])

# Programa principal
global nombreLista
global cedulaLista
global celularLista
nombreLista = []
cedulaLista = []
celularLista = []


# Se pide el archivo en el que se trabajara
global nombreArchivo
nombreArchivo = 'agenda.txt'
# Bucle del menu con todas las funciones a usar
while True:
    print('menu')
    print('1. Crear y añadir datos')
    print('2. Buscar archivo')
    print('3. Añadir archivo')
    print('4. Borrar Archivo')
    print('5. Mostrar todos los archivos')
    print('6. Mostrar archivo por letra')
    print('7. Salir')
    # Variable decision donde mediante lo impreso se ejecutara una o otra funcion
    decision = int(input('Ingresa que quieres hacer: '))

    if decision == 1:
        crearArchivo()
    elif decision == 2:
        buscarArchivo()
    elif decision == 3:
        añadirArchivo()
    elif decision == 4:
        borrarArchivo()       
    elif decision == 5:
        print(mostrarArchivos())
    elif decision == 6:
        mostrarArchivo()
    elif decision == 7:
        exit()
    else:
        print('No es una decision valida')
