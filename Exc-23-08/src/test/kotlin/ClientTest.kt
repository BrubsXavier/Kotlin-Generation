import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClientTest {}


val client1 = Client(
    "Bruna",
    "Mooca, SP",
    "93712931212"
)

@BeforeEach
fun addtolist() {
    client1.addproduct("Café")
    client1.addproduct("Pão")
    client1.addproduct("Leite")

}

@Test
fun checkdata() {

    var error = false
    try {
        val testclient = Client("", "", "")
    } catch (e: Exception) {
        error = true
    }

    assertTrue(error)

}


@Test
fun addproductTest() {

    assertEquals(3, client1.shopList.size)
    assertTrue(client1.shopList.contains("Café"))
}

@Test
fun removeproductTest() {

    client1.removeproduct("Café")

    assertEquals(2, client1.shopList.size)
    assertFalse(client1.shopList.contains("Café"))
}
