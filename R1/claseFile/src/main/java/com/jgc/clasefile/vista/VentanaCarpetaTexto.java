/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.jgc.clasefile.vista;

import com.jgc.clasefile.controlador.ControlArchivo;
import com.jgc.clasefile.controlador.ControlCarpeta;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 * @version 1.0
 * Created on 18 sept 2024
 */
public class VentanaCarpetaTexto implements InterfazVista {
  private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  private ControlCarpeta controladorCarpeta;
  private ControlArchivo controladorArchivo;
  private String ruta;
  
  
 //----------------------------------------------------------------------|
  public VentanaCarpetaTexto () {
    super();
  }
  
  
 //----------------------------------------------------------------------|
  private String leerString () {
    try {
      return in.readLine();
    } catch (IOException e) {
      System.out.println("Error! La cadena no ha sido introducida correctamente.");
      return null;
    }
  }
  
  private int leerOpcion () {
    try {
      String opcion = in.readLine();
      return Integer.parseInt(opcion);
    } catch (IOException | NumberFormatException e) {
      opcionInvalida();
      return 0;
    }
  }
  
  public void mostrarMenu () {
    System.out.println("Indica la operacion que quieres realizar: ");
    System.out.println("1: crear carpeta con ruta.");
    System.out.println("2: crear carpeta pasando ruta padre y nombre de la carpeta.");
    System.out.println("3: crear carpeta pasando un File y nombre de la carpeta.");
    System.out.println("0: salir");
  }
  
  private void procesarNuevaOperacion () {
    int opcion;
    mostrarMenu();
    opcion = leerOpcion();
    
    switch (opcion) {
      case 0 -> {
        System.out.println("");
        System.exit(0);
      }
      case 1 -> {
        this.controladorCarpeta.actionPerformed(new ActionEvent(this, opcion, CREAR_CARPETA_CON_RUTA_COMPLETA));
      }
      case 2 -> {
        this.controladorCarpeta.actionPerformed(new ActionEvent(this, opcion, CREAR_CARPETA_CON_RUTA_PADRE_Y_NOMBRE));
      }
      case 3 -> {
        this.controladorCarpeta.actionPerformed(new ActionEvent(this, opcion, CREAR_CARPETA_CON_FILE_Y_NOMBRE));
      }
      case 4 -> {
        this.controladorArchivo.actionPerformed(new ActionEvent(this, opcion, CREAR_ARCHIVO_CON_RUTA_Y_NOMBRE));
      }
      default -> {
        opcionInvalida();
      }
    }
    
    procesarNuevaOperacion();
  }
  
  private void opcionInvalida() {
    System.out.println("Opcion Invalida!");
  }
  
  
 //----------------------------------------------------------------------|
  @Override
  public void arranca() {
    procesarNuevaOperacion();
  }

  @Override
  public String getRuta() {
    System.out.print("Introduce la ruta: ");
    return leerString();
  }
  
  @Override
  public String getNombre() {
    System.out.print("Introduce el nuevo nombre: ");
    return leerString();
  }

  @Override
  public void setControladorCarpeta(ControlCarpeta cC) {
    this.controladorCarpeta = cC;
  }

  @Override
  public void setControladorArchivo(ControlArchivo cA) {
    this.controladorArchivo = cA;
  }
}
