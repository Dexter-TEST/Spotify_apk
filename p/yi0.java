package p.yi0;
import p.ez;
import java.lang.Integer;
import java.lang.String;
import p.lt;
import java.lang.Object;
import p.ys5;
import com.google.common.collect.c;
import android.content.Context;
import p.vt;
import p.r45;
import p.au2;
import p.a43;
import java.util.List;
import p.sp6;
import p.ju2;
import p.jl6;
import p.r70;
import p.xm0;
import java.lang.StringBuilder;
import java.util.ArrayList;
import p.aq6;

public final class yi0 extends ez	// class@002dc0 from classes.dex
{
    public final Context a;
    public static final ys5 b;

    static {
       yi0.b = c.r(lt.a(Integer.valueOf(0), Integer.valueOf(0), "https://misc.scdn.co/lite/favorites-mix.png?format=webp"));
    }
    public void yi0(Context p0){
       super();
       this.a = p0;
    }
    public final au2 a(vt p0,Object p1,r45 p2){
       return null;
    }
    public final a43 b(vt p0,Object p1,r45 p2,a43 p3){
       int i2;
       ju2 oju2;
       p1 = p2.f();
       int i = 0;
       int i1 = 1;
       ju2[] oju2Array1 = (p1 != null && !p1.isEmpty())? 0: 1;
       yi0 ta = this.a;
       String str = ta.getString(R.string.entity_title_favorite_songs);
       sp6 h = sp6.H;
       ju2[] oju2Array = new ju2[i1];
       if (p0.a()) {
          oju2 = jl6.b(ta);
       }else if(i2){
          oju2 = null;
       }else {
          oju2 = r70.b(ta, p0);
       }
       oju2Array[i] = oju2;
       p3 = p3.i(xm0.b(str, null, h, yi0.b, oju2Array));
       if (!i2) {
          oju2Array1 = new ju2[i1];
          vt a = p0.a;
          oju2Array1[i] = r70.c(R.string.entity_button_edit, ta, "spotify:internal:edit-playlist:"+a);
          ju2[] oju2Array2 = new ju2[i1];
          oju2Array2[i] = r70.a;
          a43 uoa43 = p3.b(oju2Array1).b(oju2Array2);
          ArrayList uArrayList = (p0.b())? xm0.k(p0, p1): xm0.f(ta, a, p1);
          p3 = uoa43.a(uArrayList);
       }else if(p0.a()){
          ys5 b = (p0.b())? jl6.b: jl6.a;
          p3 = p3.e(b);
       }
       return p3;
    }
}
