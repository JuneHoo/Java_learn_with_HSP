package DataStructure;

public class SparseArray {
    public static void main(String[] args) {
        int sum = 0;
        int rawArray[][] = new int[11][11];
        rawArray[0][3] = 1;
        rawArray[3][5] = 2;
        for (int i = 0; i < rawArray.length; i++) {
            for (int j = 0; j < rawArray[0].length; j++) {
                if (rawArray[i][j] != 0) {
                    sum++;
                }
            }
        }
        // 初始化稀疏数组 一定呀有3列
        int sparseArray[][] = new int[sum + 1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        // 遍历二维数组 将非0的值放入
        int count = 0;
        for (int i = 0; i < rawArray.length; i++) {
            for (int j = 0; j < rawArray[0].length; j++) {
                if (rawArray[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = rawArray[i][j];
                }
            }
        }

        System.out.println();
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
            System.out.println();
        }
        // SparseArray ---》rawArray
        int rawArray2[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        //
        for (int i = 1; i < sparseArray.length; i++) {
            rawArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }


        for (int i = 0; i < rawArray2.length; i++) {
            for (int j = 0; j < rawArray2[1].length; j++) {
                System.out.print(rawArray2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
