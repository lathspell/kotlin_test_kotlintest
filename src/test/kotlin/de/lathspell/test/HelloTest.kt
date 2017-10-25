package de.lathspell.test

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Example of a StringSpec Test.
 *
 * StringSpec is an abstract class which has to be extended. This is done by our HelloTest.
 *
 * The declaration contains a "()" after "StringSpec" thus the constructor of StringSpec is called upon instantiation
 * of HelloTest. The constructor takes one parameter of type lambda. It is passed here using the postfix notation.
 * The big code block thus is not the class definition of HelloTest but rather the first constructor parameter of
 * StringSpec!
 *
 * "init" is the Kotlin keyword for the default constructor. Here, it's not a constructor declaration but rather a
 * call to the constructor method "init" inside the above mentioned lambda block. It too takes a lambda function as
 * first paramter. What we see as "body of the test" is actually the lambda paramater to init().
 *
 * The StringSpec class contains an extension operator "String.invoke()" so whenever a String variable or literal
 * is invoked like a method that extension function is called. This extension is local to the StringSpec class.
 * Here the test name is a String literal which gets invoked. A lambda paramter (the assertion body) is passed as
 * postfix parameter to the invoke() method.
 *
 * The StringSpec class also contains several infix extension functions for common types like Int or String with
 * names like "shouldBe" and "shouldNotBe". Those are called to test the assertion. That line could as well be
 * written as: Int.shouldBe("hello".length, 5)
 */
class HelloTest : StringSpec() {
    init {
        "length should return size of string" {
            "hello".length shouldBe 5
        }

    }
}
