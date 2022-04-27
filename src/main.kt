package solution

fun twoOldestAges(ages: Array<Int>):ListOf<Int> {
//   var x = max.ages()
    var x =ages.toList()
    println(x.maxOrNull())
    return x.maxOrNull()

}
fun main(){
    twoOldestAges(arrayOf(50,60,78,68))
}
