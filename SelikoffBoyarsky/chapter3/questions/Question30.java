import java.time.*;

// Question: 

public class Question30 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}

// Hint: 