import java.util.*;
import java.io.*;
class cube_main
{
public static void main (String args[])throws IOException
    {
Scanner in=new Scanner(System.in);
char cube[][][]=new char [6][2][2];
String inp[]=new String[6];
int cal=0;String temp;
String alg[]=new String[100];
int c=0;
int i;int ac;
int j;
int m;
int z;int k;
char a1,a2;
char b1,b2;
char c1,c2;
char d1,d2;
char p1,p2,p3,p4;
for (i=0;i<=5;i++)
{
System.out.println('\u000C');
System.out.println("---   ---");
System.out.println("-1-   -2-");
System.out.println("---   ---");
System.out.println();
System.out.println("---   ---");
System.out.println("-3-   -4-");
System.out.println("---   ---");
if (i==0)
System.out.println("Enter Input For Front Side");
if (i==1)
System.out.println("Enter Input For Up Side");
if (i==2)
System.out.println("Enter Input For Down Side");
if (i==3)
System.out.println("Enter Input For Left Side");
if (i==4)
System.out.println("Enter Input For Right Side");
if (i==5)
System.out.println("Enter Input For Back Side");
temp=in.nextLine();
inp[i]=temp.toUpperCase();

}
/* for (j=0;j<=1;j++)
{
for (m=0;m<=1;m++)
{



 if (j==0)
{
if (m==0)
System.out.print("1)");
else
System.out.print("2)");
System.out.println();
}
else
{
  if (m==0)
System.out.print("3)");
else
System.out.print("4)");
  System.out.println();
}

cube[i][j][m]=in.next().charAt(0); 



}
}
*/

for (i=0;i<=5;i++)
{ac=0;
for (j=0;j<=1;j++)
{
for (m=0;m<=1;m++)
{
cube[i][j][m]=inp[i].charAt(ac);

ac++;
}
}
}

if (!((cube[0][0][1]=='W') && (cube[1][1][1]=='R') && (cube[4][0][0]=='G')))

{
    
if ((cube[4][0][0]=='W') && (cube[0][0][1]=='R')  && (cube[1][1][1]=='G'))
{
  //R
alg[cal]="R";
cal++;
alg[cal]="U";
cal++;
alg[cal]="R'";
cal++;
alg[cal]="U'";
cal++;
alg[cal]="R";
cal++;

 // System.out.print("RUR'U'R");
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
   //U  
   p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
   //R'
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
    //U'
    p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
   
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
   
   
}
else if (cube[1][1][1]=='W' && ( cube[0][0][1]=='G') && (cube[4][0][0]=='R' || cube[4][0][0]=='G'))
{
alg[cal]="R'";
cal++;
alg[cal]="U";
cal++;
alg[cal]="R";
cal++;
alg[cal]="U'";
cal++;
alg[cal]="R'";
cal++;

//System.out.print("R'URU'R'");
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
    
   p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
   
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
   p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
   
}
else if (cube[0][1][1]=='W' && (cube[4][1][0]=='R' || cube[4][1][0]=='G') && (cube[2][0][1]=='R' || cube[2][0][1]=='G'))
{
alg[cal]="U";
cal++;
alg[cal]="R";
cal++;
alg[cal]="U'";
cal++;
alg[cal]="R'";
cal++;

//System.out.print("URU'R'");
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
   p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
}
else if (cube[2][0][1]=='W' && (cube[0][1][1]=='R' || cube[0][1][1]=='G') && (cube[4][1][0]=='R' || cube[4][1][0]=='G'))
{alg[cal]="R";
cal++;

//System.out.print("R");
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}

else if (cube[4][1][0]=='W' && (cube[0][1][1]=='R' || cube[0][1][1]=='G') && (cube[2][0][1]=='R' || cube[2][0][1]=='G'))
{alg[cal]="D";
cal++;
alg[cal]="R2";
cal++;

//System.out.print("DR2");
 p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
   for (k=1;k<=2;k++)
{
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}

}
else if (cube[0][1][0]=='W' && (cube[2][0][0]=='R' || cube[2][0][0]=='G') && (cube[3][1][1]=='R' || cube[3][1][1]=='G'))
{alg[cal]="D2";
cal++;
alg[cal]="R2";
cal++;

//System.out.print("D2R2");
    for (k=1;k<=2;k++)
{
p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
}
for (k=1;k<=2;k++)
{
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}


}
else if (cube[2][0][0]=='W' && (cube[0][1][0]=='R' || cube[0][1][0]=='G') && (cube[3][1][1]=='R' || cube[3][1][1]=='G'))
{alg[cal]="D";
cal++;
alg[cal]="R";
cal++;

//System.out.print("DR");
   p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
   
}
else if (cube[3][1][1]=='W' && (cube[2][0][0]=='R' || cube[2][0][0]=='G') && (cube[0][1][0]=='R' || cube[0][1][0]=='G'))
{alg[cal]="D";
cal++;
alg[cal]="R'";
cal++;
alg[cal]="D'";
cal++;
alg[cal]="R";
cal++;

//System.out.print("DR'D'R");
  p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
   p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1]; 
   cube[2][0][0]=p2;
   cube[2][0][1]=p4;
   cube[2][1][0]=p1;
   cube[2][1][1]=p3;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=b1;
   cube[0][1][1]=b2;
   cube[4][1][0]=c1;
   cube[4][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][1][1]=d2;
   cube[3][1][0]=a1;
   cube[3][1][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}
else
{
for (z=0;z<=3;z++)
{
    
    
if (cube[1][0][1]=='W' && (cube[5][0][0]=='R' || cube[5][0][0]=='G')&&(cube[4][0][1]=='R' || cube[4][0][1]=='G'))
{ if(z==1){ alg[cal]="B";
cal++;

    //System.out.print("B");
}
    if(z==2){ alg[cal]="B2";
cal++;

   // System.out.print("B2");
}
    if(z==3){ alg[cal]="B'";
cal++;

   // System.out.print("B'");
}
alg[cal]="R'";
cal++;
    
//System.out.print("R'");
  p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;  break;
}
if (cube[5][0][0]=='W' && (cube[1][0][1]=='R' || cube[1][0][1]=='G')&&(cube[4][0][1]=='R' || cube[4][0][1]=='G'))
{ if(z==1){ alg[cal]="B";
cal++;

   // System.out.print("B");
}
    if(z==2){ alg[cal]="B2";
cal++;

    //System.out.print("B2");
}
    if(z==3){ alg[cal]="B'";
cal++;

    //System.out.print("B'");
}
alg[cal]="B'";
cal++;
alg[cal]="R2";
cal++;


  //  System.out.print("B'R2");
p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
   
    for (k=1;k<=2;k++)
{
p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}
  break;
}
if (cube[4][0][1]=='W' && (cube[1][0][1]=='R' || cube[1][0][1]=='G')&&(cube[5][0][0]=='R' || cube[5][0][0]=='G'))  
{  if(z==1){ alg[cal]="B";
cal++;

   // System.out.print("B");
}
    if(z==2){alg[cal]="B2";
cal++;

   // System.out.print("B2");
}
    if(z==3){alg[cal]="B'";
cal++;

   // System.out.print("B'");
}alg[cal]="L";
cal++;
alg[cal]="U";
cal++;
alg[cal]="L'";
cal++;

   // System.out.println("LUL'");
    p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
  cube[3][0][0]=p3;
   cube[3][0][1]=p1;
   cube[3][1][0]=p4;
   cube[3][1][1]=p2;
  a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=c1;
   cube[1][1][0]=c2;
   cube[5][1][1]=d1;
   cube[5][0][1]=d2;
   cube[2][0][0]=a1;
   cube[2][1][0]=a2;
   cube[0][0][0]=b1;
   cube[0][1][0]=b2;
   p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
   p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
 cube[3][0][0]=p2;
   cube[3][0][1]=p4;
   cube[3][1][0]=p1;
   cube[3][1][1]=p3;   
   a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][1][0]=a2;
   cube[5][1][1]=b1;
   cube[5][0][1]=b2;
   cube[2][0][0]=c1;
   cube[2][1][0]=c2;
   cube[0][0][0]=d1;
   cube[0][1][0]=d2;break;}
p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
}

 
}}

if (!((cube[0][1][0]=='W')&& (cube[2][0][0]=='O') && (cube[3][1][1]=='B')))
{
if (cube[3][1][1]=='W' && (cube[2][0][0]=='O'||cube[2][0][0]=='B') && (cube[0][1][0]=='O'||cube[0][1][0]=='B')) 
{alg[cal]="D'";
cal++;
alg[cal]="B";
cal++;
alg[cal]="D2";
cal++;


//System.out.print("D'BD2");
    p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1]; 
   cube[2][0][0]=p2;
   cube[2][0][1]=p4;
   cube[2][1][0]=p1;
   cube[2][1][1]=p3;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=b1;
   cube[0][1][1]=b2;
   cube[4][1][0]=c1;
   cube[4][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][1][1]=d2;
   cube[3][1][0]=a1;
   cube[3][1][1]=a2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
   for (k=1;k<=2;k++)
{
 p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;   
}

}
else if (cube[2][0][0]=='W' && (cube[0][1][0]=='O'||cube[0][1][0]=='B') && (cube[3][1][1]=='O'||cube[3][1][1]=='B')) 
{alg[cal]="D2";
cal++;
alg[cal]="B'";
cal++;
alg[cal]="D";
cal++;

//System.out.print("D2B'D");
  for (k=1;k<=2;k++)
{
 p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;   
}
  p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
   p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
}
else if (cube[0][1][1]=='W' && (cube[4][1][0]=='O'||cube[4][1][0]=='B') && (cube[2][0][1]=='O'||cube[2][0][1]=='B')) 
{alg[cal]="D";
cal++;
alg[cal]="L";
cal++;
alg[cal]="B'";
cal++;
alg[cal]="L'";
cal++;

//System.out.print("DLB'L'");
    p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
    p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
  cube[3][0][0]=p3;
   cube[3][0][1]=p1;
   cube[3][1][0]=p4;
   cube[3][1][1]=p2;
  a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=c1;
   cube[1][1][0]=c2;
   cube[5][1][1]=d1;
   cube[5][0][1]=d2;
   cube[2][0][0]=a1;
   cube[2][1][0]=a2;
   cube[0][0][0]=b1;
   cube[0][1][0]=b2;
   p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
   p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
 cube[3][0][0]=p2;
   cube[3][0][1]=p4;
   cube[3][1][0]=p1;
   cube[3][1][1]=p3;   
   a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][1][0]=a2;
   cube[5][1][1]=b1;
   cube[5][0][1]=b2;
   cube[2][0][0]=c1;
   cube[2][1][0]=c2;
   cube[0][0][0]=d1;
   cube[0][1][0]=d2;

}
else if (cube[2][0][1]=='W' && (cube[4][1][0]=='O'||cube[4][1][0]=='B') && (cube[0][1][1]=='O'||cube[0][1][1]=='B')) 
{alg[cal]="D";
cal++;
alg[cal]="B'";
cal++;
alg[cal]="D";
cal++;

//System.out.print("DB'D");
   p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
  p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
   p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
 
   
   
}
else if (cube[4][1][0]=='W' && (cube[0][1][1]=='O'||cube[0][1][1]=='B') && (cube[2][0][1]=='O'||cube[2][0][1]=='B')) 
{alg[cal]="D'";
cal++;
//System.out.print("D'");
    p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1]; 
   cube[2][0][0]=p2;
   cube[2][0][1]=p4;
   cube[2][1][0]=p1;
   cube[2][1][1]=p3;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=b1;
   cube[0][1][1]=b2;
   cube[4][1][0]=c1;
   cube[4][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][1][1]=d2;
   cube[3][1][0]=a1;
   cube[3][1][1]=a2;
   
}
else
{
for (z=0;z<=3;z++)
{
    
    
if (cube[2][1][0]=='W' &&(cube[3][1][0]=='B' || cube[3][1][0]=='O')&&(cube[5][1][1]=='B' ||cube[5][1][1]=='O'))
{ if(z==1){ alg[cal]="B";
cal++;

    //System.out.print("B");
}
    if(z==2){alg[cal]="B2";
cal++;

   // System.out.print("B2");
}
    if(z==3){alg[cal]="B'";
cal++;

   // System.out.print("B'");
}
alg[cal]="L'";
cal++;
alg[cal]="D";
cal++;
alg[cal]="L";
cal++;
alg[cal]="D'";
cal++;
    
//System.out.print("L'DLD'");
    p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
 cube[3][0][0]=p2;
   cube[3][0][1]=p4;
   cube[3][1][0]=p1;
   cube[3][1][1]=p3;   
   a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][1][0]=a2;
   cube[5][1][1]=b1;
   cube[5][0][1]=b2;
   cube[2][0][0]=c1;
   cube[2][1][0]=c2;
   cube[0][0][0]=d1;
   cube[0][1][0]=d2;
p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
   p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
  cube[3][0][0]=p3;
   cube[3][0][1]=p1;
   cube[3][1][0]=p4;
   cube[3][1][1]=p2;
  a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=c1;
   cube[1][1][0]=c2;
   cube[5][1][1]=d1;
   cube[5][0][1]=d2;
   cube[2][0][0]=a1;
   cube[2][1][0]=a2;
   cube[0][0][0]=b1;
   cube[0][1][0]=b2;
   p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1]; 
   cube[2][0][0]=p2;
   cube[2][0][1]=p4;
   cube[2][1][0]=p1;
   cube[2][1][1]=p3;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=b1;
   cube[0][1][1]=b2;
   cube[4][1][0]=c1;
   cube[4][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][1][1]=d2;
   cube[3][1][0]=a1;
   cube[3][1][1]=a2;break;
   
}
if (cube[3][1][0]=='W' &&(cube[2][1][0]=='B' || cube[2][1][0]=='O')&&(cube[5][1][1]=='B' ||cube[5][1][1]=='O'))
{ if(z==1){ alg[cal]="B";
cal++;

  //  System.out.print("B");
}
    if(z==2){alg[cal]="B2";
cal++;

    //System.out.print("B2");
}
    if(z==3){alg[cal]="B'";
cal++;

   // System.out.print("B'");
}
alg[cal]="D";
cal++;
   
 //System.out.print("D");
    p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;break;
}
if (cube[5][1][1]=='W' &&(cube[3][1][0]=='B' || cube[3][1][0]=='O')&&(cube[2][1][0]=='B' ||cube[2][1][0]=='O'))
{ if(z==1){ alg[cal]="B";
cal++;

    //System.out.print("B");
}
    if(z==2){alg[cal]="B2";
cal++;

  //  System.out.print("B2");
}
    if(z==3){ alg[cal]="B'";
cal++;
  
// System.out.print("B'");
}
  alg[cal]="B";
cal++;
alg[cal]="D2";
cal++;

//  System.out.print("BD2");
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
   for (k=1;k<=2;k++)
{
p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1];
   cube[2][0][0]=p3;
   cube[2][0][1]=p1;
   cube[2][1][0]=p4;
   cube[2][1][1]=p2;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=d1;
   cube[0][1][1]=d2;
   cube[3][1][0]=c1;
   cube[3][1][1]=c2;
   cube[5][1][0]=b1;
   cube[5][1][1]=b2;
   cube[4][1][0]=a1;
   cube[4][1][1]=a2;
}
break;
}
 p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
 
}}
}
if (!(cube [0][1][1]=='W' && cube[4][1][0]=='G' && cube[2][0][1]=='O'))
{
if (cube[2][0][1]=='W' &&(cube[0][1][1]=='G' || cube[0][1][1]=='O')&&(cube[4][1][0]=='G' ||cube[4][1][0]=='O'))
{alg[cal]="U";
cal++;
alg[cal]="R";
cal++;
alg[cal]="U'";
cal++;
alg[cal]="B2";
cal++;
alg[cal]="R'";
cal++;
alg[cal]="B";
cal++;
alg[cal]="R";
cal++;

//System.out.print("URU'B2R'BR");
    p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
   p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
   for (k=1;k<=2;k++)
{
 p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
}
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}
else if (cube[4][1][0]=='W' &&(cube[0][1][1]=='G' || cube[0][1][1]=='O')&&(cube[2][0][1]=='G' ||cube[2][0][1]=='O'))
{alg[cal]="R'";
cal++;
alg[cal]="B'";
cal++;
alg[cal]="R";
cal++;
alg[cal]="B";
cal++;
alg[cal]="R'";
cal++;
alg[cal]="B'";
cal++;
alg[cal]="R";
cal++;

//System.out.print("R'B'RBR'B'R");
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}
else
{
for (z=0;z<=3;z++)
{
   
    
if (cube[4][1][1]=='W' &&(cube[5][1][0]=='G' || cube[5][1][0]=='O')&&(cube[2][1][1]=='G' ||cube[2][1][1]=='O'))
{ if(z==1){ alg[cal]="B";
cal++;

    //System.out.print("B");
}
    if(z==2){ alg[cal]="B2";
cal++;

    //System.out.print("B2");
}
    if(z==3){ 
    alg[cal]="B'";
cal++;
//System.out.print("B'");
}
   alg[cal]="L'";
cal++; 
alg[cal]="D'";
cal++;
alg[cal]="L";
cal++;  
//System.out.print("L'D'L");
   p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
 cube[3][0][0]=p2;
   cube[3][0][1]=p4;
   cube[3][1][0]=p1;
   cube[3][1][1]=p3;   
   a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][1][0]=a2;
   cube[5][1][1]=b1;
   cube[5][0][1]=b2;
   cube[2][0][0]=c1;
   cube[2][1][0]=c2;
   cube[0][0][0]=d1;
   cube[0][1][0]=d2;
 p1=cube[2][0][0];
   p2=cube[2][0][1];
   p3=cube[2][1][0];
   p4=cube[2][1][1]; 
   cube[2][0][0]=p2;
   cube[2][0][1]=p4;
   cube[2][1][0]=p1;
   cube[2][1][1]=p3;
   a1=cube[0][1][0];
   a2=cube[0][1][1];
   b1=cube[4][1][0];
   b2=cube[4][1][1];
   c1=cube[5][1][0];
   c2=cube[5][1][1];
   d1=cube[3][1][0];
   d2=cube[3][1][1];
   
   cube[0][1][0]=b1;
   cube[0][1][1]=b2;
   cube[4][1][0]=c1;
   cube[4][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][1][1]=d2;
   cube[3][1][0]=a1;
   cube[3][1][1]=a2;
   p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
  cube[3][0][0]=p3;
   cube[3][0][1]=p1;
   cube[3][1][0]=p4;
   cube[3][1][1]=p2;
  a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=c1;
   cube[1][1][0]=c2;
   cube[5][1][1]=d1;
   cube[5][0][1]=d2;
   cube[2][0][0]=a1;
   cube[2][1][0]=a2;
   cube[0][0][0]=b1;
   cube[0][1][0]=b2;break;
}
if (cube[5][1][0]=='W' &&(cube[4][1][1]=='G' || cube[4][1][1]=='O')&&(cube[2][1][1]=='G' ||cube[2][1][1]=='O'))
{ if(z==1){  alg[cal]="B";
cal++;
   // System.out.print("B");
}
    if(z==2){  alg[cal]="B2";
cal++;
    //System.out.print("B2");
}
    if(z==3){  alg[cal]="B'";
cal++;
    //System.out.print("B'");
}
    alg[cal]="R'";
cal++; alg[cal]="B2";
cal++; alg[cal]="R";
cal++; alg[cal]="B";
cal++; alg[cal]="R'";
cal++; alg[cal]="B'";
cal++; alg[cal]="R";
cal++;
// System.out.print("R'B2RBR'B'R");
     p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
   for (k=1;k<=2;k++)
{
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2; 
}
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;break;
}
if (cube[2][1][1]=='W' &&(cube[5][1][0]=='G' || cube[5][1][0]=='O')&&(cube[4][1][1]=='G' ||cube[4][1][1]=='O'))
{ if(z==1){  alg[cal]="B";
cal++;
    //System.out.print("B");
}
    if(z==2){  alg[cal]="B2";
cal++;
   // System.out.print("B2");
}
    if(z==3){  alg[cal]="B'";
cal++;
    //System.out.print("B'");
}
 alg[cal]="B'";
cal++; alg[cal]="R'";
cal++; alg[cal]="B";
cal++; alg[cal]="R";
cal++;   
// System.out.print("B'R'BR");
     p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
  cube[5][0][0]=p2;
   cube[5][0][1]=p4;
   cube[5][1][0]=p1;
   cube[5][1][1]=p3; 
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[4][0][1]=b1;
   cube[4][1][1]=b2;
   cube[1][0][0]=c1;
   cube[1][0][1]=c2;
   cube[3][1][0]=d1;
   cube[3][0][0]=d2;
   cube[2][1][1]=a1;
   cube[2][1][0]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
    p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
   p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
   break;
}

p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
 
}
}

}
 alg[cal]="L";
