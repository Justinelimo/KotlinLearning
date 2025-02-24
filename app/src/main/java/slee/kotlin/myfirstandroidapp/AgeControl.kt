package slee.kotlin.myfirstandroidapp

fun main(){
    print("Enter your age as a whole number : ")
    var age = 0;
    var enteredAge = readln()
    age = enteredAge.toInt()

    if (age >= 18 && age >= 40){
        print("You can enter the club!")
    } else if(age >= 40){
        print("You cannot go in to the club, please go home!")
    } else{
        print("Age not verified. Please contact support.")
    }
}