/*
DESCRIPCION:
 */
package tipos_datos_var;

import javax.swing.JOptionPane;
public class Clientes {
    
        byte tamaño=3;
        byte num_datos=0;
//CLIENTE
        String nom_cl[]=new String[tamaño];
        int c_cl[]=new int[tamaño];
        String cr_cl[]=new String[tamaño],rfc_cl[] = new String[tamaño];
        int nf_cl[]=new int[tamaño];
        String cal_cl[]=new String[tamaño];
        String ne_cl[]=new String[tamaño],ni_cl[]=new String[tamaño];
        String col_cl[]=new String[tamaño];
        int cp_cl[]=new int[tamaño];
        String cd_cl[]=new String[tamaño],et_cl[]=new String[tamaño],ps_cl[]=new String[tamaño];
        String email_cl[]=new String[tamaño];
        long tc_cl[]=new long[tamaño];
        String dp_cl[]=new String[tamaño];
        double cb_cl[]=new double[tamaño],ci_cl[]=new double[tamaño],ct_cl[]=new double[tamaño];
        byte dd[]=new byte[tamaño],mm[]=new byte[tamaño],aa[]=new byte[tamaño];
        int cop_cl[]=new int[tamaño];
        String nom_em[]=new String[tamaño];
        double dc_cl[]=new double[tamaño];
        
        
   //CAPTURA DE DATOS
   //CLIENTES
   //ARREGLOS     
        public void captura_cl(){
        if(num_datos<tamaño){
        c_cl[num_datos]=Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo del cliente"));
        nom_cl[num_datos]=JOptionPane.showInputDialog(" Introduce el nombre completo del cliente ");
        cr_cl[num_datos]=JOptionPane.showInputDialog(" Introduce la CURP del cliente ");
        rfc_cl[num_datos]=JOptionPane.showInputDialog(" Introduce la RFC del cliente ");
        nf_cl[num_datos]=Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero de factura del pedido del cliente"));
        cal_cl[num_datos]=JOptionPane.showInputDialog(" Introduce la calle del cliente ");
        ne_cl[num_datos]=JOptionPane.showInputDialog(" Introduce el numero exterior cliente ");
        ni_cl[num_datos]=JOptionPane.showInputDialog(" Introduce el numero interior del cliente ");
        col_cl[num_datos]=JOptionPane.showInputDialog(" Introduce la colonia del cliente ");
        cp_cl[num_datos]=Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo postal del cliente"));
        cd_cl[num_datos]=JOptionPane.showInputDialog(" Introduce de que ciudad es el  cliente ");
        et_cl[num_datos]=JOptionPane.showInputDialog(" Introduce de que estado es el cliente ");
        ps_cl[num_datos]=JOptionPane.showInputDialog(" Introduce de que pais es el cliente ");
        email_cl[num_datos]=JOptionPane.showInputDialog(" Introduce el email del cliente");
        tc_cl[num_datos]=Long.parseLong(JOptionPane.showInputDialog(" Introduce el numero de celular del cliente"));
        dp_cl[num_datos]=JOptionPane.showInputDialog(" Introduce de que estado es el cliente ");
        cb_cl[num_datos]=Double.parseDouble(JOptionPane.showInputDialog("Inserta el costo bruto del pedido del cliente, sin el I.V.A descrito"));
        ci_cl[num_datos]=Double.parseDouble(JOptionPane.showInputDialog("Inserta el costo del I.V.A, obedecer el 16% del costo bruto del producto"));
        ct_cl[num_datos]=Double.parseDouble(JOptionPane.showInputDialog("Inserta el costo total del pedido del cliente,costo bruto+IVA"));
        dd[num_datos]=Byte.parseByte(JOptionPane.showInputDialog(" Introduce la fecha del pedido ,dia"));
        mm[num_datos]=Byte.parseByte(JOptionPane.showInputDialog(" Introduce el mes del pedido del cliente"));
        aa[num_datos]=Byte.parseByte(JOptionPane.showInputDialog(" Introduce el año del pedido del cliente"));
        cop_cl[num_datos]=Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo del pedido del cliente"));
        nom_em[num_datos]=JOptionPane.showInputDialog(" Introduce el nombre completo del empleado ");
        dc_cl[num_datos]=Double.parseDouble(JOptionPane.showInputDialog(" Introduce el descuento del pedido del cliente"));
        tamaño++;
        }//FIN DEL if
        else {
        JOptionPane.showMessageDialog(null, "¡Memoria insufisiente!");
        }//fin del else
        }//FIN PUBLIC VOID
        
        
        //METODO DE IMPRESION DE DATOS
        public void impresion_cl(){
        JOptionPane.showMessageDialog(null,"El codigo del cliente es" +c_cl + "\n" +
                                           "El nombre del cliente es " +nom_em + "\n " +
                                           "La curp del cliente es " +cr_cl + "\n " +
                                           "El RFC del cliente es " +rfc_cl + "\n " +
                                           "El numero de factura del pedido del cliente es " +nf_cl + "\n " + 
                                           "La calle del cliente es " +cal_cl + "\n " +
                                           "El numero exterior del cliente es " +ne_cl + "\n " +
                                           "El numero inteior del cliente es " +ni_cl + "\n " +
                                           "La colonia del cliente es " +col_cl + "\n " +
                                           "El codigo postal del cliente es " +cp_cl + "\n " +
                                           "La ciudad del cliente es " +cd_cl + "\n " +
                                           "El estado del cliente es " +et_cl + "\n " +
                                           "El pais de donde proviene el cliente es " +ps_cl + "\n " +
                                           "El email del cliente es " +email_cl + "\n " +  
                                           "El numero de celular del cliente es " +tc_cl + "\n " +
                                           "La descripcion del pedidos es " +dp_cl + "\n " +
                                           "El costo bruto del pedido sin el I.V.A es " +cb_cl + "\n " +
                                           "Es costo de I.V.A,obedece al 16% del costo bruto del pedido " +cb_cl + "\n " +
                                           "El costo total del pedido + I.V.A es "  +ct_cl + "\n " +
                                           "La fecha del pedido es " +dd + "\n " +mm + "\n" +aa + "\n " +
                                           "El codigo del pedido es " +cop_cl + "\n " +
                                           "El nombre del empleado que atendio al cliente es " +nom_em + "\n " +
                                           "El descuento de l pedido es " +dp_cl + "\n ");
        }//FIN DEL METODO DE IMPRESION
}//FIN DEL PUBLIC CLASS
        
