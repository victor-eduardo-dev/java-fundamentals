package class_and_method.class_challenge_date;

import util.ConsoleFormatter;
import util.Divider;

public class SimpleDateMain {

    public static final int SEP_COUNT = 42;

    public static void main(String[] args) {
        //Exibe o título.
        ConsoleFormatter.showInstructions("Exibir e Formatar Data", SEP_COUNT);

        // Cria um novo objeto SimpleDate.
        SimpleDate date = new SimpleDate(1, 12, 2023);

        // Chama os métodos de formatação de datas.
        String shortDateFormat = date.dateFormattedToBr();
        String fullDateFormat = date.dateFormattedToBrWithMonthName();

        // Exibe os dois formatos para a data.
        System.out.printf("Data comum: %s%n", shortDateFormat);
        Divider.separator(SEP_COUNT);
        System.out.printf("Data por extenso: %s%n", fullDateFormat);
        Divider.separator(SEP_COUNT);
    }
}
