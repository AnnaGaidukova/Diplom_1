package praktikum;
import praktikum.IngredientType;
import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTest {
    //тест для кол-ва ингридиентов
    @Test
    public void checkIngredientTypeNum() {
        int expectNumberIngredientType = 2;
        int actualNumberIngredientType = IngredientType.values().length;
        Assert.assertEquals(expectNumberIngredientType, actualNumberIngredientType);
    }
    //тест для типа соусы
    @Test
    public void isSauceIngrType() {
        Assert.assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
    }
    //тест для типа наполнители
    @Test
    public void isFillingIngrType() {
        Assert.assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

}