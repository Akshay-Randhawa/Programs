#include<stdio.h>
#include<conio.h>
void check(int a)
{
if(a%2==0)
puts("its a even");
else
puts("its a odd");
}
void main()
{
int a;
textbackground(BLACK);
clrscr();
puts ("enter the number to check");
scanf("%d",&a);
check(a);
getch();
}
