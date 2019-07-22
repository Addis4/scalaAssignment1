import scala.collection.mutable.ListBuffer

object question13 extends App{


    val Encode = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e ,'e))
    println(Encode)

    def encode(list: List[Symbol]): List[Any] = {
      var c = 0
      val list1 = ListBuffer[Any]()
      //var pair = (1,'k)
      for (i <-0 to list.length) {
        c += 1
        if (list(i) != list(i+1)) {
          val pair =Tuple2(c,list(i))
          c= 0
          list1 +=  pair
        }

      }
      List(list1.toString)
    }
  }







}
