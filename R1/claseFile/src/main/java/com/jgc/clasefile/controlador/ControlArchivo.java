/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefile.controlador;

import com.jgc.clasefile.modelo.Archivo;
import com.jgc.clasefile.vista.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 20 sept 2024
 */
public class ControlArchivo implements ActionListener {
  private final InterfazVista vista;
  private final Archivo modelo;
  private ControlCarpeta controladorC;
  
 //----------------------------------------------------------------------|
  /**
   * constrcutor de la clase
   * 
   * @param vista interfaz de la aplicacion
   * @param modelo logica de la aplicacion
  */
  public ControlArchivo(InterfazVista vista, Archivo modelo) {
    this.vista = vista;
    this.modelo = modelo;
        
    this.vista.setControladorArchivo(this);
    this.vista.arranca();
  }

  public void setControladorCarpeta(ControlCarpeta controladorC) {
    this.controladorC = controladorC;
    this.vista.setControladorCarpeta(controladorC);
  }
  
  
  @Override
  public void actionPerformed(ActionEvent evento) {
    String ruta = vista.getRuta();
    modelo.setRuta(ruta);
    
    switch (evento.getActionCommand()) {
      case InterfazVista.CREAR_ARCHIVO_CON_RUTA_Y_NOMBRE -> {
        String nombre = vista.getNombre();
        modelo.crearArchivo(modelo.getFileDeRuta(), nombre);
      }
    }
  }
}
