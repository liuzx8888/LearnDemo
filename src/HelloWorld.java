
public class HelloWorld {

	static int i=9;
	
	
	public static void main (String[] args) {
		
		System.out.println("Hello World");
		System.out.println(i);
	 
		int arrNum []=new int [5];
		arrNum [0] =1;
		System.out.println(arrNum [0]);
		
	
		int arrNumTwo [][]=new int [5][5];
		for (int i=0;i<arrNumTwo.length;i++ ) {
			for (int j=0;j<arrNumTwo[i].length;j++ ) {			
		  		arrNumTwo[i][j]= i*j;
			
		}
		}

		for (int i=0;i<arrNumTwo.length;i++ ) {
			for (int j=0;j<arrNumTwo[i].length;j++ ) {			
				printInfo (arrNumTwo[i][j])	  ;
			
		  }
		}
		
		printInfo("Hello World11");
		printInfo(6);		
		printInfo((float) .866666666);			
		printInfo(sum(100));
		
		arrNums(1,2,3,4,5,6);
	
	}
	/*
	 * 重载
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
	
	public static void printInfo (int s [][]) {
		System.out.println("Println "+ s);
		
	}
	
	
	/*
	 * 递归
	 */	
    public static int sum (int x) {
    	if (x==0) {
    		return 0;
    	}
    	else {	
		return x + sum(x-1);
    	}
	}
    
    
   /*
    * 
    * 数组的传递应用
    * 
    */
    
    public static void arrNums(int... args) {
    	System.out.println(args.length);
    	
    }
	
	
	
}
	
	
	
	

