package andy319.io.exploresourcecode.review2020;

/**
 * author : AndyMa
 * date : 2020/5/16 19:58
 * description :
 */
public class QuickSort {
    static int array[] = {100, 9, 3, 4, 5, 1, 2, 6, 7, 90, 56, 4, 33};

    public static void main(String[] args) {
        quickSort(0, array.length - 1);
        for (int value : array) {
            System.out.println(value);
        }
    }

    private static void quickSort(int left, int right) {
        //两次交换，一次是基准数左侧与右侧数字的交换。另一次是基准与中间某个值（一个从左边比较
        // 一个从右边比较，当i=j时，即这个位置该是基准的位置）的交换
        //递归结束条件
        if (left > right) {
            return;
        }
        int i, j, t;
        int pivot;//基准
        i = left;
        j = right;
        pivot = array[left];
        while (i != j) {
            while (array[j] >= pivot && i < j) { //找一个右边小与基准的（用于跟左边交换）
                j--;
            }
            while (array[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
                t = array[i];
                array[i] = array[j];
                array[j] = t;
            }

        }//i=j,表示已经把基准左右该交换的值都交换了
        //将基准放在i处，即基准的左边都比基准小，右边都比基准大
        array[left] = array[i];
        array[i] = pivot;
        //这样基准的左侧需要像刚才一样操作。右边也是
        quickSort(left, i - 1);
        quickSort(i + 1, right);
    }
}
