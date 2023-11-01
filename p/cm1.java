package p.cm1;
import android.os.Parcelable;
import p.t33;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;

public final class cm1 implements Parcelable	// class@001233 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final cm1 a;

    static {
       cm1.a = new cm1();
       cm1.CREATOR = new t33(29);
    }
    public void cm1(){
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
