/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.accesoaleatorio.modelo;

import java.io.File;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 7 oct 2024
 */
public class FicheroEmpleados {
  private final int LONGITUD_LONG = 8;
  private final int LONGITUD_DOUBLE = 8;
  private final int LONGITUD_INT = 4;
  private final int LONGITUD_CHAR = 2;
  
  private final int CARACTERES_APELLIDO = 10;
  
 // tamaño de los campos que forman los registros de empleados ->
  private final int LONGITUD_IDENTIFICADOR = LONGITUD_LONG;
  private final int LONGITUD_APELLIDO = (CARACTERES_APELLIDO * LONGITUD_CHAR);
  private final int LONGITUD_DEPARTAMENTO = LONGITUD_INT;
  private final int LONGITUD_SALARIO = LONGITUD_DOUBLE;
  
 // longitud total de cada registro =>
  private final int LONGITUD_TOTAL = (LONGITUD_IDENTIFICADOR + LONGITUD_APELLIDO + LONGITUD_DEPARTAMENTO + LONGITUD_SALARIO);
  
   // atributos =>
  private File path;
  
  
 // constructores =>
  public FicheroEmpleados (String inputPath) {
    this.path = new File(inputPath);
  }
  
 //getters & setters =>
   // getters -->
  public int getCARACTERES_APELLIDO() {
    return CARACTERES_APELLIDO;
  }

  public int getLONGITUD_APELLIDO() {
    return LONGITUD_APELLIDO;
  }

  public int getLONGITUD_TOTAL() {
    return LONGITUD_TOTAL;
  }

  public File getPath() {
    return path;
  }

   // setters -->
  public void setPath(File path) {
    this.path = path;
  }
}
