package member;


public class Employee extends Member {
     private String specialization;
   private String department;
   Employee(String n, int a, int p, String ad, double s, String sp, String de){
       super(n,a,p,ad,s);
       this.specialization=sp;
       this.department=de;
   }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
   @Override
   public String toString(){
       return super.toString()+"\nSpecialization :"+specialization+"\nDepartment: "+department;
}
}
