LOCAL_PATH := $(call my-dir)
# C/C++��������Ŀ¼��Ҳ�������ǵ�jniĿ¼�������޸�
		
include $(CLEAR_VARS)
   				
LOCAL_MODULE    := hello
# ��Ӧ����ɺ���������֣����������Զ���ǰ�����lib���ں������.so
   				
LOCAL_SRC_FILES := hello.c
# ��Ӧc������ļ� hello.c  
		
include $(BUILD_SHARED_LIBRARY)