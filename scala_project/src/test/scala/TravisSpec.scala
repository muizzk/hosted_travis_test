import org.scalatest._

class TravisSpec extends FunSuite with DiagrammedAssertions {
  test("TravisCI should end with CI") {
    assert("TravisCI".endsWith("CI"))
  }
}
