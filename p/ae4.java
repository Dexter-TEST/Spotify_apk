package p.ae4;
import p.ok2;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import p.vc3;
import java.util.concurrent.Executor;
import java.lang.Object;
import p.yd4;
import java.util.concurrent.atomic.AtomicBoolean;
import p.zd4;
import p.wd4;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Collection;
import p.co5;
import p.xd4;
import android.content.ServiceConnection;
import androidx.fragment.app.k;
import p.wd5;
import p.lc0;
import p.k8;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import p.lp6;
import p.sp6;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.Layout;
import android.view.View$OnClickListener;

public final class ae4 implements ok2	// class@000f67 from classes.dex
{
    public final Context a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public void ae4(Context p0,String p1,Intent p2,vc3 p3,Executor p4){
       super();
       this.c = p1;
       this.d = p3;
       this.e = p4;
       p0 = p0.getApplicationContext();
       this.a = p0;
       this.h = new yd4(this);
       this.i = new AtomicBoolean(false);
       zd4 ozd4 = new zd4(this);
       this.j = ozd4;
       this.k = new wd4(this, false);
       this.l = new wd4(this, 1);
       String[] stringArray = new String[false];
       Object[] objArray = p3.d.keySet().toArray(stringArray);
       co5.j(objArray, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       this.f = new xd4(this, objArray);
       p0.bindService(p2, ozd4, 1);
    }
    public void ae4(k p0,wd5 p1,String p2){
       super();
       lc0 olc0 = new lc0(4, this);
       this.k = olc0;
       this.l = new k8(9, this);
       this.a = p0;
       this.c = p1;
       View view = LayoutInflater.from(p0).inflate(R.layout.glue_context_menu_header, null);
       this.d = view;
       this.e = view.findViewById(R.id.image);
       this.f = view.findViewById(R.id.title);
       this.g = view.findViewById(R.id.subtitle);
       this.h = view.findViewById(R.id.description_header);
       TextView textView = view.findViewById(R.id.description);
       this.i = textView;
       TextView textView1 = view.findViewById(R.id.description_show_more);
       this.j = textView1;
       textView.getViewTreeObserver().addOnGlobalLayoutListener(olc0);
       textView1.setCompoundDrawablesWithIntrinsicBounds(null, null, new lp6(p0, sp6.F, (float)p0.getResources().getDimensionPixelSize(R.dimen.context_menu_description_show_more_drawable_size)), null);
       textView1.setText(p2);
       this.b = p0.getResources().getInteger(R.integer.context_menu_description_max_lines);
    }
    public final void a(){
       Layout layout;
       int i1;
       ae4 ti = this.i;
       if (ti == null) {
          return;
       }
       if ((layout = ti.getLayout()) == null) {
          return;
       }
       int lineCount = layout.getLineCount();
       int i = 0;
       if (lineCount > 0) {
          i1 = 1;
          if (layout.getEllipsisCount((lineCount - i1)) > 0) {
          label_0023 :
             ae4 tj = this.j;
             ae4 uoae4 = tj;
             if (!i1) {
                i = 8;
             }
             uoae4.setVisibility(i);
             uoae4 = this.l;
             View$OnClickListener onClickListe = null;
             ae4 uoae41 = (i1)? uoae4: onClickListe;
             tj.setOnClickListener(uoae41);
             tj = ti;
             if (i1) {
                onClickListe = uoae4;
             }
             tj.setOnClickListener(onClickListe);
             if (i1) {
                ti.setMaxLines(this.b);
             }
             return;
          }
       }
       i1 = 0;
       goto label_0023 ;
    }
}
