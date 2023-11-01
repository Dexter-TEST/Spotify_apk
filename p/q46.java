package p.q46;
import p.r46;
import p.tv7;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;

public final class q46 implements r46	// class@00232e from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final q46 a;

    static {
       q46.a = new q46();
       q46.CREATOR = new tv7(14);
    }
    public void q46(){
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
