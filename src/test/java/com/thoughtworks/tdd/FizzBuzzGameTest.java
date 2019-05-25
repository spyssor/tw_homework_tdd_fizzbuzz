package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzGameTest {

    private FizzBuzzGame game;

    @BeforeAll
    public void setUp(){
        game = new FizzBuzzGame();
    }

    @Test
    public void should_return_number_when_input_number_is_not_a_multiple_of_3_5_7(){

        String result = game.fizzBuzz(16);

        assertThat(result).isEqualTo("16");

    }

    @Test
    public void should_return_Fizz_when_input_number_is_a_multiple_of_3(){

        String result = game.fizzBuzz(9);

        assertThat(result).isEqualTo("Fizz");

    }

    @Test
    public void should_return_Buzz_when_input_number_is_a_multiple_of_5(){

        String result = game.fizzBuzz(25);

        assertThat(result).isEqualTo("Buzz");

    }

    @Test
    public void should_return_Whizz_when_input_number_is_a_multiple_of_7(){

        String result = game.fizzBuzz(28);

        assertThat(result).isEqualTo("Whizz");

    }

    @Test
    public void should_return_FizzBuzz_when_input_number_is_a_multiple_of_3_and_5(){

        String result = game.fizzBuzz(30);

        assertThat(result).isEqualTo("FizzBuzz");

    }

    @Test
    public void should_return_FizzWhizz_when_input_number_is_a_multiple_of_3_and_7(){

        String result = game.fizzBuzz(21);

        assertThat(result).isEqualTo("FizzWhizz");

    }

    @Test
    public void should_return_BuzzWhizz_when_input_number_is_a_multiple_of_5_and_7(){

        String result = game.fizzBuzz(35);

        assertThat(result).isEqualTo("BuzzWhizz");

    }

    @Test
    public void should_return_FizzBuzzWhizz_when_input_number_is_a_multiple_of_3_5_7(){

        String result = game.fizzBuzz(105);

        assertThat(result).isEqualTo("FizzBuzzWhizz");

    }



}
