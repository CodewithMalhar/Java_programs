public class avg_speed {
    public static void main(String[] args) {
        
        double distance = 14.0;
        double  minutes  = 45.0 ;
        double seconds = 30.0; 
        
        double miles = (distance/1.6); //8.75 miles 
        
        double t_minutes = minutes+(seconds/60); //45.5 mintues in total
        
        double t_seconds = (t_minutes / 60); //0.7583333333333333 in seconds total
        

        double average = (miles / t_seconds);

        System.out.printf("The Average of the ruuner in miles is :%.3f",average);


    }
}
