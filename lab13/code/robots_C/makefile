# This is a makefile for ./robots
# Author: Tanya L. Crenshaw, Martin Cenek
CC=gcc


robots.out:	main.c robot.o robot.h
	$(CC) -o robots.out main.c robot.o

robot.o:	robot.c robot.h
	$(CC) -c robot.c

clean: 
	/bin/rm -f *.out *.o
