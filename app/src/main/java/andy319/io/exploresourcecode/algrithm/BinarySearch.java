package andy319.io.exploresourcecode.algrithm;

/**
 * 描述：二分查找
 * 作者：mady@akulaku.com
 * 时间： 2019/2/26
 */
public class BinarySearch {

    public static void main(String args[]) {
        int[] a = {3, 5, 7, 9, 13, 20};
        int result = search(14, a);
        System.out.println(result + "===");
    }

    /**
     * 普通二分查找
     */
    public static int search(int value, int[] array) {

        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) >> 1); //相当于除以2
            if (array[middle] > value) {
                right = middle - 1;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                return middle;
            }

        }

        return -1;
    }

    /**
     * 查找最先出现的
     * 最先出现的话。则右边届相等的时候要继续搞
     */
    public static int searchFirst(int value, int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) >> 1);
            if (array[middle] >= value) {
                right = middle - 1; //右边界相等继续。因为最先的肯定在左
            } else {
                left = middle + 1;
            }
        }
        return array[right + 1] == value ? right + 1 : -1;
    }
//    如果问题改为查找value最后一次出现的下标呢？只需改动两个位置：
//            1.if (array[middle] >= value)中的等号去掉；
//            2.return中right+1改为left-1。


}
