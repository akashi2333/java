import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
public class FileTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File file = new File("word.txt");
//		if(file.exists()) {
//			file.delete();
//			System.out.println("�ļ���ɾ��");
//		}else {
//			try {
//				file.createNewFile();
//				System.out.println("�ļ��Ѵ���");
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//		}
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte buy[] = "����һͷСë¿���Ҵ���Ҳ���".getBytes();
			out.write(buy);
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream in = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = in.read(byt);
			System.out.println("�ļ��е���Ϣ��"+new String(byt,0,len));
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
