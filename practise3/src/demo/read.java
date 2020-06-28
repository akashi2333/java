package demo;

import java.io.*;
import java.util.*;


public class read {
    public static boolean writetxt(String str) throws IOException{
        boolean flag = false;
        String filein = str + "\r\n";
        String temp = "";

        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        FileOutputStream fos = null;
        PrintWriter pw = null;
        try {
            // 文件路径
            File file = new File("D:\\java\\practise3\\src\\demo\\dictionary.txt");
            // 将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buf = new StringBuffer();

            // 保存该文件原有的内容
            for (int j = 1; (temp = br.readLine()) != null; j++) {
                buf = buf.append(temp);
                buf = buf.append(System.getProperty("line.separator"));
            }
            buf.append(filein);

            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buf.toString().toCharArray());
            pw.flush();
            flag = true;
        } catch (IOException e1) {
            // TODO 自动生成 catch 块
            throw e1;
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return flag;
    }

    public static List<String> readtxt(){
        List<String> list = new ArrayList<String>();
        try {
            String encoding = "UTF-8";
            File file = new File("D:\\java\\practise3\\src\\demo\\dictionary.txt");
            if (file.isFile() && file.exists()){
                InputStreamReader reader = new InputStreamReader(
                        new FileInputStream(file),encoding
                );
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = null;
                while ((line = bufferedReader.readLine()) != null){
                    list.add(line);
                }
                bufferedReader.close();
                reader.close();
            }else {
                System.out.println("找不到文件");
            }
        }
        catch (Exception e){
            System.out.println("错误");
            e.printStackTrace();
        }
        return list;
    }

    public static void check(String s){
        int i;
        boolean b = false;
        List<String> stringList = readtxt();
        String[] content = String.join("", stringList).split("\\|");
        for(i = 0; i <= content.length - 1; i = i + 5){
            String[] str =content[i + 2].split("\\uff1b");
            for(int j = 0; j <= str.length -1; j++){
                if(str[j].length() == s.length()){
                    b = true;
                }
            }
            if(content[i].equals(s) || ((content[i + 2].indexOf(s) != -1) && b)){
                System.out.println("单词："+content[i]);
                System.out.println("读音："+content[i+1]);
                System.out.println("意思："+content[i+2]);
                System.out.println("例句："+content[i+3]);
                System.out.println("翻译："+content[i+4]);
                break;
            }
        }
        if (i > content.length -1){
            System.out.println("不存在该单词！");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

//        System.out.println("请输入查询的单词：");
//        String word  = sc.nextLine();
//        System.out.println(word);
//        check(word);

        System.out.println("请输入要添加的单词（以|隔开）：");
        String s = sc.nextLine();
        System.out.println(s);
        writetxt(s);
    }
}