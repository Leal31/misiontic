# Programa que permite saber si un cliente merece un descuento o no por su compra
# definimos variables
producto = input('Ingrese el nombre del producto: ')
precio = float(input('Ingrese el precio del producto: '))
cantidad = int(input('Ingrese la cantidad del producto: '))
totalPago = (precio * cantidad)
# si la cantidad del producto es mayor a 50 unidades se tendra descuento
if cantidad > 50:
    dcto = totalPago * 0.30
    totalPago = totalPago - dcto
    print(f'Se aplica descuento de 30%\nDescuento Total: {dcto}')
else:
    dcto = 0
    totalPago = totalPago - dcto
    print('No se aplica descuento')
# imprimimos el total a pagar independientemente de si esa condicion es falsa o verdadera
print(f'El total a pagar es: {totalPago}')
