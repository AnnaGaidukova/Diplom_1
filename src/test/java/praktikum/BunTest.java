package praktikum;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    Bun bun = new Bun("Краторная булка N-200i",  1255.00f);
    //тест "название булок"
    @Test
    public void getNameReturnCorrectBunName() {
        String expectBunName = "Краторная булка N-200i"; //ожидаемое название булки
        String actualBunName = bun.getName(); //актуальное название булки
        Assert.assertEquals(expectBunName, actualBunName); //сравниваем ожидаемое и актуальные названия булок
    }
    //тест "цена булок"
    @Test
    public void getPriceReturnCorrectBunPrice() {
        float expectBunPrice = 1255.00f; // ожидаемая цена булки
        float actualBunPrice = bun.getPrice(); //актуальная цена булки
        Assert.assertEquals(expectBunPrice, actualBunPrice); //сравниваем цены булок
    }
}