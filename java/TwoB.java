class TwoB{
public static void main(String[] args){
int twoB[][]=new int[][];
int twoB[0]=new int[1];
int twoB[1]=new int[2];
int twoB[2]=new int[3];
int twoB[3]=new int[4];
int i,j,k=0;
for(i=0;i<4;i++)
for(j=0;j<i+1;j++)
{
twoD[i][j]=k;
k++;
}
for(i=0;i<4;i++)
{
for(j=0;j<i+1;j++)
System.out.println(twoD[i][j]+"");
System.out.println();
}
}
}


