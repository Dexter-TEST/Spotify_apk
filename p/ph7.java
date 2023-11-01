package p.ph7;
import android.view.View;
import p.uh7;
import java.lang.Object;
import p.wh6;
import java.util.Objects;
import p.oh7;
import p.l55;
import java.lang.CharSequence;
import android.view.View$OnUnhandledKeyEventListener;

public abstract class ph7	// class@002264 from classes.dex
{

    public static void a(View p0,uh7 p1){
       wh6 tag;
       int i = 0x7f0a0609;
       if ((tag = p0.getTag(i)) == null) {
          tag = new wh6();
          p0.setTag(i, tag);
       }
       Objects.requireNonNull(p1);
       oh7 ooh7 = new oh7();
       tag.put(p1, ooh7);
       l55.p(p0, ooh7);
       return;
    }
    public static CharSequence b(View p0){
       return l55.k(p0);
    }
    public static boolean c(View p0){
       return l55.y(p0);
    }
    public static boolean d(View p0){
       return l55.s(p0);
    }
    public static void e(View p0,uh7 p1){
       wh6 tag;
       View$OnUnhandledKeyEventListener orDefault;
       if ((tag = p0.getTag(R.id.tag_unhandled_key_listeners)) == null) {
          return;
       }
       if ((orDefault = tag.getOrDefault(p1, null)) != null) {
          l55.n(p0, orDefault);
       }
       return;
    }
    public static Object f(View p0,int p1){
       return l55.i(p0, p1);
    }
    public static void g(View p0,boolean p1){
       l55.x(p0, p1);
    }
    public static void h(View p0,CharSequence p1){
       l55.o(p0, p1);
    }
    public static void i(View p0,boolean p1){
       l55.q(p0, p1);
    }
}
