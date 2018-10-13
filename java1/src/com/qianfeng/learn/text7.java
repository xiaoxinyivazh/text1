package com.qianfeng.learn;

public class text7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int array[]={46,34,56,12,78,23,45};
	for(int i=0;i<array.length-1;i++){
		for(int j=0;j<array.length-1-i;j++){
			if(array[j]>array[j+1]){
			int num=array[j+1];
			array[j+1]=array[j];
			array[j]=num;
			}
		}
		}
	for(int k=0;k<array.length;k++){System.out.print(array[k]+"  ");}
	}
	}


