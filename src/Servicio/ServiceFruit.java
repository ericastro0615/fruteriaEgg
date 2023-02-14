package Servicio;

import entidades.FrutaClass;

import java.util.Scanner;

public class ServiceFruit {

    Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );

    public FrutaClass crearFruta() {

        FrutaClass f1 = new FrutaClass ();
        System.out.println ( "Ingrese el nombre de la fruta: " );
        f1.setNombre ( sc.nextLine () );

        System.out.println ( "Ingrese el color de la fruta" );
        f1.setColor ( sc.nextLine () );

        System.out.println ( "Ingrerse la forma de la fruta" );
        f1.setForma ( sc.nextLine () );

        System.out.println ( "Ingrese el peso de la fruta" );
        f1.setPeso ( sc.nextDouble () );

        calcularTamanio ( f1 );


        return f1;
    }

    public void calcularTamanio(FrutaClass f1) {
        if ((f1.getPeso () > 350)) f1.setTamanio ( "Grande" );
        else System.out.println ( "Chica" );
    }

    public void mostrarFruta(FrutaClass f1) {
        System.out.println ( f1.toString () );
    }

    public void menu () {
        //contiene  a todos los metodos
        FrutaClass f1;
        System.out.println ("--creando fruta---");
        f1= crearFruta ();
        System.out.println ("--mostrando fruta--");
        mostrarFruta ( f1 );

    }


}



