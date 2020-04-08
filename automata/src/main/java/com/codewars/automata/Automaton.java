package com.codewars.automata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Automaton {
	
	static String[] states = new String[] {"q1", "q2", "q3"};
	static int[] transitions = new int[] {0, 1};
	static String[][] automata = new String[][] {
		{"q1", "q2"},
		{"q3", "q2"},
		{"q2", "q2"}
	};
	
	public static boolean fit(String[] commands) {
		StringBuilder command = new StringBuilder("");
		for(int i = 0; i < commands.length; i++) {
			command.append(commands[i]);
		}
		Pattern pattern = Pattern.compile("0*1+(0(0|1))?");
		Matcher matcher = pattern.matcher(command);
		
		return matcher.matches();
	}
	
	public static int getPosition(String state) {
		for(int i = 0; i < states.length; i++) {
			if(state.equals(states[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean match(String[] commands) {
		int currentState = 0; // q1 in states
		int start = 0;
		while(start < commands.length) {
			// get the transition
			int transition = Integer.valueOf(commands[start]);
			String state = automata[currentState][transition];
			currentState = getPosition(state);
			start ++;
		}
		return states[currentState].equals("q2") ? true : false;
	}
	
	
	
}
