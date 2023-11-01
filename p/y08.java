package p.y08;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.lang.Object;

public abstract class y08	// class@002d27 from classes.dex
{
    public static final int a;

    static {
       y08.class.getClassLoader();
    }
    public static Parcelable a(Parcel p0,Parcelable$Creator p1){
       if (!p0.readInt()) {
          return null;
       }
       return p1.createFromParcel(p0);
    }
}
