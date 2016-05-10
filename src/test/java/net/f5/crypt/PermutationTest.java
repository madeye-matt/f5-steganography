package net.f5.crypt;

import org.junit.Ignore;
import org.junit.Test;

public class PermutationTest {

    private static final String PASSWORD = "abc123";
    private static final int BIG = 30000000;

    /**
     * Permutations were running really slowly - this isn't a test so much as an entry point for profiling
     */
    @Test
    @Ignore
    public void testBigPermutation(){
        final net.f5.crypt.F5Random random = new net.f5.crypt.F5Random(PASSWORD.getBytes());
        final net.f5.crypt.Permutation permutation = new net.f5.crypt.Permutation(BIG, random);
    }
}
