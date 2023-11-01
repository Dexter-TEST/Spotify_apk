package p.g46;
import p.n46;
import p.ie5;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;

public final class g46 implements n46	// class@00169c from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final g46 a;

    static {
       g46.a = new g46();
       g46.CREATOR = new ie5(3);
    }
    public void g46(){
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
