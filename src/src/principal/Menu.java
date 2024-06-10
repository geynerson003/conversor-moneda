package principal;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    String firstMoney = "";
    String secondMoney ="";

    Scanner reading = new Scanner(System.in);

    public void menuMain(){
        System.out.println("""
                Selecciona la opción a realizar:
                --------------------------------
                1) Tasa de conversión.
                2) Realizar conversión.
                3) Salir.
                --------------------------------
                """);
    }

    public void firstMenu() throws IOException{
        int index = 1;

        while (true){
            System.out.println("""
                    Selecciona la opción para conocer la taza de conversión.
                    --------------------------------------------------------
                    1) Dólar =>> peso argentino.
                    2) Peso argentino =>> Dólar.
                    3) Dólar =>> Real brasileño.
                    4) Real brasileño =>> Dólar.
                    5) Dólar =>> Peso colombiano. 
                    6) Peso colombiano =>> Dólar.
                    7) Salir.
                    
                    ELIJA UNA OPCIÓN VALIDA:
                    ---------------------------------------------------------
                    """);
            int choice = reading.nextInt();
            switch (choice){
                case 1:
                    firstMoney = "USD";
                    secondMoney = "ARS";
                    break;
                case 2:
                    firstMoney ="ARS";
                    secondMoney ="USD";
                    break;
                case 3:
                    firstMoney = "USD";
                    secondMoney = "BRL";
                    break;
                case 4:
                    firstMoney = "BRL";
                    secondMoney = "USD";
                    break;
                case 5:
                    firstMoney = "USD";
                    secondMoney = "COP";
                    break;
                case 6:
                    firstMoney = "COP";
                    secondMoney = "USD";
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no valida, intenta nuevamente...\n");
                    break;

            }
            if (choice < 7){
                ConsultMoney consult = new ConsultMoney();
                Money money = consult.conversionCup(firstMoney, secondMoney);
                String result = "La taza de conversion de " + firstMoney + " con respecto a " + secondMoney + " es de " + money.conversion_rate();

                System.out.println("-----------------------\n" +
                        result + "\n" +
                        "------------------------------------");
            }
            if (choice == 7){
                System.out.println("Volviendo al menu principal...");
                break;
            }
            index++;
        }
    }

    public void secondMenu() throws IOException{
        int index = 1;

        while (true){
            System.out.println("""
                    Selecciona la opción para realizar la conversión.
                    --------------------------------------------------------
                    1) Dólar =>> peso argentino.
                    2) Peso argentino =>> Dólar.
                    3) Dólar =>> Real brasileño.
                    4) Real brasileño =>> Dólar.
                    5) Dólar =>> Peso colombiano. 
                    6) Peso colombiano =>> Dólar.
                    7) Salir.
                    
                    ELIJA UNA OPCIÓN VALIDA:
                    ---------------------------------------------------------
                    """);
            int choice = reading.nextInt();
            switch (choice){
                case 1:
                    firstMoney = "USD";
                    secondMoney = "ARS";
                    break;
                case 2:
                    firstMoney ="ARS";
                    secondMoney ="USD";
                    break;
                case 3:
                    firstMoney = "USD";
                    secondMoney = "BRL";
                    break;
                case 4:
                    firstMoney = "BRL";
                    secondMoney = "USD";
                    break;
                case 5:
                    firstMoney = "USD";
                    secondMoney = "COP";
                    break;
                case 6:
                    firstMoney = "COP";
                    secondMoney = "USD";
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción no valida, intenta nuevamente...\n");
                    break;

            }
            if (choice < 7){
                System.out.println("Indica la cantidad a convertir:  ");
                double amount = reading.nextDouble();
                ConsultMoney consult = new ConsultMoney();
                Money money = consult.convertMoney(firstMoney, secondMoney, amount);
                String result = "El resultado de la conversion de " + amount + " (" + firstMoney + ") equivalen a " + money.conversion_result() + " (" + secondMoney + ")";

                System.out.println("-----------------------\n" +
                        result + "\n" +
                        "------------------------------------");
            }else {
                System.out.println("Volviendo al menu principal...");
                break;
            }
            index++;
        }
    }
}


