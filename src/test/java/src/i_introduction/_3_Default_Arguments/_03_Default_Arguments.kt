package i_introduction._3_Default_Arguments

import org.junit.Assert
import org.junit.Test

class _03_Default_Arguments() {

    @Test fun testDefaultAndNamedParams() {
        val task = task3()
        Assert.assertEquals("a42b1C42D2", task)
    }
}