public class placement
{
    public static void main(String args[])
    {
        float attended_classes = 90.0f;
        int total_classes = 100;
        double percentage = (attended_classes * 100.0) / total_classes;
        
        String eligibility = (percentage >= 90) ? "Eligible" : "Not Eligible";
        
        System.out.println("Attendance Percentage: " + percentage + "%");
        System.out.println("Eligibility for placement: " + eligibility);
    }
}