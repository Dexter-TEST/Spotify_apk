package p.lx2;
import android.os.Parcelable;
import p.t33;
import java.lang.Object;
import android.os.Parcel;

public final class lx2 implements Parcelable	// class@001ddf from classes.dex
{
    public final int a;
    public static final Parcelable$Creator CREATOR;

    static {
       lx2.CREATOR = new t33(11);
    }
    public void lx2(int p0){
       super();
       this.a = p0;
    }
    public void lx2(Parcel p0){
       super();
       this.a = p0.readInt();
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
    }
}
