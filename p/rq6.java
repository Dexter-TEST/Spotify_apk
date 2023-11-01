package p.rq6;
import android.os.Parcelable;
import p.g44;
import java.lang.Object;
import android.os.Parcel;
import p.qq6;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.ArrayList;
import java.util.List;

public final class rq6 implements Parcelable	// class@00253d from classes.dex
{
    public boolean A;
    public int a;
    public int b;
    public int c;
    public int[] t;
    public int v;
    public int[] w;
    public List x;
    public boolean y;
    public boolean z;
    public static final Parcelable$Creator CREATOR;

    static {
       rq6.CREATOR = new g44(17);
    }
    public void rq6(){
       super();
    }
    public void rq6(Parcel p0){
       int[] ointArray;
       super();
       this.a = p0.readInt();
       this.b = p0.readInt();
       boolean i = p0.readInt();
       this.c = i;
       if (i > 0) {
          ointArray = new int[i];
          this.t = ointArray;
          p0.readIntArray(ointArray);
       }
       i = p0.readInt();
       this.v = i;
       if (i > 0) {
          ointArray = new int[i];
          this.w = ointArray;
          p0.readIntArray(ointArray);
       }
       boolean b = false;
       i = (p0.readInt() == 1)? true: false;
       this.y = i;
       i = (p0.readInt() == 1)? true: false;
       this.z = i;
       if (p0.readInt() == 1) {
          b = true;
       }
       this.A = b;
       this.x = p0.readArrayList(qq6.class.getClassLoader());
       return;
    }
    public void rq6(rq6 p0){
       super();
       this.c = p0.c;
       this.a = p0.a;
       this.b = p0.b;
       this.t = p0.t;
       this.v = p0.v;
       this.w = p0.w;
       this.y = p0.y;
       this.z = p0.z;
       this.A = p0.A;
       this.x = p0.x;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       if (this.c > null) {
          p0.writeIntArray(this.t);
       }
       p0.writeInt(this.v);
       if (this.v > null) {
          p0.writeIntArray(this.w);
       }
       p0.writeInt(this.y);
       p0.writeInt(this.z);
       p0.writeInt(this.A);
       p0.writeList(this.x);
       return;
    }
}
