#include <stdio.h>
#include <stdlib.h>
#include <jni.h>//必须添加的头文件
jstring Java_com_bqt_hellofromc_MyNativeMethods_helloFromC(JNIEnv* env, jobject obj) { //【返回值】【方法名】【参数列表】返回值类型jstring就是java中的string

	char* cstr = "hello from c"; //  char*  在c中可用来表示一个字符串。注意，这里绝对不能有中文
	jstring jstr = (*env)->NewStringUTF(env, cstr);
	return jstr;
}

JNIEXPORT jint JNICALL Java_com_bqt_hellofromc_MyNativeMethods_passwordFromC(JNIEnv *env, jobject obj, jint a, jint b) {
	return a + b + 10000; //c中的int占用字节数在不同环境下可能不同，可能是0-65535，所以，稍微大一点的数（十万级别）都得用double
}
