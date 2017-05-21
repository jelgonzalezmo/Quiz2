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
public abstract class Employee extends Person {
    protected int oficina;
    protected String FechaCo;

    public Employee(int oficina, String FechaCo, String nombre, String apellido, double salario) {
        super(nombre, apellido, salario);
        this.oficina = oficina;
        this.FechaCo = FechaCo;
    }


    public String toString() {
        return "Employee{" + "oficina=" + oficina + ", FechaCo=" + FechaCo + '}'+super.toString();
    }
}
    
    
    
