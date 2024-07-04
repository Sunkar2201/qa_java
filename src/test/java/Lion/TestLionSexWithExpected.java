package Lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class TestLionSexWithExpected {

    private final String sexLion;
    private final boolean expected;


    public TestLionSexWithExpected(String sexLion, boolean expected){
        this.sexLion = sexLion;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSexNoNameOfLion(){
        return new Object[][]{
                {"Алеша", false}
        };
    }

    @Mock
    Feline feline;

    @Test(expected = Exception.class)//пометили, что здесь ожидается исключение
    //чтобы тест не упал, получив исключение - мы его ждем
    public void testSexNoName() throws Exception{
        Lion lion = new Lion(sexLion, feline);
        lion.doesHaveMane();
        assertFalse(expected);
    }
}
