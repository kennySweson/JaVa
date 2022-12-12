import java.util.*;
public class Main{
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String sentence = sc.nextLine();

		// 将整个句子转换为小写
		sentence = sentence.toLowerCase();

		// 将每个单词的首字母转换为大写
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
		  String word = words[i];
		  String firstLetter = word.substring(0, 1);
		  firstLetter = firstLetter.toUpperCase();
		  word = firstLetter + word.substring(1);
		  words[i] = word;
		}

		// 将改变后的单词重新组合成句子
		sentence = String.join(" ", words);

		// 输出改变后的句子
		System.out.println(sentence); // 输出: Hello World

		
		
		
		
	}
}
