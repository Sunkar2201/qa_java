package Lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionGetFood {

    @Mock
    Feline feline;
    //замокали объект типа Feline - пустая болванка

    @Test()
    public void testLionGetFood() throws Exception {
        Lion lionTest = new Lion("Самец", feline);
        /*так как проверяем  Lion, создали для него новый объект,
        так как у объектов типа lion должен быть конструктор - заполнили его,
        вложили в том числе болванку для того, чтобы объект просто создался*/
        List<String> exception = List.of("Животные", "Птицы", "Рыба");
        //переменная exception содержит список ожидаемых данных
        Mockito.when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));
        /*замокали запрашиваемый метод - он дергается через метод getFood - вложили в него данные,
        замокали возвращаемое значение в виде списка*/
        List<String> actual = lionTest.getFood();
        /*переменная actual содержит в себе объект lionTest вызывающий метод getFood
        в нем уже имеются замоканные в 31 строке данные*/
        System.out.println("Ожидаемый результат " + exception);
        System.out.println("Фактический результат " + actual);
        assertEquals(exception, actual);
        //сравнили, что ожидамое значение и пришедшее одинаковые - метод отработал
    }
}