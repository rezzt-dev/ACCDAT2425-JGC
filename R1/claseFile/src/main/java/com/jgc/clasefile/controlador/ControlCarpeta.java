/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefile.controlador;

import com.jgc.clasefile.modelo.Carpeta;
import com.jgc.clasefile.modelo.Archivo;
import com.jgc.clasefile.vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Set;

/**
 * clase encargada de comunicar la vista con el modelo
 * como esta clase esta interesada en procesor un evento de accion entonces debe implementar la interfaz ActionListener
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 18 sept 2024
 */
public class ControlCarpeta implements ActionListener {
  private final InterfazVista vista;
  private final Carpeta modelo;
  private ControlArchivo controladorA;
  
 //----------------------------------------------------------------------|
  /**
   * constrcutor de la clase
   * 
   * @param vista interfaz de la aplicacion
   * @param modelo logica de la aplicacion
  */
  public ControlCarpeta(InterfazVista vista, Carpeta modelo) {
    this.vista = vista;
    this.modelo = modelo;
        
    this.vista.setControladorCarpeta(this);
    this.vista.arranca();
  }

  public void setControladorArchivo(ControlArchivo controladorA) {
    this.controladorA = controladorA;
    this.vista.setControladorArchivo(controladorA);
  }
  
  
 //----------------------------------------------------------------------|
  @Override
  public void actionPerformed(ActionEvent evento) {
    String ruta = vista.getRuta();
    modelo.setRuta(ruta);
    
    switch (evento.getActionCommand()) {
      case InterfazVista.CREAR_CARPETA_CON_RUTA_COMPLETA -> {
        modelo.crearCarpeta();
      }
      case InterfazVista.CREAR_CARPETA_CON_RUTA_PADRE_Y_NOMBRE -> {
        String nombreCarpeta = vista.getNombre();
        modelo.crearCarpeta(nombreCarpeta);
      }
      case InterfazVista.CREAR_CARPETA_CON_FILE_Y_NOMBRE -> {
        String nombreCarpeta = vista.getNombre();
        modelo.crearCarpeta(modelo.getFileDeRuta(), nombreCarpeta);
      }
    }
  }
  
  
 //----------------------------------------------------------------------|
  // getters & setters ->
  
}
