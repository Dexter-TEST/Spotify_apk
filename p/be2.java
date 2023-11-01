package p.be2;
import android.os.Parcelable;
import p.g44;
import java.lang.Object;
import java.util.ArrayList;
import android.os.Parcel;
import androidx.fragment.app.b;
import android.os.Parcelable$Creator;
import java.lang.String;
import p.rw;
import p.wd2;
import java.util.List;

public final class be2 implements Parcelable	// class@0010a8 from classes.dex
{
    public ArrayList a;
    public ArrayList b;
    public b[] c;
    public int t;
    public String v;
    public final ArrayList w;
    public final ArrayList x;
    public ArrayList y;
    public static final Parcelable$Creator CREATOR;

    static {
       be2.CREATOR = new g44(12);
    }
    public void be2(){
       super();
       this.v = null;
       this.w = new ArrayList();
       this.x = new ArrayList();
    }
    public void be2(Parcel p0){
       super();
       this.v = null;
       this.w = new ArrayList();
       this.x = new ArrayList();
       this.a = p0.createStringArrayList();
       this.b = p0.createStringArrayList();
       this.c = p0.createTypedArray(b.CREATOR);
       this.t = p0.readInt();
       this.v = p0.readString();
       this.w = p0.createStringArrayList();
       this.x = p0.createTypedArrayList(rw.CREATOR);
       this.y = p0.createTypedArrayList(wd2.CREATOR);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeStringList(this.a);
       p0.writeStringList(this.b);
       p0.writeTypedArray(this.c, p1);
       p0.writeInt(this.t);
       p0.writeString(this.v);
       p0.writeStringList(this.w);
       p0.writeTypedList(this.x);
       p0.writeTypedList(this.y);
    }
}