cal++;
 p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
  cube[3][0][0]=p3;
   cube[3][0][1]=p1;
   cube[3][1][0]=p4;
   cube[3][1][1]=p2;
  a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=c1;
   cube[1][1][0]=c2;
   cube[5][1][1]=d1;
   cube[5][0][1]=d2;
   cube[2][0][0]=a1;
   cube[2][1][0]=a2;
   cube[0][0][0]=b1;
   cube[0][1][0]=b2;

 alg[cal]="R'";
cal++;
p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
//Second Layer Begins

for (i=0;i<=3;i++)
{

if(cube[1][1][0]=='Y' && cube [0][0][1]=='Y' && cube [4][0][1]=='Y'&& cube [5][0][1]=='Y')
{
if(i==1)
 alg[cal]="U";
cal++;
if(i==2)
 alg[cal]="U2";
cal++;
if(i==3)
 alg[cal]="U'";
cal++;


 alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="U";
cal++; alg[cal]="R";
cal++; alg[cal]="U2";
cal++; alg[cal]="R'";
cal++;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
for (k=1;k<=2;k++)
{
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
}
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;break;
}

if(cube [0][0][0]=='Y' && cube [1][1][1]=='Y' && cube [3][0][0]=='Y' &&  cube [5][0][0]=='Y')
{if(i==1)
 alg[cal]="U";
cal++;
if(i==2)
 alg[cal]="U2";
cal++;
if(i==3)
 alg[cal]="U'";
cal++;


 alg[cal]="L'";
cal++; alg[cal]="U'";
cal++; alg[cal]="L";
cal++; alg[cal]="U'";
cal++; alg[cal]="L'";
cal++; alg[cal]="U2";
cal++; alg[cal]="L";
cal++;
p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
 cube[3][0][0]=p2;
   cube[3][0][1]=p4;
   cube[3][1][0]=p1;
   cube[3][1][1]=p3;   
   a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][1][0]=a2;
   cube[5][1][1]=b1;
   cube[5][0][1]=b2;
   cube[2][0][0]=c1;
   cube[2][1][0]=c2;
   cube[0][0][0]=d1;
   cube[0][1][0]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
 p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
  cube[3][0][0]=p3;
   cube[3][0][1]=p1;
   cube[3][1][0]=p4;
   cube[3][1][1]=p2;
  a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=c1;
   cube[1][1][0]=c2;
   cube[5][1][1]=d1;
   cube[5][0][1]=d2;
   cube[2][0][0]=a1;
   cube[2][1][0]=a2;
   cube[0][0][0]=b1;
   cube[0][1][0]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
 cube[3][0][0]=p2;
   cube[3][0][1]=p4;
   cube[3][1][0]=p1;
   cube[3][1][1]=p3;   
   a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][1][0]=a2;
   cube[5][1][1]=b1;
   cube[5][0][1]=b2;
   cube[2][0][0]=c1;
   cube[2][1][0]=c2;
   cube[0][0][0]=d1;
   cube[0][1][0]=d2;
