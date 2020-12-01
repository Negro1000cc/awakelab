------------------------------Grupal 5---------------------------------------
--1. Genere un set de consultas que permitan crear las tablas indicadas en el 
--modelo. Tenga enconsideración las llaves primarias, los tipos de dato 
--indicados y las condiciones de nulidad.
--2. Desarrolle consultas que permitan crear las llaves foráneas antes 
--indicadas, respetando elsentido lógico de su creación.

create table cliente(
rutcliente number(9) not null primary key,
nombres varchar(30) not null,
apellidos varchar(30)not null,
telefono number(9) not null,
afp varchar2(30),
sistemasalud number(2),
direccion varchar2(70),
comuna varchar2(50),
edad number(3) not null
);

create table accidente(
accidenteid number(9) not null primary key,
dia date,
hora date,
lugar varchar2(50) not null,
origen varchar2(100),
consecuencias varchar2(100),
cliente_rutcliente number(9) not null constraint accidente_cliente_fk
references cliente   
);

create table capacitacion(
idcapacitacion number(9) not null primary key,
fecha date,
hora date,
lugar varchar2(50) not null,
duracion number(3),
cantidadasistentes number (5) not null,
cliente_rutcliente number(9) not null constraint capacitacion_cliente_fk
references cliente
);

create table asistentes(
idasistente number(9) not null primary key,
nombres varchar2(100) not null,
edad number(3) not null,
capacitacion_idcapacitacion number(9) not null constraint asistentes_capacitacion_fk
references capacitacion
);
-----------------------------------------------------------------------------
--3. Genere una consulta que permita crear una restricción de valor único 
--sobre el campo “telefono” de la tabla Cliente.

Alter table cliente add constraint numero_telefono_uh unique (telefono);
------------------------------------------------------------------------------
--4.Genere una consulta que permita restringir los valores posibles del campo 
--sistemasalud de la tabla Cliente al conjunto {1,2}.

alter table cliente add constraint sistemasalud_ck
 CHECK (sistemasalud IN (1,2));

------------------------------------------------------------------------------
--5.Genere las consultas para insertar cuatro registros en la tabla Cliente, 
--y consultas para insertar siete registros en la tabla Accidente, asociados a 
--los clientes recién ingresados.
--Cliente 1
insert into cliente(rutcliente,nombres,apellidos,telefono,afp,sistemasalud,
direccion,comuna,edad) values(111111111,'Gonzalo Rodrigo','Gonzalez Medel',
991111111,'Provida',1,'Quilin 123','Macul',35);
--Cliente 2
insert into cliente(rutcliente,nombres,apellidos,telefono,afp,sistemasalud,
direccion,comuna,edad) values(122222222,'Natalia Fernanda','Jorquera Moreno',
992222222,'Habitat',2,'Bonilla 1321','Nunoa',31);
--Cliente 3
insert into cliente(rutcliente,nombres,apellidos,telefono,afp,sistemasalud,
direccion,comuna,edad) values(133333333,'Rodrigo Andres','Guzman Perez',
993333333,'Cumprum',1,'Castillo Urizar 222','Maipu',27);
--Cliente 4
insert into cliente(rutcliente,nombres,apellidos,telefono,afp,sistemasalud,
direccion,comuna,edad) values(144444444,'Margarita Daniela','Seguel Contreras',
994444444,'Modelo',2,'Los Platanos 44','Pte. Alto',17);

--Accidente 1

INSERT INTO accidente (accidenteid, dia, hora, lugar, origen, consecuencias,cliente_rutcliente)
values(5001,to_date ('2020-06-06', 'YYYY-MM-DD'), to_date ('15:45:22', 'hh24:mi:ss'),
'av providencia','trayecto hogar-trabajo','fractura femoral',144444444);
select to_char(hora,'hh24:mi:ss') from accidente;

INSERT INTO accidente (accidenteid, dia, hora, lugar, origen, consecuencias,cliente_rutcliente)
values(5002,to_date ('2020-07-12', 'YYYY-MM-DD'), to_date ('17:45:22', 'hh24:mi:ss'),
'Eliodoro Yanez','trayecto trabajo-hogar','aweonamiento',133333333);
select to_char(hora,'hh24:mi:ss') from accidente;

INSERT INTO accidente (accidenteid, dia, hora, lugar, origen, consecuencias,cliente_rutcliente)
values(5003,to_date ('2020-09-14', 'YYYY-MM-DD'), to_date ('18:45:22', 'hh24:mi:ss'),
'Vicuna Mackenna','trayecto hogar-trabajo','Dislocacion hombro',111111111);


