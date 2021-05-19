import sys
numero = 0
while True:
    print(numero)
    decision = input('Deseas imprimir mas numeros?')
    if decision.lower() == 'si' or decision.lower() == 's':
        numero = numero + 1
    else:
        sys.exit()
