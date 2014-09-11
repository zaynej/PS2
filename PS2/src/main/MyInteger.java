package main;

public class MyInteger {
	private int value;
	public MyInteger (int value)
	{
		this.value = value;
			
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public boolean IsEven()
	{
		return (this.value % 2 == 0);
	}
	
	public boolean IsOdd()
	{
		return (this.value % 2 != 0);
		
	}
	
	public boolean IsPrime(){
		for(int i=2; i<this.value; i++){
			if(this.value % i == 0) 
				return false; 
		}
		return true;
	}
	
	public static boolean IsEven(int value)
	{
		return (value % 2 == 0);
	}
	public static boolean IsOdd(int value)
	{
		return (value % 2 != 0);
		
	}
	public static boolean IsPrime(int value)
	{
		for(int i=2; i<value; i++){
			if(value % i == 0) 
				return false; 
		}
		return true;
	}
	public static boolean IsOdd(MyInteger num){
		return (num.value % 2 != 0);
	}
	
	public static boolean IsEven(MyInteger num){
		return (num.value % 2 == 0);
	}
	
	public static boolean IsPrime(MyInteger num){
		for(int i=2; i <= num.value; i++){
			if(num.value % i == 0){
				return false;	
			}
		}
		return true;
	}
	public boolean equal(int value){
		return (this.value == value);
	}
	
	public static boolean equal(MyInteger num){
		return (num.value == num.value);
	}
	
	public static int parseInt(char[] x) {
		for(int i = 0; i < (x.length -1) ; i++){
			
		}
	return x.length;
	}
	
	public static int parseInt(String s) {
		int num = Integer.parseInt(s);

		return num;
	}
}