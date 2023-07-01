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
                {"Черная", 33F},
                {"Азиатская", 63F}
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
