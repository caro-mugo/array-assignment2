fun main(){
    var y=numbers(arrayOf(1,67,80,90))
    println(y)
    var x=mixedtypes(arrayOf(6.57,"carol",5.3,false,"nyambura",27.58))
    println(x)
    var z= getVowels(arrayOf('a','e','i','o','u'))
    println(z)


}
// question 1
fun numbers(num:Array<Int>):Int{
    var product=1
    num.forEach { x->
        product*=x

    }
    return product
}



// question2
fun mixedtypes(num:Array<Any>):Float{
    var sum=0.00F
    num.forEach { number->
     if(number is Float || number is Double){
         sum+=number.toString().toFloat()

    }
    }
    return sum
}
// question 3

fun getVowels(name:Array<Char>):Int{
    var vowels=0
    name.forEach { caro ->

        if (caro=='a' || caro== 'e'|| caro =='i'|| caro=='o'|| caro== 'u'){
            vowels ++

        }
        }
    return vowels
}