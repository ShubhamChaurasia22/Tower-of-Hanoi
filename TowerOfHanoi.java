import java.util.*;
public class TowerOfHanoi{

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter The Number of Disk: ");
                int num = sc.nextInt();
                System.out.println("The Sequence of move involved in the Tower of Hanoi are: ");
        Tower(num,'A','C','B');

    }
        static void Tower(int num, char BEG, char AUX, char END){
            if(num>=1){
                Tower(num-1,BEG,END,AUX);
                System.out.println(BEG +" to "+END);
                Tower(num-1,AUX,BEG,END);
            }
        }
    }
