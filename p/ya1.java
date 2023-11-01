package p.ya1;
import p.xz4;
import androidx.fragment.app.f;
import java.lang.Object;
import p.ek3;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewParent;
import androidx.fragment.app.o;
import java.lang.String;
import java.util.Objects;
import android.app.Dialog;
import java.lang.IllegalStateException;

public final class ya1 implements xz4	// class@002d7a from classes.dex
{
    public final f a;

    public void ya1(f p0){
       this.a = p0;
       super();
    }
    public final void b(Object p0){
       if (p0 != null) {
          p0 = this.a;
          if (p0.y != null) {
             View view = p0.requireView();
             if (view.getParent() == null) {
                if (p0.C != null) {
                   if (o.I(3)) {
                      Objects.toString(p0.C);
                   }
                   p0.C.setContentView(view);
                }
             }else {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
             }
          }
       }
       return;
    }
}
