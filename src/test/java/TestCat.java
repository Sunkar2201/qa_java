import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Spy
    Feline feline;
    //создали болванку переменной, которая будет заглушкой

    @Test
    public void testSoundCat(){
        Cat cat = new Cat(feline);//так как в объект cat нужен аргумент, поместили в него
        //болванку выше. Иначе бы не сработало
        cat.getSound();
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFoodCat() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        //сделали массив списком
        List<String> actual = cat.getFood();//внесли в переменную массив ответа
        //на метод getFood
        assertEquals(expected, actual);//сравнили их
    }
}