INSERT INTO accidente (accidenteid, dia, hora, lugar, origen, consecuencias,cliente_rutcliente)
values(5004,to_date ('2020-06-10', 'YYYY-MM-DD'), to_date ('08:45:22', 'hh24:mi:ss'),
'Av Las Condes','trayecto trabajo-hogar','fractura tobillo',122222222);


INSERT INTO accidente (accidenteid, dia, hora, lugar, origen, consecuencias,cliente_rutcliente)
values(5005,to_date ('2019-04-06', 'YYYY-MM-DD'), to_date ('12:45:22', 'hh24:mi:ss'),
'Av Irarrazaval','trayecto hogar-trabajo','fractura femoral',111111111);


INSERT INTO accidente (accidenteid, dia, hora, lugar, origen, consecuencias,cliente_rutcliente)
values(5006,to_date ('2018-06-11', 'YYYY-MM-DD'), to_date ('11:45:22', 'hh24:mi:ss'),
'av providencia','trayecto trabajo-hogar','fractura clavicula',122222222);

INSERT INTO accidente (accidenteid, dia, hora, lugar, origen, consecuencias,cliente_rutcliente)
values(5007,to_date ('2018-01-17', 'YYYY-MM-DD'), to_date ('11:45:22', 'hh24:mi:ss'),
'Pocuro','trayecto trabajo-hogar','fractura en el hocico',144444444);
------------------------------------------------------------------------------
---------------------------------Grupal 6-------------------------------------
--1.Crear tabla nueva Visita

create table visita (
idvisita number(9) not null primary key,
visfecha date not null,
vishora date,
vislugar varchar2 (50) not null,
viscomentarios varchar2(200) not null,
cliente_rutcliente number(9) not null 
constraint visita_cliente_fk1 references cliente
);

--cambios tabla accidente
alter table accidente RENAME COLUMN accidenteid to idaccidente;
alter table accidente RENAME COLUMN dia to accifecha;
alter table accidente RENAME COLUMN hora to accihora;
alter table accidente RENAME COLUMN lugar to accilugar;
alter table accidente modify accilugar varchar2(150);
alter table accidente RENAME COLUMN origen to acciorigen;
alter table accidente RENAME COLUMN consecuencias to acciconsecuencias;

--cambio tabla cliente
alter table cliente RENAME COLUMN nombres to clinombres;
alter table cliente RENAME COLUMN apellidos to cliapellidos;
alter table cliente modify cliapellidos varchar2(50);
alter table cliente RENAME COLUMN telefono to clitelefono;
alter table cliente RENAME COLUMN afp to cliafp;
alter table cliente RENAME COLUMN sistemasalud to clisistemasalud;
alter table cliente RENAME COLUMN direccion to clidireccion;
alter table cliente modify clidireccion varchar2(100) not null;
alter table cliente RENAME COLUMN comuna to clicomuna;
alter table cliente modify clicomuna not null;
alter table cliente RENAME COLUMN edad to cliedad;
alter table cliente modify cliedad not null;

--cambios tabla capacitacion
alter table capacitacion RENAME COLUMN fecha to capfecha; 
alter table capacitacion modify capfecha not null;
alter table capacitacion RENAME COLUMN hora to caphora;
alter table capacitacion RENAME COLUMN lugar to caplugar;
alter table capacitacion modify caplugar varchar2(100);
alter table capacitacion RENAME COLUMN duracion to capduracion;
alter table capacitacion modify capduracion number(4);
alter table capacitacion drop column cantidadasistentes;

--cambios tabla asistentes
alter table asistentes RENAME COLUMN nombres to asistnombrecompleto;
alter table asistentes RENAME COLUMN edad to asistedad; 
alter table asistentes add asistcorreo VARCHAR2(70) ; 
alter table asistentes add asistelefono VARCHAR2(20) ; 

--------------------------30-11-2020-----------------------------------------
--Crear tabla administrativos
    create table administrativos(
     run_adm varchar(9) not null primary key,
     nombres varchar(20),
     apellidos varchar(20),
     correo varchar(20),
     area varchar(20)
);

--crear tabla profesionales

    create table profesionales(
     run_pro varchar(9) not null primary key,
     nombres varchar(20),
     apellidos varchar(20),
     telefono integer,
     titulo varchar(50),
     proyecto_qejecuta varchar(50)
);

