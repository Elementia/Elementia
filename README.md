# For Players
If you are interested in running beta-versions of this mod, go ahead and check if there are any functional versions [here](https://github.com/Elementia/Elementia/releases).

# For Developers
Simply clone this repository and run setup.bat if you are on Windows. If you are on another operating system, clone the repository and navigate to the directory in terminal. Then run the following commands:
```
bash gradlew setupDevWorkspace

# If you are using eclipse
bash gradlew eclipse

# If you are using intellij
bash gradlew idea
```

When you are satisfied with your changes in your preferred IDE, build it using this command:
```
# Windows
.\gradlew.bat buildNeeded

# Linux/Mac
bash gradlew buildNeeded
```

If you decide to contribute your changes to this repository, you should also add appropriate javadoc comments to your methods and run the following command as well:
```
# Windows
.\gradlew.bat javadoc

# Linux/Mac
bash gradlew javadoc
```

# IF YOU ARE EXPERIENCING ISSUES WITH ECLIPSE/IDEA

Run the following command(s):
```
# If you are using Eclipse
	# Windows
	.\gradlew.bat cleanEclipse

	# Linux/Mac
	bash gradlew cleanEclipse

# If you are using IntelliJ
	# Windows
	.\gradlew.bat cleanIdea

	# Linux/Mac
	bash gradlew cleanIdea
```

You can take a look at other Gradle commands if you are curious by running the "tasks" command:
```
# Windows
.\gradlew.bat tasks

# Linux/Mac
bash gradlew tasks
```

Happy developing!