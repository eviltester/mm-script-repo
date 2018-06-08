# Some FreePlane Scripts

A repo to store freeplane scripts that I wrote for use with https://www.freeplane.org

## Scripts

FreePlane already has a very good collection of Scripts on their wiki. These are a very useful starting point for creating your own scripts.

- https://www.freeplane.org/wiki/index.php/Scripts_collection
- https://www.freeplane.org/wiki/index.php/Scripting:_Example_scripts_using_external_libraries
- https://www.freeplane.org/wiki/index.php/Scripting_text_editing
- https://www.freeplane.org/wiki/index.php/Script_incubator

If you don't find a script that is close to what you need then check out the Scripting and Scripting API pages

- https://www.freeplane.org/wiki/index.php/Scripting

## How to load a script

- Find your scripts directory:
    - start FreePlane
    - `tools\Open user directory`
    - locate `\scripts`
- Copy the `.groovy` file for the script in the `\scripts` directory
- Restart Freeplane

Now that Freeplane is running, you can amend the `.script` and each time it is run it will pick up the new changes from the file system.

**When creating your own scripts, remember that the filename is the classname so it needs to be valid syntax e.g. `my-new-script.groovy` would trigger an error in Freeplane by `myNewScript.groovy` or `MyNewScript.groovy` would be fine. And it would show up in the `Tools \ Scripts` menu as `My New Script`