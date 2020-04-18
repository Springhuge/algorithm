package com.jihu.sort;

/**
 * 选择排序
 * @author jihu
 *
 */
public class Selection {

	/**
	 * 对数据a中的元素进行排序
	 */
	public static void sort(Comparable[] a) {
		for(int i =0; i < a.length-1;i++) {
			//定义一个变量 记录最小元素所在的索引 默认为参与选择排序的第一个元素所在的位置
			int minIndex = i;
			for(int j = i+1;j < a.length; j++) {
				//需要比较最小索引minIndex和j索引的值；
				if(greater(a[minIndex], a[j])) {
					minIndex = j;
				}
			}
			//交换最小元素所在索引minIndex 和 索引所在i的值
			exch(a, i, minIndex);
		}
	}

	/**
	 * 比较v元素是否大于w元素
	 */
	private static boolean greater(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}

	/**
	 * 数组元素i和j交换位置
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
