LOCAL_PATH := $(call my-dir)
# C/C++代码所在目录，也就是我们的jni目录，不必修改
		
include $(CLEAR_VARS)
   				
LOCAL_MODULE    := hello
# 对应打包成函数库的名字，编译器会自动在前面加上lib，在后面加上.so
   				
LOCAL_SRC_FILES := hello.c
# 对应c代码的文件 hello.c  
		
include $(BUILD_SHARED_LIBRARY)