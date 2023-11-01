package p.m46;
import p.n46;
import p.ie5;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;

public final class m46 implements n46	// class@001e24 from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final m46 a;

    static {
       m46.a = new m46();
       m46.CREATOR = new ie5(9);
    }
    public void m46(){
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
