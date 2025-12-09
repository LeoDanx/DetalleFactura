import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

            String ss = new Main().pideDescripcion();
            double[] dd = new Main().pideProductos();

            System.out.println(ss);
            System.out.println("Producto 1: $" +dd[0]+"\nProducto 2: $"+dd[1]);



    }

    private double[] pideProductos(){

            double p1=0.0;
            double p2=0.0;

        do {

            System.out.println("Ingresa el precio del producto 1.");
            p1 = sc.nextDouble();

            System.out.println("Ingresa el precio del producto 2.");
            p2= sc.nextDouble();
        }while(p1==0.0 || p2==0.0);

        double arreglo[] = new double[]{p1,p2};

        return arreglo;
    }

    private String pideDescripcion(){
        String s = "";

        do {
            System.out.println("Ingresa la descripcion de la factura.");
            s = sc.nextLine();
        }while(s.isBlank());

        return s;
    }
}