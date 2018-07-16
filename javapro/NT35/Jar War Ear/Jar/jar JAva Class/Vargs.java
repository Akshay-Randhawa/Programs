class Vargs
{
void show(char ch,int... x)
//void show(int... x,char ch)//error
{
	System.out.println(ch);
	for(int i=0;i<x.length;i++)
		System.out.println(x[i]);
	for(int i:x)
		System.out.println(i);
}
public static void main (String[] args)
{
	new Vargs().show('a',10,10,10,10);
}
}