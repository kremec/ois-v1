import java.lang.Math.*;
public class Gravitacija {
    
    public static void main(String[] args){
		System.out.println("OIS je zakon!");

		static void nadmorskaVisina(double visina, double grav_pospesek) {
            System.out.println(visina + " " + grav_pospesek);
        }
	}

	public static double gravPos(double visina)
	{
		return (6.674*Math.pow(10,-11)*5.972*Math.pow(10,24))/(Math.pow(6.371*Math.pow(10,6) + visina,2));
	}
}
