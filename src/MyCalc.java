
public class MyCalc {


	int sum(int a , int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		MyCalc calc = new MyCalc();
		System.out.println("sum is:"+calc.sum(10,20));
		
	}
}