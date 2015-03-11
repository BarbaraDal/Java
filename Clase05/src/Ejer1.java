import java.util.Scanner;


public class Ejer1 {

	public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("ingrese palabra");
     String linea= s.nextLine();
     int e= linea.length();
     System.out.println(e);

//     System.out.println(linea.charAt(3));
     int i=0;
     int v=1;
     int c=1;
     int vi=0,ci=0;
     
     for (i= 0; i<e; i++)
 {
	if (linea.charAt(i)=='a' || linea.charAt(i)=='e'||linea.charAt(i)=='i'||linea.charAt(i)=='o'||linea.charAt(i)=='u')
	{
	 vi=v;
	 v++;
	}
	else  {
	ci=c;
	c++;
	}
//	i++;
	}
	System.out.println("cantidad de vocales"+ vi); 
	System.out.println("cantidad de consonantes" + ci);}
 }
     
//     while (i<=e)
//    	 
//     {
//    	 System.out.println(linea.charAt(i));
//     i++;
//    	 
//     }
//     for (i= 10; i<=e; i++){
//    	 System.out.println(linea.charAt(i));
//    	
//     }
	


