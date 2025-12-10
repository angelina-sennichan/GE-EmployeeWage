public class Employee {
    int dailyAttendance;
    int wagePerHour = 20;
    int fullDayHour = 8;
    int partTimeHour = 4;
    int dailyWage;

    public void calculateAttendance() {
        int randomCheck = (int)(Math.random() * 3);  // 0, 1, or 2
        if(randomCheck == 0){
            dailyAttendance = 0;
            System.out.println("Absent");
        } else if(randomCheck == 1){
            dailyAttendance = 1;
            System.out.println("Present: Part-time");
        } else{
            dailyAttendance = 2;
            System.out.println("Present: Full-time");
        }
    }

    public void calculateDailyWage() {
        if(dailyAttendance == 1){
            dailyWage = wagePerHour * partTimeHour;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else if(dailyAttendance == 2){
            dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("No pay");
        }
    }
}
