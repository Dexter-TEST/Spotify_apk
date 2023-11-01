package p.h46;
import p.n46;
import p.ie5;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;

public final class h46 implements n46	// class@0017de from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final h46 a;

    static {
       h46.a = new h46();
       h46.CREATOR = new ie5(4);
    }
    public void h46(){
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