for (k=1;k<=2;k++)
{
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
   
}
 p1=cube[3][0][0];
   p2=cube[3][0][1];
   p3=cube[3][1][0];
   p4=cube[3][1][1];
  cube[3][0][0]=p3;
   cube[3][0][1]=p1;
   cube[3][1][0]=p4;
   cube[3][1][1]=p2;
  a1=cube[0][0][0];
   a2=cube[0][1][0];
   b1=cube[1][0][0];
   b2=cube[1][1][0];
   c1=cube[5][1][1];
   c2=cube[5][0][1];
   d1=cube[2][0][0];
   d2=cube[2][1][0];
   
   cube[1][0][0]=c1;
   cube[1][1][0]=c2;
   cube[5][1][1]=d1;
   cube[5][0][1]=d2;
   cube[2][0][0]=a1;
   cube[2][1][0]=a2;
   cube[0][0][0]=b1;
   cube[0][1][0]=b2;break;
}
if(cube [0][0][1]=='Y' && cube [3][0][1]=='Y' && cube [3][0][0]=='Y' && cube [5][0][0]=='Y' )
{if(i==1)
 alg[cal]="U";
cal++;
if(i==2)
 alg[cal]="U2";
cal++;
if(i==3)
 alg[cal]="U'";
cal++;


 alg[cal]="F";
cal++; alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="U'";
cal++; alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="U'";
cal++; alg[cal]="F'";
cal++;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p3;
   cube[0][0][1]=p1;
   cube[0][1][0]=p4;
   cube[0][1][1]=p2;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[4][0][0]=a1;
   cube[4][1][0]=a2;
   cube[2][0][1]=b1;
   cube[2][0][0]=b2;
   cube[3][1][1]=c1;
   cube[3][0][1]=c2;
   cube[1][1][0]=d1;
   cube[1][1][1]=d2;
for (k=1;k<=2;k++)
{
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
}
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p2;
   cube[0][0][1]=p4;
   cube[0][1][0]=p1;
   cube[0][1][1]=p3;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[3][1][1]=a1;
   cube[3][0][1]=a2;
   cube[2][0][0]=d2;
   cube[2][0][1]=d1;
   cube[4][0][0]=c1;
   cube[4][1][0]=c2;
   cube[1][1][0]=b1;
   cube[1][1][1]=b2;break;
}
if(cube [1][1][1]=='Y' && cube [1][0][1]=='Y' && cube [3][0][1]=='Y' && cube [3][0][0]=='Y')
{if(i==1)
 alg[cal]="U";
cal++;
if(i==2)
 alg[cal]="U2";
cal++;
if(i==3)
 alg[cal]="U'";
cal++;

 alg[cal]="F";
cal++; alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="U'";
cal++; alg[cal]="F'";
cal++;

 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p3;
   cube[0][0][1]=p1;
   cube[0][1][0]=p4;
   cube[0][1][1]=p2;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[4][0][0]=a1;
   cube[4][1][0]=a2;
   cube[2][0][1]=b1;
   cube[2][0][0]=b2;
   cube[3][1][1]=c1;
   cube[3][0][1]=c2;
   cube[1][1][0]=d1;
   cube[1][1][1]=d2;

 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p2;
   cube[0][0][1]=p4;
   cube[0][1][0]=p1;
   cube[0][1][1]=p3;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[3][1][1]=a1;
   cube[3][0][1]=a2;
   cube[2][0][0]=d2;
   cube[2][0][1]=d1;
   cube[4][0][0]=c1;
   cube[4][1][0]=c2;
   cube[1][1][0]=b1;
   cube[1][1][1]=b2;break;
}
if(cube [0][0][0]=='Y' && cube [0][0][1]=='Y' && cube [5][0][1]=='Y' && cube [5][0][0]=='Y')
{if(i==1)
 alg[cal]="U";
cal++;
if(i==2)
 alg[cal]="U2";
cal++;
if(i==3)
 alg[cal]="U'";
cal++;

 alg[cal]="R2";
cal++; alg[cal]="U2";
cal++; alg[cal]="R";
cal++; alg[cal]="U2";
cal++; alg[cal]="R2";
cal++;

for (k=1;k<=2;k++)
{
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}
for (k=1;k<=2;k++)
{
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
}
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
for (k=1;k<=2;k++)
{
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
}
for (k=1;k<=2;k++)
{
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}
break;
}
if(cube [0][0][1]=='Y' && cube [1][0][1]=='Y' && cube [1][1][0]=='Y' && cube [3][0][0]=='Y' )
{if(i==1)
 alg[cal]="U";
cal++;
if(i==2)
 alg[cal]="U2";
cal++;
if(i==3)
 alg[cal]="U'";
cal++;

 alg[cal]="F'";
cal++; alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="U'";
cal++; alg[cal]="R'";
cal++; alg[cal]="F";
cal++; alg[cal]="R";
cal++;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p2;
   cube[0][0][1]=p4;
   cube[0][1][0]=p1;
   cube[0][1][1]=p3;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[3][1][1]=a1;
   cube[3][0][1]=a2;
   cube[2][0][0]=d2;
   cube[2][0][1]=d1;
   cube[4][0][0]=c1;
   cube[4][1][0]=c2;
   cube[1][1][0]=b1;
   cube[1][1][1]=b2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p3;
   cube[0][0][1]=p1;
   cube[0][1][0]=p4;
   cube[0][1][1]=p2;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[4][0][0]=a1;
   cube[4][1][0]=a2;
   cube[2][0][1]=b1;
   cube[2][0][0]=b2;
   cube[3][1][1]=c1;
   cube[3][0][1]=c2;
   cube[1][1][0]=d1;
   cube[1][1][1]=d2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;break;
}
if(cube [0][0][0]=='Y' && cube [1][0][1]=='Y' && cube [1][1][1]=='Y' && cube [5][0][1]=='Y')
{if(i==1)
 alg[cal]="U";
cal++;
if(i==2)
 alg[cal]="U2";
cal++;
if(i==3)
 alg[cal]="U'";
cal++;


 alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="U'";
cal++; alg[cal]="R'";
cal++; alg[cal]="F";
cal++; alg[cal]="R";
cal++; alg[cal]="F'";
cal++;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p3;
   cube[0][0][1]=p1;
   cube[0][1][0]=p4;
   cube[0][1][1]=p2;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[4][0][0]=a1;
   cube[4][1][0]=a2;
   cube[2][0][1]=b1;
   cube[2][0][0]=b2;
   cube[3][1][1]=c1;
   cube[3][0][1]=c2;
   cube[1][1][0]=d1;
   cube[1][1][1]=d2;
p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p2;
   cube[0][0][1]=p4;
   cube[0][1][0]=p1;
   cube[0][1][1]=p3;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[3][1][1]=a1;
   cube[3][0][1]=a2;
   cube[2][0][0]=d2;
   cube[2][0][1]=d1;
   cube[4][0][0]=c1;
   cube[4][1][0]=c2;
   cube[1][1][0]=b1;
   cube[1][1][1]=b2;
break;
}
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;


}
if (!(cube[0][0][0]==cube[0][0][1] && cube[3][0][0]==cube[3][0][1] && cube[4][0][0]==cube[4][0][1] && cube[5][0][0]==cube[5][0][1]  ))
{
for (i=0;i<=3;i++)
{
if (cube[5][0][0]==cube[5][0][1])
{
if (i==1)
{
alg[cal]="U";
cal++;
}
if (i==2)
{
alg[cal]="U2";
cal++;
}
if (i==3)
{
alg[cal]="U'";
cal++;
}
 alg[cal]="R'";
cal++; alg[cal]="F";
cal++; alg[cal]="R'";
cal++; alg[cal]="B2";
cal++; alg[cal]="R";
cal++; alg[cal]="F'";
cal++; alg[cal]="R'";
cal++; alg[cal]="B2";
cal++; alg[cal]="R2";
cal++; 

p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p3;
   cube[0][0][1]=p1;
   cube[0][1][0]=p4;
   cube[0][1][1]=p2;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[4][0][0]=a1;
   cube[4][1][0]=a2;
   cube[2][0][1]=b1;
   cube[2][0][0]=b2;
   cube[3][1][1]=c1;
   cube[3][0][1]=c2;
   cube[1][1][0]=d1;
   cube[1][1][1]=d2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;

for (k=1;k<=2;k++)
{
 p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
}
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p2;
   cube[0][0][1]=p4;
   cube[0][1][0]=p1;
   cube[0][1][1]=p3;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[3][1][1]=a1;
   cube[3][0][1]=a2;
   cube[2][0][0]=d2;
   cube[2][0][1]=d1;
   cube[4][0][0]=c1;
   cube[4][1][0]=c2;
   cube[1][1][0]=b1;
   cube[1][1][1]=b2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
for (k=1;k<=2;k++)
{
 p1=cube[5][0][0];
   p2=cube[5][0][1];
   p3=cube[5][1][0];
   p4=cube[5][1][1];
cube[5][0][0]=p3;
   cube[5][0][1]=p1;
   cube[5][1][0]=p4;
   cube[5][1][1]=p2;   
   a1=cube[4][0][1];
   a2=cube[4][1][1];
   b1=cube[1][0][0];
   b2=cube[1][0][1];
   c1=cube[3][1][0];
   c2=cube[3][0][0];
   d1=cube[2][1][1];
   d2=cube[2][1][0];
   
   cube[1][0][0]=a1;
   cube[1][0][1]=a2;
   cube[3][1][0]=b1;
   cube[3][0][0]=b2;
   cube[2][1][1]=c1;
   cube[2][1][0]=c2;
   cube[4][0][1]=d1;
   cube[4][1][1]=d2;
}
for (k=1;k<=2;k++)
{
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
}
break;
}
if(cube[0][0][0]==cube[0][1][0] && cube[4][0][1]==cube[4][1][1])
{if (i==1)
{
alg[cal]="U";
cal++;
}
if (i==2)
{
alg[cal]="U2";
cal++;
}
if (i==3)
{
alg[cal]="U'";
cal++;
}
 alg[cal]="F";
cal++; alg[cal]="R";
cal++; alg[cal]="U'";
cal++; alg[cal]="R'";
cal++; alg[cal]="U'";
cal++; alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="F'";
cal++; alg[cal]="R";
cal++; alg[cal]="U";
cal++; alg[cal]="R'";
cal++; alg[cal]="U'";
cal++; alg[cal]="R'";
cal++; alg[cal]="F";
cal++; alg[cal]="R";
cal++; alg[cal]="F'";
cal++;

 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p3;
   cube[0][0][1]=p1;
   cube[0][1][0]=p4;
   cube[0][1][1]=p2;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[4][0][0]=a1;
   cube[4][1][0]=a2;
   cube[2][0][1]=b1;
   cube[2][0][0]=b2;
   cube[3][1][1]=c1;
   cube[3][0][1]=c2;
   cube[1][1][0]=d1;
   cube[1][1][1]=d2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p2;
   cube[0][0][1]=p4;
   cube[0][1][0]=p1;
   cube[0][1][1]=p3;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[3][1][1]=a1;
   cube[3][0][1]=a2;
   cube[2][0][0]=d2;
   cube[2][0][1]=d1;
   cube[4][0][0]=c1;
   cube[4][1][0]=c2;
   cube[1][1][0]=b1;
   cube[1][1][1]=b2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
     cube[1][0][0]=p2;
   cube[1][0][1]=p4;
   cube[1][1][0]=p1;
   cube[1][1][1]=p3;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=d1;
   cube[0][0][1]=d2;
   cube[3][0][0]=c1;
   cube[3][0][1]=c2;
   cube[5][0][0]=b1;
   cube[5][0][1]=b2;
   cube[4][0][0]=a1;
   cube[4][0][1]=a2;
 p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p2;
   cube[4][0][1]=p4;
   cube[4][1][0]=p1;
   cube[4][1][1]=p3;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   cube[1][0][1]=c1;
   cube[1][1][1]=c2;
   cube[5][1][0]=d1;
   cube[5][0][0]=d2;
   cube[2][0][1]=a1;
   cube[2][1][1]=a2;
   cube[0][0][1]=b1;
   cube[0][1][1]=b2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p3;
   cube[0][0][1]=p1;
   cube[0][1][0]=p4;
   cube[0][1][1]=p2;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[4][0][0]=a1;
   cube[4][1][0]=a2;
   cube[2][0][1]=b1;
   cube[2][0][0]=b2;
   cube[3][1][1]=c1;
   cube[3][0][1]=c2;
   cube[1][1][0]=d1;
   cube[1][1][1]=d2;
    p1=cube[4][0][0];
   p2=cube[4][0][1];
   p3=cube[4][1][0];
   p4=cube[4][1][1];
   cube[4][0][0]=p3;
   cube[4][0][1]=p1;
   cube[4][1][0]=p4;
   cube[4][1][1]=p2;
   a1=cube[0][0][1];
   a2=cube[0][1][1];
   b1=cube[1][0][1];
   b2=cube[1][1][1];
   c1=cube[5][1][0];
   c2=cube[5][0][0];
   d1=cube[2][0][1];
   d2=cube[2][1][1];
   
   
   cube[1][0][1]=a1;
   cube[1][1][1]=a2;
   cube[5][1][0]=b1;
   cube[5][0][0]=b2;
   cube[2][0][1]=c1;
   cube[2][1][1]=c2;
   cube[0][0][1]=d1;
   cube[0][1][1]=d2;
 p1=cube[0][0][0];
   p2=cube[0][0][1];
   p3=cube[0][1][0];
   p4=cube[0][1][1];
   cube[0][0][0]=p2;
   cube[0][0][1]=p4;
   cube[0][1][0]=p1;
   cube[0][1][1]=p3;
   a1=cube[1][1][0];
   a2=cube[1][1][1];
   b1=cube[4][0][0];
   b2=cube[4][1][0];
   c1=cube[2][0][1];
   c2=cube[2][0][0];
   d1=cube[3][1][1];
   d2=cube[3][0][1];
   
   cube[3][1][1]=a1;
   cube[3][0][1]=a2;
   cube[2][0][0]=d2;
   cube[2][0][1]=d1;
   cube[4][0][0]=c1;
   cube[4][1][0]=c2;
   cube[1][1][0]=b1;
   cube[1][1][1]=b2;break;
}
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;


}

}

