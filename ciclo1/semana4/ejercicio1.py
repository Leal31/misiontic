# Definimos variables iniciales
numeroEstudiantes = 0
estudiante = 1
impresiones = 1
estudiantesAprobados = 0
estudiantesReprobados = 0
mayoresNotas = 0
menoresNotas = 0
notaClase = []
# ciclo infinito
while True:
    # tomamos la nota del estudiante que se toma
    estudianteNota = float(input(f'Ingrese la nota definitiva del estudiante {estudiante}(1.0 hasta 5.0): '))
    # Se incremente la nota total acumulando todos las notas
    notaClase.append(estudianteNota)
    # si el estudiante saca 3 o mas aprobara y se sumara uno mas a estudiantes aprobados
    if estudianteNota >= 3:
        print(f'El estudiante {estudiante} aprobó')
        estudiantesAprobados += 1
    # si saca menos de 3 reprobara y se sumara uno mas a estudiantes reprobados
    else:
        print(f'El estudiante {estudiante} reprobó')
        estudiantesReprobados += 1
    # si la nota del estudiante es de 5 se dira que saco la mejor nota posible y se sumara a mayores notas
    if estudianteNota == 5:
        print(f'El estudiante {estudiante} saco la mejor notas')
    # si la nota es 1 se dira que saco la peor nota posible y se sumara a menores notas
    elif estudianteNota == 1:
        print(f'El Estudiante {estudiante} saco la peor nota')
    # al final se sumara el numero del estudiante y la cantidad de estudiantes
    estudiante += 1
    numeroEstudiantes += 1
    if estudianteNota < 0:
        notaClase.remove(estudianteNota)
        numeroEstudiantes -= 1
        estudiantesReprobados -= 1
        break
print('la nota mas alta de la clase es: ')
print(max(notaClase))
print('la nota mas baja de la clase es: ')
print(min(notaClase))

notaDefinitiva = sum(notaClase) / len(notaClase)
print(f'Los estudiantes aprobados son {estudiantesAprobados}')
print(f'Los estudiantes reprobados son {estudiantesReprobados}')
print(f'El promedio del salon es {notaDefinitiva}')
