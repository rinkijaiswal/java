class Box
{
private int length,breadth,height;//that is a propertics
public void setDimension(int l,int b,int h)//that is a fun 
{lenght=l;breadth=b;height=h;}
public void showDimension()//that is a fun
{
System.out.println("l="+lenght);
System.out.println("B="+breadht);
System.out.println("H="+height);
}
}
class Example
{
public static void main()
{
Box smallBox=newBox();
smallBox.setDimension(12,10,5);
smallBox.showDimension();
smallBox=newBox();
smallBox.showDimensin();
}
}