package Day4_Assignments;

/*** Java program to print the Frequency of Element ***/

public class FrequencyOfElement {

	public static void main(String[] args) {
		
		int n1[] = {1,2,3,4,4,3,1};
		int n2[] = new int[n1.length];
		int visit=-1;
		
		for(int i=0;i<n1.length;i++)
		{
			int count =1;
			for(int j =i+1;j<n1.length;j++)
			{
				if(n1[i]==n1[j])
				{
					count++;
					n2[j]=visit;
				}
			}
			 if(n2[i] != visit)  
	                n2[i] = count;  
			
		}
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < n2.length; i++){  
            if(n2[i] != visit)  
                System.out.println("    " + n1[i] + "    |    " + n2[i]);  
        }  
        System.out.println("----------------------------------------");  

	}

}