package p.qe0;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public final class qe0 extends b0	// class@002382 from classes.dex
{
    public boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       qe0.CREATOR = new q86(10);
    }
    public void qe0(Parcel p0,ClassLoader p1){
       super(p0, p1);
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.c = b;
       return;
    }
    public void qe0(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeInt(this.c);
    }
}
