package Grupal;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Contenedor con = new Contenedor();
		
		Scanner datos = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0;

		String rut;
		String run;
		String nombres;
		String apellidos;
		String telefono;
		String afp;
		int siSalud;
		String direccion;
		String comuna;
		int ed;
		String fechaNac;


		/**
		 * ciclo while que permite ejecutar el programa mientras no se ingrese opcion 9
		 * (salir)
		 */

		while (!salir) {

			System.out.println(">>>>BIENVENIDO<<<<");
			System.out.println("Ingrese una opcion");
			System.out.println("1: Almacenar Cliente");
			System.out.println("2: Almacenar Profesional");
			System.out.println("3: Almacenar Administrativo");
			System.out.println("4: Almacenar Capacitacion");
			System.out.println("5: Eliminar Ususario");
			System.out.println("6: Lista Usuario");
			System.out.println("7: Lista Usuario segun tipo de perfil");
			System.out.println("8: Lista Capacitaciones");
			System.out.println("9: Salir");

			try {

				opcion = datos.nextInt();

				switch (opcion) {

				case 1:

					System.out.println(">>>> Registro Cliente<<<<");
					
					System.out.println(">>>> Ingrese Rut del cliente <<<<");
					rut = datos.next();

					while (rut.length() < 7 || rut.length() > 8) {
						System.out.println("Escribe  los primeros 8 caracteres de tu rut, campo obligatorio*");
						rut = datos.next();
					}
					
					System.out.println("Ingrese Fecha Nacimiento*:");
					fechaNac = datos.next();

					if (fechaNac.length() == 0 || fechaNac == " ") {
						System.out.println("Favor escribir la fecha de nacimiento en formato dd/mm/yyyy *");
						fechaNac = datos.next();
					}
					
					System.out.println("Ingrese nombres*:");
					nombres = datos.nextLine();

					while (nombres.length() < 5) {
						System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
						nombres = datos.nextLine();
						while (nombres.length() > 30) {
							System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
							nombres = datos.nextLine();
						}
					}

					System.out.println("Ingrese apellidos*:");
					apellidos = datos.nextLine();

					while (apellidos.length() < 5) {
						System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
						apellidos = datos.nextLine();
						while (apellidos.length() > 30) {
							System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
							apellidos = datos.nextLine();
						}
					}
					
					System.out.println(">>>> Ingrese Run del cliente <<<<");
					run = datos.nextLine();

					while (run.length() < 7) {
						System.out.println("Escribe  los primeros 8 caracteres de tu rut, campo obligatorio*");
						run = datos.nextLine();
						while (run.length() > 8) {
							System.out.println("Escribe  los primeros 8 caracteres de tu rut, campo obligatorio*");
							run = datos.nextLine();
						}
					}

					System.out.println("Ingrese su telefono*:");
					telefono = datos.next();

					if (telefono.length() <= 0 ) {
						System.out.println("Escribe los 9 digitos de su telefono, campo obligatorio*");
						telefono = datos.next();
					}

					System.out.println("Ingrese AFP *:");
					afp = datos.next();

					while (afp.length() < 4 || afp.length() > 30) {
						System.out.println("Texto entre 4 a 30 caracteres, campo obligatorio*");
						afp = datos.nextLine();
					}

					
					do {
						System.out.println("Seleccione segun Sistema de Salud:");
						System.out.println("1. Fonasa  2.Isapre");
						siSalud = datos.nextInt();
					} while (siSalud < 1 || siSalud > 2);

					

					System.out.println("Ingrese Direccion*:");
					direccion = datos.next();

					while (direccion.length() > 70) {
							System.out.println("Ingresa texto hasta 70 caracteres, campo obligatorio*");
							direccion = datos.next();
					}

					System.out.println("Ingrese comuna*:");
					comuna = datos.next();
					datos.next();
						while (comuna.length() > 50) {
							System.out.println("Ingresa texto hasta 50 caracteres, campo obligatorio*");
							comuna = datos.next();

						}

					System.out.println("Ingrese Edad.*:");
					ed = datos.nextInt();

					while (ed < 1) {
						System.out.println("Edad no válida, ingese edad.(campo obligatorio*).");
						ed = datos.nextInt();
						while (ed > 150) {
							System.out.println("Edad no válida, ingese edad.(campo obligatorio*).");
							ed = datos.nextInt();

						}
					}
					
					con.almacenarCliente(new Cliente(nombres +" "+ apellidos, fechaNac, Integer.parseInt(run),Integer.parseInt(rut),nombres,apellidos,telefono,afp,siSalud,direccion,comuna,ed));

					break;

				case 2:
					System.out.println(">>>>Registro Profesional<<<<");


					String titProf;
					
					
					System.out.println("Ingrese nombres*:");
					nombres = datos.next();

					while (nombres.length() < 5 || nombres.length() > 30) {
						System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
						nombres = datos.next();
					}

					System.out.println("Ingrese apellidos*:");
					apellidos = datos.next();

					while (apellidos.length() < 5 || apellidos.length() > 30) {
						System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
						apellidos = datos.next();
					}
					
					
					System.out.println("Ingrese Fecha Nacimiento en formato dd/mm/yyyy *:");
					fechaNac = datos.next();

					if (fechaNac.length() == 0 || fechaNac == " ") {
						System.out.println("Favor escribir la fecha de nacimiento en formato dd/mm/yyyy *");
						fechaNac = datos.next();
					}
					
					System.out.println(" Ingrese Run del cliente ");
					run = datos.next();

					while (run.length() < 7 || run.length() > 8) {
						System.out.println("Escribe  los primeros 8 caracteres de tu rut, campo obligatorio*");
						run = datos.next();
					}
					

					System.out.println("Ingrese titulo Profesional:");
					titProf = datos.next();

					while (titProf.length() < 10 || titProf.length() > 50) {
						System.out.println("Escribe entre 10 a 50 caracteres, campo obligatorio*");
						titProf = datos.next();
					}

					System.out.println("Ingrese fecha de ingreso (DD/MM/AAAA):");
					String fechIng = datos.next();
					
					con.almacenarProfesional(new Profesional(nombres +" "+ apellidos, fechaNac, Integer.parseInt(run), titProf,fechIng));

					break;

				case 3:

					System.out.println(">>>>Registro Administrativo<<<<");

					System.out.println("Ingrese nombres*:");
					nombres = datos.next();

					while (nombres.length() < 5 || nombres.length() > 30) {
						System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
						nombres = datos.next();
					}

					System.out.println("Ingrese apellidos*:");
					apellidos = datos.next();

					while (apellidos.length() < 5 || apellidos.length() > 30) {
						System.out.println("Escribe entre 5 a 30 caracteres, campo obligatorio*");
						apellidos = datos.next();
					}
					
					
					System.out.println("Ingrese Fecha Nacimiento en formato dd/mm/yyyy *:");
					fechaNac = datos.next();

					if (fechaNac.length() == 0 || fechaNac == " ") {
						System.out.println("Favor escribir la fecha de nacimiento en formato dd/mm/yyyy *");
						fechaNac = datos.next();
					}
					
					System.out.println(" Ingrese Run del cliente ");
					run = datos.next();

					while (run.length() < 7 || run.length() > 8) {
						System.out.println("Escribe  los primeros 8 caracteres de tu rut, campo obligatorio*");
						run = datos.next();
					}
					
					System.out.println("Ingrese Area:");
					String area = datos.next();

					System.out.println("Ingrese experiencia previa:");
					String expPrev = datos.next();
					
					con.almacenarAdministrativo(new Administrativo(nombres +" "+ apellidos, fechaNac,  Integer.parseInt(run), area,expPrev));

					break;

				case 4:

					System.out.println(">>>>Registro Capacitacion<<<<");

					System.out.println("Ingrese ID de Capacitacion:");
					int idCap = datos.nextInt();

					System.out.println("Ingrese Rut:");
					run = datos.next();
					
					//int runus = Integer.parseInt(run);

					System.out.println("Ingrese dia de la Capacitacion:");
					String diaCap = datos.next();

					System.out.println("Ingrese hora de la Capacitacion (HH:MM):");
					String horaCap = datos.next();

					System.out.println("Ingrese lugar*:");
					String dirCap = datos.next();
					
					while (dirCap.length()<10 ){
						System.out.println("Escribe entre 10 a 70 caracteres, campo obligatorio*");
						dirCap = datos.next();
							while (dirCap.length()>70 ) {
									System.out.println("Escribe entre 10 a 70 caracteres, campo obligatorio*");
									dirCap = datos.next();	
								}						
					}

					
					
					System.out.println("Ingrese Duracion de la Capacitacion:");
					String durCap = datos.next();
					while (durCap.length()<0 ){
						System.out.println("Ingrese Duracion de la Capacitacion*");
						durCap = datos.next();
							while (durCap.length()>70 ) {
									System.out.println("Ingrese Duracion de la Capacitacion*");
									durCap = datos.next();	
								}						
					}
					

					System.out.println("Ingrese Cantidad de asistentes:");
					int cantAsist = datos.nextInt();
										
					con.almacenarCapacitacion(new Capacitacion(idCap,Integer.parseInt(run), diaCap,horaCap,dirCap,durCap,cantAsist));

					break;

				case 5:

					System.out.println(">>>>Eliminar Usuario<<<<");
					System.out.println(">>>>ingrese el rut del usuario a eliminar: <<<<");
					rut = datos.next();
					con.eliminarUsuario(Integer.parseInt(rut));
					break;

				case 6:

					System.out.println(">>>>Lista de Usuarios<<<<");
					con.listarUsuarios();
					break;

				case 7:
					
					System.out.println(">>>>Lista de Usuarios segun tipo de perfil<<<<");
					System.out.println(">>>>1.- Administrativo <<<<");
					System.out.println(">>>>2.- Profesional <<<<");
					System.out.println(">>>>3.- Cliente <<<<");
					int tipo = datos.nextInt();
					con.listarUsuariosXTipo(tipo);
					break;

				case 8:

					System.out.println(">>>>Lista de Capacitaciones<<<<");
					con.listarCapacitaciones();
					break;

				case 9:

					System.out.println("Gracias por Visitarnos");
					System.exit(0);
					salir = true;
					
					break;

				default:
					System.out.println("Ingrese una Opcion valida");
					System.out.println("*********************");

				}
				

			} catch (InputMismatchException e) {
				System.out.println(" Ingrese una opción valida  : " );
				opcion = datos.nextInt();
			}
		}
	}
}