if (!(cube[0][0][0]==cube[0][1][0]))
{
for (i=1;i<=3;i++)
{
p1=cube[1][0][0];
   p2=cube[1][0][1];
   p3=cube[1][1][0];
   p4=cube[1][1][1];
  cube[1][0][0]=p3;
   cube[1][0][1]=p1;
   cube[1][1][0]=p4;
   cube[1][1][1]=p2;
   a1=cube[0][0][0];
   a2=cube[0][0][1];
   b1=cube[4][0][0];
   b2=cube[4][0][1];
   c1=cube[5][0][0];
   c2=cube[5][0][1];
   d1=cube[3][0][0];
   d2=cube[3][0][1];
   
   cube[0][0][0]=b1;
   cube[0][0][1]=b2;
   cube[4][0][0]=c1;
   cube[4][0][1]=c2;
   cube[5][0][0]=d1;
   cube[5][0][1]=d2;
   cube[3][0][0]=a1;
   cube[3][0][1]=a2;
if (cube[0][0][0]==cube[0][1][0])
{
if (i==1)
{
alg[cal]="U";
cal++;
}
if (i==2)
{
alg[cal]="U2";
cal++;
}
if (i==3)
{
alg[cal]="U'";
cal++;
}
break;
}
}
}



    for (i=0;i<=5;i++)
{
for (j=0;j<=1;j++)
{
for (m=0;m<=1;m++)
{
System.out.print(cube[i][j][m]+"="+i+j+m);
}
System.out.println();
}
System.out.println("----------------------");
} 
System.out.println(); 
System.out.println("Unrefined Formula:");
for(i=0;i<cal;i++){
if(alg[i]==null)
{}
else
System.out.print(alg[i]);}





