import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Verhovna_Rada {
    public static void main(String[] args) {
        Verhovna_Rada verhovna_rada = new Verhovna_Rada();
        System.out.println("Input a CODE");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        if (code == 1){
            verhovna_rada.add_frakcia();
        }
        if(code ==2){
            verhovna_rada.delete_frakcia();
        }
        if(code == 3){
            verhovna_rada.all_Frakcia();
        }
        if(code == 4){
            verhovna_rada.Delete_Deputats_of_Frakcia();
        }
        if (code == 5){
            verhovna_rada.wiev_Frakcia2();

        }
        if (code == 6){
            verhovna_rada.add_Deputat();
        }
        if(code==7){
             verhovna_rada.remove_Deputat();
        }
        if (code ==8){

            verhovna_rada.Habarnuku();
        }
        if (code == 9){
            verhovna_rada.The_Most_Habarnuk();
        }



    }
    }


