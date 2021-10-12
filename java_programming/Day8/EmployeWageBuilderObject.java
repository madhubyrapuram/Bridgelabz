
public class EmployeWageBuilderObject {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME =2;


    private final String company;
    private final int EMP_RATE_PER_HOUR;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH ;

    public EmployeWageBuilderObject(String company,int EMP_RATE_PER_HOUR,
                                    int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH) {
        this.company = company;
        this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
        this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
    }

    public int computeWage(){

        int empHrs = 0, totalEmpHrs = 0,totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }

            totalEmpHrs += empHrs;
            //System.out.println("Day#: " + totalWorkingDays + " Emp Hr:" + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        //System.out.println("Total Emp Wage: " + totalEmpWage);

        return totalEmpWage;
    }

    public static void main(String[] args) {

        EmployeWageBuilderObject Dmart = new EmployeWageBuilderObject("Dmart", 20,
                20, 100);

        System.out.println("Total Emp Wage per company: " + Dmart.company + " is :" + Dmart.computeWage());


    }
}


