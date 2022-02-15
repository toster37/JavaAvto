import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TriangleTest {

    int a = 5;
    int b = 6;
    int c = 7;
    Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName("Проверка что стороны >0")
    @Tag("Dz4")
    public void assume() {
        assumeTrue(a > 0);
        assumeTrue(b > 0);
        assumeTrue(c > 0);
        logger.info("Проверка что стороны >0");
    }
    @Test
    @DisplayName("Проверка формулы площади треугольника")
    @Tag("Dz4")
    public void areaofTriangleTest() {
        assertEquals(14.696938456699069, Triangle.areaOfTriangle(a, b, c), "площадь не верная");
        assertTrue(Triangle.isTriangle(a, b, c), "Не треугольник");
        assertTrue(Triangle.isTriangle(a, b, c), "Не треугольник");
        assertNotNull(Triangle.areaOfTriangle(a, b, c));
        logger.info("Проверка формулы площади треугольника");
    }



    @Test
    @DisplayName(" Исключение в случае введения string")
    @Tag("Dz4")
    void testException(){
        Assertions.assertThrows(NullPointerException.class, ()-> getException(), "нет исключения");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("rtrt");
        });
        logger.info(" Исключение в случае введения string вместо int ");
    }

    private String getException() throws NullPointerException{
        if(true) throw new NullPointerException();
        return "result";
    }


}


  //  Практическое задание 4 JUnit Geekbrains

//        1.Напишите функцию, вычисляющую площадь треугольника по трём сторонам( int a, int b, int c).Разместите класс
//        с функцией в src/main / java.
//        2.Разместите тесты на эту функцию в классе src / test / java /.../TriangleTest.java.
//        3.Настройте генерацию отчёта и по желанию —логирование.

//        Студент Смирнов Андрей Иванович, 15,02,2022.