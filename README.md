# Assignment
1

Printing the hallow spaces Equilateral triangle
  
  The requirement is that I have to print the hallow spaced equilateral triangle with the help of user input.
   First import the Scanner class to take dynamic inputs
    
    import java.util.Scanner;
 firstly,I take a class and main method
 
     class pattern{
      public static void main(String[] args){
    Scanner t=new Scanner(System.in);
  Then I take a integer to print the no.of rows dynamically by using Scanner object.
    
    int n=t.nextInt;
     
  Then I take 3 for loops for iterating to print equilateral hallowspaced triangle.
   The first loop is for representing the no.of horizontal lines. i.e,
   
    for(int i=0;i<=n;i++){(where as i used inner for loop to get spaces regarding the input number i.e,)
  
     for(int j=i;j<=n;j++){
     System.out.print(" ");(it prints the spaces)
      }
      for(int k=1;k<=(2*i-1);k++){
      if(i==n||k==1||k==(2*i-1)){
       System.out.print("*");(prints the stars according to the given condition)
        }
       else{
       System.out.print(" ");(condition not satisfied prints spaces&breaks the loop)
       }
       }
       System.out.println();(enters the next line to print stars and spaces according to condition)

       }}}
![2021-05-17 (3)](https://user-images.githubusercontent.com/84019315/118479931-3d04c200-b72f-11eb-89a4-8a3fef3500f5.png)

