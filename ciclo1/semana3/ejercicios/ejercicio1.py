# Programa de descuentos
nombre = input('Ingrese su nombre: ')
producto = input('Ingrese el nombre del producto: ')
precio = float(input('Ingrese el precio del producto: '))
cantidad = int(input('Ingrese la cantidad del producto: '))
bolita = input('Meta la mano en esta bolsa y saque una bolita, de que color salio?').lower()

if bolita == 'negro':
    totalBruto = precio * cantidad
    dcto = totalBruto * 0.40
    totalNeto = totalBruto - dcto
    print('Tiene un descuento del 40%')
elif bolita == 'rojo':
    totalBruto = precio * cantidad
    dcto = totalBruto * 0.30
    totalNeto = totalBruto - dcto
    print('Tiene un descuento del 30%')
elif bolita == 'verde':
    totalBruto = precio * cantidad
    dcto = totalBruto * 0.60
    totalNeto = totalBruto - dcto
    print('Tiene un descuento del 60%')
elif bolita == 'azul':
    totalBruto = precio * cantidad
    dcto = totalBruto * 0.50
    totalNeto = totalBruto - dcto
    print('Tiene un descuento del 50%')
elif bolita == 'amarillo':
    totalBruto = precio * cantidad
    dcto = totalBruto * 0.20
    totalNeto = totalBruto - dcto
    print('Tiene un descuento del 20%')
elif bolita == 'blanco':
    totalBruto = precio * cantidad
    dcto = 0
    totalNeto = totalBruto - dcto
    print('No tiene ningun descuento')
else:
    print('No es un color de bola valido')

print(f'Nombre Cliente: {nombre}\nProducto: {producto}\nPrecio del Producto: {precio}\nCantidad del producto: {cantidad}\nBola que salio: {bolita}\nTotal sin descuento: {totalBruto}\nDescuento: {dcto}\nTotal con Descuento: {totalNeto}')
