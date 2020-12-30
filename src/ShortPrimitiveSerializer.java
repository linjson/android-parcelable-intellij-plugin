

public class ShortPrimitiveSerializer implements TypeSerializer {

    @Override
    public String writeValue(SerializableValue field, String parcel, String flags) {
        return parcel + ".writeInt(" + field.getName() + ");";
    }

    @Override
    public String readValue(SerializableValue field, String parcel) {
        return field.getName() + " = (short) " + parcel + ".readInt();";
    }
}