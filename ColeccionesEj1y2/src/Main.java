import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList<>();
        do{
            System.out.print("Ingrese la raza: ");
            String raza = leer.next();
            razas.add(raza);
            System.out.print("Desea seguir ingresando (S/N)? : ");
            String confirmacion = leer.next();
            if(confirmacion.equalsIgnoreCase("N")){
                break;
            }
        }while (true);
        System.out.println(razas);
        Iterator<String> it = razas.iterator();
        boolean encontrado = false;
        System.out.print("Que raza desea eliminar?: ");
        String razaABorrar = leer.next();
        while (it.hasNext()){
            String aux = it.next();
            if (aux.equals(razaABorrar)){
                //razas.sort(Comparadores.ordenarPorNombreAsc);
                razas.remove(razaABorrar);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encuentra dicha raza en el sistema.");
            //razas.sort(Comparadores.ordenarPorNombreAsc);
        }
        razas.sort(Comparadores.ordenarPorNombreAsc);
        System.out.println(razas);

    }
}