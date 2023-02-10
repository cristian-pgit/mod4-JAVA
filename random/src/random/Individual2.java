package random;

import java.util.Arrays;
import java.util.Scanner;

public class Individual2 {
	
	
	public static void main (String[]Args) {
		
		/*“Una persona debe permanecer 14 días en observación únicamente si ha salido del país. La persona
se hará el PCR si quiere volver a la normalidad. Dado que ni la persona ha salido del país ni presenta
contagios cercanos, no tendrá que hacer cuarentena ni se le hará el PCR.”*/
		boolean salio;
		boolean conCer;
		int ddObs = 14;
		
		System.out.println("Ha Salido fuera del Pais recientemente?");
		salio = haSalido();
		System.out.println("Ha tenido contacto estrecho");		
		conCer = conCer();
		if(salio == true || conCer == true) {
			System.out.println("Ud debera realizarse un test de PCR y permanecer en cuarentena por: "+ddObs+" dias.");
		} else {
			System.out.println("no es necesario permanecer ni en cuarentena ni realizarse test alguno");
		}
		
	}
	
	//se cuida
		public static Boolean haSalido() {
			boolean salio = false;
			Scanner pr = new Scanner(System.in);
			salio = pr.nextBoolean();
			return salio;
		}
		
		public static boolean conCer() {
			boolean cs = false;
			Scanner pr = new Scanner(System.in);
			cs = pr.nextBoolean();
			return cs;
		}

}
