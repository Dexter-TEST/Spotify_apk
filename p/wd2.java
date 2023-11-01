package p.wd2;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;

public final class wd2 implements Parcelable	// class@002b13 from classes.dex
{
    public final String a;
    public final int b;
    public static final Parcelable$Creator CREATOR;

    static {
       wd2.CREATOR = new g44(11);
    }
    public void wd2(Parcel p0){
       super();
       this.a = p0.readString();
       this.b = p0.readInt();
    }
    public void wd2(String p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeInt(this.b);
    }
}
