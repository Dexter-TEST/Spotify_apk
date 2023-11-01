package p.q8;
import android.content.Context;
import p.lg;
import android.view.Window;
import java.lang.Object;
import p.k8;
import p.x44;
import android.content.DialogInterface;
import p.ej4;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import p.rf;
import android.widget.Button;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewParent;

public final class q8	// class@002354 from classes.dex
{
    public final Context a;
    public final lg b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public Button f;
    public Button g;
    public Button h;
    public NestedScrollView i;
    public int j;
    public Drawable k;
    public ImageView l;
    public TextView m;
    public TextView n;
    public View o;
    public ListAdapter p;
    public int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final x44 w;
    public final k8 x;

    public void q8(Context p0,lg p1,Window p2){
       super();
       this.j = 0;
       this.q = -1;
       this.x = new k8(0, this);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.w = new x44(p1);
       TypedArray typedArray = p0.obtainStyledAttributes(null, ej4.H, R.attr.alertDialogStyle, 0);
       this.r = typedArray.getResourceId(0, 0);
       typedArray.getResourceId(2, 0);
       this.s = typedArray.getResourceId(4, 0);
       typedArray.getResourceId(5, 0);
       this.t = typedArray.getResourceId(7, 0);
       this.u = typedArray.getResourceId(3, 0);
       this.v = typedArray.getBoolean(6, true);
       typedArray.getDimensionPixelSize(true, 0);
       typedArray.recycle();
       p1.d().g(true);
    }
    public static void a(Button p0){
       LinearLayout$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.gravity = 1;
       layoutParams.weight = 0x3f000000;
       p0.setLayoutParams(layoutParams);
    }
    public static void b(View p0,View p1,View p2){
       int i = 0;
       if (p1 != null) {
          int i1 = (p0.canScrollVertically(-1))? 0: 4;
          p1.setVisibility(i1);
       }
       if (p2 != null) {
          if (!p0.canScrollVertically(1)) {
             i = 4;
          }
          p2.setVisibility(i);
       }
       return;
    }
    public static ViewGroup c(View p0,View p1){
       ViewGroup viewGroup;
       ViewGroup viewGroup1;
       if (p0 == null) {
          if (p1 instanceof ViewStub) {
             viewGroup = p1.inflate();
          }
          return viewGroup;
       }else if(p1 != null){
          ViewParent parent = p1.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(p1);
          }
       }
       if (p0 instanceof ViewStub) {
          viewGroup1 = p0.inflate();
       }
       return viewGroup1;
    }
}
