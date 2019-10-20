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
public class Productos {
    //PRODUCTOS
        String nom_pr;
        long cod_pr;
        String d_pr;
        long cb_pr,ci_pr,ct_pr;
        byte ce_pr,ds_pr;
        byte dd,mm,aa;
       
        //CAPTURA DE DATOS DEL PRODUCTO
        public void captura_pr(){
        nom_pr=JOptionPane.showInputDialog("Introduce el nombre del producto");
        cod_pr=Long.parseLong(JOptionPane.showInputDialog(" Introduce el codigo del producto"));
        d_pr=JOptionPane.showInputDialog("Introduce la descripcion del producto");
        cb_pr=Long.parseLong(JOptionPane.showInputDialog("Introduce el costo bruto del producto sin el I.V.A descrito"));
        ci_pr=Long.parseLong(JOptionPane.showInputDialog("Introduce el costo del I.V.A, obedece al 16% del costo bruto del producto"));
        ct_pr=Long.parseLong(JOptionPane.showInputDialog("Introduce el costo total del producto + I.V.A"));
        ce_pr=Byte.parseByte(JOptionPane.showInputDialog("Introduce la cantidad en existencia del producto en la empresa"));
        ds_pr=Byte.parseByte(JOptionPane.showInputDialog("Introduce el descuento del producto"));
        dd=Byte.parseByte(JOptionPane.showInputDialog("Introduce la cuando se ingreso el producto ,dia \n" +mm + "mes  \n" +aa + "año \n"));
   
        }//FIN DE LA CAPTURA
         //IMPRESION DE DATOS DE LOS PRODUCTOS
        public void impresion_pr(){
        JOptionPane.showMessageDialog(null,"El nombre del producto es " +nom_pr + "\n" +
                                           "El codigo del producto es " +cod_pr + "\n"  +
                                           "La descripcion del producto es " +d_pr + "\n " + 
                                           "El costo bruto del producto sin el I.V.A descrito es " +cb_pr + "\n " +   
                                           "El costo del I.V.A del producto es " +ci_pr + "\n " +
                                           "El costo total del producto es " +ct_pr + "\n " +        
                                           "La cantidad de producto en existencia  es  " +ce_pr + "\n " +
                                           "El descuento del producto es " +ds_pr + "\n " +
                                           "La fecha  de ingreso del producto fue " +dd + "\n " +mm + "\n " +aa );
        }//FIN DE LA IMPRESION
}//FIN DEL PUBLIC CLASS
