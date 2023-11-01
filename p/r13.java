package p.r13;
import p.zt2;
import p.au2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Set;
import java.util.Iterator;
import java.io.Serializable;
import android.os.Parcelable;
import java.lang.AssertionError;
import java.lang.StringBuilder;
import java.lang.Class;

public abstract class r13 extends zt2	// class@002457 from classes.dex
{

    public void r13(){
       super();
    }
    public final zt2 a(au2 p0){
       zt2 ozt2;
       co5.o(p0, "other");
       if (this.t()) {
          ozt2 = p0.a();
       }else {
          Iterator iterator = p0.keySet().iterator();
          zt2 ozt21 = this;
          while (true) {
             if (iterator.hasNext()) {
                String str = iterator.next();
                Object obj = p0.u(str);
                if (obj instanceof Serializable) {
                   ozt21 = ozt21.q(str, obj);
                }else if(obj instanceof Parcelable){
                   ozt21 = ozt21.p(obj, str);
                }else if(obj == null){
                   continue ;
                }else {
                   throw new AssertionError("Invalid type "+obj.getClass());
                }
             }else {
                ozt2 = ozt21;
                break ;
             }
          }
       }
       return ozt2;
    }
    public abstract boolean t();
}
