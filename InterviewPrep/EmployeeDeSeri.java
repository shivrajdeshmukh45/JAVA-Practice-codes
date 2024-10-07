package InterviewPrep;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeSeri {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        FileInputStream fip= new FileInputStream("EmployeeData.txt");
        ObjectInputStream ois=new ObjectInputStream(fip);


        Employee Fobj1=(Employee)ois.readObject();
        System.out.println(Fobj1.empId);
        System.out.println(Fobj1.empName);
        
        
        Employee Fobj2=(Employee)ois.readObject();

        System.out.println(Fobj2.empId);
        System.out.println(Fobj2.empName);
        



    }
    
}
