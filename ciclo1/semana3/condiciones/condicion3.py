producto = input('Ingrese el nombre del producto: ')
precio = float(input('Ingrese el precio del producto: '))
cantidad = int(input('Ingrese la cantidad del producto: '))

totalPago = (precio * cantidad)
if cantidad > 50:
    dcto = totalPago * 0.30
    totalPago = totalPago - dcto
    print(f'Se aplica descuento de 30%\nDescuento Total: {dcto}')
else:
    dcto = 0
    totalPago = totalPago - dcto
    print('No se aplica descuento')
print(f'El total a pagar es: {totalPago}')
