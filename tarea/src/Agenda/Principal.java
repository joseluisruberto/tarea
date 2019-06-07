package Agenda;

	import java.util.Scanner;
	public class Principal {
		
		public static void main(String[] arg){		
			
			Scanner leer=new Scanner(System.in);
			int opcion, tamanio;
			Contacto mi_contacto = null;
			String nombre = null, telefono, email;
			boolean band=true;	
			
			System.out.print("Tamaño de la agenda: ");
			tamanio=leer.nextInt();
			Agenda mi_agenda=new Agenda(tamanio);		
					
			while(band==true){	
				menu();			
				System.out.print("> Elegir opcion: ");
				opcion=leer.nextInt();
				
				switch(opcion){
					case 1: 
						System.out.print("Ingresar nombre del contacto: ");
						nombre=leer.next();
						System.out.print("Ingresar numero de telefono contacto: ");
						telefono=leer.next();
						System.out.print("Ingresar email del contacto: ");
						email=leer.next();
						
						mi_contacto=new Contacto(nombre,telefono,email);
						mi_agenda.setContacto(mi_contacto);
						break;
					case 2:
						break;
					case 3:
						mi_agenda.buscarpornombre(nombre);
						break;
					case 4:
						mi_agenda.eliminarcontacto(mi_contacto);
						break;
					case 5:
						mi_agenda.listarContactos();
						break;
					case 0:
						band=false;
						break;
					default:				
						break;					
				}				
			}		
		}
		
		public static void menu(){
			System.out.println("");
			System.out.println("Menu Agenda");
			System.out.println("[1] Agregar Contacto");
			System.out.println("[2] Editar Contacto");
			System.out.println("[3] Buscar Contacto");
			System.out.println("[4] Eliminar Contacto"); 
			System.out.println("[5] Listar Contacto");
			System.out.println("[0] Finalizar Programa");
		}
		


	}

