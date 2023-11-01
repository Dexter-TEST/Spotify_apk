package p.t4;
import p.c5;
import p.tv7;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import p.co5;

public final class t4 extends c5	// class@0026fe from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final t4 b;

    static {
       t4.b = new t4();
       t4.CREATOR = new tv7(15);
    }
    public void t4(){
       super("");
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(1);
    }
}
