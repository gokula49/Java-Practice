import java.util.Scanner;
public class Main
{   
	public static void main(String[] args) {
	    System.out.println("Enter the Total Money");
		submain sub =new submain();
		
	   sub.rotate();	
		
	}

	 static class submain { // System.out.println("Coin count");
		int a= 1,b=2,c=5,d=10,e=20,f=50,g=100,h=200,i=500;
	
         
      int k=0;
	   	Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
	    int l=amount,j=0;
	    	void rotate() {
		    if(l==0){
		         System.out.println(k);

		        return ;
		    }
		    else {
		        if(l>=500) {
		            l=l-500;k++;
		           
		        }
		        else if(l>=200) {
		            l=l-200;k++;
		        }
		        else if(l>=100) {
		            l= l-100;k++;
		        }
		        else if(l>=50) {
		            l=l-50;k++;
		        }
		        else if(l>=20) {
		            l= l-20;k++;
		        }
		        else if(l>=10) {
		            l=l-10;k++;
		        }
		        else if(l>=5) {
		            l= l-5;k++;
		        }
		        else if(l>=2) {
		            l=l-2;k++;
		        }
		        else if(l>=1) {
		            l= l-1;k++;
		        }
		        else {
		            System.out.println("Some thing wrong in this code");
		        }
		        		            
rotate();
		    } 
	}

	  }	   
	
}


