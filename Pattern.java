import java.util.Scanner;
class Pattern {
public static void main(String[] args){
Scanner t=new Scanner(System.in);
System.out.println("Enter no.of rows");
int n=t.nextInt();


for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++){
System.out.print(" ");
}
for(int k=1;k<=(2*i-1);k++){
if(i==n||k==1||k==(2*i-1)){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();

}
}
}
