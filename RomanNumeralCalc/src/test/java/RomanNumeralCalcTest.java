import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by marsalisqualls on 7/12/17.
 */
public class RomanNumeralCalcTest {
    private RomanNumeralCalc romanNumeralCalc;

    @Before
    public void setup(){
        romanNumeralCalc = new RomanNumeralCalc();
    }

    @Test
    public void romanNumeralCalc_AddOnePlusOneEqualsTwo(){
        assertEquals("II", romanNumeralCalc.add("I", "I"));
    }

    @Test
    public void romanNumeralCalc_AddOnePlusTwoEqualsThree(){
        assertEquals("III", romanNumeralCalc.add("I", "II"));
    }

    @Test
    public void romanNumeralCalc_CommutativityOfAddition_AddOnePlusFiveEqualsSix(){
        assertEquals("VI", romanNumeralCalc.add("I", "V"));
    }

    @Test
    public void romanNumeralCalc_CommutativityOfAddition_AddFivePlusOneEqualsSix() {
        assertEquals("VI", romanNumeralCalc.add("V", "I"));
    }

    @Test
    public void romanNumeralCalc_CommutativityOfAddition_AddFivePlusFiveEqualsTen() {
        assertEquals("X", romanNumeralCalc.add("V", "V"));
    }

    @Test
    public void romanNumeralCalc_CommutativityOfAddition_AddFivePlusFourEqualsNine() {
        assertEquals("IX", romanNumeralCalc.add("V", "IV"));
    }

    @Test
    public void romanNumeralCalc_CommutativityOfAddition_ultimateTest() {
        assertEquals("CXXXVIII", romanNumeralCalc.add("XCIII", "XLV"));
    }
}
