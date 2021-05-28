def factorial(n):
    if n == 0:
        return 1
    else:
        contador = n * factorial(n - 1)

    return contador


n = int(input('Ingresar el numero del factorial: '))

print(f'El factorail de {n} es {factorial(n)}')
