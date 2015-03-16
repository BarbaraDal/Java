import java.util.Random;


public class Punto {

	private int x;
	private int y;

	
	public int DevuelveNroy()
	{ int yy;
	Random r = new Random();
	
	yy= r.nextInt(10)-r.nextInt(10);
		return yy;
	}
	
	public int DevuelveNrox(){
		int yy;
		Random r = new Random();
		
		yy= r.nextInt(10)-r.nextInt(10);
			return yy;
	}
	
	
	
	
	public Punto(int xy){
		
		x=xy;
		y=xy;
	}
	public Punto(int xa, int ya){
		if(xa>=10 || xa >=-10){
		x= xa;}
		else {if(xa>10){int nro= 10-xa;
		}}
		
		if(xa>=10 || ya >=-10){
		y= ya;} else{}
	}
	
	public Punto(){
		x= DevuelveNrox();
		y= DevuelveNroy();
	}
}
