import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		  
			int ladoA = 0, ladoB= 0, ladoC= 0;

		    try
		    {
		    	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));    	
		    	
		    	System.out.println("Ingrese el largo de uno de los lados!");
		    	ladoA = Integer.parseInt(br.readLine());
		    	System.out.println("Ingrese otro lado");
		    	ladoB = Integer.parseInt(br.readLine());
		        System.out.println("Ingrese otro lado");
		        ladoC = Integer.parseInt(br.readLine());
		    }
		    catch(Exception e)
		    {
		    	//
		    	// System.out.println(e.getMessage());
		    	System.out.println("El parametro ingresado no es correcto.");
		    	System.exit(-1);
		    }

		    if ( ladoA + ladoB <= ladoC || ladoC + ladoB <= ladoA || ladoA + ladoC <= ladoB
		        || ladoA <= 0 || ladoB <= 0 || ladoC <= 0)
		    {
		    	System.out.println("No es triangulo");
		    	System.exit(-1);
		    }
            // System.out.println(e.getMessage());
		    if ( ladoA == ladoB && ladoB == ladoC )
		    	System.out.println("El triangulo es EQUILATERO");
            /*Nada*/
		    if ( ladoA != ladoB && ladoB != ladoC && ladoA !=ladoC )
		    	System.out.println("El triangulo es ESCALENO");

		    /*if ( ( ladoA == ladoB && ladoB != ladoC ) || ( ladoA == ladoC && ladoC != ladoB ) ||
		          ( ladoC == ladoB && ladoB != ladoA ))
		    	System.out.println("El triangulo es ISOSCELES");*/
		    System.exit(0);
	}
}
