/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.accesoaleatorio.modelo;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 7 oct 2024
 */
public class Empleado {
 // constantes & atributos =>
  private long identificador;
  private String apellido;
  private int departamento;
  private double salario;
  
 // constructores =>
  public Empleado () {
    
  }
  
  public Empleado (long inputId) {
    this.identificador = inputId;
  }

  public Empleado(long identificador, String apellido, int departamento, double salario) {
    this.identificador = identificador;
    this.apellido = apellido;
    this.departamento = departamento;
    this.salario = salario;
  }
 
 // getters & setters =>
  public long getIdentificador() {
    return identificador;
  }

  public void setIdentificador(long identificador) {
    this.identificador = identificador;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getDepartamento() {
    return departamento;
  }

  public void setDepartamento(int departamento) {
    this.departamento = departamento;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}
