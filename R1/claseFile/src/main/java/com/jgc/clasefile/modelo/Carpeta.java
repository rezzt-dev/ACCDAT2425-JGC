/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefile.modelo;

import java.io.File;
import java.util.ArrayList;

/**
 * clase encargada de la logica de la aplicacion
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 18 sept 2024
 */
public class Carpeta extends ModeloFile {
  private String ruta;
  
 //----------------------------------------------------------------------|
  /**
   * constructor de la clase
   * @param ruta ruta de la carpeta
  */
  public Carpeta(String ruta) {
    super(ruta);
    this.ruta = ruta;
  }

  public Carpeta() {
  }
  
  
 //----------------------------------------------------------------------|
  /**
   * crea un directorio en la ruta indicada
   * utiliza el atributo de la clase
  */
  public void crearCarpeta() {
    File directorioNuevo = new File(this.ruta);
    directorioNuevo.mkdir();
  }
  
  /**
   * crea un directorio en la ruta indicada
   * utiliza el constructor al cual le pasamos la ruta
   * del directorio padre y el nombre del nuevo directorio
   * 
   * @param nombreNuevoDirectorio nombre del nuevo directorio
  */
  public void crearCarpeta (String nombreNuevoDirectorio) {
    File directorioNuevo = new File(this.ruta, nombreNuevoDirectorio);
    directorioNuevo.mkdir();
  }
  
  /**
   * crea un directorio en la ruta indicada
   * utiliza el constructor al cual le pasamos
   * el directorio padre y el nombre del nuevo directorio
   * 
   * @param directorioPadre directorio padre
   * @param nombreDirectorio nombre del nuevo directorio
  */
  public void crearCarpeta (File directorioPadre, String nombreDirectorio) {
    File directorioNuevo = new File(directorioPadre, nombreDirectorio);
    directorioNuevo.mkdir();
  }
  
  /**
   * 
   * @param rutaCarpeta
  */
  public ArrayList<String> leerCarpeta (File rutaCarpeta) {
    ArrayList<String> informacion = new ArrayList<String>();
    
    if (rutaCarpeta.isDirectory()) {
      informacion.add("Contenido Directorio: ");
      String[] infoRaw = rutaCarpeta.list();

      for (int i = 0; i < infoRaw.length; i++) {
        File contenido = new File(infoRaw[i]);
        String nombreContenido = contenido.getName();
        informacion.add("Contenido " + (i + 1) + ": " + nombreContenido);
      }
    } else if (rutaCarpeta.isFile()) {
      informacion.add("Informacion Fichero: ");
      String nombreArchivo = rutaCarpeta.getName();
      String sizeArchivo = Long.toString(rutaCarpeta.length());
      informacion.add("Nombre: " + nombreArchivo + " | Tamaño: " + sizeArchivo);
    }
    
    return informacion;
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
}
