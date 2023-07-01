import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {
    private Ingredient ingredient;
    private IngredientType type;
    private String name;
    private float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тип, наименование и цена ингредиента: {0}, {1}, {2}")
    public static Object[][] getData() {
        return new Object[][] {
                {IngredientType.SAUCE, "sauce", 10},
                {IngredientType.SAUCE, "sauce", 12.15f},
                {IngredientType.SAUCE, "nononon", 12.15f},
                {IngredientType.FILLING, "dadada", 30},
                {IngredientType.FILLING, "filling", 20.20f},
        };
    }

    @Before
    public void init() {
        ingredient = new Ingredient(type, name, price);
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Наименование булки не совпадает", name, ingredient.getName());
    }

    @Test
    public void getPriceTest() {
        Assert.assertEquals("Цена булки не совпадает", price, ingredient.getPrice(), 0);
    }

    @Test
    public void getTypeTest() {
        Assert.assertEquals("Ошибка: тип булки не совпадает", type, ingredient.getType());
    }
}
