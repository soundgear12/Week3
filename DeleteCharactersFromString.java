package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	public String removeAllOccurrences(String str, char ch) {
		String cha = Character.toString(ch);
		String s = str.replace(cha, "");
		return s;
		
	}
	
	public void run() {
		System.out.println(removeAllOccurrences("This is a test", 't'));
		System.out.println(removeAllOccurrences("Summer is here!", 'e'));
		System.out.println(removeAllOccurrences("---0---", '-'));
		
	}
	
}
