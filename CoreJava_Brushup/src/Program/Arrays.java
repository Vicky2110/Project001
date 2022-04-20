package Program;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prime = new int[5];
		prime[0]=1;
		prime[1]=2;
		prime[2]=3;
		prime[3]=5;
		prime[4]=7;
		System.out.println(prime[1] + "This is prime number between 1 to 10");
		
		
		
		int[] prime1 = {11,13,17,19};
		System.out.println(prime1[1] + "This is prime number between 11 to 20");
		
		//For Loop integer array
		
		for(int i = 0; i<prime1.length; i++)
		{
			System.out.println(prime[i]);
		}
		
		//For loop string arrays
		
		String[] name = {"My","named","is","kumar","vicky"};
		for(int i = 0; i<name.length; i++)
		{
			
			System.out.println(name[i]);
		}
		
		//Enhanced For loop
		
		for( String s: name)
		{
			System.out.println(s);
		}
	}

}
