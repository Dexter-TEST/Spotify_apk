package p.kt;
import p.e;
import p.v74;
import p.ei2;
import android.os.Parcel;
import java.lang.String;
import java.lang.Enum;

public final class kt extends e	// class@001c81 from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       kt.CREATOR = new v74(7);
    }
    public void kt(ei2 p0,boolean p1,boolean p2,boolean p3,boolean p4){
       super(p0, p1, p2, p3, p4);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a.name());
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.t);
       p0.writeInt(this.v);
    }
}
