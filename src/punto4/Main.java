/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.io.*;
import java.util.*;


/**
 *
 * @author jeisson
 */
public class Main {
    
    public static final ArrayList<Student> St = new ArrayList<>();
    public static final ArrayList<Faculty> F = new ArrayList<>();
    public static final ArrayList<Staff> S = new ArrayList<>();
        //la funcion para descencriptar se realiza teniendo en cuenta 
        //la posicion de las letras mayusculas en el codigo ascii
public static String desencriptar(String s) {
        char scc[] = s.toCharArray();
        for (int i = 0; i < scc.length; i++) {
            if (scc[i] - 65 >= 3) {
                scc[i] = (char) ((((int) scc[i] - 65 - 3) % 26) + 65);
            } else {scc[i] = (char) ((((int) scc[i] + 26 - 65 - 3) % 26) + 65);                
            }}
                return new String(scc);}

public static void SalarioT(){
    double salario = 0;
    for (int i = 0; i <S.size(); i++) {
        salario += S.get(i).getSalario();
            }
    for (int j = 0; j <F.size(); j++){
        salario += F.get(j).getSalario();
    }
    System.out.println("El salario total de los empleados es= "+ salario);
}

public static void SalarioStaff(){
    double salarioS = 0;
    for (int i = 0; i <S.size(); i++) {
        if(S.get(i).getTitulo().equalsIgnoreCase("GERENTE")){
        salarioS+=S.get(i).getSalario();
        }
      }
    System.out.println("El salario total de los empleados Staff Gerentes es= "+ salarioS);
}

public static void listar(){
    String inf = " ";
 for (int i = 0; i <S.size(); i++) {
    inf +=S.toString()+" ";
 }
 
  for (int i = 0; i <F.size(); i++) {
    inf += F.toString()+" ";
 }
  for (int i = 0; i <St.size(); i++) {
    inf += St.toString()+" ";
      }  
    System.out.println(inf);
}

    public static void main(String[] args)throws FileNotFoundException  {
        Scanner s = new Scanner(new File("datos.txt"));

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String datos[] = line.split(",");
            
            switch (datos[0]) {
                case "STUDENT":
                    Student j = new Student(desencriptar(datos[1]), desencriptar(datos[2]),desencriptar(datos[3]),Double.parseDouble(datos[4]));
                    St.add(j);
                    
                    break;
                case "FACULTY":
                    Faculty k = new Faculty(desencriptar(datos[1]), Integer.parseInt(datos[2]), datos[3], desencriptar(datos[4]),desencriptar(datos[5]), Double.parseDouble(datos[6]));
                    F.add(k);
                  
                    break;
                case "STAFF":
                    Staff l = new Staff(desencriptar(datos[1]), Integer.parseInt(datos[2]), datos[3], desencriptar(datos[4]), desencriptar(datos[5]),Double.parseDouble(datos[6]) );
                    S.add(l);
                   
                    break;
                }
        }
        
        SalarioStaff();
        SalarioT();
        listar();
        
        }
}
           
    
    
    
    


