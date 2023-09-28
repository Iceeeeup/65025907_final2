import java.util.ArrayList;

import javax.sound.sampled.LineListener;

public class u{
    public static void main(String[] args){
       
    } 
}


class employess{
     String name;
     double age;
     String position;
     String empID;
     ArrayList<String> project ;
     employess(){
        project = new ArrayList<>();
     }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     employess(String name,double age,String position,String empID){
        this.name = name;
        this.age = age;
        this.position = position;
        this.empID = empID;
    }
    public String getname(){
        return name;
    }
    public double getage(){
        return age;
    }
    public String getposition(){
        return position;
    }
    public String getempID(){
        return empID;
    }

    public void ShowDetails(){
        System.out.println("*****************************");
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("position: "+this.position);
        System.out.println("empID: "+this.empID);
    }   
    
}


class Person extends employess{
    Person(String name, double age){
        super(name,age);
    }
    
}
class Job extends employess{
    String jobDescription;

    Job(String position, String empID, String jobDescription) {
        super(position, empID);
        this.jobDescription = jobDescription;
    }
}
class project{
    private String projectname;
    private String description;

    project(String projectname){
        this.projectname = projectname;
        this.description = description;
    }
    public String getprojectname(){
        return this.projectname;
    }
}    
