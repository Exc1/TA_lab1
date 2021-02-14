package TA_lab1;


import java.util.Scanner;

public class Main {
    public static void main(String[] rgs) throws Exception {
        Scanner firstScan = new Scanner(System.in);
        System.out.println("Введіть перше число у двійковому вигляді:");
        String firstInput = firstScan.nextLine();

        Scanner secondScan = new Scanner(System.in);
        System.out.println("Введіть друге число у двійковому вигляді:");
        String secondInput = secondScan.nextLine();

        try {
            exception(firstInput, secondInput);
            Printer.printAnswer(firstInput, secondInput);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }


    public static void exception(String firstInput, String secondInput) throws Exception {
        if(firstInput.length() == 0 || firstInput.length() > 64 || secondInput.length() == 0 || secondInput.length() > 64){
            throw new Exception("Wrong input");
        }
        for (int i = firstInput.length() - 1; i != -1; i--) {
            if (firstInput.charAt(i) != '0' && firstInput.charAt(i) != '1') {
                throw new Exception("Wrong input");
            }
        }
        for (int i = secondInput.length() - 1; i != -1; i--) {
            if (secondInput.charAt(i) != '0' && secondInput.charAt(i) != '1') {
                throw new Exception("Wrong input");
            }
        }

    }

}