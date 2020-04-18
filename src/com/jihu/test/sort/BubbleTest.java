package com.jihu.test.sort;

import java.util.Arrays;

import com.jihu.sort.Bubble;

public class BubbleTest {
	
	public static void main(String[] args) {
		Integer[] arr = {4,5,6,3,2,1};
		
		Bubble.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	
}
