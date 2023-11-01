package p.b24;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;

public final class b24 extends b0	// class@00103d from classes.dex
{
    public boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       b24.CREATOR = new q86(9);
    }
    public void b24(Parcel p0,ClassLoader p1){
       super(p0, p1);
       if (p1 == null) {
          b24.class.getClassLoader();
       }
       boolean b = true;
       if (p0.readInt() != b) {
          b = false;
       }
       this.c = b;
       return;
    }
    public void b24(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeInt(this.c);
    }
}
