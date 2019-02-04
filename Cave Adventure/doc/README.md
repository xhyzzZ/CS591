# Cave Adventure
This is a java OOD game project for CS591, which defines whether a player can finish the task after completing many steps of work.

### The System diagram
<img align = center src = "https://github.com/xhyzzZ/CS591/blob/master/Cave%20Adventure/doc/Diagram.jpg">

This system diagram describes how the game works for serveral parts.
Matters or rules need attention:
* Attack the monster first, then you can pick up the treasure, otherwise you will go into rest(first penance).
* If you slay the monster without picking up treasure, it will force you to end the game and start again.
* Follow the order that attack the mosnter first, then pick up the treasure, this will make you finish the game successfully.
* There is always a rest(first penance) in each one of the adventures if you pick up treasure first without slaying the monster, but there is only one second chance(penancne) you can pick up treasure without exiting the game. I make this second treasure appear in these three treasures randomly at one time.
* If there is no second treasure, if you still pick up treasure when you are awake from rest, you will exit the game.
* Also, if you stiil want to pick up second treasure without attacking the monster, you will exit the game too. If you attack the monster during the period of second treasure, you will be back to the adventure you wrongly enter first.

### OOD Design
For the main parts, you can refer to the OOD document file. But here I want to conclude my ood design is a few words.
* Build serveral classes, methods and object so that they can refer to each other, which certainly meets the principle of the OOD Design .
* For some duplicated parts, build reusable function to decrease the lines of code, making code more precise and clean.
* For more detailed about the OOD Design, you can look at my OOD document.

### Some tips need to be attentioned
* I use [IDEA](https://www.jetbrains.com/idea/) to build the project, if you are encountered some problems when using Eclipse or terminal, please contact me ASAP.
* In the doc folder, I put my Diagram.jpg and random song text file. In the txt file, I put some animal words in it, so that in the first penance, I can generate some random songs for each time running this function. Only one need to be attentioned: 
in the Random class, generateSongs fucntion:
The path which reads file is in my computer, so if you want to add mroe words in the txt file and then generate random songs, you should change the path for your computer, using IDEA can generate path easily. 

<img align = center src = "https://github.com/xhyzzZ/CS591/blob/master/Cave%20Adventure/doc/porblem.jpg">


