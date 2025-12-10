public class Employee {
    int dailyAttendance;
    int wagePerHour = 20;
    int fullDayHour = 8;
    int partTimeHour = 4;
    int dailyWage;
    int workingDays = 20;
    int totalWage = 0;

    public void calculateAttendance() {
        int randomCheck = (int)(Math.random() * 3);  // 0, 1 or 2
        switch (randomCheck) {
            case 0:
                dailyAttendance = 0;
                System.out.println("Absent");
                break;
            case 1:
                dailyAttendance = 1;
                System.out.println("Present: Part-time");
                break;
            case 2:
                dailyAttendance = 2;
                System.out.println("Present: Full-time");
                break;
        }
    }

    public void calculateDailyWage() {
        switch (dailyAttendance) {
            case 1: // Part-time
                dailyWage = wagePerHour * partTimeHour;
                System.out.println("Daily Employee Wage: " + dailyWage);
                break;
            case 2: // Full-time
                dailyWage = wagePerHour * fullDayHour;
                System.out.println("Daily Employee Wage: " + dailyWage);
                break;
            case 0: // Absent
            default:
                System.out.println("No pay");
                break;
        }
    }

    public void calculateMonthlyWage() {
        for (int day = 1; day <= workingDays; day++) {
            System.out.println("\nDay " + day + ":");
            calculateAttendance();   // determine attendance
            calculateDailyWage();    // calculate daily wage
            totalWage += dailyWage;  // add to monthly total
        }
        System.out.println("\nTotal Wage for the Month: " + totalWage);
    }
}
