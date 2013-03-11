package com.gensler.scalavro.types.complex

import com.gensler.scalavro.types.AvroNamedType
import scala.util.Try

class AvroRecord[T](
  name: String,
  namespace: String,
  fields: Seq[AvroRecordField[_]],
  aliases: Seq[String] = Seq(),
  doc: Option[String] = None
) extends AvroNamedType[T] {

  val typeName = "record"

  def write(obj: T): Seq[Byte] = ???

  def read(bytes: Seq[Byte]) = Try {
    ???.asInstanceOf[T]
  }

  override def schema() = ???

}