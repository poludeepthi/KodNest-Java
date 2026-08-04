
public class PreparationPlan {

    public static void main(String[] args) {
        int JavaHoursPerDay = 2;
        int aptitudeHoursPerDay = 1;
        int numberOfDays = 5;
        int weeklyJavaHours = JavaHoursPerDay * numberOfDays;
        int weeklyAptitudeHours = aptitudeHoursPerDay * numberOfDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;
        System.out.println("Java: " + weeklyJavaHours);
        System.out.println("Aptitude: " + weeklyAptitudeHours);
        System.out.println("Total: " + totalPreparationHours);
    }
}
