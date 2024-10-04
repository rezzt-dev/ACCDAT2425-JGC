/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefilestreambytes.modelo;

import com.jgc.clasefilestreambytes.modelo.myObject.MyObjectOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 4 oct 2024
 */
public class Escritura extends Fichero {
 // constantes y atributos -->
  
 //----------------------------------------------------------------------------->
 // contructores -->
  public Escritura (String inputPath) {
    super(inputPath);
  }
  
 //----------------------------------------------------------------------------->
 // metodos privados -->
  
  
 //----------------------------------------------------------------------------->
 // metodos publicos -->
   // metodo "simpleDataWrite" =>
  public void simpleDataWrite () {
    DataOutputStream outputData = null;

    try {
      outputData = new DataOutputStream(new FileOutputStream(getPath()));
      
      outputData.writeByte((byte) 123);
      outputData.writeShort((short) 1234);
      outputData.writeInt(12345);
      outputData.writeLong(1234567891);
      outputData.writeFloat((float) Math.PI);
      outputData.writeDouble(Math.PI);
      outputData.writeBoolean(true);
      outputData.writeChar('a');
      outputData.writeUTF("hola buenas");
      
    } catch (FileNotFoundException e) {
    } catch (IOException e) {
    } finally {
      try {
        outputData.close();
      } catch (IOException e) {
      }
    }
  }
  
   // metodo "readObjects" =>
  public void readObjects (Object objInput) {
    ObjectOutputStream outputData = null;
    
    try {
      if (super.fileExist()) {
         // archivo ya creado. no crea la cabecera.
        outputData = new MyObjectOutputStream(new FileOutputStream (getPath(), true));
      } else {
         // primera vez que se crea el archivo. se crea la cabecera.
        outputData = new ObjectOutputStream (new FileOutputStream(getPath()));
      }
      
      outputData.writeObject(objInput);
      
    } catch (FileNotFoundException e) {
    } catch (IOException e) {
    } finally {
      try {
        outputData.close();
      } catch (IOException e) {
      }
    }
  }
  
 //----------------------------------------------------------------------------->
 // getters & setters -->
  
  
}
