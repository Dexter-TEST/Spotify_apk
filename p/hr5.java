package p.hr5;
import java.lang.Object;
import p.fr5;
import p.mi7;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import android.graphics.Rect;
import java.lang.Math;
import android.view.View$MeasureSpec;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import p.gr5;
import p.oi;
import android.content.res.TypedArray;
import p.vr5;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import p.pr5;
import p.zr5;
import p.yq5;
import p.xe0;
import p.wh7;
import p.dh7;
import java.lang.String;
import android.util.Log;
import p.ur5;
import java.lang.Class;
import p.yr5;
import java.lang.Runnable;
import android.widget.OverScroller;
import java.lang.IllegalArgumentException;
import p.eh7;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import p.y3;
import android.view.accessibility.AccessibilityNodeInfo;
import p.x3;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.ViewParent;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import p.en6;
import android.os.Parcelable;
import p.zh2;
import android.os.Bundle;
import java.util.ArrayList;
import p.dr5;
import p.xq5;
import p.we0;

public abstract class hr5	// class@0018ab from classes.dex
{
    public final boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public xe0 a;
    public RecyclerView b;
    public final mi7 c;
    public final mi7 t;
    public ur5 v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void hr5(){
       super();
       fr5 uofr5 = new fr5(this, 1);
       this.c = new mi7(new fr5(this, 0));
       this.t = new mi7(uofr5);
       this.w = false;
       this.x = false;
       this.y = false;
       this.z = true;
       this.A = true;
    }
    public static int G(View p0){
       return p0.getLayoutParams().b.bottom;
    }
    public static int J(boolean p0,int p1,int p2,int p3,int p4){
       p1 = Math.max(0, (p1 - p3));
       if (p0) {
          if (p4 >= 0) {
          label_001c :
             p2 = 0x40000000;
          }else if(p4 == -1 && (p2 == Integer.MIN_VALUE && (!p2 && p2 == 0x40000000))){
          label_0021 :
             p4 = p1;
          }else {
          label_0031 :
             p2 = 0;
             p4 = 0;
          }
       }else if(p4 >= 0){
          goto label_001c ;
       }else if(p4 == -1){
          goto label_0021 ;
       }else if(p4 == -2){
          if (p2 != Integer.MIN_VALUE && p2 != 0x40000000) {
             p4 = p1;
             p2 = 0;
          }else {
             p4 = p1;
             p2 = Integer.MIN_VALUE;
          }
       }else {
          goto label_0031 ;
       }
       return View$MeasureSpec.makeMeasureSpec(p4, p2);
    }
    public static void L(View p0,Rect p1){
       ir5 layoutParams = p0.getLayoutParams();
       ir5 b = layoutParams.b;
       p1.set(((p0.getLeft() - b.left) - layoutParams.leftMargin), ((p0.getTop() - b.top) - layoutParams.topMargin), ((p0.getRight() + b.right) + layoutParams.rightMargin), ((p0.getBottom() + b.bottom) + layoutParams.bottomMargin));
    }
    public static int M(View p0){
       ir5 b = p0.getLayoutParams().b;
       return ((p0.getMeasuredHeight() + b.top) + b.bottom);
    }
    public static int N(View p0){
       ir5 b = p0.getLayoutParams().b;
       return ((p0.getMeasuredWidth() + b.left) + b.right);
    }
    public static int Q(View p0){
       return p0.getLayoutParams().b.left;
    }
    public static int R(View p0){
       return p0.getLayoutParams().a();
    }
    public static gr5 S(Context p0,AttributeSet p1,int p2,int p3){
       gr5 ogr5 = new gr5();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, oi.t, p2, p3);
       ogr5.a = typedArray.getInt(0, 1);
       ogr5.b = typedArray.getInt(10, 1);
       ogr5.c = typedArray.getBoolean(9, 0);
       ogr5.d = typedArray.getBoolean(11, 0);
       typedArray.recycle();
       return ogr5;
    }
    public static int T(View p0){
       return p0.getLayoutParams().b.right;
    }
    public static int V(View p0){
       return p0.getLayoutParams().b.top;
    }
    public static boolean Y(int p0,int p1,int p2){
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       boolean b = false;
       if (p2 > 0 && p0 != p2) {
          return b;
       }
       if (mode != Integer.MIN_VALUE) {
          if (mode) {
             if (mode != 0x40000000) {
                return b;
             }else if(p1 == p0){
                b = true;
             }
             return b;
          }else {
             return true;
          }
       }else if(p1 >= p0){
          b = true;
       }
       return b;
    }
    public static void Z(View p0,int p1,int p2,int p3,int p4){
       ir5 layoutParams = p0.getLayoutParams();
       ir5 b = layoutParams.b;
       p0.layout(((p1 + b.left) + layoutParams.leftMargin), ((p2 + b.top) + layoutParams.topMargin), ((p3 - b.right) - layoutParams.rightMargin), ((p4 - b.bottom) - layoutParams.bottomMargin));
    }
    public static int s(int p0,int p1,int p2){
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       if (mode == Integer.MIN_VALUE) {
          return Math.min(p0, Math.max(p1, p2));
       }
       if (mode != 0x40000000) {
          p0 = Math.max(p1, p2);
       }
       return p0;
    }
    public int A(vr5 p0){
       return 0;
    }
    public boolean A0(RecyclerView p0,View p1,Rect p2,boolean p3,boolean p4){
       int i = (p1.getLeft() + p2.left) - p1.getScrollX();
       int i1 = (p1.getTop() + p2.top) - p1.getScrollY();
       int i2 = p2.width() + i;
       int i3 = p2.height() + i1;
       i = i - this.getPaddingLeft();
       int i4 = Math.min(0, i);
       i1 = i1 - this.getPaddingTop();
       int i5 = Math.min(0, i1);
       i2 = i2 - (this.F - this.getPaddingRight());
       int i6 = Math.max(0, i2);
       i3 = Math.max(0, (i3 - (this.G - this.getPaddingBottom())));
       if (this.P() == 1) {
          if (!i6) {
             i6 = Math.max(i4, i2);
          }
       }else if(i4){
          i4 = Math.min(i, i6);
       }
       i6 = i4;
       if (!i5) {
          i5 = Math.min(i1, i3);
       }
       if (p4) {
          if ((i2 = p0.getFocusedChild()) != null) {
             i3 = this.getPaddingLeft();
             int paddingTop = this.getPaddingTop();
             i = this.G - this.getPaddingBottom();
             RecyclerView a = this.b.A;
             hr5.L(i2, a);
             if (((a.left - i6)) < (this.F - this.getPaddingRight()) && (((a.right - i6)) > i3 && (((a.top - i5)) < i && ((a.bottom - i5)) > paddingTop))) {
                i2 = 1;
             label_00a9 :
                if (!i2) {
                label_00b0 :
                   return 0;
                }
             }
          }
          i2 = 0;
          goto label_00a9 ;
       }
       if (!i6 && !i5) {
          goto label_00b0 ;
       }else if(p3){
          p0.scrollBy(i6, i5);
       }else {
          p0.j0(i6, i5, null, 0);
       }
       return true;
    }
    public final void B(pr5 p0){
       int i = this.I();
       while ((i = i - 1) >= 0) {
          View view = this.H(i);
          zr5 ozr5 = RecyclerView.M(view);
          if (ozr5.q()) {
             continue ;
          }else if(ozr5.i() && (!ozr5.k() && this.b.D.b == null)){
             if (this.H(i) != null) {
                this.a.l(i);
             }
             p0.j(ozr5);
          }else {
             this.H(i);
             this.a.c(i);
             p0.k(view);
             this.b.x.o(ozr5);
          }
       }
       return;
    }
    public final void B0(){
       hr5 tb;
       if ((tb = this.b) != null) {
          tb.requestLayout();
       }
       return;
    }
    public View C(int p0){
       View view;
       zr5 ozr5;
       int i = this.I();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          view = this.H(i1);
          if ((ozr5 = RecyclerView.M(view)) == null || (ozr5.e() != p0 || (ozr5.q() || (this.b.y0.g == null && ozr5.k())))) {
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       return view;
    }
    public int C0(int p0,pr5 p1,vr5 p2){
       return 0;
    }
    public abstract ir5 D();
    public abstract void D0(int p0);
    public ir5 E(Context p0,AttributeSet p1){
       return new ir5(p0, p1);
    }
    public int E0(int p0,pr5 p1,vr5 p2){
       return 0;
    }
    public ir5 F(ViewGroup$LayoutParams p0){
       if (p0 instanceof ir5) {
          return new ir5(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new ir5(p0);
       }
       return new ir5(p0);
    }
    public final void F0(RecyclerView p0){
       this.G0(View$MeasureSpec.makeMeasureSpec(p0.getWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(p0.getHeight(), 0x40000000));
    }
    public final void G0(int p0,int p1){
       this.F = View$MeasureSpec.getSize(p0);
       p0 = View$MeasureSpec.getMode(p0);
       this.D = p0;
       if (!p0 && !RecyclerView.U0) {
          this.F = 0;
       }
       this.G = View$MeasureSpec.getSize(p1);
       p0 = View$MeasureSpec.getMode(p1);
       this.E = p0;
       if (!p0 && !RecyclerView.U0) {
          this.G = 0;
       }
       return;
    }
    public final View H(int p0){
       hr5 ta;
       View view = ((ta = this.a) != null)? ta.d(p0): null;
       return view;
    }
    public void H0(Rect p0,int p1,int p2){
       RecyclerView.f(this.b, hr5.s(p1, (this.getPaddingRight() + (this.getPaddingLeft() + p0.width())), dh7.e(this.b)), hr5.s(p2, (this.getPaddingBottom() + (this.getPaddingTop() + p0.height())), dh7.d(this.b)));
    }
    public final int I(){
       hr5 ta;
       int i = ((ta = this.a) != null)? ta.e(): 0;
       return i;
    }
    public final void I0(int p0,int p1){
       int i;
       Rect left;
       if (!(i = this.I())) {
          this.b.p(p0, p1);
          return;
       }else {
          int i1 = Integer.MAX_VALUE;
          int i2 = Integer.MAX_VALUE;
          int i3 = Integer.MIN_VALUE;
          int i4 = Integer.MIN_VALUE;
          int i5 = 0;
          while (i5 < i) {
             RecyclerView a = this.b.A;
             hr5.L(this.H(i5), a);
             if ((left = a.left) < i1) {
                i1 = left;
             }
             if ((left = a.right) > i3) {
                i3 = left;
             }
             if ((left = a.top) < i2) {
                i2 = left;
             }
             if ((left = a.bottom) > i4) {
                i4 = left;
             }
             i5 = i5 + 1;
          }
          this.b.A.set(i1, i2, i3, i4);
          this.H0(this.b.A, p0, p1);
          return;
       }
    }
    public final void J0(RecyclerView p0){
       if (p0 == null) {
          this.b = null;
          this.a = null;
          int i = 0;
          this.F = i;
          this.G = i;
       }else {
          this.b = p0;
          this.a = p0.w;
          this.F = p0.getWidth();
          this.G = p0.getHeight();
       }
       this.D = 0x40000000;
       this.E = 0x40000000;
       return;
    }
    public int K(pr5 p0,vr5 p1){
       return -1;
    }
    public final boolean K0(View p0,int p1,int p2,ir5 p3){
       boolean b = (!p0.isLayoutRequested() && (this.z != null && (hr5.Y(p0.getWidth(), p1, p3.width) && hr5.Y(p0.getHeight(), p2, p3.height))))? false: true;
       return b;
    }
    public boolean L0(){
       return false;
    }
    public final boolean M0(View p0,int p1,int p2,ir5 p3){
       boolean b = (this.z != null && (hr5.Y(p0.getMeasuredWidth(), p1, p3.width) && hr5.Y(p0.getMeasuredHeight(), p2, p3.height)))? false: true;
       return b;
    }
    public void N0(RecyclerView p0,int p1){
       Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }
    public final int O(){
       hr5 tb;
       yq5 adapter = ((tb = this.b) != null)? tb.getAdapter(): null;
       int i = (adapter != null)? adapter.d(): 0;
       return i;
    }
    public final void O0(ur5 p0){
       hr5 tv;
       ur5 a;
       if ((tv = this.v) != null && (p0 != tv && tv.e != null)) {
          tv.d();
       }
       this.v = p0;
       tv = this.b;
       p0.getClass();
       RecyclerView v0 = tv.v0;
       v0.x.removeCallbacks(v0);
       v0.c.abortAnimation();
       p0.b = tv;
       p0.c = this;
       if ((a = p0.a) != -1) {
          tv.y0.a = a;
          p0.e = true;
          p0.d = true;
          p0.f = tv.E.C(a);
          p0.b.v0.b();
          return;
       }else {
          throw new IllegalArgumentException("Invalid target position");
       }
    }
    public final int P(){
       return eh7.d(this.b);
    }
    public boolean P0(){
       return false;
    }
    public int U(pr5 p0,vr5 p1){
       return -1;
    }
    public final void W(View p0,Rect p1){
       Matrix matrix;
       ir5 b = p0.getLayoutParams().b;
       p1.set((- b.left), (- b.top), (p0.getWidth() + b.right), (p0.getHeight() + b.bottom));
       if (this.b != null && ((matrix = p0.getMatrix()) != null && !matrix.isIdentity())) {
          RecyclerView c = this.b.C;
          c.set(p1);
          matrix.mapRect(c);
          p1.set((int)Math.floor((double)c.left), (int)Math.floor((double)c.top), (int)Math.ceil((double)c.right), (int)Math.ceil((double)c.bottom));
       }
       p1.offset(p0.getLeft(), p0.getTop());
       return;
    }
    public boolean X(){
       return this.y;
    }
    public void a0(int p0){
       hr5 tb;
       if ((tb = this.b) != null) {
          int i = tb.w.e();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             tb.w.d(i1).offsetLeftAndRight(p0);
          }
       }
       return;
    }
    public void b0(int p0){
       hr5 tb;
       if ((tb = this.b) != null) {
          int i = tb.w.e();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             tb.w.d(i1).offsetTopAndBottom(p0);
          }
       }
       return;
    }
    public void c0(yq5 p0){
    }
    public void d0(RecyclerView p0){
    }
    public void e0(RecyclerView p0){
    }
    public View f0(View p0,int p1,pr5 p2,vr5 p3){
       return null;
    }
    public void g0(AccessibilityEvent p0){
       hr5 tb;
       RecyclerView d;
       if ((tb = this.b) != null && p0 != null) {
          int i = 1;
          if (!tb.canScrollVertically(i) && (!this.b.canScrollVertically(-1) && (!this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(i)))) {
             i = false;
          }
          p0.setScrollable(i);
          if ((d = this.b.D) != null) {
             p0.setItemCount(d.d());
          }
       }
       return;
    }
    public int getPaddingBottom(){
       hr5 tb;
       int paddingBotto = ((tb = this.b) != null)? tb.getPaddingBottom(): 0;
       return paddingBotto;
    }
    public final int getPaddingEnd(){
       hr5 tb;
       int i = ((tb = this.b) != null)? eh7.e(tb): 0;
       return i;
    }
    public final int getPaddingLeft(){
       hr5 tb;
       int paddingLeft = ((tb = this.b) != null)? tb.getPaddingLeft(): 0;
       return paddingLeft;
    }
    public final int getPaddingRight(){
       hr5 tb;
       int paddingRight = ((tb = this.b) != null)? tb.getPaddingRight(): 0;
       return paddingRight;
    }
    public final int getPaddingStart(){
       hr5 tb;
       int i = ((tb = this.b) != null)? eh7.f(tb): 0;
       return i;
    }
    public final int getPaddingTop(){
       hr5 tb;
       int paddingTop = ((tb = this.b) != null)? tb.getPaddingTop(): 0;
       return paddingTop;
    }
    public void h0(pr5 p0,vr5 p1,y3 p2){
       y3 a = p2.a;
       if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
          p2.a(8192);
          a.setScrollable(true);
       }
       if (this.b.canScrollVertically(true) || this.b.canScrollHorizontally(true)) {
          p2.a(4096);
          a.setScrollable(true);
       }
       a.setCollectionInfo(x3.c(this.U(p0, p1), this.K(p0, p1), 0).a);
       return;
    }
    public final void i0(View p0,y3 p1){
       zr5 ozr5;
       if ((ozr5 = RecyclerView.M(p0)) != null && (!ozr5.k() && !this.a.k(ozr5.a))) {
          hr5 tb = this.b;
          this.j0(tb.c, tb.y0, p0, p1);
       }
       return;
    }
    public void j0(pr5 p0,vr5 p1,View p2,y3 p3){
    }
    public void k0(RecyclerView p0,int p1,int p2){
    }
    public final void l(View p0){
       this.m(-1, p0, false);
    }
    public void l0(RecyclerView p0){
    }
    public final void m(int p0,View p1,boolean p2){
       View view;
       hr5 tv;
       zr5 ozr52;
       zr5 ozr5 = RecyclerView.M(p1);
       if (!p2 && !ozr5.k()) {
          this.b.x.o(ozr5);
       }else {
          this.b.x.c(ozr5);
       }
       ir5 layoutParams = p1.getLayoutParams();
       if (!ozr5.r() && !ozr5.l()) {
          int i = -1;
          if (p1.getParent() == this.b) {
             int i1 = this.a.j(p1);
             if (p0 == i) {
                p0 = this.a.e();
             }
             if (i1 != i) {
                if (i1 != p0) {
                   RecyclerView e = this.b.E;
                   if ((view = e.H(i1)) != null) {
                      e.H(i1);
                      e.a.c(i1);
                      ir5 layoutParams1 = view.getLayoutParams();
                      zr5 ozr51 = RecyclerView.M(view);
                      if (ozr51.k()) {
                         e.b.x.c(ozr51);
                      }else {
                         e.b.x.o(ozr51);
                      }
                      e.a.b(view, p0, layoutParams1, ozr51.k());
                   }else {
                      throw new IllegalArgumentException("Cannot move a child from non-existing index:"+i1+e.b.toString());
                   }
                }
             }else {
                throw new IllegalStateException(en6.m(this.b, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"+this.b.indexOfChild(p1)));
             }
          }else {
             this.a.a(p0, p1, false);
             layoutParams.c = true;
             if ((tv = this.v) != null && tv.e != null) {
                tv.b.getClass();
                if ((ozr52 = RecyclerView.M(p1)) != null) {
                   i = ozr52.e();
                }
                if (i == tv.a) {
                   tv.f = p1;
                }
             }
          }
       }else if(ozr5.l()){
          ozr5.n.m(ozr5);
       }else {
          ozr5.j = ozr5.j & 0xdf;
       }
       this.a.b(p1, p0, p1.getLayoutParams(), false);
       if (layoutParams.t != null) {
          ozr5.a.invalidate();
          layoutParams.t = false;
       }
       return;
    }
    public void m0(RecyclerView p0,int p1,int p2){
    }
    public void n(String p0){
       hr5 tb;
       if ((tb = this.b) != null) {
          tb.j(p0);
       }
       return;
    }
    public void n0(RecyclerView p0,int p1,int p2){
    }
    public final void o(View p0,Rect p1){
       hr5 tb;
       if ((tb = this.b) == null) {
          p1.set(0, 0, 0, 0);
          return;
       }else {
          p1.set(tb.N(p0));
          return;
       }
    }
    public void o0(int p0){
    }
    public boolean p(){
       return false;
    }
    public void p0(RecyclerView p0,int p1,int p2,Object p3){
       this.o0(p1);
    }
    public boolean q(){
       return false;
    }
    public abstract void q0(pr5 p0,vr5 p1);
    public boolean r(ir5 p0){
       boolean b = (p0 != null)? true: false;
       return b;
    }
    public void r0(vr5 p0){
    }
    public void s0(Parcelable p0){
    }
    public void t(int p0,int p1,vr5 p2,zh2 p3){
    }
    public Parcelable t0(){
       return null;
    }
    public void u(int p0,zh2 p1){
    }
    public void u0(int p0){
    }
    public int v(vr5 p0){
       return 0;
    }
    public boolean v0(pr5 p0,vr5 p1,int p2,Bundle p3){
       int i;
       boolean b = false;
       if (this.b == null) {
          return b;
       }
       hr5 tG = this.G;
       hr5 tF = this.F;
       Rect rect = new Rect();
       if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
          tG = rect.height();
          tF = rect.width();
       }
       if (p2 != 4096) {
          if (p2 != 8192) {
             i = 0;
          }else if(this.b.canScrollVertically(-1)){
             i = - ((tG - this.getPaddingTop()) - this.getPaddingBottom());
          }else {
             i = 0;
          }
          if (this.b.canScrollHorizontally(-1)) {
             p2 = - ((tF - this.getPaddingLeft()) - this.getPaddingRight());
          label_0088 :
             if (!i && !p2) {
                return b;
             }else {
                this.b.j0(p2, i, null, true);
                return true;
             }
          }
       }else if(this.b.canScrollVertically(true)){
          i = (tG - this.getPaddingTop()) - this.getPaddingBottom();
       }else {
          i = 0;
       }
       if (this.b.canScrollHorizontally(true)) {
          p2 = (tF - this.getPaddingLeft()) - this.getPaddingRight();
          goto label_0088 ;
       }
       p2 = 0;
       goto label_0088 ;
    }
    public int w(vr5 p0){
       return 0;
    }
    public final void w0(){
       int i = this.I();
       while ((i = i - 1) >= 0) {
          this.a.l(i);
       }
       return;
    }
    public int x(vr5 p0){
       return 0;
    }
    public final void x0(pr5 p0){
       int i = this.I();
       while ((i = i - 1) >= 0) {
          if (!RecyclerView.M(this.H(i)).q()) {
             View view = this.H(i);
             if (this.H(i) != null) {
                this.a.l(i);
             }
             p0.i(view);
          }
       }
       return;
    }
    public int y(vr5 p0){
       return 0;
    }
    public final void y0(pr5 p0){
       pr5 d;
       RecyclerView g0;
       int i = p0.d.size();
       int i1 = i - 1;
       while (true) {
          d = p0.d;
          if (i1 >= 0) {
             zr5 a = d.get(i1).a;
             zr5 ozr5 = RecyclerView.M(a);
             if (!ozr5.q()) {
                boolean b = false;
                ozr5.p(b);
                if (ozr5.m()) {
                   this.b.removeDetachedView(a, b);
                }
                if ((g0 = this.b.g0) != null) {
                   g0.d(ozr5);
                }
                ozr5.p(true);
                a = RecyclerView.M(a);
                a.n = null;
                a.o = b;
                int i2 = a.j & 0xdf;
                a.j = i2;
                p0.j(a);
             }
             i1 = i1 - 1;
          }else {
             break ;
          }
       }
       d.clear();
       if ((p0 = p0.e) != null) {
          p0.clear();
       }
       if (i > 0) {
          this.b.invalidate();
       }
       return;
    }
    public int z(vr5 p0){
       return 0;
    }
    public final void z0(View p0,pr5 p1){
       int i;
       hr5 ta = this.a;
       xe0 b = ta.b;
       if ((i = b.a.indexOfChild(p0)) < 0) {
       }else if(ta.c.f(i)){
          ta.m(p0);
       }
       b.i(i);
       p1.i(p0);
       return;
    }
}
