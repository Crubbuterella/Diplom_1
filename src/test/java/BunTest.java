import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Имя булки: {0}, Цена булки: {1}")
    public static Object[][] Data(){
        return new Object[][] {
                {"Белая", 30F},
                {"Черная", 90F},
                {"Азиатская", 63.546F},
                {"Копеечная", 0.252F},
                {"", 0},
                {null, -100500},
                {"Самая длинная булка на свете, с блекджеком и пекарями! С возможность вертикального взлёта и подводной посадкой на титаник!", 1F/3F},
                {"&68379%&#4728512??", Float.MAX_VALUE},
                {"Булка минусова", -Float.MAX_VALUE},
                {"ГДЕ OUT OF MEMORY? Слшком умная булка!", Float.MAX_VALUE + 2F}
        };
    }

    @Test
    public void getNameTest(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void getPriceTest(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(price, bun.getPrice(),0);
    }
}
