package p.wl3;
import p.if6;
import android.os.Build$VERSION;
import android.widget.PopupWindow;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Method;
import android.graphics.Rect;
import android.view.View;
import java.lang.Integer;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import p.pl3;
import p.vl3;
import p.ul3;
import android.os.Handler;
import android.os.Looper;
import p.ej4;
import android.content.res.TypedArray;
import p.vg;
import p.ue1;
import android.widget.ListAdapter;
import android.widget.AbsListView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView;
import p.ql3;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AbsListView$OnScrollListener;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import p.rl3;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p.wh7;
import p.gh7;
import p.sl3;
import android.view.View$OnTouchListener;
import java.lang.Throwable;
import android.util.Log;
import p.wh5;
import java.lang.Runnable;
import p.tl3;
import android.database.DataSetObserver;
import android.widget.Adapter;

public class wl3 implements if6	// class@002b5c from classes.dex
{
    public boolean A;
    public boolean B;
    public int C;
    public final int D;
    public tl3 E;
    public View F;
    public AdapterView$OnItemClickListener G;
    public final pl3 H;
    public final vl3 I;
    public final ul3 J;
    public final pl3 K;
    public final Handler L;
    public final Rect M;
    public Rect N;
    public boolean O;
    public final vg P;
    public final Context a;
    public ListAdapter b;
    public ue1 c;
    public final int t;
    public int v;
    public int w;
    public int x;
    public final int y;
    public boolean z;
    public static final Method Q;
    public static final Method R;
    public static final Method S;

