import scala.collection.mutable.ListBuffer
object  question16 extends App {

    def drop(position: Int, list: List[Symbol]): Unit = {

      val bufferlist = ListBuffer[Symbol]()
      for (i <- list) {
        bufferlist += i
      }
      for (i <- 0 to list.length) {
        if (i == position)
          bufferlist --= list
      }

      println(bufferlist)

    }
  drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

