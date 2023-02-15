package random;

import java.util.Arrays;
import java.util.Scanner;

public class Individual3 {

	public static void main(String[] args) {

		String seCuida;
		String udLee;
		
		System.out.println("Si un trabajador no cuida los procedimientos de seguridad, ocurrirá un accidente. Si el trabajador "
				+ "no lee el manual de seguridad interno sucedería lo mismo. El trabajador no ha sufrido incidentes. "
				+ "De ahí concluimos que ha seguido todos los procedimientos de seguridad, y ha leído el manual de seguridad interno");
		
		System.out.println("");
		System.out.println("Por tanto...veamoslo en practica....");
		System.out.println("Ud.");
		System.out.print("Cuida los procedimientos de seguridad?");
		seCuida = seCuida();
		System.out.print("Lee el manual de seguridad interno?");
		udLee = udLee();
		System.out.println("");
		
		System.out.println("Entonces podemos concluir que:");
		if(seCuida.equals("si")) {
					System.out.println("Me Parece que Ud. cumpla con los protocolos de seguridad, por lo tanto no debiera sufrir de accidentes");
		} else {
			System.out.println("Ud. no respeta los protocolos de seguridad, lo mas seguro es que sufra un accidente");
		};
		
		if(udLee.equals("si")) {
			System.out.println("Me Parece que Ud. lea el Manual de Seguridad Interno, por lo tanto no debiera sufrir de accidentes");
		} else {
			System.out.println("Ud. no lee el Manual de Seguridad Interno, lo mas seguro es que sufra un accidente");
		};
		
		
		System.out.println("...por lo tanto...");
		if(seCuida.equals("si") && udLee.equals("si")) {
			System.out.println("Ud. es una persona que cuida los protocolos de seguridad y se ha leido correctamente, "
					+ "por lo cual Ud. no debiera sufrir de accidente alguno");
		} else {
			System.out.println("Ud. es propenso a sufrir de accidentes, esto se debe a que no sigue los protocolos de seguridad."
					+ "Lo cual nos podria indicar o que es descuidado, o que nunca ha leido el Manual de Seguridad Interna");
		}
		
		
	}
	
	
	//se cuida
	public static String seCuida() {
		boolean ok = false;
		String seCuida = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			seCuida = pr.nextLine();
			seCuida = seCuida.toLowerCase().trim();
			String[] opcion = {"si","no"};
			if(!Arrays.asList(opcion).contains(seCuida) ) {
				System.out.println("no puede estar vacio. Responda Si o No");
				System.out.print("Cuida los procedimientos de seguridad?: ");
			} else {
				ok = true;
			}
		}
		return seCuida;
	}
	public static String udLee() {
		boolean ok = false;
		String lee = null;
		while ( ok == false) {
			Scanner pr = new Scanner(System.in);
			lee = pr.nextLine();
			lee = lee.toLowerCase().trim();
//			String[] opcion = {"si","no"};
//			if(!Arrays.asList(opcion).contains(lee) ) {
//				System.out.println("no puede estar vacio. Responda Si o No");
//				System.out.print("Cuida los procedimientos de seguridad?: ");
//			} else {
//				ok = true;
//			}
			if(lee.equals("si") || lee.equals("no")) {
				ok = true;
				System.out.println(lee);
			} else {
				System.out.println("Responda Si o No");
			}
		}
		return lee;
	}
	
	
	

}
