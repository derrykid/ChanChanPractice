package derry.club;

import org.example.MethodPractice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTesting {

    @Test
    void addition() {
        int result = MethodPractice.addition(7, 11);

        Assertions.assertEquals(18, result);
    }

    @Test
    void multiplication() {
        int result = MethodPractice.multiplyNumbers(6, 11);

        Assertions.assertEquals(66, result);
    }
}
