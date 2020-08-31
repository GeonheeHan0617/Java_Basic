package totalsumavg;
import java.util.Scanner;
public class Total {

	     public static void main(String[] args) {
	           Scanner sc = new Scanner(System.in);
	           
	           try {
	           int score[][] = new int[3][5];
	           String str[] = {"Economic", "Math", "Spanish"};
	           
	           for(int i=0; i<3; i++){
	                for(int j=0; j<3; j++){
	                     System.out.print("No."+(i+1)+" "
	                     		+ "Student/ "+str[j]+" Score : ");
	                     score[i][j] = sc.nextInt();
	                     score[i][3] += score[i][j];
	                    
	                }
	                score[i][4] = score[i][3]/3;
	               
	           }

	           System.out.println("\tEco\tMath\tEsp\tTot\tAvg");
	           for(int i=0; i<3; i++){
	                System.out.print((i+1)+"\t");
	                for(int j=0; j<5; j++){
	                	
	                     System.out.print(score[i][j]+"\t");
	                }
	                System.out.println();
	           }
	         }catch (Exception e ){
	        	 System.out.println("Please enter again ");
	        	 
	         }
	           
	     }
	   
	}






