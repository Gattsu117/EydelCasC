package Dol;

import ui.Menu;
import ui.iMenu;
import ui.subMenu;

import java.util.Scanner;

public class TempConv implements iMenu {


    public double grados;
   
    private Scanner scan = new Scanner(System.in);
public TempConv(){

}

    @Override
    public void ShowOpt() {

        int opt;
        ///De celcius a farenheit
        //De farenheit a celsius
        //De celsius a kelvin
        //De kelvin a celsius
        //De farenheit a kelvin
        //De kelvin a fareheit
        ///
        //
        System.out.println("1-De celcius a farenheit");
        System.out.println("2-De farenheit a celsius");
        System.out.println("3-De celsius a kelvin");
        System.out.println("4-De kelvin a celsius");
        System.out.println("5-De farenheit a kelvin");
        System.out.println("6-De kelvin a fareheit");
        System.out.println("7-Volver al menu");
        opt = scan.nextInt();
        optSelct(opt);

    }
    public  double kelvintoFahren(double degrees){
        double result = (degrees - 273.15) * 9/5 + 32;
        return result;
    }
    public  double farenheitToKelvin(double degrees){
        double result=0;
        result=degrees-32;
        result*=5;
        result/=9;
        result+=273.15;
        return result;
    }
    public  double KelvinTocentigrades(double degrees){
        double result=0;
        result=degrees-273.15;
        return result;
    }
    public  double centigradesToKelvin(double degrees){
        double result=0;
        result=degrees+273.15;
        return result;
    }
    public  double farenheitToCentigrades(double degrees){
        double result=0;
        result=degrees-32;
        result*=5;
        result/=9;

        return result;
    }
    public static double centigradesToFarenheit(double degrees){
        double result=degrees;
        result=result*2-result/5;
        result=result+32;
        return result;
    }
    @Override
    public void show() {
        System.out.println("Show from Dol.TempConv");
        ShowOpt();
    }

    @Override
    public void optSelct(int opc) {
        //subMenu subM = new subMenu();
        Menu menu = new Menu();
        switch (opc){
            case 1:
               //Opt1
                System.out.println("Ingrese los grados a convertir ");
                setGrados(scan.nextDouble());
                
                System.out.println("el resultado de C a F es ="+centigradesToFarenheit(getGrados()));
                show();
                break;
            case 2:
                System.out.println("Ingrese los grados a convertir ");
                setGrados(scan.nextDouble());
                System.out.println("el resultado de F a C es ="+farenheitToCentigrades(getGrados()));
                show();

            case 3:
                //opt3
                System.out.println("Ingrese los grados a convertir ");
                setGrados(scan.nextDouble());
                System.out.println("el resultado de C a K es ="+centigradesToKelvin(getGrados()));
                show();

                break;
            case 4:
                //opt3
                System.out.println("Ingrese los grados a convertir ");
                setGrados(scan.nextDouble());
                System.out.println("el resultado de K a C es ="+KelvinTocentigrades(getGrados()));
                show();

                break;
            case 5:
                //faren a
                System.out.println("Ingrese los grados a convertir ");
                
                setGrados(scan.nextDouble());
                System.out.println("el resultado de F a K es ="+farenheitToKelvin(getGrados()));
                show();
              
                

                break;
            case 6:
                //Kevin a Faren
                System.out.println("Ingrese los grados a convertir ");
                setGrados(scan.nextDouble());
                System.out.println("el resultado de K a F es ="+kelvintoFahren(getGrados()));
                show();

                break;
            case 7:
                //volver

                menu.show();
                break;
            default:
                System.out.println("Opción no válida.");
                if(opc >=7 ){
                    System.out.println("Opción no válida.");
                    System.out.println("Desea volver al menú principal ó Al convertidor de Temperaturas?\n 1-Menú Principal \n2-Convertidor de Temperatura");
                    opc = scan.nextInt();
                    if(opc ==1){
                        menu.show();
                        System.out.println();
                    } else if (opc==2) {
                        show();
                    }else{

                        System.out.println("Saliendo---");
                        System.exit(0);
                    }

                }else{
                    
                }
                break;
        }
    }
    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        
        this.grados = grados;
    }
}
