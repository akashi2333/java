import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class FileTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file = new File("word.txt");
//		if(file.exists()) {
//			file.delete();
//			System.out.println("文件已删除");
//		}else {
//			try {
//				file.createNewFile();
//				System.out.println("文件已创建");
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//		}
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "我有一头小毛驴，我从来也不骑。".getBytes();
			out.write(buy);
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println("文件中的信息："+new String(byt,0,len));
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
