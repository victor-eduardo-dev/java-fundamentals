package control_structures;

import java.util.Scanner;

public class parkingFeeCalculator {

    public static final Scanner INPUT = new Scanner(System.in);

    public static final int SEP_COUNT = 46;

    public static void main(String[] args) {
        // Título.
        separator("=", SEP_COUNT);
        System.out.println("   Calculadora de Tarifas de Estacionamento");
        separator("=", SEP_COUNT);
        System.out.println(" TIPOS DE VEÍCULOS: [moto] [carro] [caminhão]");
        separator("-", SEP_COUNT);
        String typeOfVehicle = getUserEntry("Digite o tipo de veículo: ").toLowerCase().strip();
        separator("-", SEP_COUNT);
        int amountOfHours = Integer.parseInt(getUserEntry("Digite a quantia de horas: ").strip());

        // Valor a ser pago por hora.
        final double MOTO_RATE = 2.00;
        final double CAR_RATE = 5.00;
        final double TRUCK_INITIAL_RATE = 10.00;
        final double TRUCK_OVERTIME_RATE = 15.00;
        final int TRUCK_BASE_HOURS_LIMIT = 3;

        // Calcula o valor que o cliente irá pagar pelo serviço conforme a modalidade.
        double amountToPay = switch (typeOfVehicle) {
            case "moto" -> amountOfHours * MOTO_RATE;
            case "carro" -> amountOfHours * CAR_RATE;
            case "caminhão", "caminhao" -> {
                if (amountOfHours <= TRUCK_BASE_HOURS_LIMIT) {
                    yield amountOfHours * TRUCK_INITIAL_RATE;
                }else {
                    int extraHours = amountOfHours - TRUCK_BASE_HOURS_LIMIT;
                    yield (TRUCK_BASE_HOURS_LIMIT * TRUCK_INITIAL_RATE ) + (extraHours * TRUCK_OVERTIME_RATE );
                }
            }
            default -> -1;
        };
        // Chama a função que exibe o resultado.
        separator("-", SEP_COUNT);
        showResult(amountToPay);
        separator("-", SEP_COUNT);
        INPUT.close();
    }
    // Pega a entrada do usuário.
    public static String getUserEntry(String msg) {
        System.out.print(msg);
        return INPUT.nextLine();
    }
    // Cria separações para melhorar a visualização.
    public static void separator(String symbol, int countSymbol) {
        System.out.println(symbol.repeat(countSymbol));
    }

    // Exibe o valor que o cliente deve pagar.
    public static void showResult(double amountToPay) {
        if (amountToPay < 0) {
            System.out.println("Digite um dos 3 tipos de veículos, por favor!");
        }else{
            System.out.printf("Valor total à pagar: R$ %.2f%n", amountToPay);
        }
    }
}
