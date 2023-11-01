package p.rr5;
import p.b0;
import p.q86;
import android.os.Parcel;
import java.lang.ClassLoader;
import p.hr5;
import java.lang.Class;
import android.os.Parcelable;

public final class rr5 extends b0	// class@002544 from classes.dex
{
    public Parcelable c;
    public static final Parcelable$Creator CREATOR;

    static {
       rr5.CREATOR = new q86(5);
    }
    public void rr5(Parcel p0,ClassLoader p1){
       super(p0, p1);
       if (p1 != null) {
       }else {
          p1 = hr5.class.getClassLoader();
       }
       this.c = p0.readParcelable(p1);
       return;
    }
    public void rr5(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeParcelable(this.c, 0);
    }
}
