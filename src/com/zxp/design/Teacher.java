package com.zxp.design;

public class Teacher extends AbstarctPerson{

	protected void dressUp() {
		System.out.println("穿工作服");
	}

	protected void eatBreakfast() {
		System.out.println("做早饭，照顾孩子吃早饭");
	}

	protected void takeThings() {
		System.out.println("带上昨晚准备的考卷");
	}

}
