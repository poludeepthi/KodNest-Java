
class PracticeReport {

    public static void main(String[] args) {
        int solvedProblems = 50;
        int practiceDays = 5;
        double exactPercentage = 80.08;
        double reportValue = solvedProblems;
        int wholePercentage = (int) exactPercentage;
        double average = (double) solvedProblems / practiceDays;
        boolean targetReached = average >= 9.0;
        System.out.println("ReportValue: " + reportValue);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average per Day: " + average);
        System.out.println("Daily Target Reached: " + targetReached);
    }
}
