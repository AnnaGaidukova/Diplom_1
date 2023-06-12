package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
public class BunPositiveTest {
    Bun bun = new Bun("Краторная булка N-200i",  2510.00f);
    //тест "названия булок"
    @Test
    public void getNameReturnCorrectBunName() {
        String expectBunName = "Краторная булка N-200i"; //ожидаемое название булки
        String actualBunName = bun.getName(); //актуальное название булки
        Assert.assertEquals(expectBunName, actualBunName); //сравниваем ожидаемое и актуальные названия булок
    }
    //тест "цена булок"
    @Test
    public void getPriceReturnCorrectBunPrice() {
        float expectBunPrice = 2510.00f; // ожидаемая цена булки
        float actualBunPrice = bun.getPrice(); //актуальная цена булки
        Assert.assertEquals(expectBunPrice, actualBunPrice, 0.0); //сравниваем цены булок
    }
}
