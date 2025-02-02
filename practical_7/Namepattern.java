public class Namepattern{
//7X7 table
    //letter H 
     String patternH(int size ){
        String result = "", symbol = "";
        for(int line = 1;line<=size;line++){
            if(size>=1){
                for(int str = 1;str>0;str--){
                    result += "*";
                }
                if(size/2+1 == line){
                    for(int str = size-2;str>0;str--){
                        result += "*";
                    }
                }else{
                    for(int space = size-2;space>0;space--){
                        result += " ";
                    }
                }
                for(int str = 1;str>0;str--){
                    result += "*";
                }
                result += "\n";
            }
        }
        symbol += result;
        return symbol;
    }
    //letter A 
    String patternA(int size ){
        String result = "",symbol = "";
        for(int line = 1; line<=size;line++){
            if(line ==1){
             for(int star=size;star>0;star--){
                result += "*";
             }
             result +="\n";
            }else{
                if(line>1 && line<=size/2){
                   for(int star=1;star>0;star--){
                    result += "*";
                   }
                   for(int space=size-2;space>0;space--){
                    result += " ";
                   }
                   for(int star =1;star>0;star--){
                    result += "*";
                   }
                   result += "\n";
                }else if( line == size/2+1){
                    for(int star = size;star>0;star--){
                        result += "*";
                    }
                    result += "\n";
                }else{
                    for(int star = 1;star>0;star--){
                        result += "*";
                    }
                    for(int space = size-2;space>0;space--){
                        result += " ";
                    }
                    for(int star=1;star>0;star--){
                        result += "*";
                    }
                    result += "\n";
                }
            }
        }
        symbol+= result;
        return symbol;
    }
    //letter R 
    static int i =0;
    String patternR(int size){
        String result = "" , symbol = "";
        for(int line = 1; line<=size;line++){
            for(int star = 1;star>0;star--){
                result += "*";
            }
            if(line == 1){
                for(int star = size/2+1;star>0;star--){
                    result += "*";
                }
                for(int space = size-(size-2);space>0;space--){
                    result += " ";
                }
                result += "\n";
            }else{
                if(line >1 && line < size/2+1){
                    for(int space = size-size/line;space>0;space--){
                        result += " ";
                    }
                    for(int star=size-(size-1);star>0;star--){
                        result += "*";
                    }
                    result += "\n";
                }else if(line == size/2+1){
                    for(int star = size-2;star>0;star--){
                        result += "*";
                    }
                    for(int space = size-(size-1);space>0;space--){
                        result += " ";
                    }
                    result += "\n";
                }else{
                    for(int space =size/2+i++;space>0;space--){
                        result += " ";
                    }
                    for(int star = size-(size-1);star>0;star--){
                        result += "*";
                    }
                    result += "\n";
                }                
            }
        }
        symbol += result;
     return symbol;
    }
    //letter S 
    String patternS(int size){
        String result = "" , symbol = "";
        for(int line =1 ;line<=size;line++){
            if(line == 1){     
                for(int space=1;space>0;space--){
                    result += " ";
                }
                for(int star =size-line;star>0;star--){
                    result += "*";
                }
                result += "\n";
            }else{
                if(line >1 && line<size/2+1){
                    for(int star = 1;star>0;star--){
                        result += "*";
                    }
                    for(int space = size-1;space>0;space--){
                        result += " ";
                    }
                    result += "\n";
                }else if (line == size/2+1){
                    for(int space = 1;space>0;space--){
                        result += " ";
                    }
                    for(int star = size-2;star>0;star--){
                        result += "*";
                    }
                    for(int space = 1;space>0;space--){
                        result += " ";
                    }
                    result += "\n";
                }else if( line>size/2+1 && line<size){
                    for(int space=size-1;space>0;space--){
                        result += " ";
                    }
                    for(int star=1;star>0;star--){
                        result += "*";
                    }
                    result += "\n";
                }else{
                    for(int star = size-1;star>0;star--){
                        result += "*";
                    }
                    for(int space =1;space>0;space--){
                        result += " ";
                    }
                    result += "\n";
                }
            }
        }
        symbol += result;
        return symbol;
    }
        //letter D
        String patternD(int size){
            String result = "" , symbol ="";
            for(int line = 1 ; line<= size;line++){
                for(int star=1;star>0;star--){
                    result += "*";
                }
                if(line == 1 || line == size){
                    for(int star = size-size/2;star>1;star--){
                        result += "*";
                    }
                    for(int space=size/2-1;space>0;space--){
                        result += " ";
                    }
                    result += "\n";
                }else if(line == 2 || line == size-1){
                    for(int space = size/2+1;space>0;space--){
                        result += " ";
                    }
                    for(int star = size-(size-1);star>0;star--){
                        result += "*";
                    }
                    for(int space = size-(size-1); space>0;space--){
                        result+=" ";
                    }
                    result += "\n";
                }else{
                    for(int space = size - size/2+2;space>0;space--){
                        result += " ";
                    }
                    for(int star = size-(size-1);star>0;star--){
                        result += "*";
                    }
                    result += "\n";
                }
            }
            symbol += result;
             return symbol;
        }
    public static void main(String[] args) {
        Namepattern name = new Namepattern();
        String sizes = "1"; 
        int size = Integer.parseInt(sizes);
        size = (2*size-1)+6;
        System.out.print(name.patternH(size));
        System.out.println();
        System.out.print(name.patternA(size));
        System.out.println();
        System.out.print(name.patternR(size));
        System.out.println();
        System.out.print(name.patternS(size));
        System.out.println();
        System.out.print(name.patternH(size));
        System.out.println();
        System.out.print(name.patternA(size));
        System.out.println();
        System.out.print(name.patternD(size));
    }
}
