object question4 extends App {
def noOfElements(list: List[Int]) : Int = {
var count = 0
for(i <- list) count += 1
count
}
val list = List(1,2,3,4,5,6,6)
println(noOfElements(list))
}
