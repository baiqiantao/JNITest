APP_ABI := armeabi armeabi-v7a x86
#Application.mk文件的目的是，描述在你的应用程序中所需要的模块(即静态库或动态库)
#APP_ABI 的值以空格区分，代表要支持的架构，默认为【armeabi】。其他架构，ARMv7 【armeabi-v7a】；IA-32 【 x86】
#每增加一个架构，编译后都会在lib目录下生成一个相应的文件夹，文件夹下的文件都是同名的.so文件（当然文件内容不一样）