package p.y33;
import android.view.View;
import p.vt2;
import p.uu2;
import java.lang.Object;
import java.lang.Class;
import android.view.ViewGroup;
import p.ou2;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;
import p.r8;
import p.ju2;
import java.lang.IllegalArgumentException;

public final class y33	// class@002d3e from classes.dex
{
    public final int a;
    public final View b;
    public final vt2 c;
    public final uu2 d;
    public r8 e;

    public void y33(int p0,View p1,vt2 p2,uu2 p3){
       super();
       this.a = p0;
       p1.getClass();
       this.b = p1;
       this.c = p2;
       p3.getClass();
       this.d = p3;
       p3.j.getClass();
    }
    public static y33 a(int p0,ViewGroup p1,uu2 p2){
       vt2 ovt2;
       if ((ovt2 = p2.d.a(p0)) == null) {
          ovt2 = p2.i;
       }
       return new y33(p0, ovt2.c(p1, p2), ovt2, p2);
    }
    public final String toString(){
       y33 te;
       StringBuilder str = new StringBuilder(128)+"HubsViewHolder["+Integer.toHexString(this.hashCode())+" view: "+this.b+", binder: "+this.c+", binderId: "+this.a;
       if (this.e != null) {
          str = str+", position: ";
          if ((te = this.e) != null) {
             str = str+te.b+", model: ";
             if ((te = this.e) != null) {
                str = str+te.c;
             }else {
                throw new IllegalArgumentException("View not bound to any component!");
             }
          }else {
             throw new IllegalArgumentException("View not bound to any component!");
          }
       }else {
          str = str+", not bound";
       }
       return str+']';
    }
}
