

package scuola.minigame;
import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class MiniGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      //this is the input getter
        PlayerCharacter player = new PlayerCharacter(); //the new player object
        EnemyCharacter enemy = new EnemyCharacter();    //the new enemy object
        
        System.out.println("Hello, welcome to the Mini Game!");
        
        player.charCreation();
        enemy.createEnemy(30);
        player.experienceGained(10000.0);
        int playerLevel = player.getLevel();
        System.out.println(playerLevel);
        
        System.out.println("\n\n" + player + "\n");
        System.out.println(enemy);
    }//main 
    
}//MiniGame
