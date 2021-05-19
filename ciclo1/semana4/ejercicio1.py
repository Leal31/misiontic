numeroEstudiantes = 0
estudiante = 1
impresiones = 1
estudiantesAprobados = 0
estudiantesReprobados = 0
mayoresNotas = 0
menoresNotas = 0
notaClase = 0
while True:
    estudianteNota = float(input(f'Ingrese la nota definitiva del estudiante {estudiante}(1.0 hasta 5.0): '))
    notaClase += estudianteNota
    if estudianteNota >= 3:
        print(f'El estudiante {estudiante} aprobó')
        estudiantesAprobados += 1
    else:
        print(f'El estudiante {estudiante} reprobó')
        estudiantesReprobados += 1
    if estudianteNota == 5:
        print(f'El estudiante {estudiante} saco la mejor notas')
        mayoresNotas += 1
    elif estudianteNota == 1:
        print(f'El Estudiante {estudiante} saco la peor nota')
        menoresNotas += 1
    estudiante += 1
    numeroEstudiantes += 1
    if estudianteNota < 0:
        notaClase -= estudianteNota
        numeroEstudiantes -= 1
        estudiantesReprobados -= 1
        break
notaDefinitiva = notaClase / numeroEstudiantes
print(f'Los estudiantes aprobados son {estudiantesAprobados}')
print(f'Los estudiantes reprobados son {estudiantesReprobados}')
print(f'Los estudiantes que mayor nota sacaron son {mayoresNotas}')
print(f'Los estudiantes que peor nota sacaron son {menoresNotas}')
print(f'El promedio del salon es {notaDefinitiva}')
