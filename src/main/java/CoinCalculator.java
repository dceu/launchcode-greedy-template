import java.util.Arrays;

/**
 * User: dceu
 * Date: 4/13/2019
 * Time: 13:51 
 */
public class CoinCalculator {

	public CoinCalculator() {};
    public String calculateChange(String amountOfChange) {
    	System.out.println(amountOfChange);
    	StringBuilder sb = new StringBuilder(amountOfChange.substring(1, amountOfChange.length()));
    	String s = sb.toString();
    	int d = Integer.parseInt(
    			s.substring(0, s.length() - 3));
    	int c = Integer.parseInt(
    			s.substring(
    					s.length() - 2, s.length()));
    	System.out.println("Calculating amount of coins for " + d + " dollars and " 
        		+ c + " cents!");
    	int coins = 0;
    	int halfDollar, dimes, nickels, pennies;
    	int[] coinArray = new int[5];
    	if (d > 0) {
    		coins += d;
    		coinArray[0] = d;
    	}
    	if (c > 50) {
    		halfDollar = 1;
    		coins += halfDollar;
    		c -= 50;
    		coinArray[1] = halfDollar;
    		}
    	
    	if (c > 9) {
    		dimes = c / 10 ;
    		coins += dimes;
    		c = c - (dimes * 10);
    		coinArray[2] = dimes;
    	}
    		
    		
    	
    	if (c > 5) {
    	    nickels = 1;
    		coins += nickels;
    		c -= 5;
    		coinArray[3] = nickels;
    	}
    	
    	pennies = c;
    	coins += pennies;
    	coinArray[4] = pennies;
    		
    	System.out.println("A total of " + coins + " coins are used.");
    	System.out.println(
    	"Coin rolls are as follows: {dollars, half-dollars, dimes, nickels, pennies} "
    	 + "\n" + Arrays.toString(coinArray));
    	return Arrays.toString(coinArray);
    	
}
    
}
