/**
 * robot.c
 *
 * A file that contains the function prototypes for main() in the
 * ~/robots example source for Software Engineering.
 *
 * @author Tanya L. Crenshaw, Martin Cenek
 * @since August 2013
 *
 */

#include <stdio.h>

// These preprocessor commands are necessary to avoid redefined
// function errors.
#ifndef _ROBOT_H
#define _ROBOT_H

void robotPrintMessage(void);
void robotPrintAscii(void);
void dalekPrintAscii(void);
void printBlanks(int initial, int rounds); 
#endif
