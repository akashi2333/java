import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringutils {
	/**
     * 是否可转化为数字
     * @param o
     * @return
     */
    public static boolean isNum(String o) {
        // 根据代码注释补充代码完成函数       根据ASCLL
        for(int i = 0; i < o.length(); i++){
            int chr = o.charAt(i);
            if(chr < 48 || chr > 57){
                return false;
            }
        }
    	return true;
    }
   
    /**
     * 逗号表达式_规范
     * 示例： 
     * 		输入: “,A,B,B,,C"
     * 		输出: "A,B,C"
     * @param commaexpress  逗号表达式  ,A,B,B,,C
     * @return A,B,C
     */
    public static String comma_rect(String commaexpress) {
        // 根据代码注释补充代码完成函数
		String delStr = "";
	    for(int i = 0;i < commaexpress.length();i++){
	        if(commaexpress.charAt(i) != ','){
	            delStr += commaexpress.charAt(i);
	        }
	    }
	    delStr = delStr.replace("", ",");
	    boolean beginIndexFlag = true;
		boolean endIndexFlag = true;
		do{
			int beginIndex = delStr.indexOf(',') == 0 ? 1 : 0;
			int endIndex = delStr.lastIndexOf(',') + 1 == delStr.length() ? delStr.lastIndexOf(',') : delStr.length();
			delStr = delStr.substring(beginIndex, endIndex);
			beginIndexFlag = (delStr.indexOf(',') == 0);
			endIndexFlag = (delStr.lastIndexOf(',') + 1 == delStr.length());
		} while (beginIndexFlag || endIndexFlag);
    	return delStr;
    }
    

    /**
     * 去除字符串中 头和尾的空格，中间的空格保留（不使用String自带的trim方法）
     * 
     * @Title: trim
     * @Description: TODO
     * @return String
     * @throws
     */
    public static String trim(String s) {
        // 根据代码注释补充代码完成函数
        int start = 0;
		int end = s.length() - 1;
		
		//charAt(index) 找到指定下标的字符并返回和空格进行对比
		//如果是空格start就自增，自增副作用在这里也是想要的，这里最后start就是字符串第一个字符的下标
		while(s.charAt(start)==' '){
			start++;
		}
			
		//从字符串尾部依次向前和空格进行对比
		while(s.charAt(end)==' '){
			end--;
		}
    	return s.substring(start,end+1);
    }
    
    /**
     * 得到大括号中的内容（str中有且仅有一对大括号）
     * @param str
     * @return
     */
    public static String getBrackets(String str) {
        // 根据代码注释补充代码完成函数
		Pattern p = Pattern.compile(".+?(\\{.+?\\})");
		Matcher m = p.matcher(str);
		while(m.find()) {
			str = m.group();
		}
		return str;
		
    }
    
    /**
     * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
     * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
	 * 返回所有不常用单词的列表。
	 * 您可以按任何顺序返回列表。
	 * 示例 1：
	 * 		输入：A = "this apple is sweet", B = "this apple is sour"
	 * 		输出：["sweet","sour"]
     * 示例 2：
	 * 		输入：A = "apple apple", B = "banana"
	 * 		输出：["banana"]
	 * 提示：
	 * 		0 <= A.length <= 200
	 * 		0 <= B.length <= 200
	 * 说明: A 和 B 都只包含空格和小写字母。
     * @param A
     * @param B
     * @return
     */
    public static String[] uncommonFromSentences(String A, String B) {
        // 根据代码注释补充代码完成函数
        String[] sa = A.split(" ");
        String[] sb = B.split(" ");
        List<String> all = new ArrayList<String>(Arrays.asList(sa));
        all.addAll(Arrays.asList(sb));
        
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.addAll(all);
        Iterator<String> it = set.iterator();
        
        while(it.hasNext()){
            String temp = it.next();
            if(Collections.frequency(all, temp) == 1){
                list.add(temp);
            }
        }
        return list.toArray(new String[0]);
    }

}
