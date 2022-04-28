package classwork;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("39884390.20");
        DecimalFormat formatter = new DecimalFormat();
        formatter.setGroupingUsed(true);
        System.out.println(formatter.format(money));
        LocalDateTime ern = LocalDateTime.now();
        System.out.println(ern);
        DateTimeFormatter ert = DateTimeFormatter.ofPattern("E, dd:MM:yyyy, hh:mm:ss, a");
        System.out.println(ern.format(ert));
    }
}
