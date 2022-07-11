import com.cardinalhealth.katas.Paper
import com.cardinalhealth.katas.Pencil
import junit.framework.TestCase.assertEquals
import org.junit.Test

class PencilTest {

    @Test
    fun `we can read a blank piece of paper`() {
        val paper = Paper()
        assertEquals("", paper.read())
    }

    @Test
    fun `we can read a piece of paper that has text on it`() {
        val paper = Paper("Hello World")
        assertEquals("Hello World", paper.read())
    }

    @Test
    fun `we can write on the paper with a pencil`() {
        val pencil = Pencil()
        val paper = Paper()
        pencil.write(paper, "Hello!")
        assertEquals("Hello!", paper.read())
    }
}
