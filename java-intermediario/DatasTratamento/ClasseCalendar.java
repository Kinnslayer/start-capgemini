package DatasTratamento;

import java.util.Calendar;

public class ClasseCalendar {
    public static void main(String[] args) {
        // Recuperação da data com a classe calendar

    System.out.println("==> Recuperação da data com a classe Calendar");    
    Calendar cal = Calendar.getInstance();
    
    System.out.println("Data e hora atual: " + cal.getTime() + "\n");
    System.out.println("Ano: " + cal.get(Calendar.YEAR));
    System.out.println("Dia do mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

    System.out.println("==> Alterando a data/hora com método set");
    cal.set(Calendar.YEAR, 2023);
    cal.set(Calendar.DAY_OF_MONTH, 12);
    System.out.println("Data/hora atual: " + cal.getTime());
    System.out.println("Ano: " + cal.get(Calendar.YEAR));
    System.out.println("Dia do mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");

    // Recuperando a hora do dia
    System.out.println("==> Recuperando a hora do dia");
    Calendar cal1 = Calendar.getInstance();

    int hora = cal1.get(Calendar.HOUR_OF_DAY);

    System.out.println("Agora são: " + hora + " hrs");

    if (hora > 6 && hora < 12) {
        System.out.println("Bom dia");
    } else if (hora > 12 && hora < 18) {
        System.out.println("Boa tarde");
    } else {
        System.out.println("Boa noite");
    }

    }
}
