import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: dceu
 * Date: 4/13/2019
 * Time: 22:58
 */
public class CoinCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.calculateChange("$3.00");

        assertEquals("[3, 0, 0, 0, 0]" , coinMessage);
    }

    @Test
    public void oneCentShouldGiveYouOnePenny() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.calculateChange("$0.01");

        assertEquals("[0, 0, 0, 0, 1]", coinMessage);
    }

    @Test
    public void tenCentsShouldGiveYouOneDime() {
        CoinCalculator coinCalculator = new CoinCalculator();

        String coinMessage = coinCalculator.calculateChange("$0.10");

        assertEquals("[0, 0, 1, 0, 0]", coinMessage);
    }

}
