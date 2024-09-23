/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefile.modelo;

import java.io.File;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 20 sept 2024
 */
public class ModeloFile {
  private String ruta;
 
 //----------------------------------------------------------------------|
  /**
   * constructor dada una ruta
   * 
   * @param ruta ruta de carpeta
   */
  public ModeloFile (String ruta) {
    this.ruta = ruta;
  }
  
  public ModeloFile () {
  }
  
  
 //----------------------------------------------------------------------|
  /**
   * devuelve en un file la ruta de la carpeta
   * 
   * @return file que apunta a la carpeta
  */
  public File getFileDeRuta () {
    File directorioPadre = new File(this.ruta);
    return directorioPadre;
  }
  
  
 //----------------------------------------------------------------------|
  public String getRuta() {
    return ruta;
  }

  public void setRuta(String ruta) {
    this.ruta = ruta;
  }
}
