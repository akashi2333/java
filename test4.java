package shixun;
//4.дһ��������������øú�����������һ�����󣬿����ҳ����еڶ���������Լ���С�����������������������
public class test4 {
	public static void getSecondMax(int[] arrs) throws Exception {
        if (null == arrs || arrs.length <= 1) {
            throw new Exception("����Ƿ�");
        }
        int max1 = 0, max2 = 0, min = 0; // ������¼���ֵ�͵ڶ����ֵ
        for (int i = 0; i < arrs.length; i++) { // ��������
            if (i == 0) { // ��һ������ֱ�Ӹ�ֵ�����ֵ
                max1 = arrs[i];
                min = arrs[i];
            } else { // �ӵڶ������ݿ�ʼ���бȽ�
            	if (arrs[i] <min) {
            		min = arrs[i];
            	}
                if (arrs[i] == max1) { // �����ֵ��ȣ�����Ҫִ������ģ�ѭ������
                    continue;
                }
                if (arrs[i] > max1) { // ��ǰ���ݴ������ֵ 
                    max2 = max1; // ��max1��ֵ��max2
                    max1 = arrs[i]; // Ϊmax1���¸�ֵ
                } else { // ��ǰ����С�����ֵ
                    max2 = Math.max(max2, arrs[i]); // Ϊmax2���¸�ֵ���Ƚϻ�ȡ�ϴ��ֵ
                }
            }
        }
        System.out.println(max2);
        System.out.println(min);
    }
	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		int arr[] = new int[] {0,1,1,2,3,4};
		test4.getSecondMax(arr);
	}

}
