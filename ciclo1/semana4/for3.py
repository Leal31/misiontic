numeros = int(input('Cuantos numeros desea evaluar?: '))

for i in range(0, numeros, 1):
    if i % 2 == 0:
        print(f'{i} es par')
    else:
        print(f'{i} es impar')
