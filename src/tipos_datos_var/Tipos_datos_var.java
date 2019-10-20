/*DESCRIPCION1:
Identificar atributos que le corresponden a cada clase
FECHA:
18/09/2019
DESCRIPCION2:
Creacion de un metodo sin RETORNO y PARAMETROS y la ejecucion de ese mismo
metodo desde una clase diferente
FECHA:
25/09/2019
DEACRPCION3:
implementacion de estructura fundamental de control(EFC) de seleccion multiple SWITCH
FECHA:
30/09/2019
AUTOR: 
Fatima Ramirez Briseño
*/
package tipos_datos_var;
import javax.swing.JOptionPane;
public class Tipos_datos_var {

   
    public static void main(String[] args) {
        
        //OBJETOS comunicacion con las clases
        //CREACION DE OBJETOS
        //NOM_CLASE NOM_OBJETO=NEW NOM_CLASE (PARAMETROS);
        Empleados obj_em=new Empleados();
        Clientes obj_cl=new Clientes();
        Productos obj_pr=new Productos();
        Pedidos obj_pd=new Pedidos();
        Facturacion obj_ft=new Facturacion();
       
         
        //COMO EJECUTAR UN METODO DESDE OTRA CLASE
        //NOM_OBJ.NOM_METODO(PARAMETROS);
        obj_em.captura_em(); //EJECUTAR LA CAPTURA DE DATOS DEL EMPLEADO
        obj_em.impresion_em(); //IMPRESION DE DATOS DEL EMPLEADO
        //OBJETOS CLIENTES
        obj_cl.captura_cl();
        obj_cl.impresion_cl();
        //OBJETOS PRODUCTOS
        obj_pr.captura_pr();
        obj_cl.impresion_cl();
        //OBJETOS PEDIDOS
        obj_pd.captura_pd();
        obj_pd.impresion_pd();
        //FACTURACION
        obj_ft.captura_ft();
        obj_ft.impresion_ft();
        
        
        byte opcion,op_cl,op_em,op_pr,op_pd,op_ft;
     //SELECCION MULTIPLE switch
     /* MOSTRAR LAS OPCIONES LLAMADAS MENU
      LEER (ELEGIR LA OPCIÓN QUE TU QUIERES EJECUTAR)
      switch(nom_var_decidir){
      case 1:
         //escribo las acciones del caso 1
      break;//romper o terminar el caso 1
      case 2:
      break;
      case 3:
      break;
      // CONTINUO CON EL NUMERO DE CASOS U OPCIONES QUE QUIERO O NECESITA MI PROGRAMA
      default: //ESCRIBO UN MENSAJE DE ERROR
      }//FIN DEL SWITCH
     */
     
     opcion=Byte.parseByte(JOptionPane.showInputDialog("__________ M E N U  P R I N C I P A L__________\n" +
                         "         __EMPRESA   LINC__         \n " +
                         " opcion 1: Clientes \n" +
                         " opcion 2: Empleados \n" +
                         " opcion 3: Poductos \n" +
                         " opcion 4: Pedidos \n" +
                         " opcion 5: Facturacion \n" +
                         " opcion 6: Salida del sistema \n"));
        switch (opcion){
            case 1: //CAPTURA DE CLIENTES
                 op_cl=Byte.parseByte(JOptionPane.showInputDialog("_____M E N U  C L I E N T E S_____\n" +
                         " Opcion 1: Captura de clientes \n" +
                         " Opcion 2: Consulta de clientes \n" +
                         " Opcion 3: Busqueda de clientes \n" +
                         " Opcion 4: Modificacion de clientes \n" +
                         " Opcion 5: Eliminacion de clientes \n" +
                         " Opcion 6: Salida de clientes \n"));
                 switch (op_cl){
                     case 1://CAPTURA CLIENTES
                          obj_cl.captura_cl();//SE EJECUTA LA CAPTURA DE CLIENTE
                     break;
                     case 2://CONSULTA DE CLIENTES
                          obj_cl.impresion_cl();//EJECUTA EL METODO DE IMPRESION DE CLIENTES
                     case 3://BUSQUEDA DE CLIENTES
                         
                     break;
                     case 4://MODIFICACION DE CLIENTES
                         
                     break;
                     case 5://ELIMINACION DE CLIENTES
                         
                     break;
                     case 6://SALIDA DE CLIENTES
                         JOptionPane.showMessageDialog(null,"Saliendo del sistema....");
                     break;//FIN DEL CASO 6
                     default:JOptionPane.showMessageDialog(null,"Lo siento la opcion "+opcion+ " No existe,intenta nuevamente..." );
                     }//FIN DEL SWITCH DE CLIENTES DE LA VARIABLE LLAMADA op_cl
                       }//FIN DEL SWITCH DE CLIENTES DE LA VARIABLE LLAMADA OPCION
                    while (opcion!=6)
        switch (opcion){
            case 1://CAPTURA EMPLEADOS
                op_em=Byte.parseByte(JOptionPane.showInputDialog("_____M E N U  E M P L E A D O S_____\n" +
                        " Opcion 1: Captura de empleados \n" +
                        " Opcion 2: Consultar empleados \n" +
                        " Opcion 3: Busqueda de empleados \n" +
                        " Opcion 4: Modificacion de empleados \n" +
                        " Opcion 5: Eliminacion de empelados \n" +
                        " Opcion 6: Salida de empleados \n"));
                switch (op_em){
                    case 1://CAPTURA DE EMPLEADOS
                       obj_em.captura_em();
                    break;
                    case 2://CONSULTA EMPLEADOS
                        obj_em.impresion_em();
                    break;
                    case 3://BUSQUEDA DE EMPLEADOS
                        
                    break;
                    case 4://MOFICICACION DE EMPLEADOS
                        
                    break;
                    case 5://ELIMINACION DE EMPLEADOS
                        
                    break;
                    case 6:
                       JOptionPane.showMessageDialog(null,"Saliendo del sistema...."); 
                    break;    
                    default:JOptionPane.showMessageDialog(null,"Lo siento la opcion "+opcion+ " No existe,intenta nuevamente..." );
                     }//FIN DEL SWITCH DE EMPLEADOS DE LA VARIABLE LLAMADA op_em
                    }//FIN DEL SWITCH DE EMPLEADOS DE LA VARIABLE LLAMADA opcion
                    while (opcion!=6)
         switch (opcion){
             case 1://PRODUCTOS
                 op_pr=Byte.parseByte(JOptionPane.showInputDialog("_____M E N U  P R O D U C T O S_____\n" +
                         " Opcion 1: Captura de productos \n" +
                         " Opcion 2: Consultar productos \n" +
                         " Opcion 3: Busqueda de productos \n" +
                         " Opcion 4: Modificacion de productos \n" +
                         " Opcion 5: Eliminacion de productos \n" +
                         " Opcion 6: Salida de productos \n"));
                switch (op_pr){
                    case 1://CAPTURA PRODUCTOS
                        obj_pr.captura_pr();
                    break;
                    case 2://CONSULTA PRODUCTOS
                        obj_pr.impresion_pr();
                    case 3://BUSQIEDA PRODUCTOS
                        
                    break;   
                    case 4://MODIFICACION DE PRODUCTOS
                        
                    break;
                    case 5://ELIMINACION DE PRODUCTOS
                        
                    break;
                    case 6://SALIDA DE PRODUCTOS
                        JOptionPane.showMessageDialog(null,"Saliendo del sistema \n");
                    break;
                    default:JOptionPane.showMessageDialog(null,"Lo siento la opcion"+opcion + "No extiste,intenta nuevamente \n");
                        }//FIN DEL SWITCH DE PRODUCTOS DE LA VARIABLE LLAMADA op_pr
                    }//FIN DEL SWITCH DE PRODUCTOS DE LA VARIABLE LLAMADA opcion
                    while (opcion!=6)
        switch (opcion){
            case 1://PEDIDOS
                op_pd=Byte.parseByte(JOptionPane.showInputDialog("_____M E N U  P E D I D O S_____\n" +
                        " Opcion 1: Captura de pedidos \n" +
                        " Opcion 2: Consulta de pedidos \n" +
                        " Opcion 3: Busqueda de pedidos \n" +
                        " Opcion 4: Modificacion de pedidos \n" +
                        " Opcion 5: Eliminacion de pedidos \n" +
                        " Opcion 6: Salida de pedidos \n"));
                switch (op_pd){
                    case 1://CAPTURA DE PEDIDOS
                        obj_pd.captura_pd();
                    break;
                    case 2://CONSULTA PEDIDOS
                        obj_pd.impresion_pd();
                    break;
                    case 3://BUSQUEDA DE PEDIDOS
                        
                    break;
                    case 4://MODIFICACION DE PEDIDOS
                        
                    break;
                    case 5://ELIMINACION DE PEDIDOS
                        
                    break;
                    case 6://SALIDA DE PEDIDOS
                        JOptionPane.showMessageDialog(null,"Saliendo del sistema \n");
                    break;  
                    default:JOptionPane.showMessageDialog(null,"Lo siento la opcion"+opcion +"No esxite,intenta nuevamente \n");
                    }//FIN DEL SWITCH LLAMADO op_pd
                      }//FIN DEL SWITCH DE PEDIDOS DE LA VARIABLE LLAMADA OPCION
                   while (opcion!=6)
            
    switch (opcion){
        case 1: //FACTURACION
            op_ft=Byte.parseByte(JOptionPane.showInputDialog("_____M E N U  F A C T U R A C I O N_____\n" +
                    " Opcion 1: Captura de facturacion \n" +
                    " Opcion 2: Consulta de facturacion \n" +
                    " Opcion 3: Busqueda de facturacion \n" +
                    " Opcion 4: Modificacion de facturacion \n" +
                    " Opcion 5: Eliminacion de facturacion \n" +
                    " Opcion 6: Salida de facturacion \n" ));
            switch (op_ft){
                case 1://CAPTURA FACTURACION
                   obj_ft.captura_ft();
                break;  
                case 2://CONSULTA FACTURACION
                    obj_ft.impresion_ft();
                break;
                case 3://BUSQUEDA DE FACTURACION
                    
                break;
                case 4://MODIFICACION DE FACTURACION
                    
                break; 
                case 5:// ELIMINACION DE FACTURACION
                    
                break;
                case 6://SALIDA DE FACTURACION
                    JOptionPane.showMessageDialog(null,"Salinedo del sistema \n");
                break;
                default:JOptionPane.showMessageDialog(null,"Los siento la opcion" +opcion +"No esxite,intenta nuevamente \n");
               }//FIN DEL SWITCH DE LA VARIABLE LLAMADA op_ft
         }//FIN DEL SWITCH FACTURACION DE LA VARIABLE LLAMADA opcion        
               
      }//FIN PUBLIC STATIC VOID

}//FIN PUBLIC CLASS
                

       
        
 