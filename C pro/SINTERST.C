#include<stdio.h>
#include<conio.h>
void main()
{
float p,r,t,si;
clrscr();
printf("Enter The Value Of \"P\"\"R\"\"T\" = ");
scanf("%f%f%f",&p,&r,&t);
si=p*r*t/100;
printf("Simple Interset = %f",si);
getch();
}