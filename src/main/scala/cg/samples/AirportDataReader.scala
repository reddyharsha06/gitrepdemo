package cg.samples

import org.apache.log4j.Logger

import scala.io.Source

object AirportDataReader  {
  val logger = Logger.getLogger("micheal")

  def main(args: Array[String]): Unit = {
//    logger.info("Reading file " + fileName );
//    val lines = Source.fromFile(fileName).getLines();
//    logger.info("File Read Successfully ");
//    lines.foreach(line => logger.info(line));


    val fileName = "d:/inputData/airports.csv"
    val lines = Source.fromFile(fileName).getLines();
    lines foreach println
    println(lines.size);

//    val a = Array(1,2,3,4,5,6);
//    a foreach println
//    println(a.size);

    //lines.filter
    //lines.collect
    //lines.map



    // the airport has lot of data
  }
}
