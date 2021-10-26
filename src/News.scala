trait News {
  val title:String
}

case class sportNews(title:String) extends News
case class culturalNews(title:String) extends News

object test extends App{
  def determineType(x: News): String = x match {
    case sportNews(someTitle) => "" + java.time.LocalDate.now + ": " + someTitle
    case culturalNews(someTitle) => someTitle + "!"
  }
  var sportNewsSeq:Seq[String] = Seq(determineType(sportNews("Дубль Тарасенко принёс «Сент-Луису» победу над «Лос-Анджелесом». Она стала 5-й подряд")),
    determineType(sportNews("Овечкин сократил до четырёх шайб отставание от Халла по голам за карьеру в НХЛ")))

  var culturalNewsSeq:Seq[String] = Seq(determineType(culturalNews("11 работ Пабло Пикассо продали за 108,9 млн долларов в США")),
    determineType(culturalNews("В МОН высказались о сериале \"Игра в кальмара\"")))

  sportNewsSeq.foreach((element:String) => println(element+" "))
  println("________________________")
  culturalNewsSeq.foreach((element:String) => println(element+" "))
}
