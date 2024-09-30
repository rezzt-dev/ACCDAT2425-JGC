/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jgc.proyectofilestreamscaracteres;

import com.jgc.proyectofilestreamscaracteres.modelo.FileStreams;

/**
 *
 * @author JGC by Juan Garcia Cazallas
 */
public class ProyectoFileStreamsCaracteres {

  public static void main(String[] args) {
    FileStreams modelo = new FileStreams();
    modelo.setPath("texto.txt");
    StringBuffer output = modelo.leerStreamArrayCaracteres();
    modelo.escribirStreamCaracter('a');
    System.out.println(output);
    
  }
}
