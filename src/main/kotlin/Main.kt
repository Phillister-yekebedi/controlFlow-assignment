fun main() {
    ood()
    println(long(arrayOf("phillister", "morin", "Joyce","kamande")))

    robot(5,)
    robot(13)
    robot(20)
    newLine()

}
//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun ood(){
    for (i in 1 .. 100){
        if (i % 2!=0){
            println(i)
        }
    }
}

//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun long(numb: Array<String>): Int {
    var count = 0
    for (G in numb)
        if (G.length > 5) {
            count++
        }
    return count
}


//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robot(age: Int){
    if (age in 0 ..6 ){
        println( "serve milk")

    }else if (age in 6..15){
        println("serves Fanta Orange")

    }else{
        println("gets Coca Cola")
    }
}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun newLine() {
    for (n in 1..100) {
        if (n % 3 == 0 && n % 5 == 0) {
            println("Fizzbuzz")
        } else if (n % 3 == 0){
            println("Fizz")
        }
          else if (n %5 == 0){
              println("Buzz")
        }
        else{
            println(n)
        }
        }
}

