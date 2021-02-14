package TA_lab1;


public class BinToDec {
    public static boolean checkIfFullDiv(String firstScan, String secondInput){
        if (BinToDec(firstScan)[0] % BinToDec(secondInput)[0] == 0){
            return true;
        }
        return false ;
    }

    public static StringBuffer convertToNormal(StringBuffer line) {
        for (int i = line.length() - 1; i != -1; i--) {
            if (line.charAt(i) == '0' & i !=0) {
                line.setCharAt(i, '1');
            } else {
                line.setCharAt(i, '0');
                break;
            }
        }
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '0') {
                line.setCharAt(i, '1');
            } else {
                line.setCharAt(i, '0');
            }
        }
        return line;
    }

    public static long[] BinToDec(String inputLine) {
        StringBuffer line = new StringBuffer(inputLine);
        long hasMin = 0;
        if (line.charAt(0) == '1' & line.length() == 64){
            line = convertToNormal(line);
            hasMin = 1;
        }
        String s = line.toString();
        int degree = s.length() - 1;
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                ans += Math.pow(2, degree);
            }
            degree--;
        }
        long[] res = new long[] {ans, hasMin };
        return res;
    }

}
