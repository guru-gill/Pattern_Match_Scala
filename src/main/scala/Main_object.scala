object Main_object {
  def main(args: Array[String]){

var data=new PattenMatch()

    var data2= data.reverse(List.range(0,11))
     println(data2)
    var even=data.pickeven(List.range(1,20))
    println(even)
    var even1=data.pickeven1(List[Int](2,1,5,6,8,5,4,1))
    println(even1)
    println(data.matchTest('_'))
  }
}
