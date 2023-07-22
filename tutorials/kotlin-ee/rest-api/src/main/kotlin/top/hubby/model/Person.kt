package top.hubby.model

data class Person(val id: Long, val name: String?, val age: Int) {


    // this will be properties
    fun getAge2() = age
}