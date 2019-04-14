/**
 * User: dceu
 * Date: 4/13/2019
 * Time: 23:00
 */
public class Greedy {


    public static void main(String[] varArgs) {
       /*( if (varArgs.length > 1) {
            CoinCalculator coinCalculator = new CoinCalculator();
            coinCalculator.calculateChange(varArgs[0]);
        }
        throw new IllegalArgumentException("No value given");*/

    	
    	CoinCalculator coinCalculator = new CoinCalculator();
    	if (varArgs.length>0) {
    		coinCalculator.calculateChange(varArgs[0]);
    	}else {
    		throw new IllegalArgumentException("No value given");
    	}
    	   
    }
    
   
    

}
