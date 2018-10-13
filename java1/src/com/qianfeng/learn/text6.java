package com.qianfeng.learn;

public class text6 {

	public static void main(String[] args) {
	int array[]={1,2,3,4,5,6,7,8,9,10};
	int num=array[0];
	for(int i=0;i<array.length;i++){
		if(array[i]>num){
			num=array[i];
		}else {
			num=num;
		}
	}
	System.out.println("该数组的最大值是："+num);

	}

}
