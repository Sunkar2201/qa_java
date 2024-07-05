package Lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLionKittens {

    @Mock
    Feline feline;

    @Test
    public void quantityOfKittens() throws Exception{
        Lion lion = new Lion("Самец", feline);
        int exception = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        System.out.println("Ожидаемое значение " + actual);
        System.out.println("Фактическое значение " + actual);
        assertEquals(exception, actual);
    }
}