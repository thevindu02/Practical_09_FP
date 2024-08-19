import scala.io.StdIn.readInt

object PatternMatch {

    def main( args:Array[String]):Unit = {

        println("Input the integer: ")

        val number = readInt()

        val whatNumber: Int => String = (num:Int) => num match {

            case x if x <= 0 => "Negative/Zero is input"
            case x if x % 2 == 0 => "Even number is input"
            case _ =>  "Odd number is input"

        }

        val result = whatNumber(number)

        println(result)



    }
}