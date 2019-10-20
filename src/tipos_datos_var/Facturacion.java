/*CLIENTES 

 */
package tipos_datos_var;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Facturacion {
    //FACTURACION
    int cf;
    String nom_cl;
    int cod_cl;
    String cr_cl,rfc_cl;
    short n_f;
    String cal_cl;
    String ne_cl,ni_cl;
    String col_cl;
    int cp_cl;
    String cd_cl,et_cl,ps_cl;
    String email_cl,uf;
    long tc_cl;
    String dp;
    double cb_pd,ci_pd,ct_pd;
    byte dd,mm,aa;
    int  cp;
    //CAPTURA DE DATOS
    //METODO DE CAPTURA
    public void captura_ft(){
    cf=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo de factura"));
    nom_cl=JOptionPane.showInputDialog("Introduce el nombre del cliente");
    cod_cl=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del cliente"));
    cr_cl=JOptionPane.showInputDialog("Introduce la curp del cliente");
    rfc_cl=JOptionPane.showInputDialog("Introduce la RFC del cliente");
    n_f=Short.parseShort(JOptionPane.showInputDialog("Introduce el numero de factura"));
    cal_cl=JOptionPane.showInputDialog("Introduce la calle");
    ne_cl=JOptionPane.showInputDialog("Introduce el numero exterior de la casa");
    ni_cl=JOptionPane.showInputDialog("Introduce el numero interior ");
    col_cl=JOptionPane.showInputDialog("Introduce la colonia");
    cp_cl=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo postal "));
    cd_cl=JOptionPane.showInputDialog("Introduce de cual ciudad es ");
    et_cl=JOptionPane.showInputDialog("Introduce de cual estado es ");
    ps_cl=JOptionPane.showInputDialog("Introduce de cual pais es");
    email_cl=JOptionPane.showInputDialog("Introduce el email");
    uf=JOptionPane.showInputDialog("Introduce el uso fiscal");
    tc_cl=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de telefono"));
    dp=JOptionPane.showInputDialog("Introduce la descrpcion del pedido");
    cb_pd=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo bruto del pedido,sin el I.V.A descrito"));
    ci_pd=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo del I.V.A, el cual obedece al 16% del costo bruto del pedido"));
    ct_pd=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo total del pedido"));
    dd=Byte.parseByte(JOptionPane.showInputDialog("Introduce la fecha,dia"));
    mm=Byte.parseByte(JOptionPane.showInputDialog("Introduce el mes"));
    aa=Byte.parseByte(JOptionPane.showInputDialog("Introduce el año"));
    cp=Integer.parseInt(JOptionPane.showInputDialog("Introduce el codigo del pedido"));
    }//FIN PUBLIC VOID captura_ft
    //IMPRESION DE DATOS
    //METODO DE IMPRESION
    public void impresion_ft(){
    JOptionPane.showMessageDialog(null,"El codigo de factura es " +cf + "\n" +
                                       "El nombre del cliente es " +nom_cl + "\n" +
                                       "El codigo del cliente es " +cod_cl + "\n" +
                                       "La CURP del cliente es " +cr_cl + "\n" +
                                       "El RFC del cliente es " +rfc_cl + "\n" +
                                       "El numero de factura es " +n_f + "\n" +
                                       "La calles es " +cal_cl + "\n" +
                                       "El numero exterior de la casa es " +ne_cl + "\n" +
                                       "El numero interior de la casa es " +ni_cl + "\n" +
                                       "Colonia" +col_cl + "\n" +
                                       "Codigo postal" +cp_cl + "\n" +
                                       "Ciudad" +cd_cl + "\n" +
                                       "Estado" +et_cl + "\n" +
                                       "Pais" +ps_cl + "\n" +
                                       "El email capturado es" +email_cl + "\n" +
                                       "El uso fiscal es " +uf + "\n" +
                                       "El numero de telefono es " +tc_cl + "\n" +
                                       "La descripcion del pedido es" +dp + "\n" +
                                       "El costo bruto del pedido sin el I.V.A descrito es" +cb_pd + "\n" +
                                       "El costo del I.V.A es" +ci_pd + "\n" +
                                       "El costo total del pedido es" +ct_pd + "\n" +
                                       "La fecha del pedido es " +dd + "\n" +mm + "\n" +aa + "\n" +
                                       "El codigo del pedido es " +cp + "\n");    
    
    }//FIN PUBLIC impresion_ft
   
  }//FIN DEL PUBLIS CLASS
