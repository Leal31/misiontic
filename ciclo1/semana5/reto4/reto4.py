# Se declara la funcion sueldo bruto con parametros del valor de hora y las horas trabajadas
def sueldoBruto(valorHora, horaTrabajada):

    return valorHora * horaTrabajada
# Se declara la funcion de descuentos con un parametro del sueldo bruto 
def descuentosTotal(sueldoBruto):

    dctoParaFiscal = sueldoBruto * 0.09
    
    saludPension = sueldoBruto * 0.08
    
    # Se retorna la suma de todos los descuentos
    return dctoParaFiscal, saludPension

# Se declara la funcion de descuentos con un parametro del sueldo bruto
    
# Se declara la funcion de sueldo que retornara el sueldo neto a pagar
def sueldo(sueldoBruto):

    return sueldoBruto - sum(descuentosTotal(sueldoBruto))
# Se declara la funcion de proviciones que retornara la cantidad extra a pagar
def proviciones(sueldoBruto):
    prima = sueldoBruto * 8.33 / 100
    cesantias = sueldoBruto * 8.33 / 100
    interesCesantias = cesantias * 1 / 100
    vacaciones = sueldoBruto * 4.17 / 100

    return prima, cesantias, interesCesantias, vacaciones

    
# Entradas
nombre = input('Ingrese nombre completo del docente: ')
horas = float(input('Ingrese la cantidad de horas trabajadas por semana: '))
valorHoras = float(input('Ingresa el valor de la hora: '))
# Si la variable hora es mayor que 40 las horas sobrantes seran contadas como extras
if horas > 40:
    horaExtra = horas - 40
    valorExtra = valorHoras * 1.5
    totalExtra = valorExtra * horaExtra
    sueldoTotal = sueldoBruto(horas - horaExtra, valorHoras)
    sueldoTotal = sueldoTotal + totalExtra
else:
    sueldoTotal = sueldoBruto(horas, valorHoras)

paraFiscal, saludPension = descuentosTotal(sueldoTotal) 

sueldoNeto = sueldo(sueldoTotal)
    
prima, cesantia, interes, vacaciones  = proviciones(sueldoTotal)

# Salidas
print(f'El sueldo bruto del docente {nombre} es: {sueldoTotal} semanales')
print(f'Los descuentos de parafiscales son: {paraFiscal}')
print(f'Los descuentos de salud y pension son: {saludPension}')
print(f'El sueldo neto del docente {nombre} es {sueldoNeto}: semanales')
print(f'Las proviciones por prima son: {prima}')
print(f'Las proviciones por cesantias son: {cesantia}')
print(f'Los intereses de cesantias son: {interes}')
print(f'Las proviciones por vacaciones son: {vacaciones}')
