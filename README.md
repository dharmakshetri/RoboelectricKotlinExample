## RoboelectricKotlinExample

[Roboeletic](https://github.com/robolectric/robolectric) example in kotlin.
Running tests on an Android emulator or device is slow! Building, deploying, and launching the app often takes a minute or more. That’s no way to do TDD. There must be a better way.

[Robolectric](http://robolectric.org/) is a unit test framework that de-fangs the Android SDK jar so you can test-drive the development of your Android app. Tests run inside the JVM on your workstation in seconds.

### Install
Starting a New Project

If you'd like to start a new project with Robolectric tests you can refer to deckard (for either maven or gradle) as a guide to setting up both Android and Robolectric on your machine.

#### Gradle

`testCompile "org.robolectric:robolectric:3.5.1"`

#### Maven

```
<dependency>
   <groupId>org.robolectric</groupId>
   <artifactId>robolectric</artifactId>
   <version>3.5.1</version>
   <scope>test</scope>
</dependency>
```


### Used Technology
- [Android](http://developer.android.com/)
- [Roboeletic](https://github.com/robolectric/robolectric)
- [Kotlin](https://github.com/JetBrains/kotlin)

### About Me
Android Engineer, [Dharma Kshetri](www.dharmakshetri.me)

