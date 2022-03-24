/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVCDesignPatterns;

/**
 *
 * @author moham
 */
public class Employee {
    
           private String EmployeeName;  
           private String EmployeeId;  
           private String EmployeeDepartment;  

          // defining getter and setter methods  
           public String getId() {  
              return EmployeeId;  
           }  

           public void setId(String id) {  
              this.EmployeeId = id;  
           }  

           public String getName() {  
              return EmployeeName;  
           }  

           public void setName(String name) {  
              this.EmployeeName = name;  
           }  

           public String getDepartment() {  
                  return EmployeeDepartment;  
           }  

           public void setDepartment(String Department) {  
                  this.EmployeeDepartment = Department;  
           }  

}
