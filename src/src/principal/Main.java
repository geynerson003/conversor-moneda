package principal;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner reading = new Scanner(System.in);

        System.out.println("""
                **********************************
                Bienvenido al conversor de divisas
                **********************************
                """);

        while (true){
            Menu menu = new Menu();
            menu.menuMain();

            try {
                int numMenu = reading.nextInt();

                switch (numMenu){
                    case 1: menu.firstMenu();
                    break;
                    case 2: menu.secondMenu();
                    break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opción no valida, intenta nuevamente...");
                        break;
                }
                if (numMenu == 4){
                    System.out.println("Muchas gracias por usar nuestros sevicios.");
                    break;
                }
            } catch (RuntimeException e){
                System.out.println("Finalizando programa");
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }

    }
}
