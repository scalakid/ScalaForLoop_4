/**
 * Created by ADMIN on 21-Oct-15.
 * A scala for loop that takes a list of numbers as input,
 * creates another list that contains 2*(even numbers less than 8 in first list)
 * using 'yield'.
 */
object ScalaForLoop_4 {

  def main(args:Array[String])
  {
    val numList1 = List(1,2,3,4,5,6,7,8,9,10)

    val numList2 = for(i<-numList1 if(i%2==0) if(i<8) )yield i*2 //creates 2nd list of numbers with
                                                                 //specified conditions
    println("New list of numbers created is : ")

    for(i<-0 until numList2.length)   //just to print the new list created
      println(numList2(i))

  }


}
