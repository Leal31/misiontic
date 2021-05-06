# Sacar medidas de diferentes figuras geometricas
# Entradas
baseTriangulo = int(input('Ingresa la base del triangulo: '))
alturaTriangulo = int(input('Ingresa la altura del triangulo: '))
lado1 = int(input('Ingresa el lado 1 del rectangulo: '))
lado2 = int(input('Ingresa el lado 2 del triangulo: '))
radioCirculo = int(input('Ingresa el radio del circulo: '))

# procedimientos
areaTriangulo = (baseTriangulo * alturaTriangulo) / 2
areaRectangulo = lado1 * lado2
areaCirculo = 3.1416 * radioCirculo ** 2

# salida
print(f'En base a las medidas que has dado...\nEl area del triangulo es: {areaTriangulo}cm2\nEl area del rectangulo es: {areaRectangulo} cm2\nY el area del circulo es: {areaCirculo}cm2')
