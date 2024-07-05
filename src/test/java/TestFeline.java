import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestFeline {

    Feline feline = new Feline();
    //мокать не нужно, так как все методы класса Feline напрямую ни от кого не зависят
    //и не принимают в качестве аргументов объекты других классов
    //класс Feline наследник класса Animal и интерфейса Predator - прямой зависимости нет

    @Test
    public void testFelineGetFamily(){
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittens(){
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testFelineEatMeat() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        System.out.println("Тест testFelineEatMeat. Ожидаемое значение " + expected);
        System.out.println("Тест testFelineEatMeat. Фактическое значение " + actual);
        assertEquals(expected, actual);
    }
}