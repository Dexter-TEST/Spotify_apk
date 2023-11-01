package p.nr;
import p.a;
import p.v74;
import java.util.Calendar;
import android.os.Parcel;
import java.io.Serializable;

public final class nr extends a	// class@002038 from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       nr.CREATOR = new v74(6);
    }
    public void nr(Calendar p0,boolean p1,int p2){
       super(p0, p1, p2);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       a ta;
       if ((ta = this.a) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeSerializable(ta);
       }
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       return;
    }
}
