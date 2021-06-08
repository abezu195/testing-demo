package md.tekwill;

import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void constructor_whenValidAmountAndValidCurrency_returnsExpectedValues() {
        Money money = new Money(10, Currency.LEU);

        Assert.assertEquals(10, money.getAmount());
        Assert.assertEquals(Currency.LEU, money.getCurrency());
        Assert.assertTrue(money.isMoldavianCurrency());
    }

    @Test
    public void equals_whenTwoObjectsWithEqualFields_returnsTrue() {
        Money money1 = new Money(125, Currency.USD);
        Money money2 = new Money(125, Currency.USD);

        Assert.assertEquals("Expecting that amount and currency is equal for both objects", money1, money2);
    }
}
