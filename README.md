# Wava
Web + Java = Wava

An implementation of the [Java Standard Class Library](https://en.wikipedia.org/wiki/Java_Class_Library) for GWT.
  - AWT
  - Swing
  - JavaFX
  - And anything else not the included on [this GWT default list](http://www.gwtproject.org/doc/latest/RefJreEmulation.html)

## How to use
Right now it is not recommended to use this for non-testing purposes. This project is in very alpha stages. But if you do want to use this, it is a normal GWT module.
There is a provided maven plugin to use this with maven

## Maven Plugin
We provide a Maven plugin that you can add to your existing Java project.

Usage of this maven plugin is governed by the [Javazilla Product Licence](https://fungus-soft.com/wava/PLUGIN-LICENCE.txt)

Repository:
```
<pluginRepository>
    <id>javazilla-software</id>
    <url>https://repo.javazilla.com/</url>
</pluginRepository>
```
Plugin:
```
<plugin>
    <groupId>com.javazilla</groupId>
    <artifactId>wava-plugin</artifactId>
    <version>0.0.2-SNAPSHOT</version>
    <executions>
        <execution>
            <phase>compile</phase>
            <goals>
                <goal>convert2GWT</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

