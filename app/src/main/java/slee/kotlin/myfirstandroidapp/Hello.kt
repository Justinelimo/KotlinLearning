package slee.kotlin.myfirstandroidapp


fun main(){

    val operatingSystem = "ChromeOS"
    val emailId = "slee98@gmail.com"

    println(displayAlertMessage(operatingSystem , emailId))
}

    fun displayAlertMessage(operatingSystem:String , emailId:String): String{
        return "There is a signin request on $operatingSystem for your google acc $emailId"
    }