import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringutils {
	/**
     * �Ƿ��ת��Ϊ����
     * @param o
     * @return
     */
    public static boolean isNum(String o) {
        // ���ݴ���ע�Ͳ��������ɺ���       ����ASCLL
        for(int i = 0; i < o.length(); i++){
            int chr = o.charAt(i);
            if(chr < 48 || chr > 57){
                return false;
            }
        }
    	return true;
    }
   
    /**
     * ���ű��ʽ_�淶
     * ʾ���� 
     * 		����: ��,A,B,B,,C"
     * 		���: "A,B,C"
     * @param commaexpress  ���ű��ʽ  ,A,B,B,,C
     * @return A,B,C
     */
    public static String comma_rect(String commaexpress) {
        // ���ݴ���ע�Ͳ��������ɺ���
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
     * ȥ���ַ����� ͷ��β�Ŀո��м�Ŀո�������ʹ��String�Դ���trim������
     * 
     * @Title: trim
     * @Description: TODO
     * @return String
     * @throws
     */
    public static String trim(String s) {
        // ���ݴ���ע�Ͳ��������ɺ���
        int start = 0;
		int end = s.length() - 1;
		
		//charAt(index) �ҵ�ָ���±���ַ������غͿո���жԱ�
		//����ǿո�start������������������������Ҳ����Ҫ�ģ��������start�����ַ�����һ���ַ����±�
		while(s.charAt(start)==' '){
			start++;
		}
			
		//���ַ���β��������ǰ�Ϳո���жԱ�
		while(s.charAt(end)==' '){
			end--;
		}
    	return s.substring(start,end+1);
    }
    
    /**
     * �õ��������е����ݣ�str�����ҽ���һ�Դ����ţ�
     * @param str
     * @return
     */
    public static String getBrackets(String str) {
        // ���ݴ���ע�Ͳ��������ɺ���
		Pattern p = Pattern.compile(".+?(\\{.+?\\})");
		Matcher m = p.matcher(str);
		while(m.find()) {
			str = m.group();
		}
		return str;
		
    }
    
    /**
     * ������������ A �� B �� ��������һ���ɿո�ָ��ĵ��ʡ�ÿ�����ʽ���Сд��ĸ��ɡ���
     * ���һ������������һ��������ֻ����һ�Σ�����һ��������ȴû�г��֣���ô������ʾ��ǲ������ġ�
	 * �������в����õ��ʵ��б�
	 * �����԰��κ�˳�򷵻��б�
	 * ʾ�� 1��
	 * 		���룺A = "this apple is sweet", B = "this apple is sour"
	 * 		�����["sweet","sour"]
     * ʾ�� 2��
	 * 		���룺A = "apple apple", B = "banana"
	 * 		�����["banana"]
	 * ��ʾ��
	 * 		0 <= A.length <= 200
	 * 		0 <= B.length <= 200
	 * ˵��: A �� B ��ֻ�����ո��Сд��ĸ��
     * @param A
     * @param B
     * @return
     */
    public static String[] uncommonFromSentences(String A, String B) {
        // ���ݴ���ע�Ͳ��������ɺ���
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
