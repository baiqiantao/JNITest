#include <stdio.h>
#include <stdlib.h>
#include <jni.h>//������ӵ�ͷ�ļ�
jstring Java_com_bqt_hellofromc_MyNativeMethods_helloFromC(JNIEnv* env, jobject obj) { //������ֵ�������������������б�����ֵ����jstring����java�е�string

	char* cstr = "hello from c"; //  char*  ��c�п�������ʾһ���ַ�����ע�⣬������Բ���������
	jstring jstr = (*env)->NewStringUTF(env, cstr);
	return jstr;
}

JNIEXPORT jint JNICALL Java_com_bqt_hellofromc_MyNativeMethods_passwordFromC(JNIEnv *env, jobject obj, jint a, jint b) {
	return a + b + 10000; //c�е�intռ���ֽ����ڲ�ͬ�����¿��ܲ�ͬ��������0-65535�����ԣ���΢��һ�������ʮ�򼶱𣩶�����double
}
