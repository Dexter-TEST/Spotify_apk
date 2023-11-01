package p.u4;
import p.c5;
import p.tv7;
import java.lang.String;
import android.os.Parcel;
import java.lang.Object;
import p.co5;

public final class u4 extends c5	// class@002842 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final u4 b;

    static {
       u4.b = new u4();
       u4.CREATOR = new tv7(16);
    }
    public void u4(){
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
