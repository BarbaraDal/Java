import java.util.Random;


public class PruebaDevuelvenro {

	public static void main(String[] args) {
        int yy;
		Random r = new Random();
		
		do {yy= r.nextInt(10)-r.nextInt(10);
			System.out.println(yy);
			
		} while (yy>=10 || yy >=-10 );
		if(yy>=10|| yy >=-10 ){System.out.println("no sirvio");
		}
		
		
		
	}
}
