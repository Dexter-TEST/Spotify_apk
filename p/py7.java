package p.py7;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.lang.Object;

public abstract class py7	// class@0022f9 from classes.dex
{
    public static final int a;

    static {
       py7.class.getClassLoader();
    }
    public static Parcelable a(Parcel p0,Parcelable$Creator p1){
       if (!p0.readInt()) {
          return null;
       }
       return p1.createFromParcel(p0);
    }
}
