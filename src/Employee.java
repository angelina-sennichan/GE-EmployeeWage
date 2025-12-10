public class Employee {
    static int dailyAttendance;
    static int wagePerHour = 20;
    static int fullDayHour = 8;
    static int partTimeHour = 4;
    static int dailyWage;
    static int totalWage = 0;
    static int totalHours = 0;
    static int totalDays = 0;
    static int maxDays = 20;
    static int maxHours = 100;

    public static void calculateAttendance() {
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

    public static void calculateDailyWage() {
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

    //stop when total working hours is 100 or days reach 20
    public static void calculateMonthlyWage() {
        while(totalHours < maxHours && totalDays < maxDays){
            totalDays++;
            System.out.println("\nDay " + totalDays + ":");
            calculateAttendance();
            int workingHours = 0;

            switch(dailyAttendance){
                case 1:
                    workingHours = partTimeHour;
                    break;
                case 2:
                    workingHours = fullDayHour;
                    break;
                case 0:
                default:
                    workingHours = 0;
            }

            if(totalHours + workingHours > maxHours){
                workingHours = maxHours - totalHours;
            }
            totalHours += workingHours;
            dailyWage = workingHours * wagePerHour;
            totalWage += dailyWage;
            System.out.println("Working Hours Today: " + workingHours);
            System.out.println("Daily Wage: " + dailyWage);
            System.out.println("Total Hours So Far: " + totalHours);
        }
        System.out.println("\nFinal Monthly Summary");
        System.out.println("Total Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Wage for the Month: " + totalWage);
    }
}
