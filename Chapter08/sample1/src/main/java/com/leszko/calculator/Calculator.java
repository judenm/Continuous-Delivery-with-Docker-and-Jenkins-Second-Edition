package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
* Adding two integers to get the sum
*/
@Service
public class Calculator {
        final static int umlNUMBER1 = 3;
        @Cacheable("sum")
        public int sum(int a, int b) {
                return a + b;
        }
}
