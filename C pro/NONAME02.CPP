#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<dos.h>
void main()
{
int i;
clrscr();
for(i=1;i<80;i++)
{
if(kbhit())
exit(0);
gotoxy(i,13);
puts("RANDHAWA");
delay(300);
clrscr();
}
getch();
}








