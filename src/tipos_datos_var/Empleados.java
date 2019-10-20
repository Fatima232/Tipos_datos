/*DESCRIPCION:
Creacion de un metodo sin RETORNO y PARAMETROS
Metodo de IMPRESION
AUTOR:
Fatima Ramirez Briseño
FECHA:
25/09/2019

 */
package tipos_datos_var;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Empleados {
        //EMPLEADOS
        String nom_em;
        int c_em;
        String cr_em,rfc_em;
        String cal_em;
        String ne_em,ni_em;
        String col_em;
        int cp_em;
        String cd_em,et_em,ps_em;
        String email_em;
        long tc_em,cel_em;
        String es_em;
        String pt_em,ji_em;
        double sd_em;
        String nv_em;
        //CAPTURA DE DATOS
        //CREACION DE UN METODO SIN RETORNO Y PARAMETROS
        //DOMINIO ALCANCE NOM_METODO (PARAMETROS) {
        
        //}
        public void captura_em (){
        c_em=Integer.parseInt(JOptionPane.showInputDialog("Inserta el numero de empleado"));
        nom_em=JOptionPane.showInputDialog(" Introduce el nombre completo del empleado ");
        cr_em=JOptionPane.showInputDialog(" Introduce la CURP del empleado ");
        rfc_em=JOptionPane.showInputDialog(" Introduce la RFC del empleado ");
        cal_em=JOptionPane.showInputDialog(" Introduce la calle del empleado ");
        ne_em=JOptionPane.showInputDialog(" Introduce el numero exterior empleado ");
        ni_em=JOptionPane.showInputDialog(" Introduce el numero interior del empleado ");
        rfc_em=JOptionPane.showInputDialog(" Introduce la RFC del empleado ");
        col_em=JOptionPane.showInputDialog(" Introduce la colonia del empleado ");
        cp_em=Integer.parseInt(JOptionPane.showInputDialog("Inserta el codigo postal del empleado"));
        cd_em=JOptionPane.showInputDialog(" Introduce de que ciudad es el  empleado ");
        et_em=JOptionPane.showInputDialog(" Introduce de que estado es el empleado ");
        ps_em=JOptionPane.showInputDialog(" Introduce de que pais es el empleado ");
        email_em=JOptionPane.showInputDialog(" Introduce el email del empleado");
        tc_em=Long.parseLong(JOptionPane.showInputDialog(" Introduce el numero de telefono de casa del empleado"));
        cel_em=Long.parseLong(JOptionPane.showInputDialog(" Introduce el numero de celular del empleado"));
        es_em=JOptionPane.showInputDialog(" Introduce el estado civil del empleado");
        pt_em=JOptionPane.showInputDialog(" Introduce el puesto del empleado");
        ji_em=JOptionPane.showInputDialog(" Introduce el jefe inmediato del empleado");
        sd_em=Double.parseDouble(JOptionPane.showInputDialog(" Introduce el sueldo del empleado")); 
        nv_em=JOptionPane.showInputDialog(" Introduce el nivel de preparacion del empleado");}
        
        //IMPRESION DE DATOS DEL EMPLEADO
        //METODO DE IMPRESION DE DATOS DEL EMPLEADO
        public void impresion_em(){
             JOptionPane.showMessageDialog(null,"El codigo del empleado es" +c_em + "\n" +
                                           "El nombre del empleado es " +nom_em + "\n " +
                                           "La curp del empleado es " +cr_em + "\n " +
                                           "El RFC del empleado es " +rfc_em + "\n " +
                                           "La calle del empleado es " +cal_em + "\n " +
                                           "El numero exterior del empleado es " +ne_em + "\n " +
                                           "El numero inteior del empleado es " +ni_em + "\n " +
                                           "La colonia del empleado es " +col_em + "\n " +
                                           "El codigo postal del empleado es " +cp_em + "\n " +
                                           "La ciudad del empleado es " +cd_em + "\n " +
                                           "El estado civil del empleado es " +et_em + "\n " +
                                           "El email del empleado es " +email_em + "\n " +
                                           "El telefono de casa del empleado es " +tc_em + "\n " +
                                           "El numero de celular del empleado es " +cel_em + "\n " +
                                           "El estado civil del empleado es " +es_em + "\n " +        
                                           "El puesto del empleado es " +pt_em + "\n " +
                                           "El jefe inmediato del empleado es " +ji_em + "\n " +
                                           "El sueldo del empleado es " +sd_em + "\n " +
                                           "El nivel de preparacion del empleado es " +nv_em +"\n ");        
                                           
            
            
                                               
        }//FIN DEL METODO DE IMPRESION DE DATOS
}//FIN DEL PUBLIC CLASS


