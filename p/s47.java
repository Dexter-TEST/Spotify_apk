package p.s47;
import android.os.Parcelable;
import p.tv7;
import android.os.Parcel;
import java.lang.Object;
import java.lang.Integer;
import java.util.Arrays;

public final class s47 implements Parcelable	// class@0025bb from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final int t;
    public static final Parcelable$Creator CREATOR;

    static {
       s47.CREATOR = new tv7(12);
    }
    public void s47(Parcel p0){
       super();
       this.b = p0.readInt();
       this.c = p0.readInt();
       this.t = p0.readInt();
       this.a = p0.readInt();
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof s47) {
          return false;
       }
       if (this.b != p0.b || (this.c != p0.c || (this.a != p0.a || this.t != p0.t))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.a),Integer.valueOf(this.b),Integer.valueOf(this.c),Integer.valueOf(this.t)};
       return Arrays.hashCode(objArray);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.t);
       p0.writeInt(this.a);
    }
}
