import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Locale;

public class MainClassTest extends MainClass {


    @Test
    public void testGetLocalNumber(){
        int expected = 14;
        int actual = getLocalNumber();
        Assertions.assertTrue(expected==actual,"expected !=14");
    }

    @Test
    public void testGetClassNumber(){
        int actual = getClassNumber();
        Assertions.assertTrue(actual>45,"actual возвращает число меньше 45");
    }

    @Test
    public void testGetClassString(){
        String actual = getClassString();
        Assertions.assertTrue(actual.contains("Hello"),"Сторока не содержит Hello");
        Assertions.assertTrue(actual.toLowerCase(Locale.ROOT).contains("hello"),"Строка не содержит hello");


    }
}
