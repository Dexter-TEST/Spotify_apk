package p.ii2;
import p.r75;
import p.yx1;
import com.google.protobuf.c;
import java.lang.Object;
import p.u74;
import p.hc7;
import com.google.protobuf.a;
import java.lang.Class;
import p.rc3;
import java.lang.String;
import java.lang.Throwable;

public final class ii2 implements r75	// class@00199b from classes.dex
{
    public final c a;
    public static final yx1 b;

    static {
       ii2.b = yx1.a();
    }
    public void ii2(c p0){
       super();
       this.a = p0;
    }
    public static void a(c p0){
       if (p0 == null || p0.isInitialized()) {
          return;
       }
       hc7 ohc7 = p0.newUninitializedMessageException();
       ohc7.getClass();
       throw new rc3(ohc7.getMessage());
    }
}
