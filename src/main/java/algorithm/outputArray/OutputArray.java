package algorithm.outputArray;

import java.util.Arrays;
import java.util.List;

/**
 * �^����ꂽ�C�ӂ̐��̐��l�ɑ΂��đS���o�͂���.
 * �ċA�Ăяo���̗��K
 * @author �t
 *
 */
public class OutputArray {

	private static final String[] array = {"0","1","2","3","4"};
	private static List<String> str2 = Arrays.asList(array);
	
	/**
	 * �A���S���Y�����s���\�b�h
	 */
	public static void excecute() {
		printChar(str2, "");
		
	}
	
	private static void printChar(List<String> array, String outStr) {
		
		if (array.size() == outStr.length()) {
			System.out.println(outStr);return;
		}
		array.stream().forEach(x ->{ printChar(array, outStr + x);});
	}
}
