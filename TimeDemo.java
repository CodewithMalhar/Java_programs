import java.util.*;
import java.time.*;

public class TimeDemo {
    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        
        System.out.println(a);
        System.out.println(a.getYear());
        System.out.println(a.getMonth());
        System.out.println(a.getDayOfWeek());
    }
}