--Crear tabla usuarios

    create table usuarios(
     run_usuario varchar(9) not null primary key,
     nombres varchar(20),
     apellidos varchar(20),
     fecha_nacimiento date,
     cliente_rutcliente number(9) not null constraint uuarios_cliente_fk1
     references cliente, 
     adiministrativos_runadm varchar(9) not null constraint usuarios_administrativos_fk2
     references administrativos,
     profesionales_runpro varchar(9) not null constraint uuarios_profesionales_fk3
     references profesionales
);

--Crear tabla Chequeos
    create table chequeos(
        idchequeo integer not null primary key,
        nombre_chequeo varchar(30)
);

--Se crea tabla para solucionar relacion M:N entre visita y chequeos
    create table estado_cumplimiento(
     cumple_cheq varchar(2),
     cumple_con_obsv varchar(100),
     no_cumple_cheq varchar(2),
     visita_idvisita number(9) not null constraint est_cumpli_visita_fk1
     references visita, 
     chequeo_idchequeo number(38) not null constraint est_cumpli_chequeos_fk2
     references chequeos
);

--Crear tabla Pago Cliente
create table pago_cliente(
    ID_pago_cliente number PRIMARY KEY,
    fecha_pago date,
    monto_pago number,
    mes_que_paga varchar2(15),
    año_que_paga NUMBER(4),
    cliente_rutcliente number(9) not null 
    constraint pago_cliente_cliente_fk1 references cliente
);

--Se crea secuencia y trigger para campo que se incremente idpagocliente
CREATE SEQUENCE pagocli_seq;

create or replace trigger pagocli_bir
before insert on pago_cliente
for each row
when (new.ID_pago_cliente is null)
begin
    select pagocli_seq.nextval
    into :new.ID_pago_cliente
    from dual;
end;
--Crear tabla ActividadesMejora

create table ActividadesMejora(
ID_Asesoria number PRIMARY KEY,
Numero_actividades number,
Nombre_actividades varchar2(15), 
fecha_Plazo date
);
alter table ActividadesMejora RENAME COLUMN ID_Asesoria to cod_amejora;
alter table ActividadesMejora RENAME COLUMN Numero_Actividades to ID_actividades;

--Crear tabla asesorias

    create table asesorias(
        idasesoria varchar(9) not null primary key,
        fecha_realizacion date,
        motivo varchar2(50),
        mes_que_paga varchar2(15),
        año_que_paga number(4),
        profesional_runpro varchar(9) not null constraint asesorias_profesionales_fk1
        references profesionales,
        actmejora_idasesoria number constraint asesorias_actmejora_fk2
        references ActividadesMejora
    );
    --Se modifica asesorias ya que FK y tipo de datos y campos se crearon erroneamente
    alter table asesorias
    drop constraint asesorias_actmejora_fk2;
    alter table asesorias rename column actmejora_idasesoria to actmejora_codamejora;  
  
    alter table asesorias
    add constraint actmejora_codamejora
    foreign key (actmejora_codamejora)
    references actividadesmejora(cod_amejora);
    
 --Agregar FK a Asesorias de Profesionales   
    alter table asesorias modify profesionales_runpro number(9);
    
    alter table asesorias
    add constraint asesorias_profesionales_fk1
    foreign key (profesionales_runpro)
    references profesionales(run_pro);
    

    --Crear trigger para ActividadesMejora
    CREATE SEQUENCE act_seq;

    create or replace trigger act_bir
    before insert on ActividadesMejora
    for each row
    when (new.ID_actividades is null)
    begin
    select act_seq.nextval
    into :new.ID_actividades
    from dual;
    end;
    
