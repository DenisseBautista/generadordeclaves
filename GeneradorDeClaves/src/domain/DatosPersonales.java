/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
public class DatosPersonales {
    protected String nombre;
    protected int edad;
    protected String apellido;
    public DatosPersonales(){};/*Constructorvacio*/
    public DatosPersonales(String nombre, String apellido, int edad)
    {
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    
    }
    
}
/* Scanner dat=new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("Nombre:");
        String name=dat.nextLine();
         System.out.print("Apellidos:");
        String apellidos=dat.nextLine();
        System.out.println("Nombre:"+name);
        System.out.println("apellidos: " + apellidos);*/