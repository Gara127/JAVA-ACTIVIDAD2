import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Actividad0202 {
    public static void main(String[] args) throws IOException {

        String [] [] notasAsignatura= new String [4] [4];
        notasAsignatura [0][0] = "M01";
        notasAsignatura [0][1] = "8";
        notasAsignatura [0][2] = "5";
        notasAsignatura [0][3] = "10";    
        notasAsignatura [1][0] = "M02"; 
        notasAsignatura [1][1] = "3"; 
        notasAsignatura [1][2] = "8"; 
        notasAsignatura [1][3] = "9"; 
        notasAsignatura [2][0] = "M03"; 
        notasAsignatura [2][1] = "9"; 
        notasAsignatura [2][2] = "7"; 
        notasAsignatura [2][3] = "6"; 
        notasAsignatura [3][0] = "M04"; 
        notasAsignatura [3][1] = "10"; 
        notasAsignatura [3][2] = "4"; 
        notasAsignatura [3][3] = "9"; 
        int i=0;
        int j=0;
        int valorIntroducido = 0;
        int valorModificado = 0;
        Scanner entrada= new Scanner(System.in);
        String nombreModificado = "";

        System.out.println("Los valores del array bidemensional son: ");
        for ( i = 0; i<notasAsignatura.length; i++) {

            for ( j=0; j<notasAsignatura[i].length; j++) {
                System.out.print(notasAsignatura[i][j] + " ");
            }
            System.out.println();
        }
        
        do{
            System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:" );
            System.out.println("1- Mostrar el nombre de todas las asignaturas." );
            System.out.println("2-Modificar el nombre de una asignatura. " );
            System.out.println("3- Modificar la puntuación de una asignatura." ); 
            System.out.println("4- Mostrar la puntuación menor de cada una de las asignaturas." ); 
            System.out.println("0- Salir" );

            valorIntroducido =entrada.nextInt();
            switch(valorIntroducido){                  
                case 1:     

                    System.out.println("Los asignaturas introducidas son: ");
                    for ( i = 0; i<notasAsignatura.length; i++) {
            
                        System.out.print(notasAsignatura[i][0] + " ");
                        
                    }  
                    System.out.println();  
                    break;
                 
                case 2:
                    do{
                        System.out.println("Indica la posición  de la asignatura que quieres modificar ( entre 0 y 3)");
                        i = entrada.nextInt();
                    }while(i<0 || i>3);   
                    System.out.println("Indica el nuevo nombre de la asignatura");
                    nombreModificado = entrada.next();
                    System.out.println("Has modificado la asignatura " + notasAsignatura[i][0] + " por " + nombreModificado);
                    notasAsignatura[i][0]=nombreModificado;
 
                    break;
                case 3:
                    do{
                        System.out.println("Indica el número de asignatura (entre 0 y 3) que le quieres cambiar un valor ");
                        i = entrada.nextInt();
                    }while(i<0 || i>3);

                    do{
                        System.out.println("Indica el número de puntuación (entre 1 y 3) que quieres modificar");
                        j = entrada.nextInt();
                    }while(j<1 || j>3);

                    do{
                        System.out.println("Indica la nueva puntación");
                        valorModificado = entrada.nextInt();
                    }while(valorModificado<0 || valorModificado>10 );

                    notasAsignatura[i][j] = Integer.toString(valorModificado);
                    System.out.println("Has modificado la puntuación de " + notasAsignatura[i][0] + " por " + valorModificado);
                    break;
                case 4:

                    for (i=0; i<notasAsignatura.length; i++) {
                        int min=-1;
                        int nota=0;
                        for (j=1; j<notasAsignatura[i].length; j++) {
                                nota=Integer.parseInt(notasAsignatura[i][j]);
                                if(nota<min ||min==-1) {
                                    min=nota;
                                }
                        }
                        System.out.println("La puntuación más baja de la asignatura " + notasAsignatura[i][0] + " es " + min);
                    }
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
