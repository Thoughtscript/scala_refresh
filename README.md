# Scala Review and Refresh

[![](https://img.shields.io/badge/Scala-3.2.1-red.svg)](https://www.scala-lang.org/)
[![](https://img.shields.io/badge/Java-1.18-blue.svg)](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)
[![](https://img.shields.io/badge/Scala-Plugin-red.svg)](https://plugins.jetbrains.com/plugin/1347-scala)
[![](https://img.shields.io/badge/sbt-1.7.3-blue.svg)](https://www.scala-sbt.org/download.html)

Scala review and refresh.

## Setup and Use

I found the easiest way to get Scala set up on Windows 11 is to:

1. Install the [Scala Plugin](https://plugins.jetbrains.com/plugin/1347-scala) through IntelliJ.
2. Make sure to set **Project Structure** > **Platform Settings** > **Global Libraries** to: `scala-sdk-2.13.10`.

   ![](./img/Screenshot%202022-11-09%20172252.png)

3. Make sure to set **Project Structure** > **Project Settings** > **Project** > **SDK** to: Java `18`.

    ![](./img/Screenshot 2022-11-09 172401.png)

## sbt

To compile build and run Scala files/apps:

1. Open **Run** > **Edit Configurations** > **sbt Task**

   ![](./img/Screenshot 2022-11-09 175724.png)

2. Assuming a valid `build.sbt` configuration file and a main method (`@main`) exists within the `src/main/scala` classpath, a **Build** command will be automatically added to the defined task.
3. Add `run` to **Tasks**.
4. Then run the named task.

## Resources

1. https://docs.scala-lang.org/scala3/book/methods-main-methods.html
2. https://docs.scala-lang.org/getting-started/intellij-track/getting-started-with-scala-in-intellij.html
3. https://www.tutorialspoint.com/scala
4. https://www.baeldung.com/scala/scala-3-main-methods
5. https://docs.scala-lang.org/tour/tour-of-scala.html
6. https://stackoverflow.com/questions/1791408/what-is-the-difference-between-a-var-and-val-definition-in-scala