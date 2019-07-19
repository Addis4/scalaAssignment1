object question1 extends App {
def lastElement(list : List[Int]) : Int = {
var c = 0 
for(i<- list) c += 1
c
}
//val list = List(1,2,3,4,5)
val last = lastElement(List(1,2,3,4,5))
println(last)
 }
