package p.v35;
import android.os.Parcelable;
import p.t33;
import java.lang.String;
import java.lang.Object;
import p.io2;
import java.util.Arrays;
import android.os.Parcel;

public final class v35 implements Parcelable	// class@002975 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public static final Parcelable$Creator CREATOR;

    static {
       v35.CREATOR = new t33(18);
    }
    public void v35(String p0,String p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof v35) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || (!io2.j(this.b, p0.b) || !io2.j(this.c, p0.c))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.a,this.b,this.c};
       return Arrays.hashCode(objArray);
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
    }
}
