/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefilestreambytes.modelo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 4 oct 2024
 */
public class Lectura extends Fichero {
 // constantes y atributos -->
  
 //----------------------------------------------------------------------------->
 // contructores -->
  public Lectura (String inputPath) {
    super(inputPath);
  }
  
 //----------------------------------------------------------------------------->
 // metodos privados -->
 //----------------------------------------------------------------------------->
 // metodos publicos -->
  public String simpleDataRead () {
    DataInputStream inputData = null;
    StringBuffer dataText = new StringBuffer();
    
    try {
      inputData = new DataInputStream(new FileInputStream(getPath()));
      
      dataText.append(inputData.readByte());
      dataText.append(" ");
      
      dataText.append(inputData.readShort());
      dataText.append(" ");
      
      dataText.append(inputData.readInt());
      dataText.append(" ");
      
      dataText.append(inputData.readLong());
      dataText.append(" ");
      
      dataText.append(inputData.readFloat());
      dataText.append(" ");
      
      dataText.append(inputData.readDouble());
      dataText.append(" ");
      
      dataText.append(inputData.readBoolean());
      dataText.append(" ");
      
      dataText.append(inputData.readChar());
      dataText.append(" ");
      
      dataText.append(inputData.readUTF());
      dataText.append(" ");
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        inputData.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
    return dataText.toString();
  }
  
 //----------------------------------------------------------------------------->
 // getters & setters -->
}
