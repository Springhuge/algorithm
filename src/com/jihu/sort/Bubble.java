package com.jihu.sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 冒泡排序
 * @author jihu
 *
 */
public class Bubble {

	/**
	 * 对数据a中的元素进行排序
	 */
	public static void sort(Comparable[] a) {
		for(int i = 0; i < a.length-1;i++) {
			for(int j = 0;j < a.length-1-i; j++) {
				if (greater(a[j], a[j+1])) {
					exch(a, j, j+1);
				}
			}
		}
	}
	
	/**
	 * 比较v元素是否大于w元素
	 */
	private static boolean greater(Comparable v,Comparable w) {
		return v.compareTo(w)>0;
	}
	
	/**
	 * 数组元素i和j交换位置
	 */
	private static void exch(Comparable[] a,int i,int j) {
		Comparable temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}