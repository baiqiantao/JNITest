package com.bqt.hellofromc;

/** 存放native方法的类 */
public class MyNativeMethods {
	private static MyNativeMethods mEmployee;

	private MyNativeMethods() {
	}

	public static MyNativeMethods getInstance() {
		if (mEmployee == null) {
			mEmployee = new MyNativeMethods();
		}
		return mEmployee;
	}

	 //相当于在java代码中定义了一个接口，然后用C语言实现了此接口
	public native String helloFromC();

	public native int passwordFromC(int x, int y);
}