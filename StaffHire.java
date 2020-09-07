public class StaffHire{
    private int vacancy_number;
    private String designation;
    private String job_type;
    
    StaffHire(int vacancy_number,String designation,String job_type){
        this.vacancy_number = vacancy_number;
        this.designation = designation;
        this.job_type = job_type;
        
    }
    public void set_vacancy_number(int vacancy_number){
        this.vacancy_number = vacancy_number;
    }
    public void set_designation(String designation){
        this.designation = designation;
    }
    public void set_job_type(String job_type){
        this.job_type = job_type;
    }
    public int get_vacancy_number(){
        return vacancy_number;
    }
    public String get_designation(){
        return designation;
    }
    public String get_job_type(){
        return job_type;
    }
    public void display(){
        System.out.println(get_vacancy_number());
        System.out.println(get_designation());
        System.out.println(get_job_type());
        
    }
}