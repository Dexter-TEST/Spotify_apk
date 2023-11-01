package p.gt3;
import android.os.Parcelable;
import p.dj2;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.ft3;
import p.a3;
import java.lang.ClassLoader;
import java.lang.Class;
import p.yp;
import p.et3;
import java.util.HashMap;
import p.ej4;
import p.co5;
import java.lang.Enum;
import java.util.Map;

public final class gt3 implements Parcelable	// class@001775 from classes.dex
{
    public final ft3 a;
    public final a3 b;
    public final yp c;
    public final String t;
    public final String v;
    public final et3 w;
    public Map x;
    public HashMap y;
    public static final Parcelable$Creator CREATOR;

    static {
       gt3.CREATOR = new dj2(5);
    }
    public void gt3(Parcel p0){
       String str;
       super();
       if ((str = p0.readString()) == null) {
          str = "error";
       }
       this.a = ft3.valueOf(str);
       this.b = p0.readParcelable(a3.class.getClassLoader());
       this.c = p0.readParcelable(yp.class.getClassLoader());
       this.t = p0.readString();
       this.v = p0.readString();
       this.w = p0.readParcelable(et3.class.getClassLoader());
       this.x = ej4.H0(p0);
       this.y = ej4.H0(p0);
       return;
    }
    public void gt3(et3 p0,ft3 p1,a3 p2,String p3,String p4){
       super(p0, p1, p2, null, p3, p4);
    }
    public void gt3(et3 p0,ft3 p1,a3 p2,yp p3,String p4,String p5){
       super();
       this.w = p0;
       this.b = p2;
       this.c = p3;
       this.t = p4;
       this.a = p1;
       this.v = p5;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.a.name());
       p0.writeParcelable(this.b, p1);
       p0.writeParcelable(this.c, p1);
       p0.writeString(this.t);
       p0.writeString(this.v);
       p0.writeParcelable(this.w, p1);
       ej4.Q0(p0, this.x);
       ej4.Q0(p0, this.y);
    }
}
