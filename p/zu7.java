package p.zu7;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.lang.Object;
import p.o2;

public abstract class zu7	// class@002f6d from classes.dex
{
    public static final int a;

    static {
       zu7.class.getClassLoader();
    }
    public static Parcelable a(Parcel p0,Parcelable$Creator p1){
       if (!p0.readInt()) {
          return null;
       }
       return p1.createFromParcel(p0);
    }
    public static void b(o2 p0,Parcel p1){
       if (p0 == null) {
          p1.writeInt(0);
          return;
       }else {
          p1.writeInt(1);
          p0.writeToParcel(p1, 0);
          return;
       }
    }
}
