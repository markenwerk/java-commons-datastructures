# Some common datastructures for Java

[![Build Status](https://travis-ci.org/markenwerk/java-commons-datastructures.svg?branch=master)](https://travis-ci.org/markenwerk/java-commons-datastructures)
[![Dependency Status](https://www.versioneye.com/user/projects/56d8144cd71695003886c483/badge.svg)](https://www.versioneye.com/user/projects/56d8144cd71695003886c483)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/commons-datastructures/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/commons-datastructures)
[![Java SE 6](https://img.shields.io/badge/java-SE_6-brightgreen.svg)](http://docs.oracle.com/javase/6/docs/api/)
[![MIT License](https://img.shields.io/badge/license-MIT-brightgreen.svg)](https://github.com/markenwerk/java-commons-datastructures/blob/master/LICENSE)

This is a collection of some common datastructures that describe everyday use cases. It is mainly intended for API providers who don't want to redeclare somewhat trivial datastructures all the time.

## Overview

This library is hosted in the [Maven Central Repository](https://maven-badges.herokuapp.com/maven-central/net.markenwerk/commons-datastructures). You can use it with the following coordinates:

```xml
<dependency>
	<groupId>net.markenwerk</groupId>
	<artifactId>commons-datastructures</artifactId>
	<version>1.1.1</version>
</dependency>
```

Consult the [usage description](#datastructures) and [Javadoc](https://markenwerk.github.io/java-commons-datastructures/index.html) for further information.

## Datastructures

#### Box

This library provides the generic [`Box`][Box], which is an mutable container class that holds a single value.

```java
Foo value = ...

// creates a container that holds value
Box<Foo> box = new Box<>(value);

// returns the contained value
box.getValue();

// update the contained value
box.setValue(new Foo(...));
```

#### Wrapper

This library provides the generic [`Wrapper`][Wrapper], which is an immutable container class that holds a single value.

```java
Foo value = ...

// creates a container that holds value
Wrapper<Foo> wrapper = new Wrapper<>(value);

// returns the contained value
wrapper.getValue();
```

#### Pair

This library provides the generic [`Pair`][Pair], which is an immutable container class that holds two values of similar type.

```java
Foo first = ...
Foo second = ...

// creates a container that holds first and second
Pair<Foo> pair = new Pair<>(first, second);

// returns the contained values
pair.getFirst();
pair.getSecond();

// creates new pair with one changed value
pair.withFirst(new Foo(...));
pair.withSecond(new Foo(...));
```

#### Tuple

This library provides the generic [`Tuple`][Tuple], which is an immutable container class that holds two values of different type.

```java
Foo first = ...
Bar second = ...

// creates a container that holds first and second
Tuple<Foo, Bar> tuple = new Tuple<>(first, second);

// returns the contained values
tuple.getFirst();
tuple.getSecond();

// creates new tuple with one changed value
tuple.withFirst(new Foo(...));
tuple.withSecond(new Bar(...));
```

#### Triple

This library provides the generic [`Triple`][Triple], which is an immutable container class that holds three values of different type.

```java
Foo first = ...
Bar second = ...
Baz third = ...

// creates a container that holds first, second and third
Triple<Foo, Bar, Baz> triple = new Triple<>(first, second, third);

// returns the contained values
triple.getFirst();
triple.getSecond();
triple.getThird();

// creates new triple with one changed value
triple.withFirst(new Foo(...));
triple.withSecond(new Bar(...));
triple.withThird(new Baz(...));
```

#### Entry

This library provides the generic [`Entry`][Entry], which is an immutable container class that a key-value-pair.

```java
Key key = ...
Value value = ...

// creates a container that holds key and value
Entry<Key, Value> entry = new Entry<>(key, value);

// returns the contained values
entry.getKey();
entry.getValue();
```

#### Either

This library provides the generic [`Either`][Either], which is one of two distinct immutable container class that hold a single value; [`Left`][Left] and [`Right`][Right].

```java
Foo foo = ...
Bar bar = ...

// creates a left container that holds foo
Either<Foo, Bar> left = new Left<>(foo);

// creates a right container that holds bar
Either<Foo, Bar> right = new Right<>(bar);

// returns true
left.isLeft();
right.isRight();

// returns the contained values
left.getLeft();
right.getRight();

// returns false
left.isRight();
right.isLeft();
```

[Either]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Either.html
[Entry]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Entry.html
[Left]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Left.html
[Pair]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Pair.html
[Right]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Right.html
[Triple]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Triple.html
[Tuple]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Tuple.html
[Wrapper]: https://markenwerk.github.io/java-commons-datastructures/index.html?net/markenwerk/commons/datastructures/Wrapper.html
