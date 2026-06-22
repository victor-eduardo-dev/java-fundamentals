package class_and_method.class_challenge_date;

public class SimpleDate {
    int day;
    int month;
    int year;

    SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private String zeroLeft(int value) {
        // %02d formata números inteiros com no mínimo 2 dígitos.
        // Se o número tiver apenas 1 dígito, um zero é adicionado à esquerda.
        // Exemplos:
        // 1 -> 01
        // 5 -> 05
        return String.format("%02d", value);
    }

    public String dateFormattedToBr() {
        return String.format("%s/%s/%d", zeroLeft(this.day), zeroLeft(this.month), this.year);
    }

    private String monthName() {
        String[] months = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (this.month < 1 || this.month > 12) {
            return "Mês inválido";
        }

        return months[this.month - 1];
    }

    public String dateFormattedToBrWithMonthName() {
        return String.format("%s de %s de %d", zeroLeft(this.day), monthName(), this.year);
    }
}
