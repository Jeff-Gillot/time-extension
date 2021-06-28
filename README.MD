##Time extensions
[![](https://jitpack.io/v/Jeff-Gillot/time-extension.svg)](https://jitpack.io/#Jeff-Gillot/time-extension)
[![](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

###How to use

```kotlin

val oneSecond = 1.second()
val tenSeconds = 10.seconds()

val twoDaysThreeHours = 2.days() + 3.hours()

val days = 3.days()
val hours = 3.hours()
val minutes = 3.minutes()
val seconds = 3.seconds()
val milliseconds = 3.milliseconds()
val nanoseconds = 3.nanoseconds()

//Also works with doubles (be careful about rounding errors)
val ninetyMinutes = 1.5.hours()

//It is just a shortcut to java.time.Duration
val threeHours = 3.hours()
val threeHours = Duration.ofHours(3)
```

###Installation
[Full installation guide](https://jitpack.io/#Jeff-Gillot/time-extension/1.0.0)

Add the JitPack repository to your `build.gradle`:
```groovy
allprojects {
	repositories {
		maven { url "https://jitpack.io" }
	}
}
```

Add the dependency to your project:
```groovy
dependencies {
    implementation 'com.github.Jeff-Gillot:time-extension:1.0.0'
}
```
###Licence
Copyright 2021 Jean-François Gillot

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.