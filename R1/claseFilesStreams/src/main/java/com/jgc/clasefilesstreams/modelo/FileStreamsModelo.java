/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefilesstreams.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author JGC by Juan Garcia Cazallas
 * version 1.0
 * created on 30 sept 2024
 */
public class FileStreamsModelo {
 // constantes y atributos -->
  private String path;
  
 //----------------------------------------------------------------------------->
 // contructores -->
  public FileStreamsModelo () {
  }
  
  public FileStreamsModelo (String inputPath) {
    this.path = inputPath;
  }
  
 //----------------------------------------------------------------------------->
 // metodos privados -->
  
  
 //----------------------------------------------------------------------------->
 // metodos publicos -->
   // metodo "leerFicheroCaracter" =>
  public StringBuffer leerFicheroCaracter () {
    StringBuffer outputContent = new StringBuffer();
  
    try {
      File inputFile = new File(this.path);
      FileReader readerIn = new FileReader(inputFile);
      int i = 0;
      
      while ((i = readerIn.read()) != -1) {
        outputContent.append((char) i);
      }
      
      readerIn.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return outputContent;
  }
  
   // metodo "leerFicheroCadena" =>
  public StringBuffer leerFicheroCadena () {
    StringBuffer outputContent = new StringBuffer();
    
    try {
      File inputFile = new File(this.path);
      FileReader readerIn = new FileReader(inputFile);
      
      char[] buffer = new char[1024];
      int i = 0;
      
      while ((i = readerIn.read(buffer)) != 1) {
        outputContent.append(buffer, 0, i);
      }
      
      readerIn.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return outputContent;
  }
   
   // metodo "leerFicheroLinea" =>
  public StringBuffer leerFicheroLinea () {
    StringBuffer outputContent = new StringBuffer();
    
    try {
      File inputFile = new File(this.path);
      BufferedReader bufferReader = new BufferedReader(new FileReader(inputFile));
      String line;
      
      while ((line = bufferReader.readLine()) != null) {
        outputContent.append(line);
        outputContent.append(System.lineSeparator());
      }
      
      bufferReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return outputContent;
  }
  
   // metodo "escribirFicheroCaracter" =>
  public void escribirFicheroCaracter (char inputChar, boolean noSobreescribir) {
    try {
      File outputFile = new File(this.path);
      FileWriter writerOut = new FileWriter(outputFile, noSobreescribir);
      
      writerOut.write(inputChar);
      
      writerOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
   // metodo "escribirFicheroCadena" =>
  public void escribirFicheroCadena (String inputString, boolean noSobreescribir) {
    try {
      File outputFile = new File(this.path);
      FileWriter writerOut = new FileWriter(outputFile, noSobreescribir);
      
      for (int i=0; i < inputString.length(); i++) {
        writerOut.write(inputString.charAt(i));
      }
      
      writerOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
   // metodo "escribirFicheroLinea" =>
  public void escribirFicheroLinea (String inputLine, boolean noSobreescribir) {
    try {
      File outputFile = new File(this.path);
      FileWriter writerOut = new FileWriter(outputFile, noSobreescribir);
      
      writerOut.write(inputLine);
      writerOut.write(System.lineSeparator());
      
      writerOut.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
 //----------------------------------------------------------------------------->
 // getters & setters -->
  public String getPath () {
    return this.path;
  }
  
  public void setPath (String inputPath) {
    this.path = inputPath;
  }
  
}
