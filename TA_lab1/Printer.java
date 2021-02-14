package TA_lab1;

public class Printer {
    public static void printAnswer(String firstInput, String secondInput) {
        if (BinToDec.BinToDec(firstInput)[1] == 1) {
            System.out.println("Перше число:" + firstInput + "=-" + BinToDec.BinToDec(firstInput)[0]);
        } else {
            System.out.println("Перше число:" + firstInput + "=" + BinToDec.BinToDec(firstInput)[0]);
        }
        if (BinToDec.BinToDec(secondInput)[1] == 1) {
            System.out.println("Друге число:" + secondInput + "=-" + BinToDec.BinToDec(secondInput)[0]);
        } else {
            System.out.println("Друге число:" + secondInput + "=" + BinToDec.BinToDec(secondInput)[0]);
        }
        System.out.println("-----------------------------------------------");
        if (BinToDec.checkIfFullDiv(firstInput, secondInput)){
            System.out.println("Числа діляться націло!");
        } else {
            System.out.println("Є остача!");
        }
        System.out.println("-----------------------------------------------");
    }
}
