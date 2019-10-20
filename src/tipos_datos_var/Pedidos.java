/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_datos_var;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Pedidos {
       //PEDIDOS
    String dp;
    int cp;
    byte dd,mm,aa;
    double d,cb,ci,ct;
    String nom_cl;
    int cod_cl;
    String nom_em;
   //CAPTURA DE DATOS
   //METODO DE CAPTURA
    public void captura_pd(){
    dp=JOptionPane.showInputDialog("Introduce la descripcion del producto");
    cp=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del pedido")); 
    dd=Byte.parseByte(JOptionPane.showInputDialog("Introduce la fecha del pedido,dia \n" +mm + "mes \n" +aa + "año \n"));
    d=Double.parseDouble(JOptionPane.showInputDialog("Introduce el descuento del pedido"));
    cb=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo bruto del pedido, sin el I.V.A descrito"));
    ci=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo del I.V.A,obedece al 16% del costo bruto"));
    ct=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo total del pedido,costo bruto +I.V.A"));
    nom_cl=JOptionPane.showInputDialog("Introduce el nombre del cliente");
    cod_cl=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del cliente"));
    nom_em=JOptionPane.showInputDialog("Introduce el nombre del empleado que realizo el pedido");
    }//FIN DEL PUBLIC VOID captura_pd
    //IMPRESION DE DATOS
    //METODO DE IMPRESION
    public void impresion_pd(){
    JOptionPane.showMessageDialog(null,"La descripcion del producto es " +d + "\n" +
                                       "El codigo del pedido es " +cp + "\n" +
                                       "La fecha del pedido es " +dd + "\n" +mm + "\n" +aa + "\n" +
                                       "El descuento del pedido es " +dp + "\n" +
                                       "El costo bruto del pedido, sin el I.V.A es " +cb + "\n" +
                                       "El costo del I.V.A del pedido es " +ci + "\n" +
                                       "Costo total del pedido es " +ct + "\n" +
                                       "El nombre del cliente es " +nom_cl + "\n" +
                                       "El nombre del empleado que realizo el pedido fue" +nom_em + "\n");
    }//FIN DEL PUBLIC VOID impresion_pd
    }//FIN DEL PUBLIC CLASS

