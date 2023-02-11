package m05uf2metodesstring;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilitatsString {

    static Scanner sc = new Scanner(System.in);

    static String[] obtenirArray(String csv) {
        String[] CadenaTroceada;
        String temp;

        CadenaTroceada = csv.split(",");

        for (int i = 0; i < CadenaTroceada.length; i += 2) {

            if (CadenaTroceada[i].compareToIgnoreCase(CadenaTroceada[i + 1]) > 0) {
                temp = CadenaTroceada[i];
                CadenaTroceada[i] = CadenaTroceada[i + 1];
                CadenaTroceada[i + 1] = temp;
            }

        }
        return CadenaTroceada;
    }

    static void imprimir(String[] CadenaTroceada) {
        for (int i = 0; i < CadenaTroceada.length; i += 2) {
            System.out.println(CadenaTroceada[i] + "\t" + CadenaTroceada[i + 1]);
        }

    }

    public static ArrayList<String> ArraylistDoctores(String[] CadenaTroceada) {
        ArrayList<String> doctores = new ArrayList();
        for (int i = 0; i < CadenaTroceada.length; i = +2) {
            if (CadenaTroceada[i].startsWith("Dra")) {
                doctores.add(CadenaTroceada[i]);
            }
        }
        return doctores;
    }

    public static void ImprimirDoctores(ArrayList<String> doctores) {
        System.out.println("Listado de Doctores");
        for (int i = 0; i < doctores.size(); i++) {
            System.out.println(i + 1 + ". " + doctores.get(i));
        }
    }

    public static ArrayList<String> eliminarDoctora(ArrayList<String> doctores) {

        String doctra;

        System.out.println("Dime el nombre de la doctora a eliminar");
        doctra = sc.nextLine();
        for (int i = 0; i < doctores.size(); i++) {

            //if (doctora.equalsIgnorecase(doctores.get(i))) {
            if (doctores.get(i).equalsIgnoreCase(doctra)) {
                doctores.remove(i);
                break;//no se puede repetir asi que una vez encontrado lo borrramos 
            }
        }
        return doctores;

    }
}
