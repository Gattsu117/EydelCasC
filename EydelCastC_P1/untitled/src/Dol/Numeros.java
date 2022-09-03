package Dol;

import ui.iMenu;
import ui.subMenu;

import java.util.Scanner;

public class Numeros implements iMenu {
    Scanner scan = new Scanner(System.in);
    public Numeros(){

    }
    public double number1;
    public double getNumber1() {
        return number1;
    }
    public void setNumber1(double number1) {
        this.number1 = number1;
    }
    public double getNumber2() {
        return number2;
    }
    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public double number2;
    

   


    @Override
    public void ShowOpt() {

        System.out.println("Ingresa el número1");
        setNumber1(scan.nextInt());

        System.out.println("Ingresa el número2");
        setNumber2(scan.nextInt());


       
        System.out.println("La suma es" + resultOper(getNumber1(), getNumber2()));
        subMenu subM = new subMenu();


        subM.show();

    }
    private Double resultOper(double num1, double num2){
            double result = num1 + num2;
        
        return result;
    }

    @Override
    public void show() {
        ShowOpt();
    }

    @Override
    public void optSelct(int opc) {

    }
}
