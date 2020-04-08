package com.codewars.automata;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AutomatonTest {

	@Test
	public void fitTest() {
		assertTrue(Automaton.match(new String[] {"1", "0", "0", "1"}));
	}
	
	
}
