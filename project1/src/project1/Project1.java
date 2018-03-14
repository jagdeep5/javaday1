/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author macstudent
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("welcome to java programming");
        int a=200;
        int b=100;
        
     
//        System.out.println("sum: " +(a+b));
//        System.out.println("subtraction: " + (a-b)); 
//        System.out.println("multiply: " + (a*b));
//         System.out.println("divison: " + (a/b));
          Arithmetic p1 = new Arithmetic();
          p1.add( a, b);
          p1.subtract(a, b);
          p1.multiply(a, b);
          p1.divison(a, b);
          
     Student s1 = new Student();
     s1.setData(1, "abc", 50 );
        s1.getData(); 
        
                 
Student s2 = new Student();
     s2.setData(2, "def", 40 );
        s2.getData(); 
        Student s3 = new Student();
     s3.setData(3, "ghi", 30);
        s3.getData(); 
        int i;
        for(i=0; i<=10; i++){
                 System.out.println(i+ " " +s1.snm);
        }
    }
    
}
