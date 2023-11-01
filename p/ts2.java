package p.ts2;
import android.os.Parcelable;
import p.t33;
import android.os.Parcel;
import java.lang.Object;
import p.xs2;
import java.lang.ClassLoader;
import java.lang.Class;
import p.rs2;
import p.sk3;

public final class ts2 implements Parcelable	// class@0027d0 from classes.dex
{
    public final Parcelable a;
    public final Parcelable b;
    public static final Parcelable$Creator CREATOR;

    static {
       ts2.CREATOR = new t33(10);
    }
    public void ts2(Parcel p0){
       super();
       this.a = p0.readParcelable(xs2.class.getClassLoader());
       this.b = p0.readParcelable(rs2.class.getClassLoader());
    }
    public void ts2(Parcelable p0,sk3 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeParcelable(this.a, p1);
       p0.writeParcelable(this.b, p1);
    }
}
