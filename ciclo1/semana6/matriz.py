# Matrices en python

f = 0
c = 0
valor = 0
suma = 0
contador = 0

# Declarar la matriz

f = int(input('Ingrese numero de filas de la matriz: '))
c = int(input('Ingrese numero de columnas de la matriz: '))

matriz1 = [[0 for j in range(c)] for i in range(f)]

# Llenar la matriz con datos elegidos

for i in range(0, f, 1):
    for j in range(0, c, 1):
        valor = int(input(f'matriz1[{i}][{j}] = '))
        matriz1[i][j] = valor

# Imprimir la matriz
print('----------MATRIZ1----------')
for i in range(0, f, 1):
    for j in range(0, c, 1):
        print(matriz1[i][j], end = ' ')
    print('\n')

# Generar promedio

for i in range(0, f, 1):
    for j in range(0, c, 1):
        if matriz1[i][j] % 2 == 0:
            suma = suma + matriz1[i][j]
        # cuenta de los primos de la matriz
        if matriz1[i][j] > 1:
            divisor = 2
            while matriz1[i][j] % divisor != 0:
                divisor = divisor + 1
                if matriz1[i][j] == divisor:
                    contador = contador + 1

# Mostrar resultados de operaciones

print(f'La suma de pares es: {suma}')
print(f'La cantidad de primos es: {contador}')
