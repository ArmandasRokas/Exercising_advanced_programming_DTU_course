package uge1_interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStakTest {

    private Stak stak;

    @BeforeEach
    void setUp() {
        stak = new LinkedStak();
    }

    @Test
    void push() {
        stak.push("a");
        stak.push("b");
        stak.push("c");
        assertArrayEquals(new String[]{"c","b","a"}, stak.show());
    }

    @Test
    void push_one_element() {
        stak.push("a");
        assertArrayEquals(new String[]{"a"}, stak.show());
    }

    @Test
    void pop() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void isFull() {
    }

    @Test
    void show_empty_list(){
        assertThrows(UnsupportedOperationException.class,
                ()->{
                    stak.show();
                });
    }
}