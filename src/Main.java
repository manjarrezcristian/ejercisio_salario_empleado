//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            /**una empresa desea registrar la informacion de cada empleado para ello
            un empleado debe ingresar con su usuario y contraseña
            una vez ingresado el empleado debe registrar la siguiente informacion
            1 nombre completo
            2 documento de identidad
            3 valor de la hora
            4 cantidad de horas
            5 seleccionar un dia ded descanso a la semana (l-v)
            el sistema le debe mostrar al empleado su salario neto, salario bruto, deduccion por pension
            deduccion por salud auxilio de transporte si aplica y bonificacion del 10% si no supera
            2smmlv sin incluir subsidio de transporte, toda la informacion del empleado se debe mostrar en
            un mensaje descriptivo**/

            /**definicion y asignacion de variables**/
            Scanner leer = new Scanner(System.in);
            String nombre_empleado = "";
            String docuemnto_identidad = "";
            String dia_descanso = "";
            String usuario_empleado = "";
            String contrasena_empleado = "";
            double salario_bruto = 0;
            double salario_neto = 0;
            double retencion_salud = 0;
            double retencion_pension = 0;
            double valor_hora = 0;
            double cantidad_hora = 0;
            double bonificacion_empleado = 0;
            int auxilio_transporte = 200000;

        /**aqui estamos preguntando y capturando variables**/
            System.out.println("ingrese su usuario: ");
            usuario_empleado = leer.nextLine();
        System.out.println("ingrese su contraseña: ");
        contrasena_empleado = leer.nextLine();

        /**aqui empezamos con los condicionales**/
        if (usuario_empleado.equals("usuario") && contrasena_empleado.equals("makankiuri")) {
            System.out.println("ha ingresado de forma correcta");
        }else {
               System.out.println("error de credenciales");
            }

             /**otra forma de aplicar condicionales**/
            /**if (usuario_empleado.equals("usuario")){
                System.out.println("ha ingresado de forma correcta");
                if (contrasena_empleado.equals("makankiuri"))
                    System.out.println("bienvenido al sitema");**/



        }
    }
