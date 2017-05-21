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
public class Faculty  extends Employee{
    private String rango;
    public Faculty(String rango, int oficina, String FechaCo, String nombre, String apellido, double salario) {
        super(oficina, FechaCo, nombre, apellido, salario);
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Faculty{" + "rango=" + rango + '}'+super.toString();
    }

   
    
    
   
}
