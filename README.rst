===============
Yaidom exercise
===============

This programming exercise uses the `yaidom`_ XML querying library for XML processing.

The following knowledge is assumed before starting with this exercise:

* Basic XML knowledge, about XML syntax and XML namespaces (see below)
* Some very minimal knowledge about XBRL instances (see below)
* Basic knowledge of Scala and its Collections API

Learning (enough) about the yaidom library is seen as part of the exercise.

The exercise has the form of a unit test that must be made to succeed. It tests the ability
to query XML using Scala and yaidom.

.. _`yaidom`: https://github.com/dvreeze/yaidom


Preparation
===========

Fork this (Scala SBT) project from Github, at `Yaidom-exercise`_. Make sure to either have an installation of `SBT`_ or
`Maven`_ available. Also make sure to have a Java JDK 8 installed.

The use of an IDE like Eclipse (Scala-IDE) or IntelliJ is not required, but can be handy (for its syntax highlighting and more).
Tips for importing a Maven or sbt project into Eclipse (Scala-IDE) or IntelliJ can be found on the internet, if needed.

Also download the API documentation of the yaidom library from `Maven central`_. Alternatively,
bookmark the `yaidom API documentation`_ at `javadoc.io`_.

During the exercise, the **yaidom API documentation** will be needed extensively, so it is advisable to
have this documentation at your disposal in a browser.

.. _`Yaidom-exercise`: https://github.com/dvreeze/yaidom-exercise
.. _`SBT`: http://www.scala-sbt.org/download.html
.. _`Maven`: https://maven.apache.org/download.cgi
.. _`Maven central`: https://search.maven.org/
.. _`yaidom API documentation`: https://www.javadoc.io/doc/eu.cdevreeze.yaidom/yaidom_2.12/1.7.1
.. _`javadoc.io`: http://javadoc.io/


The exercise
============

This programming exercise is not only a particular programming test, but it also (intentionally) leads to some practical experience with
the **yaidom** XML querying (Scala) library.

First, make sure to have a good grasp of XML Namespaces. It may be advisable to read `Understanding Namespaces`_
to that end. After that, consider reading some `yaidom documentation`_, to familiarize yourself with the yaidom API.
The top-level page of the `yaidom API documentation`_ gives an overview of the API, by way of several examples.

The exercise is about XML processing, but it uses `XBRL`_ as the sample "XML dialect". Please read `Getting started with XBRL for developers`_.
It takes very little time to read. Then have a look at the `sample XBRL instance`_ uses in the exercise. The content of that
XBRL instance document should then make sense, in how facts, contexts and units "hang together" (via references to ID attributes).

Next, turn to the exercise. In the test source tree, fill in the missing parts in test case ``QuerySpec``, making
the test case run successfully.

It is important to not just make the tests compile and run successfully, but also to review how each test does what
the test description says it does. For example, there may be a test in which descendant-or-self elements of some element are
queried, where the query method itself has already been given, and where the missing piece to implement is only an
element predicate. It is not enough to implement this missing piece. It is also important to understand how the complete
test does what it says it does.

After doing the exercise, the following should be clear:

* Yaidom offers a sound XML query API, interoperating well with the Scala Collections API, and respecting XML namespaces
* The yaidom ``BackingElemApi`` element query API abstraction can be backed by multiple different XML DOM-like implementations, such as Saxon

Although this is not shown here, yaidom is not only flexible in the choice of the underlying XML DOM-like implementation,
but it is also a basis for creating arbitrary "yaidom dialects" on top of it, as "specific type-safe DOM trees".
This is probably the real benefit of yaidom, as is illustrated by projects like `TQA`_ (for XBRL querying).
Indeed, using TQA would have made this exercise a lot easier, because of its higher level of abstraction.

Note that in comparison the Scala XML library does not offer this flexibility in supporting multiple "backends" and "dialects".
Neither does it enforce the creation of namespace-well-formed XML. For these reasons, yaidom had to be developed as an
alternative that is more suitable in domains like XBRL.

.. _`Understanding Namespaces`: http://www.lenzconsulting.com/namespaces/
.. _`yaidom documentation`: https://dvreeze.github.io/yaidom-and-namespaces.html
.. _`yaidom API documentation`: https://www.javadoc.io/doc/eu.cdevreeze.yaidom/yaidom_2.12/1.7.1
.. _`XBRL`: https://www.xbrl.org/
.. _`Getting started with XBRL for developers`: https://www.xbrl.org/the-standard/how/getting-started-for-developers/
.. _`sample XBRL instance`: https://github.com/dvreeze/yaidom-exercise/blob/master/src/test/resources/sample-Instance-Proof.xml
.. _`TQA`: https://github.com/dvreeze/tqa

