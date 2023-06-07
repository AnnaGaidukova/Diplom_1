package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class IngredientTest {
    @Parameterized.Parameters
    public static Object[][] getIngridientData() {
        return new Object[][]{
                {IngredientType.SAUCE, "Соус традиционный галактический", 15.00f},
                {IngredientType.FILLING, "Хрустящие минеральные кольца", 300.00f},
        };
    }
    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
    //тест стоимости ингридиентов
    @Test
    public void getCorrectPriceIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(price, ingredient.getPrice(), 0);
    }
    //тест наименования ингридиентов
    @Test
    public void getCorrectNameIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(name, ingredient.getName());
    }
    //тест типа ингридиента
    @Test
    public void getCorrectTypeIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(type, ingredient.getType());
    }
}