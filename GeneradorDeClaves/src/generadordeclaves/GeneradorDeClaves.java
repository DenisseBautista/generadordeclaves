
package generadordeclaves;

import java.util.Scanner;

/**
 * @author denissE
 */
public class GeneradorDeClaves {

    
    public static void main(String[] args) {
   System.out.println("¡Bienvenido al generador de claves/contraseñas!");
   Scanner dat=new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("Nombre:");
        String name=dat.nextLine();
         System.out.print("Apellidos:");
        String apellidos=dat.nextLine();
        System.out.println("Nombre:"+name);
        System.out.println("apellidos: " + apellidos);
           }
    
}
