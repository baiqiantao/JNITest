package com.bqt.hellofromc;

/** ���native�������� */
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

	 //�൱����java�����ж�����һ���ӿڣ�Ȼ����C����ʵ���˴˽ӿ�
	public native String helloFromC();

	public native int passwordFromC(int x, int y);
}