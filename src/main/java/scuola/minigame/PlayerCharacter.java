
package scuola.minigame;
import java.util.Scanner;

/**
 *
 * @author cristian
 */
public class PlayerCharacter {
    private String name;
    private String role;
    private String race;
    private int level;
    private int hp;
    private int mp;
    private double exp;
    
    Scanner sc = new Scanner(System.in);
    
/********** This is the player object constructor ************/
    public PlayerCharacter() {
        this.name = "Name";
        this.role = "Role";
        this.race = "Race";
        this.level = 0;
        this.hp = 100;
        this.mp = 10;
        this.exp = 0.0;
    }//object
    
/************ These are the settings the player can choose ***************
    * * These settings are what defines the character and remain        *
    * * unvaried during the whole game.                                 *
    *                                                                   *   
    * @param name is the name of the character ;)                       *
    * @param role is for the player to choose ranged melee or magic     *
    * @param race is for the player to choose between two races         *
    *                                                                   *
    *                                                                   *
    
    public PlayerCharacter(String name, String role, String race) {
        this.name = name;
        this.role = role;
        this.race = race;
    }
    
    *                                                                   *
    *********************************************************************/
    
/***** These are the statistics the player has accumulated during the game ***
     * * These settings change automatically during the game depending on  * *
     * * the player's actions                                              * *
     *                                                                       *
     * @param level is the level of the character                            *
     * @param hp is the player's health                                      *
     * @param mp is the magical power or mana                                *
     * @param exp are the experience points of the player                    *
     *                                                                       *

    
    public PlayerCharacter(int level, int hp, int mp, double exp) {
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.exp = exp;
    }
    
    *                                                                       *
    *************************************************************************/
    
/*** The getter methods for the class ***/

    public String getName() {
        return this.name;
    }
    public String getRole() {
        return this.role;
    }
    public String getRace() {
        return this.race;
    }
    public int getLevel() {
        return this.level;
    }
    public int getHp() {
        return this.hp;
    }
    public int getMp() {
        return this.mp;
    }
    public double getExp() {
        return this.exp;
    }
    
/****************************************/

/*** These are the setter methods *******
    public void setName(String name) {
        this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setRace(String race) {
        this.faction = race;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
/****************************************/
    
    /*************************************************************************************
     *                    Method to print out the info on the roles                      *
     *                                                                                   */
    public void rolesInfo() {
        String fighter = "\nFighter\n"
                + "For those who like to rely more on instinct.\n"
                + "Enter melee and try to hit as much as possible while tanking a few blows.\n"
                + "MP halved, HP doubled.\n\n";
        String archer = "Archer\n"
                + "For those who are fairly confident in their aim.\n"
                + "Take a few hit from distance before the enemy can close in.\n"
                + "Can take two hits on the first question of the opponent before losing HP.\n\n";
        String mage = "Mage\n"
                + "For those who take pride in their knowledge and arcane arts.\n"
                + "Can deal devastating bows on opponents but has low HP.\n"
                + "MP quintupled, HP at one fifth.\n\n";
        System.out.println(fighter + archer + mage);
    }
    /*************************************************************************************/
    
    /*************************************************************************************
     *                    Method to print out the info on the races                      *
     *                                                                                   */
    public void racesInfo() {
        String student = "\nStudent\n"
                + "Those pesky little demons.\n"
                + "They have mostly empty heads and strong bodies, always ready to make trouble.\n"
                + "They like to make trouble for professors regardless of damage taken.\n"
                + "The student race has double HP and a third of the MP.\n\n";
        String professor = "Professors\n"
                + "Older sadistic demons.\n"
                + "Their bodies have deteriorated but their heads are full of sadistic thoughts.\n"
                + "They like to torment students with their knowledge.\n"
                + "The professor race has triple the MP and half the HP.\n";
        System.out.println(student + professor);
    }
    /*************************************************************************************/
    
    /*************************************************************************************
     *                   Method for creating the character                               *
     *                                                                                   */
    public void charCreation() {
        boolean okay;
        
        String[] roles = {"Info", "Fighter", "Archer", "Mage"};
        String[] races = {"Info", "Student", "Professor"};
        
        System.out.print("Choose a character name: ");
        this.name = sc.nextLine();
        
        /*********************** Choosing roles here ***************************************/
        System.out.println("\n\nGood " + this.name + ", now it's time to choose a role.\n" 
                + "You can either be a Fighter(1), an Archer(2), or a Mage(3).\n"
                + "Type (0) for info on the roles.\n" );
        System.out.print("Choose a role by typing a number: ");
        do{
            if (sc.hasNext("1") || sc.hasNext("2") 
                    || sc.hasNext("3")) 
                okay = true;
            else if(sc.hasNext("0")) {
                okay = false;
                rolesInfo();
                sc.nextLine();
                System.out.print("Choose a role by typing a number: ");
            }else{
                okay = false;
                String word = sc.nextLine();
                System.err.println(word + " is not one of the choices");
                System.out.print("Choose a role by typing a number: ");
            }
        }while(!okay);
        this.role = roles[Integer.parseInt(sc.nextLine())];
        
        if (this.role.equals("Fighter")) {
            this.hp*=2;
            this.mp/=2;
        }else if (this.role.equals("Mage")) {
            this.hp/=5;
            this.mp*=5;
        }
        
        /******************** Choosing race here *************************************/
        System.out.println("\n\nGreat " + this.name 
                + ", now for the last thing, you need to choose a race.\n" 
                + "You can either be a Student(1), or a Professor(2).\n"
                + "Type (0) for info on the races.\n");
        System.out.print("Choose a race by typing a number: ");
        do{
            if (sc.hasNext("1") || sc.hasNext("2")) 
                okay = true;
            else if(sc.hasNext("0")) {
                okay = false;
                racesInfo();
                sc.nextLine();
                System.out.print("Choose a race by typing a number: ");
            }else{
                okay = false;
                String word = sc.nextLine();
                System.err.println(word + " is not one of the choices");
                System.out.print("Choose a race by typing a number: ");
            }
        }while(!okay);
        this.race = races[Integer.parseInt(sc.nextLine())];
        
        if (this.race.equals("Student")) //changes hp or mp based on the race chosen
            this.hp = this.hp * 2;
        else
            this.mp = this.mp * 3;
        
    }//charCreation
    
    public void experienceGained (double exp) {             //method to add experience and call the levelUp() method
        this.exp = this.exp + exp;
        System.out.println(String.format("+%.0f EXP", exp));
        levelUp();
    }//experienceGained
    
    private void levelUp() {                                //method to level up. Can only be accessed by the experienceGained() method.
        while (this.exp > Math.pow(this.level, 3)) 
            this.level++;
        if (this.role.equals("Fighter"))
    }//levelUp
    
    /*************************** toString method *******************************************
     * @return the character sheet when the object is called, can be used with print to    *
     * make the player see his details.                                                    *
     * @Overr used to override the object output                                           *
     *                                                                                     */
    @Override 
    public String toString() {
        return String.format("Character sheet\n" + "Character name: %s\nRole: %s\n"
                + "Race: %s\nLevel: %d\nHP: %d\nMP: %d\nEXP: %.0f",
                this.name, this.role, this.race, 
                this.level, this.hp, this.mp, this.exp);
    }//toString
    
}//class
