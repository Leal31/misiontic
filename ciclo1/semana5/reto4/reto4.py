# Se declara la funcion sueldo bruto con parametros del valor de hora y las horas trabajadas
def sueldoBruto(valorHora, horaTrabajada):
    if horaTrabajada > 40:
        horaExtra = horaTrabajada - 40
        valorExtra = valorHora * 1.5
        totalExtra = valorExtra * horaExtra
        sueldoBruto = valorHora  * (horaTrabajada - horaExtra)
    else:
        totalExtra = 0
        sueldoBruto = valorHora * horaTrabajada 
    return sueldoBruto, totalExtra

# Se declara la funcion de descuentos con un parametro del sueldo bruto 
def descuentosTotal(sueldoBruto):

    dctoParaFiscal = sueldoBruto * 0.09
    
    dctoSalud = sueldoBruto * 0.04

    dctoPension = sueldoBruto * 0.04
    # Se retorna la suma de todos los descuentos
    return dctoParaFiscal, dctoSalud, dctoPension

# Se declara la funcion de descuentos con un parametro del sueldo bruto
    
# Se declara la funcion de sueldo que retornara el sueldo neto a pagar
def sueldo(sueldoBruto):

    return sueldoBruto - sum(descuentosTotal(sueldoBruto))
# Se declara la funcion de proviciones que retornara la cantidad extra a pagar
def proviciones(sueldoBruto):
    prima = sueldoBruto * 8.33 / 100
    cesantias = sueldoBruto * 8.33 / 100
    interesCesantias = sueldoBruto * 1 / 100
    vacaciones = sueldoBruto * 4.17 / 100

    return prima, cesantias, interesCesantias, vacaciones

    
# Entradas
horas = int(input('Ingrese la cantidad de horas trabajadas por semana: '))
valorHoras = int(input('Ingresa el valor de la hora: '))
# Si la variable hora es mayor que 40 las horas sobrantes seran contadas como extras
sueldoNoExtra, sueldoExtra = sueldoBruto(valorHoras, horas)

sueldoTotal = sueldoNoExtra + sueldoExtra

paraFiscal, salud, pension = descuentosTotal(sueldoTotal) 

sueldoNeto = sueldo(sueldoTotal)
    
prima, cesantia, interes, vacaciones  = proviciones(sueldoTotal)

# Salidas
print(f'El sueldo sin horas extra es: {sueldoNoExtra}')
print(f'Las horas extra dan un monto de: {sueldoExtra}')
print(f'Todo el sueldo ganado por el empleado es: {sueldoTotal}')
print(f'Los descuentos por parafiscal son: {paraFiscal}')
print(f'Los descuentos por salud son: {salud}')
print(f'Los descuentos por pension son: {pension}')
print(f'La suma de todos los descuentos es: {sum(descuentosTotal(sueldoTotal))}')
print(f'El sueldo neto es: {sueldoNeto}')
print(f'Las proviciones por prima son: {prima}')
print(f'Las proviciones por cesantias son: {cesantia}')
print(f'Las proviciones por interes de cesantias son: {interes}')
print(f'Las proviciones por vacaciones son: {vacaciones}')


