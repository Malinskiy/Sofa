[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.malinskiy/sofa/badge.svg)]
(https://maven-badges.herokuapp.com/maven-central/com.malinskiy/sofa) [![Build Status](https://travis-ci.org/Malinskiy/Sofa.svg?branch=master)](https://travis-ci.org/Malinskiy/Sofa)

# Sofa
Tired of copy pasting logcat exceptions and stack traces into search? Now you can click links inside the 
logcat and browse for possible resolutions. 

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
