package cg.samples

import org.apache.log4j.Logger

import scala.io.Source

object AirportDataReader  {
  val logger = Logger.getLogger("micheal")

  def main(args: Array[String]): Unit = {
    val fileName = "d:/inputData/airports.csv";
    logger.info("Reading file " + fileName );
    val lines = Source.fromFile(fileName).getLines();
    logger.info("File Read Successfully ");
    lines.foreach(line => logger.info(line));

    // the airport has lot of data
  }
}