--Ingreso de registros

    insert into profesionales(run_pro,nombres,apellidos,telefono, titulo,proyecto_qejecuta) 
    values(311111111,'uuuuuuuno','uuuno',0101010101,'Ingeniero','AAAAA-1');

    insert into profesionales(run_pro,nombres,apellidos,telefono, titulo,proyecto_qejecuta) 
    values(322222222,'doooos','doos',020202020,'Doctor','AAAAA-2');

    insert into profesionales(run_pro,nombres,apellidos,telefono, titulo,proyecto_qejecuta) 
    values(333333333,'treeees','trees',0303030303,'Abogado','AAAAA-3');


    insert into administrativos(run_adm,nombres,apellidos,correo,area) 
    values(444444444,'Juanito','Peerez','jp@jp.com','RRHH');

    insert into administrativos(run_adm,nombres,apellidos,correo,area) 
    values(455555555,'Rosa','Gonzalez','rg@rg.com','Finanzas');

    insert into administrativos(run_adm,nombres,apellidos,correo,area) 
    values(466666666,'Alan','Brito','ab@ab.com','Ventas');

    --Se modifica tabla usuarios y administrativos ya que tipo de datos 
    --no coincidian para poder agregar las FK

    alter table usuarios drop column cantidadasistentes; 

    alter table usuarios
    drop constraint USUARIOS_ADMINISTRATIVOS_FK2;
    
    alter table usuarios
    drop constraint USUARIOS_PROFESIONALES_FK;
    
    alter table usuarios
    drop constraint UUARIOS_CLIENTES_FK1;
  
    alter table usuarios drop column ADIMINISTRATIVOS_RUNADM;
    alter table usuarios drop column PROFESIONALES_RUNPRO;
    alter table usuarios drop column CLIENTE_RUTCLIENTE;

    alter table usuarios
    add constraint usuarios_profesionales_fk
    foreign key (run_usuario)
    references Profesionales(run_pro);
  
    alter table ASESORIAS
    drop constraint asesorias_profesionales_fk1;
      
    alter table profesionales drop primary key;
    alter table profesionales modify run_pro number(9);
  
    alter table profesionales
    add constraint profesionales_PK primary key (run_pro);

    alter table usuarios
    add constraint usuarios_cliente_fk2
    foreign key (run_usuario)
    references cliente(rutcliente);
  
    alter table usuarios
    add constraint usuarios_profesionales_fk3
    foreign key (run_usuario)
    references Profesionales(run_pro);

    alter table administrativos drop primary key;
    alter table administrativos modify run_adm number(9);
    alter table administrativos
    add constraint administrativos_pk primary key (run_adm);
   
    alter table usuarios
    add constraint usuarios_administrativos_fk4
    foreign key (run_usuario)
    references administrativos(run_adm);
  
