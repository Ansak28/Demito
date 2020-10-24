/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AppComprimir {
    public static void CrearArchi(Comprimidor com, String N){
        Archivo ar = com.FArchivo();
        ar.Comprimir(N);
    }

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.- Comprimir en Zip");
        System.out.println("2.- Comprimir en Rar");
        System.out.println("3.- Comprimir en Tgz");
        System.out.println("4.- Salir");
        System.out.print("Elija la opción deseada: ");
        return entrada.nextInt();
    }

    public static void main(String[] args) {
        String archivo = "documento.docx";
        boolean terminado = false;
        do {
            switch (menu()) {
                case 1:
                    CrearArchi(new ComprimidorZip(), archivo);
                    break;
                case 2:
                    CrearArchi (new ComprimidorRar(), archivo);
                    break;
                case 3:
                    CrearArchi ( new ComprimidorTgz(), archivo);
                    break;
                case 4:
                    terminado = true;
                    break;
                default :
                    System.out.println("Arhvivo no soportado");
            }
        } while (!terminado);
    }

}
