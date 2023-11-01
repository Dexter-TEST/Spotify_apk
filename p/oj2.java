package p.oj2;
import p.nj2;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.HashSet;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import p.y77;
import p.xe7;
import java.util.Iterator;
import p.uo2;

public final class oj2 implements nj2	// class@00212f from classes.dex
{
    public final HashSet a;
    public final ArrayList b;
    public final LinearLayout c;
    public final y77 t;

    public void oj2(Context p0,ViewGroup p1){
       super();
       this.a = new HashSet(1);
       this.b = new ArrayList(1);
       LinearLayout linearLayout = LayoutInflater.from(p0).inflate(R.layout.glue_header_view_binder_content_set, p1, false);
       this.c = linearLayout;
       this.t = xe7.k(linearLayout);
    }
    public final void a(float p0){
       this.t.a(p0);
    }
    public final View getView(){
       return this.c;
    }
    public final void i(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          uo2 ouo2 = iterator.next();
          if (ouo2.c()) {
             oj2 tc = this.c;
             tc.setPivotX((float)ouo2.b());
             tc.setPivotY((float)ouo2.f());
             break ;
          }
       }
       return;
    }
}
