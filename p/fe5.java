package p.fe5;
import p.he5;
import p.tv7;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class fe5 extends he5	// class@0015b0 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final fe5 a;

    static {
       fe5.a = new fe5();
       fe5.CREATOR = new tv7(28);
    }
    public void fe5(){
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
