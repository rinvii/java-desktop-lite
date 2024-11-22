/**
 * robot.c
 *
 * A file that contains the supporting functions for main() in the
 * ~/robots example source for Software Engineering.
 *
 * @author Tanya L. Crenshaw, Nathan Schmedake, Daman Oberoi, Martin Cenek
 * @since August 2013
 *
 */

#include "robot.h"

/**
 * robotPrintMessage
 *
 * This function prints the message, "I really love robots!"
 *
 * @returns none 
 */
void robotPrintMessage(void)
{
  printf("\n\nI really love robots!\n\n");
  return;
}

/**
 * robotPrintAscii
 *
 */
void robotPrintAscii(void)
{
  printf("\n\n");
  printf("UWR: Unidentified Wheeled Robot\n");
  int round = 0;
  for(int i = 0; i < 3; i++) {
	printBlanks(10, round);
  	printf("     i_i    \n");
	printBlanks(10, round);
	printf("    [x_x]   \n");
	printBlanks(10, round);
	printf("   /|___|\\ \n");
	printBlanks(10, round);
	printf("    d   b   \n");

	round++;
  }
}

/**
 * printBlanks
 *
 */
void printBlanks(int initial, int rounds)
{
  for(int i = 0; i < initial; i++) {
	printf(" ");
  }
  
  for(int j = 0; j < rounds; j++) {
    for(int k = 0; k < initial; k++) {
	printf(" ");
    }
  }
}

/**
 * dalekPrintAscii
 *
 */
void dalekPrintAscii(void)
{
  int i;
  char* blank = "                              ";
  blank = blank +30;
  printf("\n\n"
	 "I am Dalek, from Dr. Who\n"
	 "%s      <----->      \n" 
         "%s     <  (0)  >     \n"        
         "%s     |       |     \n"
         "%s    < ------- >    \n"
         "%s    o         o    \n"
         "%s    o  0  ()  o    \n"
	 "%s   o           o   \n"
   	 "%s o o o o o o o o o \n"
   	 "%s o o o o o o o o o \n"
   	 "%s o o o o o o o o o \n", blank, blank, blank, blank, blank, blank, 
	 blank, blank, blank, blank);
  blank = blank - 10;
}
