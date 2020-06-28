package shixun;
//3.编写代码，输入一组二维数组，实现二维数组转置输出（行变列，列变行）。
public class test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        int[][] arr=new int[3][4];    //先定义一个二维数组
        for (int i = 0; i < arr.length; i++) {          //循环给二维数组赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=i + j;
            }
        }
        System.out.println("---转置前---");               //打印下二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---转置后---");
        for (int i = 0; i < arr[0].length; i++) {              //将二维数组转置
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(); 
        }

	}

}
