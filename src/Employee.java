public class Employee {
    int dailyAttendance;
    public void calculateAttendance(){
        if(Math.random()< 0.5){
            dailyAttendance = 0;
            System.out.println("Absent");
        }else {
            dailyAttendance = 1;
            System.out.println("Present");
        }
    }
}
