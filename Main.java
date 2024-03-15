import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter an expression using only parentheses");
   
        Scanner reader = new Scanner(System.in);
        String expression = reader.nextLine();

        BalanceParentheses balance = new BalanceParentheses();
        balance.balanceParentheses(expression);

        reader.close();

        
     }
}

