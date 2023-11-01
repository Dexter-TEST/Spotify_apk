package p.oz1;
import android.os.Parcelable;
import p.az5;
import p.vh4;
import p.g44;
import java.lang.String;
import java.lang.Object;
import p.ny1;
import p.tz1;
import p.nz1;
import p.h22;
import p.sz1;
import p.f22;
import p.qz1;
import p.mj7;
import java.lang.Class;
import java.lang.Integer;
import java.util.Map;
import java.util.Set;
import p.pz1;
import java.lang.Enum;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.StringBuilder;
import p.co5;
import android.os.Parcel;

public final class oz1 implements Parcelable	// class@0021bb from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final String t;
    public final String v;
    public final String w;
    public final Object x;
    public final String y;
    public final ny1 z;
    public static final az5 A;
    public static final vh4 B;
    public static final Parcelable$Creator CREATOR;

    static {
       oz1.A = new az5();
       oz1.B = new vh4(200, 299);
       oz1.CREATOR = new g44(24);
    }
    public void oz1(int p0,int p1,int p2,String p3,String p4,String p5,String p6,Object p7,ny1 p8,boolean p9){
       f22 uof22;
       qz1 oqz1;
       qz1 a1;
       Set set;
       Set set1;
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p5;
       this.w = p6;
       this.x = p7;
       this.y = p4;
       if (p8 != null) {
          this.z = p8;
          p0 = 1;
       }else {
          this.z = new tz1(this, this.a());
          set1 = 0;
       }
       nz1 b = nz1.b;
       az5 a = oz1.A;
       if (!p0) {
          _monitor_enter(a);
          if ((uof22 = h22.b(sz1.b())) == null) {
             oqz1 = qz1.d.e();
             _monitor_exit(a);
          }else {
             oqz1 = uof22.e;
             _monitor_exit(a);
          }
          nz1 c = nz1.c;
          if (p9) {
             oqz1.getClass();
          }else if((a1 = oqz1.a) != null && (a1.containsKey(Integer.valueOf(p1)) && ((set = a1.get(Integer.valueOf(p1))) == null && !set.contains(Integer.valueOf(p2))))){
             if ((a1 = oqz1.c) != null && (a1.containsKey(Integer.valueOf(p1)) && ((set = a1.get(Integer.valueOf(p1))) == null && !set.contains(Integer.valueOf(p2))))) {
                b = nz1.a;
             }else if((oqz1 = oqz1.b) != null && (oqz1.containsKey(Integer.valueOf(p1)) && ((set1 = oqz1.get(Integer.valueOf(p1))) == null && !set1.contains(Integer.valueOf(p2))))){
             label_00bf :
                a.E().getClass();
                return;
             }
          }
          b = c;
          goto label_00bf ;
       }
    }
    public void oz1(int p0,String p1,String p2){
       super(-1, p0, -1, p1, p2, null, null, null, null, false);
    }
    public void oz1(Exception p0){
       ny1 ony1 = (p0 instanceof ny1)? p0: new ny1(p0);
       super(-1, -1, -1, null, null, null, null, null, ony1, false);
       return;
    }
    public final String a(){
       oz1 ty;
       if ((ty = this.y) == null) {
          ty = ((ty = this.z) == null)? null: ty.getLocalizedMessage();
       }
       return ty;
    }
    public final int describeContents(){
       return 0;
    }
    public final String toString(){
       String str = "{HttpStatus: "+this.a+", errorCode: "+this.b+", subErrorCode: "+this.c+", errorType: "+this.t+", errorMessage: "+this.a()+"}";
       co5.l(str, "StringBuilder\(\"{HttpStatus: \"\)\n        .append\(requestStatusCode\)\n        .append\(\", errorCode: \"\)\n        .append\(errorCode\)\n        .append\(\", subErrorCode: \"\)\n        .append\(subErrorCode\)\n        .append\(\", errorType: \"\)\n        .append\(errorType\)\n        .append\(\", errorMessage: \"\)\n        .append\(errorMessage\)\n        .append\(\"}\"\)\n        .toString\(\)");
       return str;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeString(this.t);
       p0.writeString(this.a());
       p0.writeString(this.v);
       p0.writeString(this.w);
    }
}
