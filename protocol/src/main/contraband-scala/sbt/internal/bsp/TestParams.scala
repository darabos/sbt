/**
 * This code is generated using [[https://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package sbt.internal.bsp
/**
 * Test Request
 * The test build target request is sent from the client to the server to test the given list of build targets.
 * The server communicates during the initialize handshake whether this method is supported or not.
 * @param targets A sequence of build targets to test.
 * @param originId An option identifier generated by the client to identify this request.
                   The server may include this id in triggered notifications or responses.
 * @param arguments Optional arguments to the test execution engine.
 * @param dataKind Kind of data to expect in the `data` field.
                   If this field is not set, the kind of data is not specified.
 * @param data Language-specific metadata for this test execution.
 */
final class TestParams private (
  val targets: Vector[sbt.internal.bsp.BuildTargetIdentifier],
  val originId: Option[String],
  val arguments: Vector[String],
  val dataKind: Option[String],
  val data: Option[sjsonnew.shaded.scalajson.ast.unsafe.JValue]) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = o match {
    case x: TestParams => (this.targets == x.targets) && (this.originId == x.originId) && (this.arguments == x.arguments) && (this.dataKind == x.dataKind) && (this.data == x.data)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (37 * (37 * (37 * (37 * (37 * (17 + "sbt.internal.bsp.TestParams".##) + targets.##) + originId.##) + arguments.##) + dataKind.##) + data.##)
  }
  override def toString: String = {
    "TestParams(" + targets + ", " + originId + ", " + arguments + ", " + dataKind + ", " + data + ")"
  }
  private[this] def copy(targets: Vector[sbt.internal.bsp.BuildTargetIdentifier] = targets, originId: Option[String] = originId, arguments: Vector[String] = arguments, dataKind: Option[String] = dataKind, data: Option[sjsonnew.shaded.scalajson.ast.unsafe.JValue] = data): TestParams = {
    new TestParams(targets, originId, arguments, dataKind, data)
  }
  def withTargets(targets: Vector[sbt.internal.bsp.BuildTargetIdentifier]): TestParams = {
    copy(targets = targets)
  }
  def withOriginId(originId: Option[String]): TestParams = {
    copy(originId = originId)
  }
  def withOriginId(originId: String): TestParams = {
    copy(originId = Option(originId))
  }
  def withArguments(arguments: Vector[String]): TestParams = {
    copy(arguments = arguments)
  }
  def withDataKind(dataKind: Option[String]): TestParams = {
    copy(dataKind = dataKind)
  }
  def withDataKind(dataKind: String): TestParams = {
    copy(dataKind = Option(dataKind))
  }
  def withData(data: Option[sjsonnew.shaded.scalajson.ast.unsafe.JValue]): TestParams = {
    copy(data = data)
  }
  def withData(data: sjsonnew.shaded.scalajson.ast.unsafe.JValue): TestParams = {
    copy(data = Option(data))
  }
}
object TestParams {
  
  def apply(targets: Vector[sbt.internal.bsp.BuildTargetIdentifier], originId: Option[String], arguments: Vector[String], dataKind: Option[String], data: Option[sjsonnew.shaded.scalajson.ast.unsafe.JValue]): TestParams = new TestParams(targets, originId, arguments, dataKind, data)
  def apply(targets: Vector[sbt.internal.bsp.BuildTargetIdentifier], originId: String, arguments: Vector[String], dataKind: String, data: sjsonnew.shaded.scalajson.ast.unsafe.JValue): TestParams = new TestParams(targets, Option(originId), arguments, Option(dataKind), Option(data))
}
