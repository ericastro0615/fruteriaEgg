package principal;

import Servicio.ServiceFruit;
import entidades.FrutaClass;


public class Main {
    public static void main(String[] args) {
        //instancia el obj de SERVICIO para acceder a los metodos del objeto (encapsulamiento)
        ServiceFruit fs = new ServiceFruit ();
        fs.menu ();
    }
}