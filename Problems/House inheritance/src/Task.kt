fun main() {
    val rooms = readLine()?.toInt()!!
    val price = readLine()?.toInt()!!
    val house = buildHouse(rooms, price)
    println(totalPrice(house))
}

fun buildHouse(roomsNum: Int, costHouse: Int): House {
    var house: House? = null
    if (roomsNum <= 1) {
        house = Cabin(roomsNum, costHouse)
    } else if (roomsNum in 2..3) {
        house = Bungalow(roomsNum, costHouse)
    } else if (roomsNum == 4) {
        house = Cottage(roomsNum, costHouse)
    } else if (roomsNum in 5..7) {
        house = Mansion(roomsNum, costHouse)
    } else if (roomsNum in 8..10 || roomsNum > 10) {
        house = Palace(roomsNum, costHouse)
    }
    return house!!
}

fun basePrice(price: Int): Int {
    var p = 0
    p = when {
        price < 0 -> {
            0
        }
        price > 1000000 -> {
            1000000
        }
        else -> {
            price
        }
    }
    return p
}

fun totalPrice(house: House): Int {
    var res = 0
    when (house) {
        is Cabin -> {
            val p = basePrice(house.price)
            res = p * 1
        }
        is Bungalow -> {
            val p = basePrice(house.price)
            res = (p * 1.2).toInt()
        }
        is Cottage -> {
            val p = basePrice(house.price)
            res = (p * 1.25).toInt()
        }
        is Mansion -> {
            val p = basePrice(house.price)
            res = (p * 1.4).toInt()
        }
        is Palace -> {
            val p = basePrice(house.price)
            res = (p * 1.6).toInt()
        }
    }
    return res
}


open class House(val rooms: Int, val price: Int) {
    open fun status() {
        println("House")
    }
}

class Cabin(rooms: Int, price: Int) : House(rooms, price) {
    override fun status() {
        println("Cabin")
    }
}

class Bungalow(rooms: Int, price: Int) : House(rooms, price) {
    override fun status() {
        println("Bungalow")
    }
}

class Cottage(rooms: Int, price: Int) : House(rooms, price) {
    override fun status() {
        println("Cottage")
    }
}

class Mansion(rooms: Int, price: Int) : House(rooms, price) {
    override fun status() {
        println("Mansion")
    }
}

class Palace(rooms: Int, price: Int) : House(rooms, price) {
    override fun status() {
        println("Palace")
    }
}