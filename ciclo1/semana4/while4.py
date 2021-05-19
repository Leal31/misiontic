numero = 1
divisor = 0
while numero <=20:
    numero = numero + 1
    divisor = 2
    while numero % divisor != 0:
        divisor = divisor + 1
    if numero == divisor:
        print(numero, 'es primo')
    else:
        print(numero, 'no es primo')
