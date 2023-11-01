package p.mo6;
import java.lang.Enum;
import java.lang.String;
import java.lang.IllegalArgumentException;
import p.tp2;
import android.view.View;
import java.lang.Class;
import java.lang.Object;
import androidx.fragment.app.o;
import java.util.Objects;
import android.view.ViewParent;
import android.view.ViewGroup;

public final class mo6 extends Enum	// class@001ed7 from classes.dex
{
    public static final mo6 a;
    public static final mo6 b;
    public static final mo6 c;
    public static final mo6 t;
    public static final mo6[] v;

    static {
       mo6 omo6 = new mo6("REMOVED", 0);
       mo6.a = omo6;
       mo6 omo61 = new mo6("VISIBLE", 1);
       mo6.b = omo61;
       mo6 omo62 = new mo6("GONE", 2);
       mo6.c = omo62;
       mo6 omo63 = new mo6("INVISIBLE", 3);
       mo6.t = omo63;
       mo6[] omo6Array = new mo6[]{omo6,omo61,omo62,omo63};
       mo6.v = omo6Array;
    }
    public void mo6(String p0,int p1){
       super(p0, p1);
    }
    public static mo6 b(int p0){
       if (!p0) {
          return mo6.b;
       }
       if (p0 == 4) {
          return mo6.t;
       }
       if (p0 == 8) {
          return mo6.c;
       }
       throw new IllegalArgumentException(tp2.k("Unknown visibility ", p0));
    }
    public static mo6 c(View p0){
       if (!(0 - p0.getAlpha()) && !p0.getVisibility()) {
          return mo6.t;
       }
       return mo6.b(p0.getVisibility());
    }
    public static mo6 valueOf(String p0){
       return Enum.valueOf(mo6.class, p0);
    }
    public static mo6[] values(){
       return mo6.v.clone();
    }
    public final void a(View p0){
       ViewGroup parent;
       int i = this.ordinal();
       int i1 = 2;
       if (i) {
          if (i != 1) {
             if (i != i1) {
                if (i == 3) {
                   if (o.I(i1)) {
                      Objects.toString(p0);
                   }
                   p0.setVisibility(4);
                }
             }else if(o.I(i1)){
                Objects.toString(p0);
             }
             p0.setVisibility(8);
          }else if(o.I(i1)){
             Objects.toString(p0);
          }
          p0.setVisibility(0);
       }else if((parent = p0.getParent()) != null){
          if (o.I(i1)) {
             p0.toString();
             parent.toString();
          }
          parent.removeView(p0);
       }
       return;
    }
}
