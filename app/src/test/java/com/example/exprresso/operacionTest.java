package com.example.exprresso;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class operacionTest {
    private operacion mOperacion;

    @Before
    public void setUp() {
        mOperacion = new operacion();
    }

    @Test
    public void operacionNotNull() {
        assertNotNull(mOperacion);
    }

    @Test
    public void suma() throws Exception {
        assertEquals("7", mOperacion.suma("3", "4"));
    }
}