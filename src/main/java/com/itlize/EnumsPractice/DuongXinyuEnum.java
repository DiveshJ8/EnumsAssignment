/**
 * 
 */
package com.itlize.EnumsPractice;

/**
 * @author Divesh
 *
 */
public enum DuongXinyuEnum {

	Duong, Xinyu;

	String getCatchPhrase() {
		// TODO Auto-generated method stub

		String s = "Hey, my name is " + this + "!";
		return s;
	}

	boolean isDuong() {
		// TODO Auto-generated method stub

		if (this == Duong)
			return true;
		else
			return false;
	}

	boolean isXinyu() {
		// TODO Auto-generated method stub

		if (this == Xinyu)
			return true;
		else
			return false;
	}
}
