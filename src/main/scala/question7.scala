object question7 extends App {
  def flatten(listmain: List[Any]): List[Any] = {
    def listmain(lists: List[Any]): List[Any] = {


      for (i <- lists) {

        i match {
          case List() => i
          case x :: xs1 => x :: listmain(xs1, i)
        }
      }


      val merge = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
      println(merge)
    }
  }
}
