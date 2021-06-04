prueba = [1,7,9,12,78,34,2,8,23]
# for para recorrer en cada caso de la lista
for i in range(len(prueba)):
    # m es la variable que poseera la variable iteradora
    m = i
    # Mientras m sea igual a 0 y mayor que la anterior iteracion
    while m > 0 and prueba[m] > prueba[m - 1]:
        # aux es el valor actual que ira cambiando
        aux = prueba[m]
        # prueba sera el resultado de la anterior iteracion
        prueba[m] = prueba[m - 1]
        # La anterior iteracion tendra la variable del valor actual
        prueba[m - 1] = aux
        # la variable m se restara
        m = m - 1

print(prueba)
