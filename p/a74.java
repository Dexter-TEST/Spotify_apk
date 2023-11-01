package p.a74;
import p.k64;
import p.wl3;
import android.os.Build$VERSION;
import android.widget.PopupWindow;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import android.content.Context;
import android.util.AttributeSet;
import p.e64;
import android.view.MenuItem;
import p.l64;
import p.ue1;
import p.z64;

public final class a74 extends wl3 implements k64	// class@000f29 from classes.dex
{
    public k64 T;
    public static final Method U;

    static {
       try{
          if (Build$VERSION.SDK_INT <= 28) {
             Class[] uClassArray = new Class[]{Boolean.TYPE};
             a74.U = PopupWindow.class.getDeclaredMethod("setTouchModal", uClassArray);
          }
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void a74(Context p0,int p1,int p2){
       super(p0, null, p1, p2);
    }
    public final void n(e64 p0,MenuItem p1){
       a74 tT;
       if ((tT = this.T) != null) {
          tT.n(p0, p1);
       }
       return;
    }
    public final void o(e64 p0,l64 p1){
       a74 tT;
       if ((tT = this.T) != null) {
          tT.o(p0, p1);
       }
       return;
    }
    public final ue1 q(Context p0,boolean p1){
       z64 oz64 = new z64(p0, p1);
       oz64.setHoverListener(this);
       return oz64;
    }
}
