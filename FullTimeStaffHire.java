public class FullTimeStaffHire extends StaffHire{
    private int salary;
    private int working_hour;
    private String staff_name;
    private String joining_date;
    private String qualification;
    private String appointed_by;
    private boolean joined;
    
    FullTimeStaffHire(int vacancy_number,String designation,String job_type,int salary,int working_hour){
        super(vacancy_number,designation,job_type);
        this.salary = salary;
        this.working_hour = working_hour;
        this.staff_name = "";
        this.joining_date = "";
        this.qualification = "";
        this.appointed_by = "";
        this .joined = false;
    }
    public void set_salary(int salary){
        this.salary = salary;  
    }
    public void set_working_hour(int working_hour){
        this.working_hour = working_hour;
    }
    public void set_staff_name(String staff_name){
        this.staff_name = staff_name;
    }
    public void set_joining_date(String joining_date){
        this.joining_date = joining_date;
    }
    public void set_qualification(String qualification){
        this.qualification = qualification;
    }
    public void set_appointed_by(String appointed_by){
        this.appointed_by = appointed_by;
    }
    public void set_joined(boolean joined){
        this.joined = joined;
    }
    public int get_salary(){
        return salary;
    }
    public int get_working_hour(){
        return working_hour;
    }
    public String get_staff_name(){
        return staff_name;
    }
    public String get_joining_date(){
        return joining_date;
    }
    public String get_qualification(){
        return qualification;
    }
    public String get_appointed_by(){
        return appointed_by;
    }
    public boolean get_joined(){
        return joined;
    }
    public void setSalary(int salary){
        if (get_joined() == false){
            this.salary = salary;
        }else{
            System.out.println("It is not possible to change the salary because staff is already hired");
        }
    }
    public void hireFullTimeStaff(String staff_name,String joining_date,String qualification,String appointed_by){
        if (get_joined() == true){
            System.out.println("Staff is already appointed."+"Name :"+get_staff_name()+"joining date"+get_joining_date());
        }else{
            this.staff_name = staff_name;
            this.joining_date = joining_date;
            this.qualification = qualification;
            this.appointed_by = appointed_by;
            this .joined = true;
        }
    }
        public void DisplayDetails(){
            super.display();
            System.out.println("");
            if (get_joined() == true){
                System.out.println("staff name:"+get_staff_name());
                System.out.println("salary:"+get_salary());
                System.out.println("working_hour"+get_working_hour());
                System.out.println("joining date"+get_joining_date());
                System.out.println("qualification"+get_qualification());
                System.out.println("appointed by"+get_appointed_by());
            }
}
}