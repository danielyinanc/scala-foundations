package ca.mobilelive.helloworld.errorhandling

import java.net.URL
import scala.util.Try

object ErrorHandling {
  // A typical try catch block
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }

  def parseURL(url: String): Try[URL] = Try(new URL(url))
  val url = parseURL("URL: ") getOrElse new URL("http://duckduckgo.com")

  parseURL("http://danielwestheide.com").map(_.getProtocol) // results in Success("http")
  parseURL("garbage").map(_.getProtocol) // results in Failure(java.net.MalformedURLException: no protocol: garbage)
}
