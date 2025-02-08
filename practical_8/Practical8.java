public class Practical8 {
     //pattern 1
     public static void Pattern1(int n , int i){
         if(n==i/2+1){
             PrintStar(n);
             return ;
         }
         PrintStar(n);
         Pattern1(n+1 , i);
         PrintStar(n);
     }
     public static void PrintStar(int n){
         if(n>0){
             System.out.print("*");
             PrintStar(n-1);
             return;
         }
         System.out.println();
     }


     //pattern 2nd 
     public static void pattern2(int space , int size , int star ){
         if(space == 0 && star == size+1 ){
             //center line
             plus(size+1);
             System.out.println();
             return;
         }
         //upper part
         space(space);
         star(star);
         System.out.println();
         pattern2(space-1, size, star+1);
         //lower part
         space(space);
         fslash(star);
         System.out.println();
     }
     public static void plus(int n){
         if(n>0){
             System.out.print("+");
             plus(n-1);
             return;
         }
     }
     public static void star(int n){
         if(n>0){
             System.out.print("*");
             star(n-1);
             return;
         }
     }
     public static void space(int n){
         if(n>0){
             System.out.print(" ");
             space(n-1);
             return;
         }
     }
     public static void fslash(int n){//forward slash
         if(n>0){
             System.out.print("/");
             fslash(n-1);
             return;
         }
     }


     //pattern 3rd
     public static void Patttern3(int space , int line, int star , int size){
         if(space ==0){
             pat3star(size+(size-1));
             System.out.println();
             return;
         }
         Pat3space(space);
         pat3star(2*line-1);
         System.out.println();
         Patttern3(space-1,line+1,2*line-1 ,size);
         Pat3space(space);
         pat3star(2*line-1);
         System.out.println();
     }
     public static void Pattern3plus(int space , int plus , int size ,int line){
         if(line == size+size){
             return;
         }
         Pat3space(space);
         pat3plus(plus);
         System.out.println();
         Pattern3plus(space, plus , size ,line+1);
     }
     public static void Pat3space(int space){
         if(space>0){
             System.out.print(" ");
             Pat3space(space-1);
             return;
         }
     }
     public static void pat3star(int star){
         if(star>0){
             System.out.print("*");
             pat3star(star-1);
             return;
         }
     }
     public static void pat3plus(int plus){
         if(plus>0){
             System.out.print("+");
             pat3star(plus-1);
             return;
         }
     }
    

    public static void main(String[] args) {
        //pattern 1
        // int size = 3;
        // int k =size;
        // size = size - (size-1);
        // Pattern1(size , k*2+1);


        //pattern 2nd
        // int size = 3;
        // int space=size;
        // pattern2(space, size ,size-(space-1));


        //pattern 3rd
         int size = 3;
         int space = size-1;
         Patttern3(space, 1, 1 , size);
         Pattern3plus(space, 1 , size , 1);
    }
}
