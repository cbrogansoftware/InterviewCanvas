package com.cbrogansoftware.interviewcanvas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void baselineReturnsBaseline() {
        Printer printer = new Printer();
        assertEquals("Baseline", printer.baseline());
    }
}