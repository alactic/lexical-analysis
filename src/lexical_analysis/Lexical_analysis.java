/**
 NAME: OKAFOR ECHEZONA ELVIS
 REG NO: 2012/181569
 COURSE: COS461
 DEPT: COMPUTER SCIENCE
 **/

package lexical_analysis;
import java.util.*;
    	
public class Lexical_analysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	String[] keywords={"if", "else", "writeIn", "end", "for", "while", "sandra"};
		String[] identifier={"age", "underaged", "Adult", "maximum", "sentence", "count" , "sandra"};
        String[] operator={"%", "+", "-", "/", "*", "="};
        String[] symbols={"(", ")", "\"", ">", "<",";"};
		String[] literal={"0", "1", "2", "3", "4","18"};		
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String st=input.nextLine();
        int count=0;
		int ident_count=0;
		int keywords_count=0;
		int literal_count=0;
		int operator_count=0;
                int symbols_count=0;
		int count2=0;
		int count3=0;
        StringTokenizer stk=new StringTokenizer(st," ");
        while(stk.hasMoreTokens()){
            String token=stk.nextToken();
            System.out.println(token);
			for(int i=0; i<6; i++)
			{
			if(token.equals(identifier[i])){
				ident_count++;
				System.out.println("identifier: "+token);
			}else if(token.equals(operator[i])){
				operator_count++;
				System.out.println("operator:   "+token);
			}else if(token.equals(literal[i])){
				literal_count++;
				System.out.println("literal:    "+token);
			}else if(token.equals(keywords[i])){
				keywords_count++;
				System.out.println("keywords:   "+token);
			}else if(token.equals(symbols[i])){
				symbols_count++;
				System.out.println("symbols:   "+token);
                        }
			//System.out.println("Words are: "+token);
            count++;
        }
		}
        System.out.println("\nidentifier count: "+ident_count);
		System.out.println("operator count:   "+operator_count);
		System.out.println("literal count:    "+literal_count);
		System.out.println("keywords count:   "+keywords_count);
                System.out.println("symbols count:   "+symbols_count);
		}
}
   
