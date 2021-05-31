from sys import exit

def sueldoBruto(valorHora, horaTrabajada):

    return valorHora * horaTrabajada
    
def descuentos(sueldoBruto):

    dctoParaFiscal = sueldoBruto * 0.09

    dctoPension = sueldoBruto * 0.04

    dctoSalud = sueldoBruto * 0.04

    return dctoParaFiscal + dctoPension + dctoSalud

def sueldo(sueldoBruto):

    return sueldoBruto - descuentos(sueldoBruto)

def proviciones(sueldoBruto):
    prima = sueldoBruto * 8.33 / 100
    cesantias = sueldoBruto * 8.33 / 100
    interesCesantias = sueldoBruto * 1 / 100
    vacaciones = sueldoBruto * 4.17 / 100

    return prima + cesantias + interesCesantias + vacaciones


while True:
    
    decision = input('Quiere ingresar un profesor?: ')
    if decision.lower() == 'si':

        nombre = input('Ingrese nombre completo del docente: ')
        horas = float(input('Ingrese la cantidad de horas trabajadas por semana: '))
        valorHoras = float(input('Ingresa el valor de la hora: '))

        if horas > 40:
            horaExtra = horas - 40
            valorExtra = valorHoras * 1.5
            totalExtra = valorExtra * horaExtra
            sueldoTotal = sueldoBruto(horas - horaExtra, valorHoras)
            sueldoTotal = sueldoTotal + totalExtra
        else:
            sueldoTotal = sueldoBruto(horas, valorHoras)
    
        dcto = descuentos(sueldoTotal)

        sueldoNeto = sueldo(sueldoTotal)
    
        aumentos  = proviciones(sueldoTotal)

        print(f'El sueldo bruto del docente {nombre} es: {sueldoTotal} mensuales')
        print(f'Los descuentos de parafiscales, salud y pension son:  {dcto} mensuales')
        print(f'El sueldo neto del docente {nombre} es {sueldoNeto}: mensuales')
        print(f'Las proviciones por prima, cesantias, interes de cesantias y vacaciones son: {aumentos}')
    else:
        exit()
