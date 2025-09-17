import java.util.Scanner;
public class Sieve {
public static void main(String[] arg){
Scanner a= new Scanner(System.in);
System.out.println("Please type an integer: ");
int n=a.nextInt();
Boolean[] array;
array = new Boolean[n+1];
for (int i=0;i<n;i++){
    array[i]=true;
}
array[0]=false;
array[1]=false;
for(int j=2; j<n+1; j++){
    for(int k=2*j; k<n+1; k+=j){
        array[k]=false;
    }
}
for (int i=2;i<n+1;i++){
    if (array[i]==true){
        System.out.println(i);
    }
}
















}
}
