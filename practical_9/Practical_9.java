public class Practical_9{
    public static int factorial(int num) {
        if(num<2) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static int factorial2(int num) {
        int fact=1;
        for (int i=num;i>0;i--) {
            fact *= i;
        }
        return fact;
    }

    // String Concatenation
    public static String AddString(char s) {
        String str = "";
        str += s;
        return str;
    }

    // StringBuffer Append
    public static StringBuffer AppendStringBuffer(char s) {
        StringBuffer sbf = new StringBuffer("");
        sbf.append(s);
        return sbf;
    }

    // StringBuilder Append
    public static StringBuilder AppendStringBuilder(char s) {
        StringBuilder sb = new StringBuilder("");
        sb.append(s);
        return sb;
    }

    public static void main(String args[]) {
        int num[] = {2,3,5,7,8,10,12,15,17,20};
        long netTimeRec = 0, netTimeIter = 0;
        int iterations = num.length; 
        
        System.out.println("Start Time: " + System.nanoTime());
        // Recursive factorial time
        for (int i=0;i<iterations;i++) {
            long start = System.nanoTime();
            factorial(num[i]);
            long end = System.nanoTime();
            netTimeRec += (end-start);
        }
        System.out.println("End time: " + System.nanoTime());
        System.out.println("Recursive factorial avg time: "+(netTimeRec / iterations));
        System.out.println();
        
        // Iterative factorial time
        System.out.println("Start Time: " + System.nanoTime());
        for (int i=0;i<iterations;i++){
            long start = System.nanoTime();
            factorial2(num[i]);
            long end = System.nanoTime();
            netTimeIter += (end - start);
        }
        System.out.println("End time: " + System.nanoTime());
        System.out.println("Iterative factorial avg time: "+(netTimeIter / iterations));
        System.out.println();

        // String Operations
        String arr = "HARSHADPORAJWAR";
        long timeString = 0, timeStringBuffer = 0, timeStringBuilder = 0;
        int strIterations = arr.length();

        // String Concatenation Time
        System.out.println("Start Time: " + System.nanoTime());
        for (int i =0;i<strIterations;i++) {
            long start = System.nanoTime();
            AddString(arr.charAt(i));
            long end = System.nanoTime();
            timeString += (end - start);
        }
        System.out.println("End time: " + System.nanoTime());
        System.out.println("Concatenation avg time: "+(timeString / strIterations));
        System.out.println();

        // StringBuffer Append Time
        System.out.println("Start Time: " + System.nanoTime());
        for (int i=0;i<strIterations;i++){
            long start=System.nanoTime();
            AppendStringBuffer(arr.charAt(i));
            long end =System.nanoTime();
            timeStringBuffer +=(end - start);
        }
        System.out.println("End time: " + System.nanoTime());
        System.out.println("StringBuffer append avg time: "+(timeStringBuffer / strIterations));
        System.out.println();

        // StringBuilder Append Time
        System.out.println("Start Time: " + System.nanoTime());
        for (int i=0;i<strIterations;i++){
            long start =System.nanoTime();
            AppendStringBuilder(arr.charAt(i));
            long end = System.nanoTime();
            timeStringBuilder += (end - start);
        }
        System.out.println("End time: " + System.nanoTime());
        System.out.println("StringBuilder append avg time: " + (timeStringBuilder / strIterations));
    }
}
