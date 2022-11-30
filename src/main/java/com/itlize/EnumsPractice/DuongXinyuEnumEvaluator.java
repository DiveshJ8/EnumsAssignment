package com.itlize.EnumsPractice;

public class DuongXinyuEnumEvaluator {

}

class DuongXinyuEvaluator {

	String input;

	public DuongXinyuEvaluator(String input) {
		// TODO Auto-generated constructor stub

		this.input = input;
	}

	public boolean isDuong() {
		// TODO Auto-generated method stub

		DuongXinyuEnum Duong = DuongXinyuEnum.Duong;
		if (Duong.name().equals(input)) {
			return true;
		}

		return false;
	}

	public boolean isXinyu() {
		// TODO Auto-generated method stub

		DuongXinyuEnum Xinyu = DuongXinyuEnum.Xinyu;
		if (Xinyu.name().equals(input)) {
			return true;
		}

		return false;

	}

}
