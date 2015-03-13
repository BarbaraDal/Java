import java.util.Random;
import java.util.Scanner;


public class Ejer2 {

	public static void main(String[] args) {
//		double azar= Math.random();
//        System.out.println(azar);
		int a,b;
		int intentos=0;
		boolean val;
		String dificultad;
		Random rnd= new Random();
		Scanner teclado= new Scanner(System.in);
		a= rnd.nextInt(11);
		do{
		System.out.println("Ingrese el número que se genero");
		int nro= teclado.nextInt();
		val= (nro==a);
		System.out.println(val);
		intentos ++;
		}while (val==false);
	    if( intentos<=3){dificultad= "Fácil";}
	    else if (intentos<=7){dificultad= "Intermedio";}
	    else  {dificultad= "Complicado";}
		System.out.println("Cantidad de intentos "+ intentos);
	    System.out.println("Dificultad " + dificultad);
		System.out.println("El numero es: " +a);
		
	}

}
