package Program;

public class IfelseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If Condition
		
		int[] mul= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<mul.length;i++)
		{
			if(mul[i] % 2 ==0)
			{
				System.out.println(mul[i]);
		//for exit the for looop
				break;
		}
			else
			{
				System.out.println(mul[i] + "not multiple of 2");
			}
			}
			}
	}


