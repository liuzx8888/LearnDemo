
public class HelloWorld {

	
	
	public static void main (String[] args) {
		
		System.out.println("Hello World");
		System.out.println(i);
	 
		int arrNum []=new int [5];
		arrNum [0] =1;
		System.out.println(arrNum [0]);
	    
		printInfo("Hello World11");
		printInfo(6);		
		printInfo((float)6.866666666);			
	
	
	}
	/*
	 * ����
	 */
	
	public static void printInfo (String s) {
		System.out.println("Println "+ s);
		
	}

	
	public static void printInfo (int s) {
		System.out.println("Println "+ s);
		
	}

	public static void printInfo (float s) {
		System.out.println("Println "+ s);
		
	}
	
	/*
	 * 
	 * �ݹ�
	 */
	public static void sum (int i) {
		
		i= i + sum(i);
		i=i--;
		
	}
	
	
	
	
	
}
	
	
	
	

