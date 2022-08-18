package arrays;


public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray= {"Anil","Sam","Joe","Anee","automation"};
		
		System.out.println("Ii am updating this file");
		boolean findname=false;
		int in=0;
		String s="Sam1";
		for (int i=0;i<strArray.length;i++) {
			if(s.equals(strArray[i]))
		{
			in=i;findname=true; break;
		}
		}
		if(findname)
System.out.println(s  +" string is found at index "+   in);
		else
			System.out.println(s  +" string is not found in the array ");
	}

}
