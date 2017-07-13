import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by marsalisqualls on 7/13/17.
 */
public class RomanNumeralTest {
    private RomanNumeral romanNumeral;

    @Before
    public void setup(){
        romanNumeral = new RomanNumeral();
    }

    @Test
    public void romanNumeral_ConvertToRoman_ConvertToRomanMethodShouldReturnI_WhenGiven1(){
        assertEquals("I", romanNumeral.convertToRoman(1));
    }

    @Test
    public void romanNumeral_ConvertToRoman_ConvertToRomanMethodShouldReturnIII_WhenGiven3(){
        assertEquals("III", romanNumeral.convertToRoman(3));
    }

    @Test
    public void romanNumeral_ConvertToRoman_ConvertToRomanMethodShouldReturnV_WhenGiven5(){
        assertEquals("V", romanNumeral.convertToRoman(5));
    }

    @Test
    public void romanNumeral_ConvertToRoman_ConvertToRomanMethodShouldReturnIV_WhenGiven4(){
        assertEquals("IV", romanNumeral.convertToRoman(4));
    }

    @Test
    public void romanNumeral_ConvertToRoman_ConvertToRomanMethodShouldReturnX_WhenGiven10(){
        assertEquals("X", romanNumeral.convertToRoman(10));
    }

    @Test
    public void romanNumeral_ConvertToRoman_ConvertToRomanMethodShouldReturnIX_WhenGiven9(){
        assertEquals("IX", romanNumeral.convertToRoman(9));
    }

    @Test
    public void romanNumeral_ConvertToArabic_ConvertToArabicMethodShouldReturn1_WhenGivenI(){
        assertEquals(1, romanNumeral.ConvertToArabic("I"));
    }

    @Test
    public void romanNumeral_ConvertToArabic_ConvertToArabicMethodShouldReturn3_WhenGivenIII(){
        assertEquals(3, romanNumeral.ConvertToArabic("III"));
    }

    @Test
    public void romanNumeral_ConvertToArabic_ConvertToArabicMethodShouldReturn5_WhenGivenV(){
        assertEquals(5, romanNumeral.ConvertToArabic("V"));
    }

    @Test
    public void romanNumeral_ConvertToArabic_ConvertToArabicMethodShouldReturn4_WhenGivenIV(){
        assertEquals(4, romanNumeral.ConvertToArabic("IV"));
    }

    @Test
    public void romanNumeral_ConvertToArabic_ConvertToArabicMethodShouldReturn10_WhenGivenX(){
        assertEquals(10, romanNumeral.ConvertToArabic("X"));
    }

    @Test
    public void romanNumeral_ConvertToArabic_ConvertToArabicMethodShouldReturn9_WhenGivenIX(){
        assertEquals(9, romanNumeral.ConvertToArabic("IX"));
    }

    @Test
    public void ultimateTest(){
        assertEquals(1989, romanNumeral.ConvertToArabic("MCMLXXXIX"));
        assertEquals("MCMLXXXIX", romanNumeral.convertToRoman(1989));
    }
}
