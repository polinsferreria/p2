package m05uf2metodesstring;

import java.util.ArrayList;

public class M05UF2MetodesString {

    public static void main(String[] args) {
        // VARIABLES
        String[] CadenaTroceada;
        ArrayList <String> doctores;
        String csv
                = "Sr. Jimenez,Dra. Garcia,Dr. Ruiz,Sra. Gonzalez,Dra. Hernandez,"
                + "Sr. Rodriguez,Sr. Diaz,Dr. Fernandez,Dra. Moreno,Sr. Lopez,"
                + "Sra. Muñoz,Dra. Martinez,Dr. Alvarez,Sr. Sanchez,Dra. Romero,"
                + "Sra. Perez,Sr. Alonso,Dr. Gomez,Sra. Gutierrez,Dr. Martin,"
                + "Dra. Navarro,Sr. Torres";
        
        //RESULTADO
        CadenaTroceada = UtilitatsString.obtenirArray(csv);
        UtilitatsString.imprimir(CadenaTroceada);
        
        //ArrayList<Integer> doctoras = new ArrayList<Integer>(); //Un array sin tamaño de longitud
        //doctors(UtilitatsString.doctoras(CadenaTroceada,doctoras));
        //for (int i = 0; i < CadenaTroceada.length; i++) {}
        doctores = UtilitatsString.ArraylistDoctores(CadenaTroceada);
        
        System.out.println("");
        
        UtilitatsString.ImprimirDoctores(doctores);
        
        doctores = UtilitatsString.eliminarDoctora(doctores);
        
    }

}
