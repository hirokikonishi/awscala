import com.amazonaws.services.{dynamodbv2 => aws}
import dynamodbv2.KeyType

object KeySchema {
  def apply(k: aws.model.KeySchemaElement): KeySchema = new KeySchema(
    attributeName = k.getAttributeName,
    keyType = aws.model.KeyType.fromValue(k.getKeyType)
  )
}

case class KeySchema(attributeName: String, keyType: KeyType) extends aws.model.KeySchemaElement {
  setAttributeName(attributeName)
  setKeyType(keyType)
}