--Ingresar registros en las tablas donde no existen
--ActividadesMejora

    alter table actividadesmejora modify nombre_actividades varchar2(50);
    insert into actividadesmejora (cod_amejora,nombre_actividades,fecha_plazo)
    values (2001, 'Seguridad Banos','20/12/2020');

    insert into actividadesmejora (cod_amejora,nombre_actividades,fecha_plazo)
    values (2002, 'Optimizar Escaleras','05/01/2021');

    insert into actividadesmejora (cod_amejora,nombre_actividades,fecha_plazo)
    values (2003, 'Seguridad de redes electricas','15/06/2021');
    
    --Asesorias
    
    alter table asesorias rename column año_que_paga to ano_q_paga;

    insert into asesorias(idasesoria,fecha_realizacion,motivo,mes_que_paga,ano_q_paga,
    profesionales_runpro,actmejora_codamejora) values(11101,'10/11/2020','actualizacion',
    'Diciembre',2020,311111111,2001);

    insert into asesorias(idasesoria,fecha_realizacion,motivo,mes_que_paga,ano_q_paga,
    profesionales_runpro,actmejora_codamejora) values(11102,'04/05/2019','Limpieza',
    'Agosto',2019,322222222,2002);

    insert into asesorias(idasesoria,fecha_realizacion,motivo,mes_que_paga,ano_q_paga,
    profesionales_runpro,actmejora_codamejora) values(11103,'13/08/2018','Optimizar redes',
    'Noviembre',2018,333333333,2003);

    insert into capacitacion(idcapacitacion,capfecha,caphora,caplugar,capduracion,cliente_rutcliente)
    values(82101,'08/09/20','08/09/20','Macul',2,111111111);

    insert into capacitacion(idcapacitacion,capfecha,caphora,caplugar,capduracion,cliente_rutcliente)
    values(82102,'08/10/20','08/10/20','Macul',2,122222222);
    UPDATE capacitacion SET caplugar = 'Nunoa' where idcapacitacion = 82102;

    insert into capacitacion(idcapacitacion,capfecha,caphora,caplugar,capduracion,cliente_rutcliente)
    values(82103,'04/02/20','04/02/20','Maipu',2,133333333);

    insert into asistentes(idasistente, asistnombrecompleto, asistedad,capacitacion_idcapacitacion,asistcorreo,asistelefono)
    values(1223, 'Pedro de las Mercedes', 39, 82103,'pedritogmail.com', 8564124);

    insert into asistentes(idasistente, asistnombrecompleto, asistedad,capacitacion_idcapacitacion,asistcorreo,asistelefono)
    values(4556, 'Maria la Palta', 28, 82101, 'Maria@gmal.com', 85647211);

    insert into asistentes(idasistente, asistnombrecompleto, asistedad,capacitacion_idcapacitacion,asistcorreo,asistelefono)
    values(7889,'Laura Rosales',45,82102, 'Laurar@gmail.com', 84521785);

    insert into chequeos (idchequeo, nombre_chequeo)
    values(6554, 'temperatura cooler carne');

    insert into chequeos (idchequeo, nombre_chequeo)
    values(3221, 'zonas limpias');

    insert into chequeos (idchequeo, nombre_chequeo)
    values(9887, 'uso de mascarilla');

    insert into visita (idvisita, visfecha, vishora, vislugar, viscomentarios, cliente_rutcliente)
    values(2111, '12/02/20','12/02/20', 'Valparaiso', 'se hizo revision del lugar y se encuentra en 
    optimas condiciones', 111111111);

    insert into visita (idvisita, visfecha, vishora, vislugar, viscomentarios, cliente_rutcliente)
    values(2222,'09/05/2020', '09/05/2020', 'Valparaiso', 'se hizo revision del lugar y se encuentra en 
    optimas condiciones', 122222222);

    insert into visita (idvisita, visfecha, vishora, vislugar, viscomentarios, cliente_rutcliente)
    values (2333, '02/04/2020', '02/04/2020','maipu', 'se hizo revision del lugar y se encuentra en 
    optimas condiciones', 133333333);

    insert into estado_cumplimiento (cumple_cheq, 
    visita_idvisita, chequeo_idchequeo)
    values('si',2111,6554);

    insert into estado_cumplimiento (cumple_cheq, 
    visita_idvisita, chequeo_idchequeo)
    values('si',2222,3221);

    insert into estado_cumplimiento (cumple_cheq, 
    visita_idvisita, chequeo_idchequeo)
    values('si',2333,9887);

    insert into pago_cliente (id_pago_cliente, fecha_pago, monto_pago, mes_que_paga,
    año_que_paga, cliente_rutcliente)
    values(5444,'05/01/2020', 65800,'diciembre','2019',111111111);

    insert into pago_cliente (id_pago_cliente, fecha_pago, monto_pago, mes_que_paga,
    año_que_paga, cliente_rutcliente)
    values(5555,'05/01/2020', 65800,'diciembre','2019',122222222);

    insert into pago_cliente (id_pago_cliente, fecha_pago, monto_pago, mes_que_paga,
    año_que_paga, cliente_rutcliente)
    values(5666,'05/01/2020', 65800,'diciembre','2019',133333333);

    insert into usuarios(run_usuario, nombres, apellidos, fecha_nacimiento)
    values(122222222, 'uuuuuuuno','uuuno','12/05/1985');

    insert into usuarios(run_usuario, nombres, apellidos, fecha_nacimiento)
    values(455555555, 'Juanito','Peerez','12/05/1990');

    insert into usuarios(run_usuario, nombres, apellidos, fecha_nacimiento)
    values(144444444, 'Margarita Daniela','Seguel Contreras','10/09/1990');


----------------------------Consultas a la DB--------------------------------

--A. 
/*Realice una consulta que permita listar todas las capacitaciones de un cliente 
en particular, indicando el nombre completo, la edad y el correo electrónico de 
los asistentes.*/

    select asistentes.asistnombrecompleto, asistentes.asistedad, 
    asistentes.asistcorreo, capacitacion.cliente_rutcliente from asistentes
    join capacitacion
    on  capacitacion.idcapacitacion = asistentes.capacitacion_idcapacitacion
    where capacitacion.cliente_rutcliente= 111111111;

--B.
/*Realice una consulta que permita desplegar todas las visitas en terreno 
realizadas a los clientes que sean de la comuna de Valparaíso. Por cada visita 
debe indicar todos los chequeos que se hicieron en ella, junto con el estado de 
cumplimiento de cada uno.*/

    select visfecha,viscomentarios,vislugar, e.cumple_cheq,c.nombre_chequeo
    from estado_cumplimiento e
    join visita v
    on idvisita= e.visita_idvisita
    join chequeos c
    on chequeo_idchequeo=c.idchequeo
    where vislugar='Valparaiso';

--C
/*Realice una consulta que despliegue los accidentes registrados para todos los clientes,
indicando los datos de detalle del accidente, y el nombre, apellido, RUT y teléfono del
cliente al que se asocia dicha situación.*/

    select idaccidente,accifecha,accihora,accilugar,acciorigen,a.acciconsecuencias,
    c.clinombres,c.cliapellidos,c.rutcliente,c.clitelefono
    from cliente c
    join accidente a
    on cliente_rutcliente=c.rutcliente;
