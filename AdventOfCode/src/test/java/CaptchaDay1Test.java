import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaptchaDay1Test {

    @Before
    public void setUp() {
    }

    @Test
    public void testCaptcha1() {
        String captcha = "1122";
        int expected = 3;
        assertEquals(expected, CaptchaDay1.inverseCaptcha(captcha));
    }

    @Test
    public void testCaptcha2() {
        String captcha = "1111";
        int expected = 4;
        assertEquals(expected, CaptchaDay1.inverseCaptcha(captcha));
    }

    @Test
    public void testCaptcha3() {
        String captcha = "91212129";
        int expected = 9;
        assertEquals(expected, CaptchaDay1.inverseCaptcha(captcha));
    }

    @Test
    public void test1CaptchaPt2() {
        String captcha = "1212";
        int expected = 6;
        assertEquals(expected, CaptchaDay1.inverseCaptchaPt2(captcha));
    }

    @Test
    public void test2CaptchaPt2() {
        String captcha = "1221";
        int expected = 0;
        assertEquals(expected, CaptchaDay1.inverseCaptchaPt2(captcha));
    }

    @Test
    public void test3CaptchaPt2() {
        String captcha = "123425";
        int expected = 4;
        assertEquals(expected, CaptchaDay1.inverseCaptchaPt2(captcha));
    }

    @Test
    public void test4CaptchaPt2() {
        String captcha = "123123";
        int expected = 12;
        assertEquals(expected, CaptchaDay1.inverseCaptchaPt2(captcha));
    }

    @Test
    public void test5CaptchaPt2() {
        String captcha = "12131415";
        int expected = 4;
        assertEquals(expected, CaptchaDay1.inverseCaptchaPt2(captcha));
    }
}