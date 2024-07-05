package Lion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionSexWithExpected {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)//пометили, что здесь ожидается исключение
    //чтобы тест не упал, получив исключение - мы его ждем
    public void testSexNoName() throws Exception{
        String sexLion = "Алеша";
        boolean expected = false;
        Lion lion = new Lion(sexLion, feline);
        lion.doesHaveMane();
        assertEquals(expected, lion.doesHaveMane());
    }
}
