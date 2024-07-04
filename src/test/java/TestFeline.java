import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Spy
    Feline feline;

    @Test
    public void testFelineGetFamily(){
        feline.getFamily();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittens(){
        feline.getKittens();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testFelineEatMeat() throws Exception{
        List<String> expected = feline.getFood("Хищник");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
}