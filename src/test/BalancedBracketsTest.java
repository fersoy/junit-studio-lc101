package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(true);
    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void singleBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketsAroundStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void testingDefaultTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void testNullArgument() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(null));
    }

    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void multipleUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }
    @Test
    public void balancedBracketsInStringsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }


}
