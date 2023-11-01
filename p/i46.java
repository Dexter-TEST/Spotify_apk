package p.i46;
import p.n46;
import p.ie5;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;

public final class i46 implements n46	// class@001923 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final i46 a;

    static {
       i46.a = new i46();
       i46.CREATOR = new ie5(5);
    }
    public void i46(){
       super();
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(1);
    }
}
