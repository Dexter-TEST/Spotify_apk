package p.c23;
import p.fu2;
import android.os.Parcelable;
import p.b23;
import java.lang.String;
import p.t33;
import java.lang.Object;
import p.co5;
import p.o26;
import p.ay6;
import p.wf2;
import java.lang.Class;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;

public class c23 implements fu2, Parcelable	// class@001181 from classes.dex
{
    private final String a;
    private final String b;
    private final ui3 c;
    public static final Parcelable$Creator CREATOR;
    public static final b23 t;
    private static final c23 v;

    static {
       c23.t = new b23();
       c23.v = b23.a("", "");
       c23.CREATOR = new t33(3);
    }
    public void c23(String p0,String p1){
       co5.o(p0, "id");
       co5.o(p1, "category");
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ay6(new o26(13, this));
    }
    public static final String a(c23 p0){
       return p0.b;
    }
    public static final String b(c23 p0){
       return p0.a;
    }
    public static final c23 e(){
       return c23.v;
    }
    public static final c23 j(String p0,String p1){
       c23.t.getClass();
       return b23.a(p0, p1);
    }
    public static final c23 m(fu2 p0){
       c23 uoc23;
       c23.t.getClass();
       if (p0 != null) {
          if (p0 instanceof c23) {
          }else {
             uoc23 = b23.a(p0.c(), p0.d());
          }
       }else {
          uoc23 = c23.e();
       }
       return p0;
    }
    public static final c23 q(){
       c23.t.getClass();
       return c23.e();
    }
    public String c(){
       return this.a;
    }
    public String d(){
       return this.b;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof c23) {
          return false;
       }
       if (!io2.j(this.a, p0.a) || !io2.j(this.b, p0.b)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.c.getValue().intValue();
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.a);
       p0.writeString(this.b);
    }
}
