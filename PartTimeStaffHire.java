public class PartTimeStaffHire extends StaffHire{
    private int wagesPerhour;
    private String shifts;
    private boolean terminated;
    private boolean joined;
    private int working_hour;
    private String staff_name;
    private String joining_date;
    private String qualification;
    private String appointed_by;
   
    PartTimeStaffHire(int vacancy_number,String designation,String job_type,int working_hour,int wagesPerhour,String shifts){
        super(vacancy_number,designation,job_type);
        this.working_hour = working_hour;
        this.wagesPerhour = wagesPerhour;
        this.shifts = shifts;
        staff_name = "";
        joining_date = "";
        qualification = "";
        appointed_by = "";
        joined = false;
        terminated = false;
    }
    public void set_wagesPerhour(int wagesPerhour){
        this.wagesPerhour = wagesPerhour;
    }
    public void set_shifts(String shifts){
        this.shifts = shifts;
    }
    public void set_terminated(boolean terminated){
        this.terminated = terminated;
    }
        public void set_joined(boolean joined){
        this.joined = joined;
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
    public int get_wagesPerhour(){
        return wagesPerhour;
    }
    public String get_shifts(){
        return shifts;
    }
    public boolean get_terminated(){
        return terminated;
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
    public void setshifts(String shifts){
        if (joined == false){
            this.shifts = shifts;
        }else{
            System.out.println("It is not possible to set new shift");
        }
    }
    public void hirePartTimeStaff(String staff_name,String joining_date,String qualification,String appointed_by){
        if (get_joined() == true){
            System.out.println("Staff is already appointed."+"Name :"+get_staff_name()+"joining date"+get_joining_date());
        }else{
            this.staff_name = staff_name;
            this.joining_date = joining_date;
            this.qualification = qualification;
            this.appointed_by = appointed_by;
            this .joined = true;
            this.terminated = false;
        }
    }
    public void terminateStaff(){
       if(get_terminated() == true){
        System.out.println("staff is already terminated");
        }else{
        staff_name = "";
        joining_date = "";
        qualification = "";
        appointed_by = "";
        joined = false;
        terminated = true;
        }
        
}
 public void DisplayDetails(){
        super.display();
        System.out.println("");
        if (get_joined() == true){
            System.out.println("staff name:"+get_staff_name());
            System.out.println("salary:"+get_wagesPerhour());
            System.out.println("working_hour"+get_working_hour());
            System.out.println("joining date"+get_joining_date());
            System.out.println("qualification"+get_qualification());
            System.out.println("appointed by"+get_appointed_by());
            System.out.println("income per day:"+get_wagesPerhour()*get_working_hour());
       }
    }
}