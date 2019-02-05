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
    this.cleanCobWebs = "clean up all the cob webs";  //initialize object
}
```
- accessor method:
```
public String getCleanCobWebs() {
    return cleanCobWebs;      // get the first action
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

## Monsters classes

## Treasures classes

## Random classes

## Penances classes

## Helperfunctions classes
