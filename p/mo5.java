package p.mo5;
import java.lang.String;
import java.lang.Byte;
import java.lang.Object;
import java.util.UUID;
import java.nio.ByteBuffer;
import android.util.Base64;
import java.nio.charset.Charset;

public final class mo5	// class@001ed6 from classes.dex
{
    public static final byte a;
    public static final byte b;

    static {
       mo5.a = Byte.parseByte("01110000", 2);
       mo5.b = Byte.parseByte("00001111", 2);
    }
    public void mo5(){
       super();
    }
    public static String a(){
       UUID uUID = UUID.randomUUID();
       byte[] uobyteArray = new byte[17];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.putLong(uUID.getMostSignificantBits());
       uByteBuffer.putLong(uUID.getLeastSignificantBits());
       byte[] uobyteArray1 = uByteBuffer.array();
       byte b = uobyteArray1[0];
       uobyteArray1[16] = b;
       uobyteArray1[0] = (byte)((b & mo5.b) | mo5.a);
       return new String(Base64.encode(uobyteArray1, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
