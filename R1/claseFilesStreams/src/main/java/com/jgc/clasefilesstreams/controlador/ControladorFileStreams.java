/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefilesstreams.controlador;

import com.jgc.clasefilesstreams.modelo.FileStreamsModelo;
import com.jgc.clasefilesstreams.vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author JGC by Juan Garcia Cazallas
 * version 1.0
 * created on 30 sept 2024
 */
public class ControladorFileStreams implements ActionListener {
 // constantes y atributos -->
  private InterfazVista vista;
  private FileStreamsModelo modelo;
  
  private String path;
  private boolean noSobreescribir;
  
 //----------------------------------------------------------------------------->
 // contructores -->
  public ControladorFileStreams (InterfazVista inputVista, FileStreamsModelo inputModelo) {
    this.vista = inputVista;
    this.modelo = inputModelo;
    
    this.vista.setControladorFileStreams(this);
  }
  
 //----------------------------------------------------------------------------->
 // metodos privados -->
  
 //----------------------------------------------------------------------------->
 // metodos publicos -->
   // metodo "actionPerformed" =>
  @Override
  public void actionPerformed (ActionEvent evento) {
    switch (evento.getActionCommand()) {
      case InterfazVista.LEER_FICHERO_CARACTER -> {
        this.path = this.vista.getPath();
        this.modelo.setPath(this.path);
        
        this.modelo.leerFicheroCaracter();
        this.vista.operacionTerminada();
      }
      
      case InterfazVista.LEER_FICHERO_CADENA -> {
        this.path = this.vista.getPath();
        this.modelo.setPath(this.path);
        
        this.modelo.leerFicheroCadena();
        this.vista.operacionTerminada();
      }
      
      case InterfazVista.LEER_FICHERO_LINEA -> {
        this.path = this.vista.getPath();
        this.modelo.setPath(this.path);
        
        this.modelo.leerFicheroLinea();
        this.vista.operacionTerminada();
      }
      
      case InterfazVista.ESCRIBIR_FICHERO_CARACTER -> {
        this.path = this.vista.getPath();
        this.modelo.setPath(this.path);
        
        this.noSobreescribir = this.vista.sobreescribirFichero();
        char inputChar = this.vista.leerChar();
        
        this.modelo.escribirFicheroCaracter(inputChar, noSobreescribir);
        this.vista.operacionTerminada();
      }
      
      case InterfazVista.ESCRIBIR_FICHERO_CADENA -> {
        this.path = this.vista.getPath();
        this.modelo.setPath(this.path);
        
        this.noSobreescribir = this.vista.sobreescribirFichero();
        String inputChars = this.vista.leerString();
        
        this.modelo.escribirFicheroCadena(inputChars, noSobreescribir);
        this.vista.operacionTerminada();
      }
      
      case InterfazVista.ESCRIBIR_FICHERO_LINEA -> {
        this.path = this.vista.getPath();
        this.modelo.setPath(this.path);
        
        this.noSobreescribir = this.vista.sobreescribirFichero();
        String stringLine = this.vista.leerString();
        
        this.modelo.escribirFicheroLinea(stringLine, noSobreescribir);
        this.vista.operacionTerminada();
      }
    }
  }
}
