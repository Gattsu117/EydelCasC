package ui;

import Dol.Numeros;
import Dol.TempConv;

import java.util.Scanner;

public class subMenu implements iMenu{
    Scanner scan = new Scanner(System.in);
    @Override
    public void ShowOpt() {
        int opt;
        System.out.println("1-Número Aleatorio");
        System.out.println("2-Sumar dos Números");
        System.out.println("3-Volver");
        opt = scan.nextInt();
        optSelct( opt);
    }
    public static void test(){
        System.out.println("Print");
        Menu menu = new Menu();
        menu.show();

    }
    public static void tempConv(){
        System.out.println("tempConv");
        TempConv tempc= new TempConv();
        int i = 0;


        tempc.show();

    }
    

    @Override
    public void show() {
        ShowOpt();
    }

    @Override
    public void optSelct(int opc) {
        if(opc ==1) {
            //eligio la opción 1
            double v = Math.random() * 35;
            System.out.println("El npuemro random es =" +v );

            show();
        }else if(opc==2){
           // test2();
            Numeros num = new Numeros();

            num.show();
        }else if(opc==3){
            System.out.println("Volver");
            Menu men = new Menu();
            men.show();

        }else{
            System.out.println("Opcion no valida");
            show();
    }

    }
}
