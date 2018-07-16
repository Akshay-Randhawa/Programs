#include<stdio.h>
#include<conio.h>
int length(char c[])
{
int l=0;
while(c[l]!='\0')
{
l++;
}
return(l);
}
void main()
{
int l;
char s[20];
clrscr();
puts("enter the string");
gets(s);
l=length(s);
printf("length = %d",l);
getch();
}