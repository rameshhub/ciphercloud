package cypercloud;

public class Conversion {

	public static void main(String[] args) {
		
		String a="hello",reverse="";
		//String b=null;
		
		//char c[] =a.toCharArray();
		
		
		int len =a.length();
		for(int i=len-1;i>=0;i--){
			
			reverse = reverse + a.charAt(i);
		}
System.out.print(reverse);
	}

}
