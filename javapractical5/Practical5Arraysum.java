public class Practical5Arraysum{
	static int i = 0;
	public int getSum(int numbers[]){
	  if(i==numbers.length){ //base case
		  return 0;  
	  }else{
		  int sum = numbers[i++] + getSum(numbers);
		  return sum;
	  }
  }
	public static void main(String args[]){
	Practical5Arraysum practical = new Practical5Arraysum();
	int numbers[] = {2,3};
	System.out.println(practical.getSum(numbers));
  }
}
