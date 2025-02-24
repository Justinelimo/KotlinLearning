package slee.kotlin.myfirstandroidapp

fun main(){
    //val circleRatio = 3.1415926535476905;
   // print(circleRatio)

    // We can as well pick user inputs then convert it to Int
    var age = 0
    print("Please enter your age")
    val enteredAge = readln()
    age = enteredAge.toInt()
   // val age = 26;

    if (age<18){
        print("You don't meet the required age to be in a club Still young!!!")

    }else{
        print("You can go into the club and have fun.")
    }
}