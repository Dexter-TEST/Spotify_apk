package p.mm6;
import p.rz;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import android.view.accessibility.AccessibilityManager;
import java.lang.CharSequence;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.FrameLayout;
import android.view.ViewParent;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.widget.TextView;
import java.lang.IllegalArgumentException;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.text.TextUtils;
import p.f5;
import android.content.res.ColorStateList;
import p.qm6;
import android.os.Build$VERSION;
import p.u3;
import p.mz;
import p.om6;
import android.os.Handler;
import java.lang.ref.Reference;

public final class mm6 extends rz	// class@001ec5 from classes.dex
{
    public final AccessibilityManager q;
    public boolean r;
    public static final int[] s;

    static {
       mm6.s = new int[2]{0x7f030598,0x7f03059a};
    }
    public void mm6(Context p0,ViewGroup p1,SnackbarContentLayout p2,SnackbarContentLayout p3){
       super(p0, p1, p2, p3);
       this.q = p1.getContext().getSystemService("accessibility");
    }
    public static mm6 f(int p0,View p1,CharSequence p2){
       ViewParent parent;
       int i = 0;
       int i1 = i;
       while (true) {
          if (p1 instanceof CoordinatorLayout) {
             break ;
          }else if(p1 instanceof FrameLayout){
             if (p1.getId() == 0x1020002) {
                break ;
             }else {
                i1 = p1;
             }
          }
          if (p1 != null) {
             parent = p1.getParent();
             if (parent instanceof View) {
             }else {
                parent = i;
             }
          }
          if (parent == null) {
             parent = i1;
             break ;
          }
       }
       if (p1 != null) {
          Context context = p1.getContext();
          LayoutInflater layoutInflat = LayoutInflater.from(context);
          TypedArray typedArray = context.obtainStyledAttributes(mm6.s);
          int i2 = 1;
          int resourceId = typedArray.getResourceId(i2, -1);
          typedArray.recycle();
          if (typedArray.getResourceId(0, -1) == -1 || resourceId == -1) {
             i2 = 0;
          }
          int i3 = (i2)? 0x7f0d010b: 0x7f0d006b;
          mm6 omm6 = new mm6(context, p1, layoutInflat.inflate(i3, p1, 0), layoutInflat.inflate(i3, p1, 0));
          omm6.c.getChildAt(0).getMessageView().setText(p2);
          omm6.e = p0;
          return omm6;
       }else {
          throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
       }
    }
    public final void g(CharSequence p0,View$OnClickListener p1){
       int i = 0;
       Button actionView = this.c.getChildAt(i).getActionView();
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          this.r = true;
          actionView.setVisibility(i);
          actionView.setText(p0);
          actionView.setOnClickListener(new f5(this, 2, p1));
       }else {
          actionView.setVisibility(8);
          actionView.setOnClickListener(null);
          this.r = i;
       }
       return;
    }
    public final void h(ColorStateList p0){
       this.c.getChildAt(0).getActionView().setTextColor(p0);
    }
    public final void i(){
       qm6 c;
       qm6 d;
       qm6 oqm6 = qm6.b();
       rz te = this.e;
       int i = 1;
       int i1 = -2;
       if (te == i1) {
       }else {
          mm6 tq = this.q;
          if (Build$VERSION.SDK_INT >= 29) {
             i1 = (this.r != null)? 4: 0;
             i1 = u3.b(tq, te, ((i1 | i) | 0x02));
          }else if(this.r != null && tq.isTouchExplorationEnabled()){
             c = -2;
          }
          i1 = c;
       }
       te = this.n;
       qm6 a = oqm6.a;
       _monitor_enter(a);
       if (oqm6.c(te)) {
          c = oqm6.c;
          c.b = i1;
          oqm6.b.removeCallbacksAndMessages(c);
          oqm6.f(oqm6.c);
          _monitor_exit(a);
       }else if((d = oqm6.d) != null){
          d = (te != null && d.a.get() == te)? 1: 0;
          if (d) {
          label_0060 :
             if (i) {
                oqm6.d.b = i1;
             }else {
                oqm6.d = new om6(i1, te);
             }
             if ((c = oqm6.c) != null && oqm6.a(c, 4)) {
                _monitor_exit(a);
             }else {
                oqm6.c = null;
                oqm6.g();
                _monitor_exit(a);
             }
          }
       }
       i = 0;
       goto label_0060 ;
       return;
    }
}
