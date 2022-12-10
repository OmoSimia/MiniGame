
package scuola.minigame;

/**
 *
 * @author cristian
 */
public class EnemyCharacter {
    private String name;
    private String kind;
    private String race;
    private int level;
    private int hp;
    private int mp;
    private double exp;
    
    /***********These are the characteristics of the enemy object********/
    public EnemyCharacter() {
        this.name = "Name";
        this.kind = "Kind";
        this.race = "Dev";
        this.level = 0;
        this.hp = 100;
        this.mp = 10;
        this.exp = 0.0;
    }
   /**************** These are the settings of the enemy ****************
    * * These settings are what defines the character, and remain       *
    * * unvaried during the whole game.                                 *
    *                                                                   *
    * @param name is the name of the character ;)                       *
    * @param Kind is the enemy type                                     *
    * @param race the impartial programmer race                         *
    * @param level is the level of the character                        *
    * @param hp is the enemy's health                                   *
    * @param mp is the magical power or mana                            *
    * @param exp are the experience points of the enemy                 *
    *                                                                   *
    
    public EnemyCharacter(String name, String kind, String race, 
            int level, int hp, int mp, int exp) {
        this.name = name;
        this.kind = kind;
        this.race = race;
        this.level = level;
        this.hp = hp;
        this.mp = mp;
        this.exp = exp;
    }
   /*                                                                   *
    *********************************************************************/
    
    /***** The getter methods for the class *****/

    public String getName() {
        return this.name;
    }
    public String getKind() {
        return this.kind;
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
    /*******************************************/

    /****** These are the setter methods *******  
    public void setName(String name) {
        this.name = name;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }
//    public void setRace(String race) {
//        this.faction = faction;
//    }
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
    /*******************************************/
    
    /*************************** toString method *******************************************
     * @return the character sheet when the object is called.                              *
     * @Overr used to override the object output                                           *
     *                                                                                     */
    @Override
    public String toString() {
        return String.format("Enemy sheet\n" + "Enemy name: %s\nKind: %s\n"
                + "Race: %s\nLevel: %d\nHP: %d\nMP: %d\nEXP: %.2f",
                this.name, this.kind, this.race, 
                this.level, this.hp, this.mp, this.exp);
    }//toString
    
}//class
