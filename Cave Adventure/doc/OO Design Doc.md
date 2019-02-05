# CS591 OO Design Document
The java program has seven classes and one main function.
* [Actions classes](#Actions-classes)
* [Adventures classes](#Adventures-classes)
* [Monsters classes](#Monsters-classes)
* [Treasures classes](#Treasures-classes)
* [Random classes](#Random-classes)
* [Penances classes](#Penances-classes)
* [Helperfunctions classes](#Helperfunctions-classes)

## Actions classes
This class defines actions what should you do when you enter into new place(accessor method). For example,
- Object composition:
```
private String cleanCobWebs;  // first action

```
- struct method:
```
public Actions() {
    //initialize object
    this.cleanCobWebs = "clean up all the cob webs";  
}
```
- accessor method:
```
public String getCleanCobWebs() {
    // get the first action
    return cleanCobWebs;      
}
```
When you have met this question:
```
You have ventured deeper into the cave, what would you like to do?
    1) Attack the evil wombat and turn off the goblin’s water supply 
    2) Pick up the golden shield
```
Option one is one of the functions defined in actions class called getCleanCobWebs( ).
## Adventures classes
This class defines what should you do when you pick up treasures or slay one of the monsters(included accessor method). For example,
- Object composition:
```
private String enter;  // enter first adventure

```
- struct method:
```
public Adventures() {
    //initialize object
    this.enter = "entering the mouth of the cave";  
}
```
- accessor method:
```
public String getEnter() {
    // get the first enter adventure
    return enter;      
    
}
```
- other method:
```
public String moveToNext() {
    // return the sentence after pick up treasure successfully
    return "Move on to the next adventure"; 
}

public String attackGoblin() {
    // return the sentence for the attack monster funtion
    return "Attack the evil" + " " + monsters.getGoblin() + " and" + actions.getCleanCobWebs();
}
```
When you have met this question:
```
You slayed the evil goblin and are sill alive, what would you like to do? 
    1) Move on to the next adventure 
    2) Pick up the golden sword
```
Option one is one of the functions defined in actions class called moveToNext( ).
```
You have ventured deeper into the cave, what would you like to do?
    1) Attack the evil wombat and turn off the goblin’s water supply 
    2) Pick up the golden shield
```
The title is one of the functions defined in adventures class called getGoDeeper( ).

## Monsters classes
This class defines and initializes accessor method for getting monster’s name. For example,
- Object composition:
```
private String goblin;  // goblin's name

```
- struct method:
```
public Monsters() {
    //initialized object
    this.goblin = "goblin";
}
```
- accessor method:
```
public String getGoblin() {
    // return monster's name
    return goblin;
}
```
## Treasures classes
This class defines accessor methods and methods of treasures which needed to be picked up. For example,
- Object composition:
```
private String sword;;  // sword name

```
- struct method:
```
public Treasures() {
    //initialized object
    this.sword = "sword";
}
```
- accessor method:
```
public String getSword() {
    // return treasure's name
    return sword;
}
```
-other method:
```
public String pickUpSword() {
    // return sentence for picking up the treasure 
    return "Pick up the golden" + " " + this.getSword();
}
```

## Random classes
This class defines method in generating random animal in song Old MacDonald had a Farm called generateSongs( ). 
```
public String generateWords()
// the core part is random sort 
Collections.shuffle(words);
```
Define final mission about randomly selecting and sorting word method called generateWords( ).
```
// pay attention to the path, the path is in your computer
public String generateSongs()
```
Define method of randomly select one of the adventures to have a second treasure function called generateRandomArray( ).
```
public boolean[] generateRandomArray()
```

## Penances classes
This class define penance methods like singing MacDonald or Christmas called songOldMacDonald( ) and songChristmas( ). 
```
// generate random animal word using method in class Random
public String songOldMacDonald()

public String songChristmas()
```
Define penance methods about picking up treasure without slaying the monsters for the first and second time. For example,
```
// pick up treasure without slaying the monsters
public String goblinPenance()

// pick up second treasure without slaying the monsters
public String afterSecondGoblinPenance()
```

## Helperfunctions classes
This class contains all the methods in the whole lifecycle of the game, I divide them into five parts.
* first part -- welcome part
```
public void welcome()
public void acceptChallenge(String decision)
```
* second part -- first adventure part
```
public void readyToEnter(String decision)
public void enterTheMouthOfCave(String decision)
```
* third part -- second adventure part
```
public void moveOnToDeeper(String decision)
public void enterDeeper(String decision)
```
* forth part -- third adventure part
```
public void moveToTheEnd(String decision)
public void enterTheEnd(String decision)
```
* fifth part -- final part
```
public void moveToTheFinalMission(String decision)
public void enterFinalMission(String decision)
```
What’s more, there are several special situations when encountered like you still want to pick up treasures when you are after second penance or attack the monster after first or second penance. 
At last, main method is based on class of Helperfunctions.
