===============
Yaidom exercise
===============

This programming exercise uses the `yaidom`_ XML querying library for XML processing.

The following knowledge is assumed before starting with this exercise:

* Basic XML knowledge, about XML syntax and XML namespaces (see below)
* Some very basic knowledge about XBRL instances (see below)
* Basic knowledge of Scala and its Collections API

Yaidom is gently introduced through the use of exercises. The exercises have the form of unit tests that
must be made to succeed.

.. _`yaidom`: https://github.com/dvreeze/yaidom


Preparation
===========

Fork this (Scala SBT) project from Github, at `Yaidom-exercise`_. Make sure to either have an installation of `SBT`_ or
`Maven`_ available. Also make sure to have a Java JDK 8 installed.

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

The exercise leads to some practical experience with the **yaidom** XML querying (Scala) library.

First, make sure to have a good grasp of XML Namespaces. It may be advisable to read `Understanding Namespaces`_
to that end. After that, consider reading some `yaidom documentation`_, to familiarize yourself with the yaidom API.

Next, turn to the exercise. In the test source tree, fill in the missing parts in tests ``QuerySpec``, making
the tests run successfully.

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

Note that in comparison the Scala XML library does not offer this flexibility in supporting multiple "backends" and "dialects".
Neither does it enforce the creation of namespace-well-formed XML. For these reasons, yaidom had to be developed as an
alternative that is more suitable in domains like XBRL.

.. _`Understanding Namespaces`: http://www.lenzconsulting.com/namespaces/
.. _`yaidom documentation`: http://dvreeze.github.io/

