package cg.samples

import org.apache.log4j.Logger

object Calculator extends App{
  val logger = Logger.getLogger("root");

  def add(num1:Int, num2:Int): Int = {
    //logger.info(s"Entered Calculator.add(${num1}, ${num2})")
    val result = num1+num2;
    //logger.info(s"Exited Calculator.add(${num1}, ${num2})")
    result;
  }


}
