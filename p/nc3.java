package p.nc3;
import p.nr0;
import p.tv7;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import p.co5;

public final class nc3 extends nr0	// class@001fad from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final nc3 a;

    static {
       nc3.a = new nc3();
       nc3.CREATOR = new tv7(23);
    }
    public void nc3(){
       super();
    }
    public final String a(){
       return "";
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(1);
    }
}
