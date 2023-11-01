package p.t80;
import java.util.concurrent.atomic.AtomicLong;
import p.u53;
import java.lang.Object;
import java.util.Date;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.Buffer;
import android.os.Process;
import java.lang.Integer;
import java.lang.String;
import p.xj0;
import java.util.Locale;
import java.lang.CharSequence;

public final class t80	// class@00271a from classes.dex
{
    public static final AtomicLong a;
    public static String b;

    static {
       t80.a = new AtomicLong(0);
    }
    public void t80(u53 p0){
       super();
       byte[] uobyteArray = new byte[10];
       long time = new Date().getTime();
       long l = time / 1000;
       ByteBuffer uByteBuffer = ByteBuffer.allocate(4);
       uByteBuffer.putInt((int)l);
       uByteBuffer.order(ByteOrder.BIG_ENDIAN);
       uByteBuffer.position(0);
       byte[] uobyteArray1 = uByteBuffer.array();
       uobyteArray[0] = uobyteArray1[0];
       uobyteArray[1] = uobyteArray1[1];
       uobyteArray[2] = uobyteArray1[2];
       uobyteArray[3] = uobyteArray1[3];
       byte[] uobyteArray2 = t80.a((time % 1000));
       uobyteArray[4] = uobyteArray2[0];
       uobyteArray[5] = uobyteArray2[1];
       uobyteArray2 = t80.a(t80.a.incrementAndGet());
       uobyteArray[6] = uobyteArray2[0];
       uobyteArray[7] = uobyteArray2[1];
       uobyteArray2 = t80.a((long)Integer.valueOf(Process.myPid()).shortValue());
       uobyteArray[8] = uobyteArray2[0];
       uobyteArray[9] = uobyteArray2[1];
       String str = xj0.v0(uobyteArray);
       Locale uS = Locale.US;
       Object[] objArray = new Object[]{str.substring(0, 12),str.substring(12, 16),str.subSequence(16, 20),xj0.P0(p0.b()).substring(0, 12)};
       t80.b = String.format(uS, "%s-%s-%s-%s", objArray).toUpperCase(uS);
    }
    public static byte[] a(long p0){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(2);
       uByteBuffer.putShort((short)(int)p0);
       uByteBuffer.order(ByteOrder.BIG_ENDIAN);
       uByteBuffer.position(0);
       return uByteBuffer.array();
    }
    public final String toString(){
       return t80.b;
    }
}
