USE empresa;
/*Crear tabla de empleados*/
CREATE TABLE empleados(
Codigo int primary key not null,
nombre varchar(30),
apellidos varchar(50),
cargo varchar(50),
salario double,
ciudad varchar(30)
);

select * from empleados;

/* LLenar tabla */
INSERT INTO empleados(Codigo, nombre, apellidos, cargo, salario, ciudad) VALUES 
(1,'Emanuel', 'Leal Arce', 'Operario',1290000,'Cali'), 
(2, 'Pedro', 'Garcia Ruiz', 'Ingeniero', 2900000, 'Bogota'),
(3, 'Ana Maria', 'Arias Gomez', 'Asistente', 2000000, 'Cali'),
(4, 'Adriana', 'Martinez Cuero', 'Ingeniero', 4100000, 'Bogota');



INSERT INTO empleados(Codigo, nombre, apellidos, cargo, salario, ciudad) 
VALUES 
(5, 'Rafael', 'Ramirez Fiesco', 'Operario de empaque', 909000, 'Santa Marta'),
(6, 'Juan Esteban', 'Cordoba Gaitan', 'Contador', 1278000, 'Barranquilla'),
(7, 'Carolina', 'Cruz Melano', 'Supervisor general', 4090000, 'Medellin'),
(8, 'Juliana', 'Niño Aragon', 'Exportador', 2670000, 'Bogota'),
(9, 'Katherine', 'Rivera Gonzales', 'Ingeniero', 3790000, 'Buenaventura'),
(10, 'Mario', 'Cuadrado Minero', 'Contador', 2790000, '');


/* consultas varias en la base de datos */
/* todos los empledos que sean ingenieros*/
SELECT * FROM EMPLEADOS WHERE cargo = 'Ingeniero';

/* todos los datos de Emanuel, Pedro y Maria*/
SELECT * FROM empleados WHERE nombre in('Emanuel', 'Pedro', 'Ana Maria');

/* Todos los empleados que empiecen por M */
select * from empleados where nombre like 'M%';

/*Salarios superiores a 2000000*/
SELECT * FROM empleados WHERE salario > 2000000;

/* Empleados que viven en Cali*/
SELECT * FROM empleados WHERE ciudad = 'Cali';

/* Empleados que viven en Bogota y que su salario es superior a 3000000 */
SELECT * FROM empleados WHERE ciudad = 'Bogota' and salario > 3000000;

/* Empleados que tengan el salario entre 1000000 y 4000000 */
SELECT * FROM empleados WHERE salario BETWEEN 1000000 and 4000000;

/* Consultar datos de empleados que sean ingenieros y asistentes */
SELECT * FROM empleados WHERE cargo = 'Ingeniero' or cargo = 'Asistente';

/* Empleados que tienen el sueldo mayor a 2000000 viven en Bogota y su nombre comienza por P */
SELECT * FROM empleados where salario > 2000000 and ciudad = 'Bogota' and nombre like 'P%';

/* Nombres y apellidos de los empleados que viven en Cali */
SELECT nombre, apellidos from empleados where ciudad = 'Cali';

/* Parametros de drop delete alter */
set SQL_SAFE_UPDATES=0;
delete from empleados where cargo = 'Asistente';

ALTER TABLE empleados DROP COLUMN ciudad;