# -Java-Decompiler-by-Moddy
Java decompiler created by me and open source.

![JavaDecompiler](https://github.com/ModdyCraft/-Java-Decompiler-by-Moddy/blob/content/javadecompiler.png)

----

## Features
- You can decompile class files much faster and safer.
- Generate commands with the data you enter so that you decompile manually.
- It will never execute a command without your consent.
- The run button only creates a file .bat with a command to decompile the files you want.

----

## How to use Java Decompiler
In the application we have a section that says "Direccion", what we must place is the path to the folder that we are going to decompile for example:
C:\\users\\username\\documents\\, but we should not place the folder with the files to be decompiled.

Image to find the path

![JavaDecompiler](https://github.com/ModdyCraft/-Java-Decompiler-by-Moddy/blob/content/javadecompiler5.png)
![JavaDecompiler](https://github.com/ModdyCraft/-Java-Decompiler-by-Moddy/blob/content/javadecompiler6.png)

In the text field "Carpeta con archivos" we must place only the name of the folder that contains the files that we are going to decompile and in the text field "Destino" you must place the name of the folder where you want the unzipped files to be saved.

Clarifications the folders will not be generated automatically just by putting the name, you have to create the folders beforehand.

![JavaDecompiler](https://github.com/ModdyCraft/-Java-Decompiler-by-Moddy/blob/content/javadecompiler%201.png)

----

### Button actions
> "Generar comando" button
> > It only generates a command that you can run in the Windows console, but before executing the command you must go to the folder that contains the two folders both the folder that contains the files to be decompiled and the destination folder of the decompiled files.
>
> "Ejecutar" button
> > This button does not execute anything the only thing that makes you create a file .bat with the commands and that can be executed from wherever you want, you can find this file in the Documents folder of your pc within the outputsJD folder, you will find the newly generated file with the name of the folder that contains the files to decompile.
>
> "Copiar" button
> > Pressing this button will copy the command to your clipboard if you pressed the "Generar comando" button, or else it will copy to your clipboard the path where the file is located .bat that you generated when you pressed the "Ejecutar" button.
