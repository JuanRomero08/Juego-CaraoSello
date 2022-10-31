/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author Janus
 */
public class Juego {

    public static void main(String[] args) throws Exception {
        /*Declaracion de variables*/
        int lanzarMoneda = (int) (Math.random() * 2) + 1;
        int seguir = 1, contador, total = 0, suma = 1;
        
        
        for (contador = 0; contador < suma; contador++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese su nombre:");
            String nombre=leer.nextLine();
            System.out.println(nombre+", Ingresa la cantidad de dinero que deseas apostar:");
           
            int apuesta = leer.nextInt();

            
            /* Seleccion de opciones para el jugador y lectura de esta misma */
            System.out.println("Seleccione una de estas opciones: \n 1. Cara \n 2. Sello");
            int opcionJuego = leer.nextInt();

            
            /*Respuesta del sistema a la opcion seleccionada por el jugador, lanza mensaje segun si pierde o gana */
            if (opcionJuego == lanzarMoneda) {
                System.out.println("Felicidades, salio su opcion seleccionada, ha ganado");
                total += apuesta * 2;
                System.out.println("La suma total de su dinero es: " + total);
            } else {
                System.out.println("Lo siento, has perdido :,((");
                total = apuesta - apuesta;
                System.out.println("La suma total de su dinero es: " + total);
            }

            System.out.println("Si desea seguir jugando digite el numero 1, Si desea salir del juego digite el numero 2");
            seguir = leer.nextInt();

            if (seguir == 1) {
                suma++;
            }
        }

        if (seguir == 2) {
            System.out.println("Usted gano en total: " + total);
            System.out.println("El total de veces que ha jugado es: " + contador);
        } else if (seguir > 2) {

        }

    }
}
