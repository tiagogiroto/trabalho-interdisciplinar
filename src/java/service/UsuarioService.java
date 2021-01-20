/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Tiago
 */
public class UsuarioService {
     public static final UsuarioService INSTANCE = new UsuarioService();
     
     private UsuarioService() {
         
  }
     
     public static UsuarioService getInstance() {
         System.out.print("teste");
    return INSTANCE;
  }
}
