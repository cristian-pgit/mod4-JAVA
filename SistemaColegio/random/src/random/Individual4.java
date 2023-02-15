package random;

public class Individual4 {
	
	public static void main (String[]Args) {
		
//		Evalúe las siguientes expresiones lógicas, y determine su valor de verdad. En este 
//		punto no debe usar ninguna ayuda tecnológica, solo las tablas de verdad indicadas 
//		en el material de apoyo.
//		a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10))
//		b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3))
//		c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20)
//				
//		a) (A mayor que B)[v] O (largo(Hola Mundo) = 10)[v] [Verdadero]
//		b) 7 no es menor que 7[v] Y 7 no es mayor que 9[v] O 3menor a 5[f] Y 4=3[f] [Verdadero]
//		c) 4 mayor que 14 [f] O 5 menor a 20[v] [Verdadero]
		
		boolean V1,V2,V3;
		String a = "A";
		String b = "B";
		String hm = "Hola Mundo";
		
		
		System.out.println("Veamos cual de las siguientes Afirmaciones son Verdaderas");
		System.out.println("a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10))");
		if( a.compareTo(b)>0 || hm.length()==10) {
			V1 = true;
		} else {
			V1 = false;
		}
		System.out.println("V1 es: "+V1);
		
		System.out.println("Veamos cual de las siguientes Afirmaciones son Verdaderas");
		System.out.println("b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3))");
		V2= ( !((5+2)<7) && !((7 > 9) || (3 < 5) && (4 == 3))); 
		System.out.println("V2 es: "+V2);
		
		System.out.println("Veamos cual de las siguientes Afirmaciones son Verdaderas");
		System.out.println("c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20)");
		V3= ( ((2*3 + 5 -7) > (2*(2 + 5)) || ((10 - 5) < 20))); 
		System.out.println("V3 es: "+V3);
		
		
		System.out.println("Por tanto de las tres afirmaciones son a)"+V1+", b)"+V2+", c)"+V3);
	
		
		
		
	}

}
