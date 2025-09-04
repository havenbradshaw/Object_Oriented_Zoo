Level 1:

Created abstract Animal class capable of making sound. 
Added 3 subclasses (Bird, Mammal, Reptile) that override the sound abstract method in animal and gave them their own sounds.
Created 3 interfaces (Flyable, Walkable, Sunbathes) and implemented them into subclasses.

Created and stored animals in an ArrayList, looped through and called them and had them output their respective movements and sounds.

AI: Used Copilot help with autocompletion and debugging as I went.

Level 2:

Created the other 2 of the 3 Interfaces.
Added walkable to both bird and mammal.
Updated Main.Java.

AI: Used Copilot to help me update Main.

Level 3: 

After much anguish, finally refactored everything into correct files (animals, interfaces, main)

Created a ZooManager class that puts new animals into the zoo (array) and then displays them on the screen. 
The ZooManager then takes user input to choose one of the animals and outputs that animals name, sound and movement type.
Gave the ZooManager exception handling to ensure that if user input exceeds or goes below the number of available animals then an error message will be output. 
Updated Main to run ZooManager.

AI: Ran into an issue when refactoring everything into files. I was getting errors saying that no such packages existed and it seemed there was an issue with how I had the hierarchy set up.
I consulted both Copilot and GPT and no matter what I did, the errors persisted. After opening the app for about the dozenth time, it suddenly all worked and I had 0 errors (out of the 62 I had before).

Also used AI to help set up ZooManager and autocomplete my JavaDoc.
