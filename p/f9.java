package p.f9;
import p.h9;
import p.ie5;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class f9 extends h9	// class@001587 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final f9 a;

    static {
       f9.a = new f9();
       f9.CREATOR = new ie5(25);
    }
    public void f9(){
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
