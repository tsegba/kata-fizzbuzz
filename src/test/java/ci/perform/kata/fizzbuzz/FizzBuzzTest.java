package ci.perform.kata.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void shouldReturn1when1() {
        assertEquals("1", fizzBuzz.generate(1, 1));
    }

    @Test
    void shouldReturn2when2() {
        assertEquals("2", fizzBuzz.generate(2, 2));
    }

    @Test
    void shouldReturnFizzWhen3() {
        assertEquals("Fizz", fizzBuzz.generate(3, 3));
    }

    @Test
    void shouldReturnFizzWhen6() {
        assertEquals("Fizz", fizzBuzz.generate(6, 6));
    }

    @Test
    void shouldReturnFizzWhen9() {
        assertEquals("Fizz", fizzBuzz.generate(9, 9));
    }

    @Test
    void shouldReturnBuzzWhen5() {
        assertEquals("Buzz", fizzBuzz.generate(5, 5));
    }

    @Test
    void shouldReturnSitouWhen7() {
        assertEquals("Sitou", fizzBuzz.generate(7, 7));
    }

    @Test
    void shouldReturnSitouWhen14() {
        assertEquals("Sitou", fizzBuzz.generate(14, 14));
    }

    @Test
    void shouldReturnBuzzWhen10() {
        assertEquals("Buzz", fizzBuzz.generate(10, 10));
    }

    @Test
    void shouldReturnBuzzWhen15() {
        assertEquals("FizzBuzz", fizzBuzz.generate(15, 15));
    }

    @Test
    void shouldReturnBuzzWhen30() {
        assertEquals("FizzBuzz", fizzBuzz.generate(30, 30));
    }

    @Test
    void shouldReturnFizzSitouWhen21() {
        assertEquals("FizzSitou", fizzBuzz.generate(21, 21));
    }

    @Test
    void shouldReturn12FizzWhen1to3() {
        assertEquals("12Fizz", fizzBuzz.generate(1, 3));
    }

    @Test
    void shouldReturn12Fizz4BuzzWhen1to5() {
        assertEquals("12Fizz4Buzz", fizzBuzz.generate(1, 5));
    }

    @Test
    void shouldReturn12Fizz4BuzzFizzSitou8FizzBuzz11Fizz13SitouFizzBuzzWhen1to15() {
        assertEquals("12Fizz4BuzzFizzSitou8FizzBuzz11Fizz13SitouFizzBuzz", fizzBuzz.generate(1, 15));
    }

    @Test
    void shouldReturn12Fizz4BuzzFizzSitou8FizzBuzz11Fizz13SitouFizzBuzz1617Fizz19BuzzFizzSitouWhen1to21() {
        assertEquals("12Fizz4BuzzFizzSitou8FizzBuzz11Fizz13SitouFizzBuzz1617Fizz19BuzzFizzSitou", fizzBuzz.generate(1, 21));
    }

}