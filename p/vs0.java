package p.vs0;
import android.net.Uri;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;

public final class vs0	// class@002a53 from classes.dex
{
    public String a;
    public String b;
    public String c;
    public final String d;
    public Uri e;
    public sp6 f;
    public final Drawable g;
    public final boolean h;

    public void vs0(){
       Uri eMPTY = Uri.EMPTY;
       co5.l(eMPTY, "EMPTY");
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = eMPTY;
       this.f = null;
       this.g = null;
       this.h = false;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof vs0) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       if (!co5.c(this.e, p0.e)) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (!co5.c(this.g, p0.g)) {
          return false;
       }
       if (this.h != p0.h) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       int i = (this.e.hashCode() + tp2.g(this.d, tp2.g(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31), 31)) * 31;
       vs0 tf = this.f;
       int i1 = 0;
       int i2 = (tf == null)? 0: tf.hashCode();
       i = (i + i2) * 31;
       if ((tf = this.g) != null) {
          i1 = tf.hashCode();
       }
       i = (i + i1) * 31;
       if ((tf = this.h) != null) {
          i2 = 1;
       }
       return (i + i2);
    }
    public final String toString(){
       return kg4.p("ContextMenuHeader\(title="+this.a+", subtitle="+this.b+", description="+this.c+", descriptionHeader="+this.d+", headerImageUri="+this.e+", placeholderIcon="+this.f+", headerImageDrawable="+this.g+", isIconRounded=", this.h, ')');
    }
}
