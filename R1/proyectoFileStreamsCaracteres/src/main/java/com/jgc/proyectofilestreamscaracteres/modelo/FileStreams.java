/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.proyectofilestreamscaracteres.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 30 sept 2024
 */
public class FileStreams {
 // atributos y constantes ->
  private String path;
  
  public FileStreams () {
    
  }
  
  public FileStreams (String inputPath) {
    this.path = inputPath;
  }
 //--------------------------------------------------------------------------------->
 // getters & setters ->
  public String getPath () {
    return this.path;
  }
  
  public void setPath (String inputPath) {
    this.path = inputPath;
  }
  
 //--------------------------------------------------------------------------------->
 // metodos publicos & privados ->
   // metodo "leerStreamCaracteres" ==>
  public StringBuffer leerStreamCaracteres () {
    FileReader reader = null;
    int i = 0;
    StringBuffer outputString = new StringBuffer();
    
    try {
      File archivo = new File(this.path);
      reader = new FileReader(archivo);
      
      while (i != -1) {
        outputString = outputString.append((char) i);
        i = reader.read();
      }
      
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return outputString;
  }
  
    // metodo "leerStreamArrayCaracteres" ==>
  public StringBuffer leerStreamArrayCaracteres () {
    FileReader reader = null;
    int i;
    StringBuffer outputString = new StringBuffer();
    
    try {
      File archivo = new File(this.path);
      reader = new FileReader(archivo);
        
      char tempArray[] = new char[5];
        
      while ((i = reader.read(tempArray)) != -1) {
        outputString.append(tempArray, 0, i);  // Añade el carácter al StringBuffer
      }
        
      reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
   
    return outputString;
  }
  
    // metodo "leerStringBufferedReader" ==>
  public StringBuffer leerStringBufferedReader () {
    FileReader reader = null;
    int i;
    StringBuffer outputString = new StringBuffer();
    
    try {
      File archivo = new File(this.path);
      reader = new FileReader(archivo);
        
      BufferedReader bufferFile = new BufferedReader(reader);
      String line;
        
      line = bufferFile.readLine();
      
      while (line != null) {
        outputString = outputString.append(line);
        line = bufferFile.readLine();
      }
        
      reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return outputString;
  }
  
    // metodo "escribirStreamCaracter" ==>
  public void escribirStreamCaracter (char caracter) {
    FileWriter writer = null;
    
    
    try {
      File archivo = new File(this.path);
      writer = new FileWriter(archivo);
      writer.write(caracter);
      
      
      writer.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
