package praktikum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunNegativeTest {
    private final String expectBunName;
    private final float expectedBunPrice;

    public BunNegativeTest(String expectedName, float expectedPrice) {
        this.expectBunName = expectedName;
        this.expectedBunPrice = expectedPrice;
    }
    @Parameterized.Parameters(name = "Тестовые данные: name=\"{0}\", price={1}")
    public static Object[][] getBun() {
        return new Object[][]{
                {"", -100.50f},
                {null, 0},
                {"1234567890", 0.05f},
                {"тест тест", 100.00f},
                {"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", Float.MAX_VALUE},
                {"!@#$%^&*/:'=+-?<> _|();\"~`.,", 100},
        };
    }
    @Test
    public void testGetBunName() {
        Bun bun = new Bun(expectBunName, expectedBunPrice);
        String actualName = bun.getName();
        assertEquals("Метод getBunName возвращает неверное значение", expectBunName, actualName);
    }
    @Test
    public void testGetBunPrice() {
        Bun bun = new Bun(expectBunName, expectedBunPrice);
        float actualPrice = bun.getPrice();
        assertEquals("Метод getBunPrice возвращает неверное значение", expectedBunPrice, actualPrice, 0.0);
    }
}