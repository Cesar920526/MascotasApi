--Creacion de tablas--
CREATE TABLE tipo_mascota (idtipo_mascota serial PRIMARY KEY,descripcion char(200));
CREATE TABLE propietario (idpropietario serial PRIMARY KEY, cedula char(20), nombre char(80), direccion char(100), telefono char(10), correo char(30), comentarios TEXT);
CREATE TABLE mascota (idmascota serial PRIMARY KEY, nombre char (100), id_tipo_mascota INTEGER, id_propietario INTEGER, 
					 CONSTRAINT fk_mascota foreign key (id_tipo_mascota) references tipo_mascota(idtipo_mascota),
					 CONSTRAINT fk_propietario foreign key (id_propietario) references propietario(idpropietario));


---Insert datos pruebas--
INSERT INTO tipo_mascota (descripcion) VALUES (
  'Perro'
);

INSERT INTO tipo_mascota (descripcion) VALUES (
  'Gato'
);

INSERT INTO propietario (cedula, nombre,direccion,telefono,correo,comentarios) VALUES (
  '54545451',
  'Pepita',
  'Calle falsa 123',
  '777777',
  'pepi@gmail.com',
  ''
); 

INSERT INTO propietario (cedula,nombre,direccion,telefono,correo,comentarios) VALUES (
  '69872310',
  'Juan S',
  'Carrera 3 DN # 1A oeste-42',
  '1234567',
  'juan@gmail.com',
  ''
); 

INSERT INTO propietario (cedula,nombre,direccion,telefono,correo,comentarios) VALUES (
  '9896423',
  'David Arango',
  'Calle real123',
  '76859',
  'david@gmail.com',
  ''
);

INSERT INTO mascota (nombre,id_tipo_mascota,id_propietario) VALUES (
  'Azula',
   1,
   1
); 

INSERT INTO mascota (nombre,id_tipo_mascota,id_propietario) VALUES (
  'Bruno',
   2,
  null
); 

INSERT INTO mascota (nombre,id_tipo_mascota,id_propietario) VALUES (
  'Banshee',
   1,
   2
); 



INSERT INTO mascota (nombre,id_tipo_mascota,id_propietario) VALUES (
  'Pegy',
   1,
   2
); 


--Listar todas las mascotas--
SELECT * FROM mascota;

--Listar mmascotas que no han sido adoptadas--
SELECT * FROM mascota where id_propietario IS null

--Listar el número de mascotas por cada tipo de mascota.--
select tipo_mascota.descripcion , count(mascota.idmascota) from mascota
inner join tipo_mascota on tipo_mascota.idtipo_mascota = mascota.id_tipo_mascota
GROUP by tipo_mascota.descripcion;

--Listar los propietarios que tengan más de una mascota.--
select propietario.nombre , COUNT(mascota.idmascota)
from mascota
inner join propietario on mascota.id_propietario = propietario.idpropietario
GROUP by propietario.nombre
having  COUNT(mascota.idmascota) > 1;

--Listar el número de mascotas por cada tipo de mascota y por cada propietario.--
select propietario.nombre , tipo_mascota.descripcion, COUNT(mascota.idmascota)
from mascota
inner join tipo_mascota on tipo_mascota.idtipo_mascota = mascota.id_tipo_mascota
inner join propietario on mascota.id_propietario = propietario.idpropietario 
GROUP by tipo_mascota.descripcion, propietario.nombre;

--Listas los propietarios que no tienen mascotas.--
select propietario.nombre
from propietario
where propietario.idpropietario
not in (SELECT mascota.id_propietario from mascota where mascota.id_propietario is not NULL)