for (i=0;i<cal-1;i++)
{
if (alg[i]!=null && alg[i+1]!=null){
if (alg[i].charAt(0)==alg[i+1].charAt(0))

{


if (alg[i].length()==1)
{
if (alg[i+1].length()==1)
{alg[i]=null;alg[i+1]+="2";
}
else if (alg[i+1].charAt(1)=='2' )
{alg[i]+="'";alg[i+1]=null;
}
else
{alg[i]=null;
alg[i+1]=null;

}

}
else if (alg[i].charAt(1)=='2' )
{
if (alg[i+1].length()==1)
{alg[i]=null;
alg[i+1]+="'";
}
else if (alg[i+1].charAt(1)=='2' )
{
alg[i]=null;
alg[i+1]=null;

}
else
{
alg[i+1]=null;
alg[i]=Character.toString(alg[i].charAt(0));
}

}
else
{
if (alg[i+1].length()==1)
{
alg[i]=null;
alg[i+1]=null;
}
else if (alg[i+1].charAt(1)=='2' )
{
alg[i+1]=null;
alg[i]=Character.toString(alg[i].charAt(0));
}
else
{alg[i+1]=null;
alg[i]=Character.toString(alg[i].charAt(0));
alg[i]+="2";
}
}


}
}


}
System.out.println();

for(i=0;i<cal;i++){
if(alg[i]==null)
{}
else
System.out.print(alg[i]);}

System.out.println();
System.out.println("Refined Formula Above");
}
    }


