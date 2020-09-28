import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BodyMassIndexTest {
    @Test
    void testBmiCalc() {
        BodyMassIndex a = new BodyMassIndex(75,186);
        Assertions.assertEquals(23.2, a.bmicalc());
    }
    @Test
    void testBmiCatNormalWeight() {
        BodyMassIndex b = new BodyMassIndex(75,186);
        Assertions.assertEquals("Normal Weight", b.bmicat());
    }
    @Test
    void testBmiCatOverweight() {
        BodyMassIndex b = new BodyMassIndex(70,200);
        Assertions.assertEquals("Overweight", b.bmicat());
    }
    @Test
    void testBmiCatUnderweight() {
        BodyMassIndex b = new BodyMassIndex(80,160);
        Assertions.assertEquals("Underweight", b.bmicat());
    }
    @Test
    void testBmiCatObese() {
        BodyMassIndex b = new BodyMassIndex(57,250);
        Assertions.assertEquals("Obese", b.bmicat());
    }
}