    static {
       Class[] uClassArray;
       int i = 0;
       int i1 = 1;
       if (Build$VERSION.SDK_INT <= 28) {
          try{
             uClassArray = new Class[i1];
             uClassArray[i] = Boolean.TYPE;
             wl3.Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", uClassArray);
             try{
                uClassArray = new Class[i1];
                uClassArray[i] = Rect.class;
                wl3.S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", uClassArray);
             }catch(java.lang.NoSuchMethodException e0){
             }
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
       try{
          if (Build$VERSION.SDK_INT <= 23) {
             uClassArray = new Class[]{View.class,Integer.TYPE,Boolean.TYPE};
             wl3.R = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", uClassArray);
          }
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void wl3(Context p0,AttributeSet p1,int p2,int p3){
       super();
       this.t = -2;
       this.v = -2;
       this.y = 1002;
       this.C = 0;
       this.D = Integer.MAX_VALUE;
       this.H = new pl3(this, 2);
       this.I = new vl3(0, this);
       this.J = new ul3(this);
       this.K = new pl3(this, 1);
       this.M = new Rect();
       this.a = p0;
       this.L = new Handler(p0.getMainLooper());
       TypedArray typedArray = p0.obtainStyledAttributes(p1, ej4.R, p2, p3);
       this.w = typedArray.getDimensionPixelOffset(0, 0);
       int dimensionPix = typedArray.getDimensionPixelOffset(1, 0);
       this.x = dimensionPix;
       if (dimensionPix) {
          this.z = true;
       }
       typedArray.recycle();
       vg ovg = new vg(p0, p1, p2, p3);
       this.P = ovg;
       ovg.setInputMethodMode(1);
       return;
    }
    public final boolean a(){
       return this.P.isShowing();
    }
    public final int b(){
       return this.w;
    }
    public final void c(){
       int i2;
       Method r;
       int i4;
       wl3 owl3;
       int i6;
       Method q;
       wl3 tc;
       wl3 tv;
       wl3 tP = this.P;
       int i = 1;
       int i1 = 0;
       wl3 ta = this.a;
       if (this.c == null) {
          ue1 oue1 = this.q(ta, (this.O ^ i));
          this.c = oue1;
          oue1.setAdapter(this.b);
          this.c.setOnItemClickListener(this.G);
          this.c.setFocusable(i);
          this.c.setFocusableInTouchMode(i);
          this.c.setOnItemSelectedListener(new ql3(i1, this));
          this.c.setOnScrollListener(this.J);
          tP.setContentView(this.c);
       }else {
          ViewGroup contentView = tP.getContentView();
       }
       Drawable background = tP.getBackground();
       wl3 tM = this.M;
       if (background != null) {
          background.getPadding(tM);
          Rect top = tM.top;
          i2 = tM.bottom + top;
          if (this.z == null) {
             this.x = - top;
          }
       }else {
          tM.setEmpty();
          i2 = 0;
       }
       int b = (tP.getInputMethodMode() == 2)? true: false;
       wl3 tF = this.F;
       wl3 tx = this.x;
       if (Build$VERSION.SDK_INT <= 23) {
          if ((r = wl3.R) != null) {
             int i3 = 3;
             try{
                Object[] objArray = new Object[i3];
                objArray[i1] = tF;
                objArray[i] = Integer.valueOf(tx);
                objArray[2] = Boolean.valueOf(b);
                b = r.invoke(tP, objArray).intValue();
             }catch(java.lang.Exception e0){
                b = tP.getMaxAvailableHeight(tF, tx);
             }
          }else {
          }
       }else {
          b = rl3.a(tP, tF, tx, b);
       }
       if ((tx = this.t) == -1) {
          b = b + i2;
       }else if((tv = this.v) != -2){
          i6 = (tv != -1)? View$MeasureSpec.makeMeasureSpec(tv, 0x40000000): View$MeasureSpec.makeMeasureSpec((ta.getResources().getDisplayMetrics().widthPixels - (tM.left + tM.right)), 0x40000000);
       }else {
          i6 = View$MeasureSpec.makeMeasureSpec((ta.getResources().getDisplayMetrics().widthPixels - (tM.left + tM.right)), Integer.MIN_VALUE);
       }
       int i5 = ((b = this.c.a(i6, (b + i1))) > 0)? ((this.c.getPaddingBottom() + this.c.getPaddingTop()) + i2) + i1: 0;
       b = b + i5;
       ta = (tP.getInputMethodMode() == 2)? 1: 0;
       ej4.N0(tP, this.y);
       if (tP.isShowing()) {
          if (!gh7.b(this.F)) {
             return;
          }else if((tM = this.v) == -1){
             tM = -1;
          }else if(tM == -2){
             i5 = this.F.getWidth();
          }
          if (tx == -1) {
             i4 = (ta)? b: -1;
             if (ta) {
                b = (this.v == -1)? -1: 0;
                tP.setWidth(b);
                tP.setHeight(i1);
             }else if(this.v == -1){
                i1 = -1;
             }
             tP.setWidth(i1);
             tP.setHeight(-1);
          }else if(tx == -2){
             i4 = b;
          }
          tP.setOutsideTouchable(i);
          wl3 tF1 = this.F;
          wl3 tw = this.w;
          ta = this.x;
          if (tM < 0) {
             i5 = -1;
          }
          i2 = (i4 < 0)? -1: i4;
          tP.update(tF1, tw, ta, i5, i2);
       }else if((ta = this.v) == -1){
          i6 = -1;
       }else if(ta == -2){
          i6 = this.F.getWidth();
       }
       if (tx == -1) {
          i4 = -1;
       }else if(tx == -2){
          i4 = b;
       }
       tP.setWidth(i6);
       tP.setHeight(i4);
       i6 = 28;
       if (Build$VERSION.SDK_INT <= i6) {
          if ((q = wl3.Q) != null) {
             try{
                Object[] objArray1 = new Object[i];
                objArray1[i1] = Boolean.TRUE;
                q.invoke(tP, objArray1);
             }catch(java.lang.Exception e0){
             }
          }
       }else {
          sl3.b(tP, i);
       }
       tP.setOutsideTouchable(i);
       tP.setTouchInterceptor(this.I);
       if (this.B != null) {
          ej4.M0(tP, this.A);
       }
       if (Build$VERSION.SDK_INT <= i6) {
          if ((q = wl3.S) != null) {
             try{
                Object[] objArray2 = new Object[i];
                objArray2[i1] = this.N;
                q.invoke(tP, objArray2);
             }catch(java.lang.Exception e0){
                Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e0);
             }
          }
       }else {
          sl3.a(tP, this.N);
       }
       wh5.a(tP, this.F, this.w, this.x, this.C);
       this.c.setSelection(-1);
       if (this.O == null || (this.c.isInTouchMode() && (tc = this.c) != null)) {
          tc.setListSelectionHidden(i);
          tc.requestLayout();
       }
       if (this.O == null) {
          this.L.post(this.K);
       }
       return;
    }
    public final Drawable d(){
       return this.P.getBackground();
    }
    public final void dismiss(){
       wl3 tP = this.P;
       tP.dismiss();
       tP.setContentView(null);
       this.c = null;
       this.L.removeCallbacks(this.H);
    }
    public final ue1 e(){
       return this.c;
    }
    public final void g(Drawable p0){
       this.P.setBackgroundDrawable(p0);
    }
    public final void h(int p0){
       this.x = p0;
       this.z = true;
    }
    public final void j(int p0){
       this.w = p0;
    }
    public final int l(){
       if (this.z == null) {
          return 0;
       }
       return this.x;
    }
    public void p(ListAdapter p0){
       wl3 tE;
       wl3 tc;
       wl3 tb;
       if ((tE = this.E) == null) {
          this.E = new tl3(0, this);
       }else if((tb = this.b) != null){
          tb.unregisterDataSetObserver(tE);
       }
       this.b = p0;
       if (p0 != null) {
          p0.registerDataSetObserver(this.E);
       }
       if ((tc = this.c) != null) {
          tc.setAdapter(this.b);
       }
       return;
    }
    public ue1 q(Context p0,boolean p1){
       return new ue1(p0, p1);
    }
    public final void r(int p0){
       Drawable background;
       if ((background = this.P.getBackground()) != null) {
          wl3 tM = this.M;
          background.getPadding(tM);
          this.v = (tM.left + tM.right) + p0;
       }else {
          this.v = p0;
       }
       return;
    }
}
