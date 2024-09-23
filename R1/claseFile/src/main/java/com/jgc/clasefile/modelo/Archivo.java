/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefile.modelo; 

import java.io.File;
import java.io.IOException;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 20 sept 2024
 */
public class Archivo extends ModeloFile {
  private String nombre;
  private String ruta;

  
 //----------------------------------------------------------------------|
  /**
   * constructor de la clase
   * @param ruta ruta del archivo
  */
  public Archivo (String ruta, String nombre) {
    super(ruta);
    this.nombre = nombre;
  }
  
  public Archivo () {
    super();
  }
  
  
 //----------------------------------------------------------------------|
  /**
   * crea un fichero dada una ruta y el nombre
   * 
   * @param ruta ruta en la que vamos a crear el fichero
   * @param nombre nombre que va a tener nuestro fichero
  */
  public void crearArchivo (File ruta, String nombre) {
    try {
      File ficheroNuevo = new File(ruta, nombre);
      ficheroNuevo.createNewFile();
    } catch (IOException e) {
    }
  }
  
  
 //----------------------------------------------------------------------|
  // getters & setters ->
  @Override
  public String getRuta() {
    return ruta;
  }

  @Override
  public void setRuta(String ruta) {
    this.ruta = ruta;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
}
