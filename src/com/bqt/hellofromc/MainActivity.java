package com.bqt.hellofromc;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.ListActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
	static {
		System.loadLibrary("hello");// 在java代码中引入libs目录下的库函数，文件名为【libhello.so】。注意，引入时的文件名要去掉前面的lib和后面的.so		
	}
	private TextView tv_info;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] array = { "调用C中的无参方法，返回一个字符串", "调用C中的有参方法，返回处理1+2后的值", };

		tv_info = new TextView(this);
		tv_info.setTextColor(Color.BLUE);
		tv_info.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
		tv_info.setPadding(20, 10, 20, 10);
		getListView().addFooterView(tv_info);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new ArrayList<String>(Arrays.asList(array))));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position) {
		case 0:
			String stringFromC = MyNativeMethods.getInstance().helloFromC();
			tv_info.setText(stringFromC);
			break;
		case 1:
			int intFromC = MyNativeMethods.getInstance().passwordFromC(1, 2);
			tv_info.setText(intFromC+"");
			break;
		}
	}
}