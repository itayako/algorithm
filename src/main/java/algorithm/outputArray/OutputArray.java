package algorithm.outputArray;

import java.util.Arrays;
import java.util.List;

/**
 * 与えられた任意の数の数値に対して全件出力する.
 * 再帰呼び出しの練習
 * @author 衡
 *
 */
public class OutputArray {

	private static final String[] array = {"0","1","2","3","4"};
	private static List<String> str2 = Arrays.asList(array);
	
	/**
	 * アルゴリズム実行メソッド
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
