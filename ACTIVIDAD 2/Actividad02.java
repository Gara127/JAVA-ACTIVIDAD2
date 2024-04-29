import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Actividad02 {
    public static void main(String[] args) throws IOException {
        int valorIntroducido = 0;
        Scanner entrada= new Scanner(System.in);
        double[] recipientes = new double[5];
        int i = 0; 
        double cantidadIntroducido = 0;
        double litrosTotales = 0;
        recipientes[0]= 0.0;  
        recipientes[1] = 0.0;
        recipientes[2] = 0.0;
        recipientes[3] = 0.0;
        recipientes[4] = 0.0;



        do{
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:" );
            System.out.println("1- Añadir refresco a un recipiente." );
            System.out.println("2-Quitar refresco de un recipiente. " );
            System.out.println("3- Calcular el total de refresco." ); 
            System.out.println("0-Finalizar" );
            
            valorIntroducido =entrada.nextInt();
            switch(valorIntroducido){                  
                case 1:                               
                    do{
                        System.out.println("Introduce el número del recipiente para añadir el refresco (del 0 al 4)");
                        i =entrada.nextInt();
                    }while(i<0 || i>4);

                    do{
                        System.out.println("Introduce la cantidad a ingresar en el recipiente " + i );
                        cantidadIntroducido = entrada.nextDouble();
                    }while(cantidadIntroducido<0);

                    recipientes[i] += cantidadIntroducido;

                    for ( i = 0; i<recipientes.length; i++) {
                        System.out.println("El estado actual del recipiente " + i + " es: "  + recipientes[i]);
                    }

                    break;
                 
                case 2:
                   do{
                        System.out.println("Introduce el número del recipiente para quitar el refresco (del 0 al 4)");
                        i =entrada.nextInt();
                    }while(i<0 || i>4);
                         
                    do{
                        System.out.println("Introduce la cantidad a quitar en el recipiente " + i );
                        cantidadIntroducido = entrada.nextDouble();
                    }while(cantidadIntroducido<0 || cantidadIntroducido>recipientes[i]);

                    recipientes[i] -= cantidadIntroducido;

                    for ( i = 0; i<recipientes.length; i++) {
                        System.out.println("El estado actual del recipiente " + i + " es: "  + recipientes[i]);
                    }

                    break;
                case 3:
                    for ( i = 0; i<recipientes.length; i++) {
                        litrosTotales += recipientes[i];    
                    }
                    System.out.println("El total de litros de todos los recipientes es " + litrosTotales);
                    break;
                case 0:
                    System.out.println("adiós");
                    break;
            default:
                System.out.println ("Ha introducido un valor incorrecto, por favor inserte de nuevo");         
            }
            
        }while(valorIntroducido!=0);
        


        entrada.close();       
              
    }
}      