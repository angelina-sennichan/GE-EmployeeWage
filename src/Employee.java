public class Employee {
    int dailyAttendance;
    int wagePerHour = 20;
    int fullDayHour = 8;
    int dailyWage;

    public void calculateAttendance(){
        if(Math.random()< 0.5){
            dailyAttendance = 0;
            System.out.println("Absent");
        }else {
            dailyAttendance = 1;
            System.out.println("Present");
        }
    }
    public void calculateDailyWage(){
        if(dailyAttendance == 1){
            dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Employee Wage: " + dailyWage);
        }else{
            System.out.println("No pay");
        }
    }
}
