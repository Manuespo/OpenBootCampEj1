package com.company;

public class Empleado {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Double salario;

    public Empleado(String nombre, String apellido, Integer dni, Double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public double salarioAnual(){
        return 12*this.salario;
    }
    public void aumentarSalario(double aumento){
        this.salario= ((aumento/100)+1)*this.salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", salario=" + salario +
                '}';
    }
}
