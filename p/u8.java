package p.u8;
import p.h9;
import p.ie5;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class u8 extends h9	// class@002865 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final u8 a;

    static {
       u8.a = new u8();
       u8.CREATOR = new ie5(14);
    }
    public void u8(){
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
