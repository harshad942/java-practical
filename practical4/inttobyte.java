public class inttobyte{
    //int getbyte(int num)
    public static int getbyte(int num){
       int ByteValue = num % 256;
        if(ByteValue > 127){
            ByteValue  -= 256;
        }
        if(ByteValue < -128){
            ByteValue += 256;
        }
        return ByteValue;
    }

    //int getShort(int num)
    public static int getShort(int num){
        int ShortValue = num%65536;
        if(ShortValue > 32767){
            ShortValue -= 65536; 
        }
        if(ShortValue < -32768){
            ShortValue += 65536;
        }
        return ShortValue;
    }

    //int getnumber(int num , String type)
    public static int getNumber(int num , String type){
        String b ="byte";
        String s = "short";
        if(b.equalsIgnoreCase(type)){
            return getbyte(num);
        }else if(s.equalsIgnoreCase(type)){
            return getShort(num);
        }else{
            System.out.println("not valid type");
            return num;
        }
    }

    public static void main(String[] args) {
        int num = 246;
        String type = "shorT";
        System.out.println(getNumber(num, type));
    }
}
