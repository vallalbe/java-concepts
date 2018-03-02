package com.interview.questions

/**
  * @author PARIVALLAL R
  */
object RecursiveFunction {
  def main(args: Array[String]): Unit = {
   // print(factorial(4))
    tuples()
  }

  /*
  RecursiveFunction example
  factorial(4)
    if (4 == 0) 1 else 4 * factorial(4 - 1)
    4 * factorial(3)
    4 * (3 * factorial(2))
    4 * (3 * (2 * factorial(1)))
    4 * (3 * (2 * (1 * factorial(0)))
    4 * (3 * (2 * (1 * 1)))
    24
   */
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }
  def tuples()={
    val stuff = (42, "fish")
    println(stuff.getClass)
    val things = ("a", 1, 3.5)
    println(things.getClass)
    println(things._1)
    println(things._2)
    println(things._3)
    def getUserInfo = ("Al", 42, 200.0)
    val(name, age, weight) = getUserInfo
    val t = ("Al", 42, 200.0)
    t.productIterator.foreach(println)
  }
}
