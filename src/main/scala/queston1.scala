object question1 extends App {
def lastElement(list : List[Int]) : Int = {
var c = 0 
for(i<- list) c += 1
list(c-1)
}
//val list = List(1,2,3,4,5)
//val last = lastElement(List(1,2,3,4,8))
println(lastElement(List(1,2,3,4,8)))
 }
