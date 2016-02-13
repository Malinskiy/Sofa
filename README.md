[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.malinskiy/sofa/badge.svg)]
(https://maven-badges.herokuapp.com/maven-central/com.malinskiy/sofa) [![Build Status](https://travis-ci.org/Malinskiy/Sofa.svg?branch=master)](https://travis-ci.org/Malinskiy/Sofa)

# Handling the exceptions:

```java
try {
    something;
} catch(Exception e) {
    StackOverflow.search(e);
}
```
# Sofa
So probably you're tired of copy pasting logcat exceptions and stack traces into search, right? Now you can click links inside the logcat and browse for possible resolutions.

# Usage
Just install this comfy sofa into your application:
```java
public class MainApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        Sofa.install();
    }
}
```

and you'll see [StackOverflow](http://stackoverflow.com) search links in your logcat

```
E/Sofa: http://stackoverflow.com/search?q=android.os.NetworkOnMainThreadException
```


## Get it

Gradle:
```groovy
repositories {
    ...
    mavenCentral()
    ...
}
...
dependencies {
    ...
    compile 'com.malinskiy:sofa:0.1.0'
    ...
}
```

Inspired by [Jordan Hall's](https://github.com/DivineOmega) [post](https://twitter.com/DivineOmega/status/695744177557106688)

## License

```
Copyright 2016 Anton Malinskiy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
    
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and   limitations under the License.
```
