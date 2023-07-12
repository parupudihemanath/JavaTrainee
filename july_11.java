package drucare;

public class july_11 {

	public static void main(String[] args) 
	{
		
		//task1
		System.out.println("task1");
		
		String s="hello all";
		
		for(int x=0;x<s.length();x++)
		{
			System.out.println(s.charAt(x));
		}
		
		//task2
		       System.out.println();
		
				System.out.println("task2");
				
				String s1="hello all";
				
				for(int x=s1.length()-1;x>0;x--)
				{
					System.out.println(s1.charAt(x));
				}
				
				//task3
			       System.out.println();
			
					System.out.println("task3");
					
					String s2="hello all welcome here";
					      char a[] = s2.toCharArray();
					      for(int x=0;x<a.length;x++)
							{
								System.out.println(a[x]);
							}

			    //task4
					System.out.println();
					
				    System.out.println("task4");
							
				    String s3="hello all welcome here";
					          String arr[]= s3.split(" ");
					          for(int x=0;x<arr.length;x++)
								{
									System.out.println(arr[x]);
								}
					          
					        //task5
								System.out.println();
								
							    System.out.println("task5");
										
							    String s4="aebcidxyzou";
							    for(int x=0;x<s4.length();x++)
							    {
							    if(s4.charAt(x)=='a'||s4.charAt(x)=='e'||s4.charAt(x)=='i'||s4.charAt(x)=='o'||s4.charAt(x)=='u')
							    {
							    	System.out.println("vowel"+ " "+  s4.charAt(x));
							    }
							    else if (s4.charAt(x)!='a'||s4.charAt(x)!='e'||s4.charAt(x)!='i'||s4.charAt(x)!='o'||s4.charAt(x)!='u')
							    {
							    	System.out.println("Consonanats"+" "+ s4.charAt(x));
							    }
							    }
								          
							  //task6
								System.out.println();
								
							    System.out.println("task6");
										
							    String s5="madam";
							    String s6 =" ";
								         
								for(int x=s5.length()-1;x>=0;x--)
								   {
									s6= s6+s5.charAt(x);
									 
									}	    
								System.out.println(s6);
	}

}
