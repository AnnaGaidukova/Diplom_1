package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient firstIngridient, secondIngridient;
    //Проверка добавления булки в бургер
    @Test
    public void setBunToBurger() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }
    //тест добавления ингридиента в бургер
    @Test
    public void addIngredientToBurger() {
        Burger burger = new Burger();
        burger.addIngredient(firstIngridient);
        Assert.assertEquals(firstIngridient, burger.ingredients.get(0));
    }
    //тест удаления ингридиента из бургера
    @Test
    public void removeIngredientFromBurger() {
        Burger burger = new Burger();
        burger.addIngredient(firstIngridient);
        burger.removeIngredient(0);
        Assert.assertTrue(burger.ingredients.isEmpty());
    }
    //тест перетягивания ингридиента в бургер
    @Test
    public void moveIngredientFromBurger() {
        Burger burger = new Burger();
        burger.addIngredient(firstIngridient);
        burger.addIngredient(secondIngridient);
        int expectedIndex = 1;
        burger.moveIngredient(0, 1);
        Assert.assertEquals(expectedIndex, burger.ingredients.lastIndexOf(firstIngridient));
    }
    //тест стоимости бургера
    @Test
    public void getPriceReturnCorrectBurgerPrice() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(firstIngridient);
        burger.addIngredient(secondIngridient);
        float expectedPriceBurger = 6847.00f;
        Mockito.when(bun.getPrice()).thenReturn(1255.00f);
        Mockito.when(firstIngridient.getPrice()).thenReturn(3000.00f);
        Mockito.when(secondIngridient.getPrice()).thenReturn(1337.00f);
        Assert.assertEquals(expectedPriceBurger, burger.getPrice(), 0);
    }
    //тест соберать булочку
    @Test
    public void getReceiptReturnCorrectRecept() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(firstIngridient);
        burger.addIngredient(secondIngridient);
        String exeptRecept = "(==== Краторная булка N-200i ====) \n= sauce Соус Spicy-X =\n= filling Плоды Фалленианского дерева =" +
                "\n(==== Краторная булка N-200i ====)\n\nPrice:3474.00f\n";
        Mockito.when(bun.getName()).thenReturn("Краторная булка N-200i");
        Mockito.when(bun.getPrice()).thenReturn(1255.00f);
        Mockito.when(firstIngridient.getName()).thenReturn("Соус Spicy-X");
        Mockito.when(firstIngridient.getPrice()).thenReturn(90.00f);
        Mockito.when(firstIngridient.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(secondIngridient.getName()).thenReturn("Плоды Фалленианского дерева");
        Mockito.when(secondIngridient.getPrice()).thenReturn(874.00f);
        Mockito.when(secondIngridient.getType()).thenReturn(IngredientType.FILLING);
        Assert.assertEquals(exeptRecept, burger.getReceipt());
    }

    }
