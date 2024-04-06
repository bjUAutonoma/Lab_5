/**
 *
 * @author bjuan
 */

import java.util.Scanner;

public class Guia_Semana_5 {
    public static void main(String[] args) {
        Guia_Semana_5.menu();
    }
    public static void menu(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("BIENVENIDO"
                    + "\n\nComo desea operar?"
                    + "\n(1) Contar Digitos"
                    + "\n(2) Suma de Digitos"
                    + "\n(3) Maximo Comun Divisor"
                    + "\n(4) Invertir un Numero"
                    + "\n(5) Finalizar");
            int option = input.nextInt();
            if (option==1){
                System.out.println("\nIngrese el numero a contar:");
                int num = input.nextInt();
                String strNum = Integer.toString(num);
                int count = 0;
                Guia_Semana_5.count(strNum,count);
            }
            if (option==2){
                System.out.println("\nIngrese el numero a sumar:");
                int num = input.nextInt();
                String strNum = Integer.toString(num);
                int count = 0;
                Guia_Semana_5.addition(strNum, count);
            }
            if (option==3){
                System.out.println("\nIngrese el primer numero para el MCD:");
                int num = input.nextInt();
                System.out.println("Ingrese el segundo numero para el MCD:");
                int num_2 = input.nextInt();
                int count = num+num_2;
                Guia_Semana_5.mcd(num,num_2,count);
            }
            if (option==4){
                System.out.println("\nIngrese el numero a invertir:");
                int num = input.nextInt();
                String strNum = Integer.toString(num);
                String reverseNum = "";
                Guia_Semana_5.reverse(strNum, reverseNum);
            }
            if (option==5){
                System.exit(0);
            }
            else{
                System.out.println("\nOPCION INVALIDA\n");
                Guia_Semana_5.menu();
            }
        }
        catch (Exception InputMismatchException) {
            System.out.println("\nERROR\n");
            Guia_Semana_5.menu();
        }
    }
    public static void count(String strNum, int count){
        if (strNum.length()>0){
            count = count+1;
            strNum = strNum.substring(0,strNum.length()-1);
            count(strNum,count);
        }
        else{
            System.out.println("\nEl numero tiene '"+count+"' digitos\n");
            Guia_Semana_5.menu();
        }
    }
    public static void addition(String strNum, int count){
        if (strNum.length()>0){
            //int temp = Integer.parseInt(strNum.substring(strNum.length()-1));
            count = count+(Integer.parseInt(strNum.substring(strNum.length()-1)));
            strNum = strNum.substring(0,strNum.length()-1);
            addition(strNum,count);
        }
        else{
            System.out.println("\nLa suma de los digitos es de: "+count+"\n");
            Guia_Semana_5.menu();
        }
    }
    public static void mcd(int num, int num_2, int count){
        if (num%count!=0 || num_2%count!=0){
            count = count-1;
            mcd(num,num_2,count);
        }
        else{
            System.out.println("\nEl maximo comun divisor entre "+num+" y "+num_2+" es: "+count+"\n");
            Guia_Semana_5.menu();
        }
    }
    public static void reverse(String strNum, String reverseNum){
        if (strNum.length()>0){
            reverseNum = reverseNum+strNum.substring(strNum.length()-1);
            strNum = strNum.substring(0,strNum.length()-1);
            reverse(strNum,reverseNum);
        }
        else{
            System.out.println("\nEl numero invertido es: "+reverseNum+"\n");
            Guia_Semana_5.menu();
        }
    }
}
