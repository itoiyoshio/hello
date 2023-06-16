import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random r = new Random();
      int number = r.nextInt(90)+10;
      boolean check = false;

      for(int i = 0; i < 5; i++){
        System.out.print("数字を予想してください(10~99):");
        int user = sc.nextInt();
        if(user == number){
          System.out.println("当たり");
          check = true;
          break;
        } else if(user > number){
          System.out.println("大きいです。");
          if(user>=number+20){
            System.out.println("20以上大きいです。");
          }
        } else if(user < number){
          System.out.println("小さいです。");
          if(user+20<=number){
            System.out.println("20以上小さいです。");
          }
        }
      }
      sc.close();
      if(!check){
        System.out.println("ゲームオーバーです。正解は"+number+"でした。残念。");
      }
    }
}