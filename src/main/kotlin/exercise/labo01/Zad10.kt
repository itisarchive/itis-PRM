package pl.kdudek.exercise.labo01

data class Product(
    val name: String,
    val price: Double,
    val category: String
)

interface DiscountPolicy {
    fun calculateDiscountedPrice(product: Product): Double
}

class NoDiscount : DiscountPolicy {
    override fun calculateDiscountedPrice(product: Product): Double = product.price
}

class FixedAmountDiscount(private val discountValue: Double) : DiscountPolicy {
    override fun calculateDiscountedPrice(product: Product): Double =
        (product.price - discountValue).coerceAtLeast(0.0)
}

class Cart<T> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun removeItem(item: T) {
        items.remove(item)
    }

    fun getItems(): List<T> = items

    fun sortByPrice() {
        items.sortBy { item -> (item as Product).price }
    }
}

fun calculateCartTotal(cart: Cart<Product>, policy: DiscountPolicy): Double {
    return cart.getItems().sumOf { policy.calculateDiscountedPrice(it) }
}

fun main() {
    val cart = Cart<Product>()
    cart.addItem(Product("Milk", 2.5, "Food"))
    cart.addItem(Product("Bread", 1.5, "Food"))
    cart.addItem(Product("Butter", 3.0, "Food"))
    cart.addItem(Product("Shampoo", 10.0, "Cosmetics"))
    cart.addItem(Product("Soap", 5.0, "Cosmetics"))
    cart.addItem(Product("Toothpaste", 4.0, "Cosmetics"))
    cart.addItem(Product("Socks", 7.0, "Clothes"))
    cart.addItem(Product("T-shirt", 15.0, "Clothes"))
    cart.addItem(Product("Jeans", 30.0, "Clothes"))

    val noDiscountPolicy = NoDiscount()
    val fixedAmountDiscountPolicy = FixedAmountDiscount(5.0)

    println("Total price with no discount: ${calculateCartTotal(cart, noDiscountPolicy)}")
    println("Total price with fixed amount discount: ${calculateCartTotal(cart, fixedAmountDiscountPolicy)}")

    cart.sortByPrice()

    println("Items sorted by price:")
    cart.getItems().forEach { product -> println("${product.name} - ${product.price}") }
}
