package p.j;
import android.os.Parcelable;
import p.ry7;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public abstract class j implements Parcelable	// class@001a95 from classes.dex
{
    public final ry7 a;
    public final boolean b;
    public final boolean c;
    public final boolean t;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    public void j(ry7 p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,boolean p6,boolean p7){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null state");
       }
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       return;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof j) {
          return false;
       }
       if (!this.a.equals(p0.a) || (this.b != p0.b || (this.c != p0.c || (this.t != p0.t || (this.v != p0.v || (this.w != p0.w || (this.x != p0.x || this.y != p0.y))))))) {
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
       i3 = (this.v != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.w != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.x != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.y == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.q("WelcomeModel{state="+this.a+", canContinueWithPhoneNumber="+this.b+", canUseLanguageOnboarding="+this.c+", needSignupConfiguration="+this.t+", sendWelcomeScreenShown="+this.v+", sendInstallReferrer="+this.w+", requestAutoLogin="+this.x+", hasStartedAllboarding=", this.y, "}");
    }
}
