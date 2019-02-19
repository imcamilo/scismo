package imcamilo.com.github.service

import imcamilo.com.github.model.EQCL
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * Created by Camilo Jorquera on 20-01-19
  */
object EQCenterServiceImp {

  val tablePage: Document = Jsoup.connect("http://www.sismologia.cl/links/tabla.html").get
  val trElements: Elements = tablePage.getElementsByTag("tr")
  var dataEQ: mutable.LinkedHashSet[EQCL] = mutable.LinkedHashSet()

  def lastInformation(): mutable.LinkedHashSet[EQCL] = {
    trElements.forEach( row => {
      val tdElements: Elements = row.getElementsByTag("td")
      dataEQ.add(EQCL(row.child(0).text(),row.child(1).text(),row.child(2).text()))
    })
    dataEQ
  }

}