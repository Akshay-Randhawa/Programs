#include<stdio.h>
#include<conio.h>
void main()
{
char a[10];
int l=0;
clrscr();
printf("enter the name ");
gets(a);
while(a[l]!='\0')
{
l++;
}
printf("length of string = %d",l);
getch();
}