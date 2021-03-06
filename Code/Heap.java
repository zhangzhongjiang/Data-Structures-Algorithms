public class Heap {
  private int[] a; // 数组，从下标1开始存储数据
  private int n; // 堆可以存储的最大数据个数
  private int count; // 堆中已经存储的数据个数

  public Heap(int capactiy) {
    a = new int[capactiy + 1];
    n = capacity;
    count = 0;
  }

  public void insert(int data) {
    if (count >= n) {
      // 堆满了
      return;
    }

    ++count;
    a[count] = data;
    int i = count;
    while (i / 2 > 0 && a[i] > a[i / 2]) {
      // 自下向上堆化
      swap(a, i, i / 2); // 交换下标为i 和 i/2的两个元素
      i = i / 2;
    }
  }
}