fun main(args: Array<String>) {

    var a = 10
    println()
    //Segitiga Kiri
    for(i in 1..a){
        for(c in 1..i){
            print('*')
        }
        println()
    }
        println()
    // Segitiga Kanan
    for (i in 1..a) {
        for (f in a downTo i){
            print(' ')
        }
        for (g in 1..i) {
            print('*')
        }
        println()
    }
     println()
    // Piramid
    for (i in 1..a) {
        for (j in a downTo i) {
            print(' ')
        }
        for(k in 1..i){
            print('*')
        }
        for (l in 1..i-1){
            print('*')
        }
        println()
    }
}
