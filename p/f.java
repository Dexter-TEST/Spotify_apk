package p.f;
import android.os.Parcelable;
import p.ou3;
import java.lang.String;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public abstract class f implements Parcelable	// class@001588 from classes.dex
{
    public final ou3 a;
    public final String b;
    public final String c;
    public final boolean t;
    public final boolean v;
    public final boolean w;

    public void f(ou3 p0,String p1,String p2,boolean p3,boolean p4,boolean p5){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null state");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null username");
       }
       this.b = p1;
       if (p2 == null) {
          throw new NullPointerException("Null password");
       }
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof f) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (this.t != p0.t || (this.v != p0.v || this.w != p0.w))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       int i1 = (((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i;
       int i2 = 1231;
       int i3 = (this.t != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.v != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.w == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.q("LoginModel{state="+this.a+", username="+this.b+", password="+this.c+", submittable="+this.t+", loginCredentialsError="+this.v+", hintRequested=", this.w, "}");
    }
}
