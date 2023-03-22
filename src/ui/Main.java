package ui;

import model.Controladora;

import java.util.Date;
import java.util.Scanner;

public class Main {

    private Controladora controladora;
    private Scanner sc;

    public Main() {

        controladora = new Controladora();
        sc = new Scanner(System.in);



    }

    public static void main(String[] args) {

        Main ppal = new Main();

        int option = 0;
        do{
            option = ppal.showMenu();
            ppal.executeOperation(option);
        }while (option!=0);

    }

    public int showMenu(){
        int option = 0;
        System.out.println(
                """
                        1. Crear Usuario
                        2. Crear Servicio
                        3. Actualizar
                        4. Inactivar
                        5. Consultar
                        6. Mostrar Usuarios
                        0. Salir"""
        );
        option= sc.nextInt();
        sc.nextLine();
        return option;
    }

    public void executeOperation(int operation) {

        switch(operation) {
            case 0:
                System.out.println("Adios ps");
                break;
            case 1:
                crearUsuario();
                break;

            case 2:
                crearServicio();
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                mostrarUsuarios();
                break;

            default:
                System.out.println("Error, invalid option");

        }
    }

    public void crearUsuario(){

        System.out.println("Nombre del cliente");
        String name = sc.next();

        System.out.println("Id");
        String id = sc.next();

        System.out.println("Fecha de Registro");
        System.out.println("Dia");
        int dia = sc.nextInt();
        System.out.println("Mes");
        int mes = sc.nextInt();
        sc.nextLine();
        System.out.println("Año");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.println("Direccion");
        String direccion = sc.next();

        System.out.println("Correo Electronico");
        String corre = sc.next();

        System.out.println("Telefono");
        String telefono = sc.next();

        System.out.println("Estado");
        int estado = sc.nextInt();

        controladora.crearCliente(name, id, dia, direccion, corre, telefono, estado);
    }
    public void crearServicio(){
        System.out.println("Digite el id del cliente");
        String id=sc.next();
        System.out.println("Digite el tipo de servicio 1. Gas 2. Agua 3. Energia 4. Telefonia 5. Internet");
        int serv=sc.nextInt();

        System.out.println("Codigo de contrato");
        String codigo=sc.next();
        System.out.println("Direccion instalacion");
        String direccion=sc.next();
        System.out.println("Fecha de instalacion");
        int diaIns=sc.nextInt();
        System.out.println("Fecha de facturacion");
        int diaFact=sc.nextInt();
        System.out.println("Estado");
        boolean estado=sc.nextBoolean();
        System.out.println("Codigo Servicio");
        String codigoServ=sc.next();
        System.out.println("Valor Contador Anterior");
        int valorAnt=sc.nextInt();
        System.out.println("Valor Contador Actual");
        int valorAct=sc.nextInt();

        int tipo = 0;
        double minLoc = 0;
        double minNac = 0;
        double consumo = 0;
        double megas = 0;

        if(serv == 4){
            System.out.println("Tipo contrato 1. Ilimitado 2. Limitado, 3. Prepago");
            tipo=sc.nextInt();
            System.out.println("Cantidad minutos locales");
            minLoc=sc.nextDouble();
            System.out.println("Cantidad minutos nacionales");
            minNac=sc.nextDouble();
        }else if(serv == 5){
            System.out.println("Tipo contrato 1. Ilimitado 2. Limitado, 3. Prepago");
            tipo=sc.nextInt();
            System.out.println("Cantidad de consumidos");
            consumo=sc.nextDouble();
            System.out.println("Cantidad de megas");
            megas=sc.nextDouble();
        }

        controladora.crearServicio(id,serv, codigo, direccion, diaIns, diaFact, estado, codigoServ, valorAnt, valorAct, tipo, minLoc, minNac, consumo, megas);
    }

    public void mostrarUsuarios(){
        controladora.mostrarUsuarios();
    }
}