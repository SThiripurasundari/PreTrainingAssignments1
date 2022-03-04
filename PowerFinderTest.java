package com.gradle.tutorial;

import com.tutorial.PowerFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
 * This Junit test class helps to test the class which generate
 * exponential value given the base and exponent variables
 *
 * Author -Thiripurasundari
 */
public class PowerFinderTest {

@Test
    public void testing_exponential_values()
    {
        Assertions.assertEquals(8 ,PowerFinder.getExponentialValue(2,3));
        Assertions.assertEquals(9 ,PowerFinder.getExponentialValue(3,2));
        Assertions.assertEquals(25 ,PowerFinder.getExponentialValue(5,2));

    }
}
