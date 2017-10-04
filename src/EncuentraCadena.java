
import java.util.Scanner;

public class EncuentraCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String cadena, subcadena;
        int posicion=0, apariciones=0;
        
        //Ingreso de datos
        System.out.println("Ingrese una cadena de palabras :");
        cadena = scan.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Ingrese la palabra que desea buscar :");
        subcadena = scan.nextLine();
        System.out.println();
        while (posicion>=0){				
                posicion = cadena.indexOf(subcadena, posicion);			
                if (posicion >= 0){
                        posicion++;
                        apariciones++;
                }
        }		
        System.out.println("Aparece " + apariciones + " veces");

    }
    
}
