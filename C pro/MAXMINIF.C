#include<stdio.h>
#include<conio.h>
int max( int a,int b,int c)
{
if(a>b&&a>c)
return (a);
else if(b>a&&a>c)
return(b);
else
return(c);
}
int mini (int a, int b, int c)
{
if(a<b&&a<c)
return(a);
else if(b<a&&b<c)
return(b);
else
return(c);
}
void main()
{
int x,y,z,mx,mi;
clrscr();
printf("enter the 3 values to find mini and max = ");
scanf("%d%d%d",&x,&y,&z);
mx=max(x,y,z);
mi=mini(x,y,z);
printf(" max = %d",mx);
printf("mini = %d",mi);
getch();
}