fun main() { // So basically this is the main function of kotlin
    /*
    The fun above stands for function in kotlin, and we do not need to use
    main(String[], args) like in JAVA
    Note: the old Kotlin Versions used to run main(args: Array<String>) in order to run the main function
    */
    val name = "Kotlin"
    println("Hello, $name!") // The basic print function in kotlin, does not need System.out.println


    /* In Kotlin we do not need to declare the variable
    type because kotlin can understand the variable type by itself
     */

    var first_number = 69;
    var second_number = 420;

    println("The addition of the numbers are ${first_number + second_number}")

}