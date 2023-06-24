/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        List<Prestamo> lista = new ArrayList<>();
        int op;
        do {
            System.out.print("\n==============MENU=================\n"
                    + "\t Seleccione una opcion\n"
                    + "Prestamo Automovil               [1]\n"
                    + "Prestamo Educativo               [2]\n"
                    + "Salir                            [0]\n");
            op = scanner.nextInt();

            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("===========Datos del Beneficiario==========\n");
                    System.out.print("Ingrese el nombres: ");
                    String nombreBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el apellidos: ");
                    String apellidoBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el usuario: ");
                    String usuarioBeneficiario = scanner.nextLine();

                    System.out.print("Ingrese los meses: ");
                    int tiempoPrestamo = scanner.nextInt();
                    
                    scanner.nextLine();
                    System.out.print("Ingrese la ciudad donde se realizara el"
                            + " prestamo: ");
                    String ciudadPrestamo = scanner.nextLine();
                    
                    System.out.print("Ingrese el tipo de auto: ");
                    String tipo = scanner.nextLine();
                    
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAuto = scanner.nextLine();
                    
                    System.out.print("Ingrese el valor del auto: ");
                    double valorAuto = scanner.nextDouble();
                    
                    scanner.nextLine();
                    System.out.println("==========Datos del Garante==========");
                    System.out.print("Ingrese el nombres: ");
                    String nombreGarante = scanner.nextLine();
                    
                    System.out.print("Ingrese el apellidos: ");
                    String apellidoGarante = scanner.nextLine();
                    
                    System.out.print("Ingrese el usuario: ");
                    String usuarioGarante = scanner.nextLine();

                    Persona datosBeneficiario
                            = new Persona(
                                    nombreBeneficiario,
                                    apellidoBeneficiario,
                                    usuarioBeneficiario);
                    Persona datosGarante = new Persona(nombreGarante,
                            apellidoGarante, usuarioGarante);

                    PrestamoAutomovil presstamoA = new PrestamoAutomovil
                                    (tipo,
                                    marcaAuto, datosGarante,
                                    valorAuto, valorAuto,
                                    datosBeneficiario,
                                    tiempoPrestamo,
                                    ciudadPrestamo);
                    presstamoA.calcularValorMensual();

                    lista.add(presstamoA);
                    break;
                case 2:
                    System.out.println("=======Datos del Beneficiario=======\n");
                    System.out.print("Ingrese el nombre: ");
                    nombreBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el apellido:");
                    apellidoBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el usuario:");
                    usuarioBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese los meses del prestamo: ");
                    tiempoPrestamo = scanner.nextInt();
                    
                    scanner.nextLine();
                    System.out.print("Ingrese la ciudad donde se realizara el"
                            + " prestamo: ");
                    ciudadPrestamo = scanner.nextLine();
                    
                    System.out.print("Ingrese el nivel de estudio: ");
                    String nivelEstudio = scanner.nextLine();
                    
                    System.out.print("Ingrese el valor de la carrera: ");
                    double valorCarrera = scanner.nextDouble();

                    Persona datosBeneficiario2
                            = new Persona(
                                    nombreBeneficiario,
                                    apellidoBeneficiario,
                                    usuarioBeneficiario);

                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(
                            nivelEstudio, valorCarrera,
                            datosBeneficiario2, tiempoPrestamo,
                            ciudadPrestamo);
                    prestamoEducativo.calcularValorMensual();

                    lista.add(prestamoEducativo);
                    break;
                default:
                    System.out.println("Aqui estan sus Datos,\n"
                            + "Gracias por su Atencion");;
                    break;
            }
        } while (op != 0);

        for (Prestamo prestamo : lista) {
            System.out.println(prestamo);
        }
    }
}