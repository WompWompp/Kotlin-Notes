package com.example.myfirstproject

//Arrays

/*
fun main() {

   val myArray = arrayOf("cat","dog","bird","snake")
   myArray.set(0,"Kot")
   myArray[1] = "Pies"
   println(myArray.get(0))
   println(myArray.get(1))
   val a:Int = 0
   for (a in 0..3){
      println(myArray.get(a))
      val a = a + 1
   }


}
 */
/*
fun main(){

   val myArray = arrayOf(1,2,3,4,5)
   println(myArray[3])

}
 */
/*
fun main(){
   val myArray = arrayOf("cat",2,2.2,3,4,7)
   println(myArray[2])
   val arraySize = myArray.size
   println(arraySize)
}

*/

//Lists

/*
fun main() {
   //arrayList
   val myArray = ArrayList<String>()
   myArray.add("Cat")
   myArray.add("Dog")
   println(myArray[0])
   //arrayListOf
   val myArrayListOf = arrayListOf<String>("a","b","c")
   myArrayListOf.add("d")
   println(myArrayListOf[2])
   println(myArrayListOf[3])
   //add to index
   myArrayListOf.add(4,"e")
   println(myArrayListOf[4])
   myArrayListOf.add(0,"01")
   println(myArrayListOf[0])
   //set
   myArrayListOf.set(0,"02")
   println(myArrayListOf[0])
   //any
   val myAnyList = ArrayList<Any>()
   myAnyList.add("a")
   myAnyList.add(1)
   myAnyList.add(true)
   myAnyList.add(2.22)
   println(myAnyList[0])
   }
*/

//Sets
// Don't count the same attribute
/*
fun main() {
    //arrayof vs setof

    val myArray = arrayOf(1,2,2,3,4)
    println(myArray.size)
    val mySet = setOf(1,2,2,2,2,2,2,2,2,2,2,3,3,3,4)
    println(mySet.size)
    //forEach
    mySet.forEach{println(it)}
    //hashset
    val myHashSet = HashSet<String>()
    myHashSet.add("Cat")
    myHashSet.add("Cat")
    println(myHashSet.size)

}
*/

// Hashmap

//fun main(){
    //key value logic

    //val cityArray = arrayOf("ankara","istanbul")
    //val degreeArray = arrayOf(25,27)
    //println("${cityArray[0]} : ${degreeArray}")

    //No index in hashmaps
   // val myHash = HashMap<String,Int>()
   // myHash["ankara"]=25
    //myHash["istanbul"]=15

    //println(myHash["istanbul"])
   // println("Ankara: ${myHash["ankara"]}")
   // println("istanbul: ${myHash["istanbul"]}")

   // val myHashMap = hashMapOf<Int,String>(1 to "monday",2 to "tuesday",3 to "wednesday")
    //myHashMap[4]="thursday"

//}

//// Operators

//fun main() {
    //+= -=
/*    var num1 = 5
    println(num1)
    num1 = num1+1
    println(num1)
    num1+=1
    println(num1)
    num1++
    println(num1)
    num1--
    println(num1)
*/
    /*
    println(2==2)
    println(2==3)
    println(2!=3)
    println(2!=2)
    println(2>3)
    println(2<3)
    println(2>=3)
    println(3<=3)
    */

    //println(2>1 && 1>0)
   // println(2>2 && 1>0)
    //%
    //println(10%3)
    //? !! for avoding null point exception
    //? safe call
    //val num1:String? = null
    //println(num1?.length)
    //?
    //var name:String? = null
    //println(name?.length ?: 2)

//}

// if cases
/*
fun main() {

    val myAge = 23

    if (myAge<18){
        println("You can't vote")
    }else{
        println("You can vote")
    }
}

*/
/*
fun main(){

    val degree = 150

    if (degree<0){
        println("Ice")
    }else if (degree>0 && degree<100){
        println("Liquid")
    }else{
        println("Gas")
    }

}
*/
/*
fun main() {

    val list = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val day = list.random()
    if (day == "Monday") {
        println("It's the first day of the week")
    } else if (day == "Tuesday") {
        println("It's the second day of the week")
    } else if (day == "Wednesday") {
        println("It's the third day of the week")
    } else if (day == "Thursday") {
        println("It's the fourth day of the week")
    } else if (day == "Friday"){
        println("It's the fifth day of the week")
    } else if (day =="Saturday"){
        println("It's the sixth day of the week")
    } else {
        println("It's the seventh day of the week")
    }
}
 */

// switch when

fun main() {

    val list = listOf(1,2,3,4,5,6,7)
    val day = list.random()

    when(day){
        1-> println("Monday")
        2-> println("Tuesday")
        3-> println("Wednesday")
        4-> println("Thursday")
        5-> println("Friday")
        6-> println("Saturday")
        7-> println("Sunday")
    }

}