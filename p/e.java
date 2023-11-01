package p.e;
import p.ks6;
import android.os.Parcelable;
import p.ei2;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public abstract class e implements ks6, Parcelable	// class@001447 from classes.dex
{
    public final ei2 a;
    public final boolean b;
    public final boolean c;
    public final boolean t;
    public final boolean v;

    public void e(ei2 p0,boolean p1,boolean p2,boolean p3,boolean p4){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null gender");
       }
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       return;
    }
    public final boolean a(){
       return false;
    }
    public final boolean b(){
       boolean b = (this.a != ei2.a)? true: false;
       return b;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof e) {
          return false;
       }
       if (!this.a.equals(p0.a) || (this.b != p0.b || (this.c != p0.c || (this.t != p0.t || this.v != p0.v)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       int i1 = (this.a.hashCode() ^ i) * i;
       int i2 = 1231;
       int i3 = (this.b != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.c != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.t != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.v == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.q("GenderModel{gender="+this.a+", allGendersEnabled="+this.b+", otherGenderEnabled="+this.c+", preferNotToSayGenderEnabled="+this.t+", fetchingConfigurationInForeground=", this.v, "}");
    }
}
