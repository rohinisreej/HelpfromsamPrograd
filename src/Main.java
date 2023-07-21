import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int score=1;
        while(input>1){
            if(input%2==0){
                input/=2;

            }
            else{
                score++;
                input-=1;
            }
        }
        System.out.println(score);
    }
}