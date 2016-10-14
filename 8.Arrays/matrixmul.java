import java.util.*;

class matrixmul
{ public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     int m1,n1,m2,i,j,k,n2;
     System.out.println("Enter m1 and n1 for first matrix:");
     m1=sc.nextInt();
      n1=sc.nextInt();
     System.out.println("Enter m2 and n2 for second matrix:");
     m2=sc.nextInt();
     n2=sc.nextInt();
    if(n1==m2)
{ 
    int a[][]=new int[m1][n1];
     int b[][]=new int[m2][n2];
     int c[][]=new int[m1][n2];
     System.out.println("Enter elements of first matrix:");
     for(i=0;i<m1;i++)
      { for(j=0;j<n1;j++)
          a[i][j]=sc.nextInt();
       }
      System.out.println("Enter elements of second matrix:");
     for(i=0;i<m2;i++)
      { for(j=0;j<n2;j++)
          b[i][j]=sc.nextInt();
       }
    for(i=0;i<m1;i++)
       { for(j=0;j<n2;j++)
          { c[i][j]=0;
             for(k=0;k<n1;k++)
              { c[i][j]+=a[i][k]*b[k][j];
               }
         }
     }
  System.out.println("Multiplied matrix:");
  for(i=0;i<m1;i++)
    { for(j=0;j<n2;j++)
       System.out.print(c[i][j]+"\t");
       System.out.println();
   }
}
}
}