import java.util.Scanner;

public class MaquinaTragaperrasPrueba {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaTragaperras maquina = new MaquinaTragaperras();
        //Empezamos el programa preguntandole al jugador cuando dinero quiere apostar
        System.out.println("***BIENVENIDO AL JUEGO DE LA MÁQUINA TRAGAPERRAS***");
        double saldo;
        String respuesta = "";
        //Si la cantidad a apostar es menor de 1 o mayor de 50 entonces repetimos la pregunta
            do  {
                System.out.println("¿Con cuánto dinero quieres empezar ( 1 a 50 ) ?");
            saldo = sc.nextInt();
             } while ((saldo < 1) || (saldo > 50));
            //Cada respuesta según el resultado de la parida
             do {
                saldo = saldo - 0.5;
                System.out.println("La combinación de esta jugada es: " + maquina.getTirada());
                if (maquina.getPremio() >= 1) {
                    System.out.println("Felicidades, has ganado " + maquina.getPremio());
                    saldo = saldo + maquina.getPremio();
                }
                else {
                    System.out.println("No has ganado nada");
                }
                System.out.println("Su saldo actual es de " + saldo + "euros");
                //Le preguntamos al jugador si desea seguir jugando
                do {
                    System.out.println("¿Quiere seguir jugando? (S - N)");
                    respuesta = sc.next().toUpperCase();
                } while (!respuesta.equals("S") && (!respuesta.equals("N")));
             } while (saldo >= 0.5 && !respuesta.equals("N"));
             System.out.println("Hasta la proxima!!");
    }
}