package shixun;
//3.��д���룬����һ���ά���飬ʵ�ֶ�ά����ת��������б��У��б��У���
public class test3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        int[][] arr=new int[3][4];    //�ȶ���һ����ά����
        for (int i = 0; i < arr.length; i++) {          //ѭ������ά���鸳ֵ
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=i + j;
            }
        }
        System.out.println("---ת��ǰ---");               //��ӡ�¶�ά����
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---ת�ú�---");
        for (int i = 0; i < arr[0].length; i++) {              //����ά����ת��
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(); 
        }

	}

}
