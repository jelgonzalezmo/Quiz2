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
public class Staff extends Employee{
    private String titulo;

    public Staff(String titulo, int oficina, String FechaCo, String nombre, String apellido, double salario) {
        super(oficina, FechaCo, nombre, apellido, salario);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Staff{" + "titulo=" + titulo + '}'+super.toString();
    }



     
}
