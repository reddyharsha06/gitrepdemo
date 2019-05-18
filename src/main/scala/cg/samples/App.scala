package cg.samples

import org.apache.log4j.Logger


/**
 * @author ${user.name}
 */
object App {
  val logger = Logger.getLogger("root");

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def main(args : Array[String]) {
    val a = 29;
    logger.debug("Value of A ::: " + a);

    val b = 49
    logger.debug("Value of B ::: " + b);

    logger.debug("Args are ::: " + args);

    logger.info("Main Entered...");
    println( "Hello World!" );
    println("concat arguments = " + foo(args));
    logger.info("Main Exited");
    try {
       100/0
    }catch {
      case e : ArithmeticException=> logger.error(e.getMessage);
    }
  }
}
