import java.util.Arrays;

public class ARRAYS {

	public static void main(String[] args) {
		int a1[] = new int[] {0,1,2,3,4};     //һά�����ʼ��
		for(int i:a1) {                        //foreach������
			System.out.print(i + ",");
		}
		
		System.out.println();
		int a2[][] = new int[][] {{1,2,3},{2,3,4},{3,4,5}};     //��ά�����ʼ��
/*		for(int j = 0;j < a2.length;j++) {              //��ͨ������
			for(int k = 0;k < a2[j].length;k++) {
				System.out.print(a2[j][k]);
			}
			System.out.println();
		}*/
		int m = 0;                      //foreach������
		for(int x[]:a2) {
			m++;
			int n = 0;
			for(int e:x) {
				n++;
				if(m == a2.length && n == x.length) {
					System.out.print(e);
				}else {
					System.out.print(e + ",");
				}
			}
		}
		
		System.out.println();
		int a3[] = new int[5];     //һά����
		Arrays.fill(a3, 8);               //�������
		for(int j:a3) {                        //foreach������
			System.out.print(j + ",");
		}
		
		System.out.println();
		int a4[] = new int[] {1,2,3,4,5};     //һά�����ʼ��
		Arrays.fill(a4,1,4,8);               //֪��λ��������飬��ʼ����������������
		for(int y:a4) {                        //foreach������
			System.out.print(y + ",");
		}
		
		System.out.println();
		int a5[] = new int[] {10,8,19,9};     //һά����
	    Arrays.sort(a5);                       //�������򣬴�С����
		for(int q:a5) {                        //foreach������
			System.out.print(q + ",");
		}
		
		System.out.println();
		int arr[] = new int[] {12,34,45};
		int newarr1[] = Arrays.copyOf(arr, 5);         //���Ƶ�ָ��λ�ã����㲹0
		for(int p:newarr1) {                        //foreach������
			System.out.print(p + ",");
		}
		System.out.println();
		int newarr2[] = Arrays.copyOfRange(arr,1,3);     //���Ƶ�ָ��λ�ã����㲹0,��ʼ����������������
		for(int o:newarr2) {                        //foreach������
			System.out.print(o + ",");
		}
		
		System.out.println();
		Arrays.parallelSort(arr);                     //����������
		int index = Arrays.binarySearch(arr,0,2,34); //�����ѯ��[0��1��Ϊָ����Χ
		System.out.println(index);              //�����򷵻��±꣬�������򷵻�-1��������±�

	}

}
