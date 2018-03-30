package jmodern;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MainTest {
    @Test
    public void testTriple() {
        assertThat(Main.triple("chop"), equalTo("chopchopchop"));
    }
}
