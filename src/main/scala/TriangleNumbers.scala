import scala.collection.mutable.ListBuffer
object TriangleNumbers {
  def main(args:Array[String]):Unit = {
    var divisors = 0
    var current_num = 1
    var result = 0
    while (divisors < 501) {
      divisors = 0
      result = 0
      var naturals = (1 to current_num).toList
      naturals.foreach{result += _}
      var temp = 1
      var divisor_list:ListBuffer[Int] = new ListBuffer[Int]()
      while (temp < result/2) {
        if (result%temp == 0) {
          //println("here")
          if (!divisor_list.contains(temp)) {
            divisor_list += temp
            if (temp != result/temp) {
              divisor_list += (result/temp)
            }
          }
        }
        temp += 1
      }
      divisors = divisor_list.length
      current_num += 1
      if (current_num%1000 == 0) {
        println(current_num, result, divisors)
      }

    }
  }
}
