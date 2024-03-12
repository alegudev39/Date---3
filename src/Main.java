import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console
public class Main {
    public static void main(String[] args) {

        String dateString = "2023-03-01T13:00:00Z";
        DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString, formatter);


        System.out.println("Anno: " + dateTime.getYear());
        System.out.println("Mese: " + dateTime.getMonthValue());
        System.out.println("Giorno: " + dateTime.getDayOfMonth());
        System.out.println("Giorno della settimana: " + dateTime.getDayOfWeek().getValue());

    }
}