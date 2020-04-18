package com.jihu.test.sort;

import java.util.ArrayList;
import java.util.Arrays;

import com.jihu.sort.Selection;

public class SelectionTest {

	public static void main(String[] args) {
		//原始数据
		Integer[] a = {4,6,8,7,9,2,10,1};
		
		Selection.sort(a);
		
		System.out.println(Arrays.toString(a));
	}
}
