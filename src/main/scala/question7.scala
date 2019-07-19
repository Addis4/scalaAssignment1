object question7 extends App {
def flatten(listmain: List[Int]): List[Int] = {
def listmain(lists: List[Int]): List[Int] = {

/*  list1 match {
case List() => list2
case x :: xs1 => x :: flatten(xs1, list2)
}  
*/


val merge = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
println(merge)
}
