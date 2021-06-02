# Programa que simule un tablero de ajedrez con estas caracteristicas
f = int(input('Ingrese numero de filas: '))
c = int(input('Ingrese numero de columnas: '))

ajedrez = [[0 for j in range(c)]for i in range(f)]
if f == 8 and c == 8:
    for i in range(0, f, 1):
        for j in range(0, c, 1):
            if i == 0:
                ajedrez[i][0] = 2
                ajedrez[i][7] = 2
                ajedrez[i][1] = 3
                ajedrez[i][6] = 3
                ajedrez[i][2] = 4
                ajedrez[i][5] = 4
                ajedrez[i][3] = 5
                ajedrez[i][4] = 6
            elif i == 7:
                ajedrez[i][0] = -2
                ajedrez[i][7] = -2
                ajedrez[i][1] = -3
                ajedrez[i][6] = -3
                ajedrez[i][2] = -4
                ajedrez[i][5] = -4
                ajedrez[i][3] = -5
                ajedrez[i][4] = -6
            elif i == 1:
                ajedrez[i][j] = 1
            elif i == 6:
                ajedrez[i][j] = -1
            else:
                ajedrez[i][j] = 0

    for i in range(0, f, 1):
        for j in range(0, c, 1):
            print(ajedrez[i][j], end = ' ')
        print('\n')

else:
    print('El tamaño del tablero no es correcto')
