/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

/**
 *
 * @author jeisson
 */
public class Student extends Person{
        public static final String [] STATUS ={"F","S","J"};
        private String status;

    public Student( String nombre, String apellido,String status, double salario) {
        super(nombre, apellido, salario);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "status=" + status + '}'+super.toString();
    }


    

   

  
    
}
