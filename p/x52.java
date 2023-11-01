package p.x52;
import android.os.Parcelable;
import p.dj2;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class x52 implements Parcelable	// class@002c0e from classes.dex
{
    public int a;
    public int b;
    public static final Parcelable$Creator CREATOR;

    static {
       x52.CREATOR = new dj2(9);
    }
    public void x52(){
       super();
    }
    public void x52(Parcel p0){
       super();
       this.a = p0.readInt();
       this.b = p0.readInt();
    }
    public void x52(x52 p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
    }
    public final int describeContents(){
       return 0;
    }
    public final String toString(){
       return tp2.n("SavedState{mAnchorPosition="+this.a+", mAnchorOffset=", this.b, '}');
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeInt(this.b);
    }
}
