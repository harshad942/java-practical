public class Practical5{
	public int factorial1(int number){
		if(number<2){
		return 1;
		}else{
		int fact = 1;
		for(int i=number;i>=2;i--){
			fact *=i;
			}
		return fact;
		}
	}
	public int factorial2(int number){
	  if(number<2){
	    return 1;
	  }else{
	    int fact = 1;
	    while(number>=2){
	      fact *= number--;
	    }
	    return fact;
	  }
	}
	public int factorial3(int number){
	  if(number<2){
	    return 1;
	  }else{
	    return number*factorial3(number-1);
	  }
	}
	public static void main(String args[]){
		Practical5 practical = new Practical5();
		System.out.println(practical.factorial1(5));
	}
}
