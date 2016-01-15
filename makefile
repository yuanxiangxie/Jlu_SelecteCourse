#
# Made by yuanxiang
# 2016/01/15
#

Complier = javac
Linker = java


HelloWorld.class: HelloWorld.java
	${Complier} $^

.PHONY: HelloWorld
HelloWorld: 
	@ ${Linker} HelloWorld 

.PHONY: clean
clean:
	rm HelloWorld.class
