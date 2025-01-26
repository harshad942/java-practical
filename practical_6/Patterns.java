public class Patterns{
public void displayPattern1(int size){
        //upper part
        for(int ln =1;ln<=size;ln++){
            for(int space = 1;space<=size-ln;space++){
                System.out.print("  ");
            }
            for(int symb=2*ln-1;symb>0;symb--){
                System.out.print("+ ");
            }
            System.out.println();
        }
        //lower part
         for(int ln =1;ln<=size-1;ln++){
            for(int space = 1;space<=ln;space++){
                System.out.print("  ");
            }
            for(int symb=2*size-1-ln;symb>ln;symb--){
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    
    
    public void displayPattern2(int size){
        //upper part
        for(int ln =1;ln<=size;ln++){
            for(int space = 1;space<=size-ln;space++){
                System.out.print("  ");
            }
            for(int symb=2*ln-1;symb>0;symb--){
                if(symb%2!=0){
                    System.out.print("+ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //lower part
         for(int ln =1;ln<=size-1;ln++){
            for(int space = 1;space<=ln;space++){
                System.out.print("  ");
            }
            for(int symb=2*size-1-ln;symb>ln;symb--){
                if((ln%2!=0&&symb%2==0) || (ln%2==0 && symb%2!=0)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    
    public void displayPattern3(int size){
        //upper part
        for(int line =1;line<=size;line++){
            for(int space = size-line;space>0;space--){
                System.out.print("  ");
            }
            for(int symbol = 2*line-1;symbol>0;symbol--){
                if((line%2==0 && symbol%2==0)||(line%2!=0 && symbol%2!=0)){
                    System.out.print("* ");
                }else{
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
        //lower part
        for(int line =1 ;line<=size;line++){
            for(int space = line-1;space>0;space--){
                System.out.print("  ");
            }
            for(int symbol = 2*size-2*line+1;symbol>0;symbol--){
                if(size%2==0){
                    if((line%2!=0 && symbol%2==0)||(line%2==0 && symbol%2 != 0)){
                        System.out.print("+ ");
                    }else{
                        System.out.print("* ");
                    }
                }else{
                    if((line%2!=0 && symbol%2!=0)||(line%2==0 && symbol%2 == 0)){
                        System.out.print("+ ");
                    }else{
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
    Patterns pattern = new Patterns();
    pattern.displayPattern3(5);
    }
}
