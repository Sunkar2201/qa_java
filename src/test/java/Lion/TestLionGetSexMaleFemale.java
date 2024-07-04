package Lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionGetSexMaleFemale {

    private final String sexLion;
    private final boolean expected;


    public TestLionGetSexMaleFemale(String sexLion, boolean expected){
        this.sexLion = sexLion;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSexOfLion(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
                /* передаем через параметризацию в конструктор Lion данные - в частности
                туда улетает переменная sexLion
                 */
        };
    }

    @Mock
    Feline feline;
    //замокали объект типа Feline - пустая болванка

    @Test
    public void testSex() throws Exception{
        Lion lion = new Lion(sexLion, feline);
        /*создали обхект класса  Lion. Так как имеет конструктор - заполнили его
        переменной sexLion из параметризованного теста выше
        feline-болванку добавили для отработки конструктора из класса Lion*/
        boolean c = lion.doesHaveMane();
        /*так как в конструкторе класса Lion имеется конструкция if-else,
        дающая для метода doesHaveMane() значение в переменную boolean hasMane
        проверяем этот метод
         */
        System.out.println(c);
        assertEquals(expected,c);
        /*сравниваем ожидаемое значение с помощью переменной конструктора выше и
        полученное из метода lion.doesHaveMane()
         */
    }
}