public class toxxstring {
    //String dec to octal (String num , String type)  
    public static String decmialtoOctal(String num){
        String oct = num;
        StringBuilder Octal = new StringBuilder("");
        int n = Integer.parseInt(num);
        if (n < 8 && n >= 0) {
            return '0'+num;
        }
        if(n>=8){
            while(n>0){
            // int x = 1;
            int rem = n%8;
            oct = String.valueOf(rem);
            Octal.insert(0,oct);
            n = n/8;
            }
        }else{
            return "not positive number";
        }
        return "O"+Octal.toString();
    }
    //String dec to binary (String num , String type)
    public static String decimaltobinary(String num){
        String bin = num;
        StringBuilder binary = new StringBuilder("");
        int n = Integer.parseInt(num);
        if(n == 1 || n == 0){
            return "0b"+num;
        }
        if(n>1){
            while (n>0) {
                int rem = n%2;
                bin = String.valueOf(rem);
                binary.insert(0, bin);
                n = n/2;
            }
        }else{
            return "not valid number";
        }
        return "0b"+binary.toString();
    }
    //String dec to hexadecimal (String num , String type)
    public static String decimaltohexa(String num){
        String hex = num;
        StringBuilder hexadecimal = new StringBuilder("");
        int n = Integer.parseInt(num);
        if(n>=1 && n<10){
            return "0x"+num;
        }
        if(n>=10){
            while (n>0) {
                int rem = n%16;
                char hexchar = (rem < 10) ? (char) ('0' + rem) : (char) ('A' + (rem - 10));
                hexadecimal.insert(0, hexchar);
                n = n/16;
            }
        }
        return "0x"+hexadecimal.toString();
    }
    //String binary to decimal (String num , String type)
    public static String binarytodecimal(String num){
        String btod = num;
        int k =0 , result , sum = 0;
        for(int i =num.length()-1;i>1;i--){
            int n = Character.getNumericValue(num.charAt(i));
            int power = (int)Math.pow(2, k);
            result = n*power;
            k++;
            sum += result; 
        }
        btod = String.valueOf(sum);
        return btod;
    }
    //String hexadecimal to decimal (String num , String type)
    public static String hexadecimaltodecimal(String num){
        String hextodeci = num;
        int power , k = 0,result = 0 ,sum =0;
        for(int i=num.length()-1;i>1;i--){
            char c = num.charAt(i);
            if (Character.isDigit(c)) {
                result = c - '0'; 
            } else if (Character.isLetter(c)) {
                result = 10 + (Character.toUpperCase(c) - 'A');
            }
            power = (int)Math.pow(16, k);
            sum += result*power;
            k++;
        }
        hextodeci = String.valueOf(sum);
        return hextodeci; //output is in decimal value.
    }
    //String octal to decimal (String num , String type)
    public static String octaltodec(String num){
        int n = Integer.parseInt(num);
        int i =0 , sum =0;
        if(n>=0 && n<8){
            return num;
        }else{
            while(n>0){
                int Ep = (int)Math.pow(8, i);
                int rem = n%10;
                int octa = rem*Ep;
                sum += octa;
                n = n/10;
                i++;
            }
        }    
        return String.valueOf(sum);
    }
    public static void main(String args[]){
        String num = "010";
        String type = "decimal";
        String result;
        String hex = "hexadecimal";
        String oct = "octal";
        String dec = "decimal";
        String bin = "binary";
        if(num.charAt(0)=='0' && num.charAt(1)=='b'){
            if(dec.equalsIgnoreCase(type)){
                System.out.println(binarytodecimal(num));
            }else if(oct.equalsIgnoreCase(type)){
                result = binarytodecimal(num);
                System.out.println(decmialtoOctal(result));
            }else{
                result = binarytodecimal(num);
                System.out.println(decimaltohexa(result));
            }
        }else if(num.charAt(0)=='0'&&num.charAt(1)=='X'){
            if(dec.equalsIgnoreCase(type)){
                System.out.println(hexadecimaltodecimal(num));
            }else if(bin.equalsIgnoreCase(type)){
                result = hexadecimaltodecimal(num);
                System.out.println(decimaltobinary(result));
            }else{
                result = hexadecimaltodecimal(num);
                System.out.println(decmialtoOctal(result));
            }
        }else if(num.charAt(0)=='0'){
            if(bin.equalsIgnoreCase(type)){
                result = octaltodec(num);
                System.out.println(decimaltobinary(result));
            }else if(dec.equalsIgnoreCase(type)){
                System.out.println(octaltodec(num));
            }else{
                result = octaltodec(num);
                System.out.println(decimaltohexa(result));
            }
        }else {
            if(bin.equalsIgnoreCase(type)){
                System.out.println(decimaltobinary(num));
            }else if(oct.equalsIgnoreCase(type)){
                System.out.println(decmialtoOctal(num));
            }else{
                System.out.println(decimaltohexa(num));
            }
        }
    }
}
