package random;

public class Randomx1 {
	
	public static void main (String[]Args) {
		
//		int[] numeros = {5,7,9,10};
//		
//		
//		for (int i=0;i<4;i++) {
//			System.out.println(numeros[i]);
//		}
		
		
		String a = "mensaje";
		String b = "de";
		String c = "prueba";
		String d = "El Adrian";
		String f = "lo";
		String g = "C****";
		
		int x = 2;
		int y = 3;
		int w = 2;
		int z = 2;
		
		mensaje(a,b,c);
		mensaje(d,f,g);
		mensaje(d,a,f);
		
		mensaje2(d,f,g);
		
		System.out.println(suma(x,y));
		System.out.println(suma(w,z));
		System.out.println(suma(x,z));
		
		
	}	

	
	public static void mensaje(String a, String b, String c) {
		System.out.println(a+" "+b+" "+c);
		
	}
	
	public static String mensaje2(String a, String b, String c) {
		
		String mensaje = a+b+c;
		System.out.println(a+" "+b+" "+c);
		return mensaje;
		
	}
	
	public static int suma(int x, int y) {
		return x+y;
	}
	


	

	
	
	
}
