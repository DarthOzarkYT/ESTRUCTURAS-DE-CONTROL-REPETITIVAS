fun main(){
    println("===== TRIANGULO 1 =====")
    for(i in 1..10){
        for(j in 10 downTo i){
            print(" ")
        }
        for(j in i downTo 1){
            print("*")
        }
        println()
    }
    println("\n===== Triangulo 2 =====")
    for (i in 1..10) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println("\n===== Triangulo 3 =====")
    for (i in 10 downTo 1) {
        for (j in 10 downTo i) {
            print(" ")
        }
        for (j in i downTo 1) {
            print("*")
        }
        println()
    }
    println("\n===== Triangulo 4 =====")
    for (i in 1..10) {
        for (j in 10 downTo i) {
            print("*")
        }
        println()
    }
    println("\n======== Rombo ========")
    for (i in 1 ..  10) {
        for (j in 10 downTo  i) {
            print(" ")
        }
        for (j in i downTo  1) {
            print(" *")
        }
        println()
    }
    for (i in 9 downTo 1) {
        for (j in 10 downTo i) {
            print(" ")
        }
        for (j in i downTo 1) {
            print(" *")
        }
        println()
    }
    print("\n======== Arbol ========\n")
    for (i in 1 ..  10) {
        for (j in 10 downTo  i) {
            print(" ")
        }
        for (j in i downTo  1) {
            print(" *")
        }
        println()
    }
    println("\t\t  | |\n\t\t  | |\n\t\t  | |\n\t\t  | |\n")
}
