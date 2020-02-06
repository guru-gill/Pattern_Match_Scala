class PattenMatch {

  // Reverse List using Pattern matching

  def reverse(list:List[Int]):List[Int]= {
    list match {
      case ::(head, next) =>reverse(next):+head
      case Nil =>List[Int]()
    }
  }
  //pick even number from shored list
  def isEven(number: Int) = number % 2 == 0
  def pickeven(list:List[Int]):List[Int]= {
    list match {
      case Nil => List[Int]()
      case List(_) => List[Int]()
      case head1 :: head2 :: tail => head2 :: pickeven(tail)
    }
  }
    //pick even number from unshored list
    def pickeven1(list:List[Int]):List[Int]= {
      list match {
        case Nil => List[Int]()
        case List(_) => List[Int]()
        case ::(head, next) => if (isEven(head))

          head :: pickeven1(next)
        else
          pickeven1(next)


      }
    }
      def matchTest(x: Any): Any = x match {
        case 1 => "one"
        case "two" => 2
        case y: Int => "scala.Int"
        case _ => "many"
      }


}
