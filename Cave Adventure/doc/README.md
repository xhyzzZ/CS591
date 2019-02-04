# Cave Adventure
This is a java OOD game project for CS591, which defines whether a player can finish the task after completing many steps of work.

### The System diagram
<img align = center src = "https://github.com/xhyzzZ/CS591/blob/master/Cave%20Adventure/doc/Diagram.jpg">

This system diagram describes how the game works for serveral parts.
Matters need attention:
* Attack the monster first, then you can pick up the treasure, otherwise you will go into rest(first penance).
* If you slay the monster without picking up treasure, it will force you to end the game and start again.
* Follow the order that attack the mosnter first, then pick up the treasure, this will make you finish the game successfully.
* There is always a rest(first penance) in each one of the adventures if you pick up treasure first without slaying the monster, but there is only one second chance you can pick up treasure without exiting the game. I make this second treasure appear in these three treasures randomly at one time.
* If there is no second treasure, if you still pick up treasure when you are awake from rest, you will exit the game.
* Also, if you stiil want to pick up second treasure without attacking the monster, you will exit the game too.



