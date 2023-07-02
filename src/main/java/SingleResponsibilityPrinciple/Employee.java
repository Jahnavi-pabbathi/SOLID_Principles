package SingleResponsibilityPrinciple;

public class Employee {
    private void getRegularHours(){
        //if cfo changes calculateSalary function and change this method
        // then this change is reflected to calculateHours when this method is called
        //this rule is violated
    }
    public void calculateSalary(){
        getRegularHours();
    }
    public void calculateHours(){
         getRegularHours();
    }
    public void saveEmpData(){

    }


}
