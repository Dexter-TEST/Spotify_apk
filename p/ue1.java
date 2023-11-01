package p.ue1;
import android.widget.ListView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.widget.AbsListView;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.widget.Adapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.widget.AdapterView;
import p.pe1;
import p.w51;
import p.re1;
import p.te1;
import java.lang.Object;
import java.lang.reflect.Field;
import java.lang.Throwable;
import java.lang.Boolean;
import p.ce1;
import p.se1;
import p.yl3;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import p.em0;
import java.lang.Runnable;
import p.qe1;
import java.lang.Integer;
import java.lang.reflect.Method;

public class ue1 extends ListView	// class@002893 from classes.dex
{
    public boolean A;
    public yl3 B;
    public em0 C;
    public final Rect a;
    public int b;
    public int c;
    public int t;
    public int v;
    public int w;
    public se1 x;
    public boolean y;
    public final boolean z;

    public void ue1(Context p0,boolean p1){
       super(p0, null, 0x7f0301e9);
       this.a = new Rect();
       this.b = 0;
       this.c = 0;
       this.t = 0;
       this.v = 0;
       this.z = p1;
       this.setCacheColorHint(0);
    }
    public final int a(int p0,int p1){
       int itemViewType;
       ViewGroup$LayoutParams layoutParams;
       int dividerHeigh = this.getDividerHeight();
       Drawable divider = this.getDivider();
       ListAdapter adapter = this.getAdapter();
       int i = this.getListPaddingTop() + this.getListPaddingBottom();
       if (adapter == null) {
          return i;
       }
       if (dividerHeigh <= 0 || divider == null) {
          dividerHeigh = 0;
       }
       int count = adapter.getCount();
       View view = null;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i1 >= count) {
             return i;
          }
          if ((itemViewType = adapter.getItemViewType(i1)) != i2) {
             view = null;
             i2 = itemViewType;
          }
          view = adapter.getView(i1, view, this);
          if ((layoutParams = view.getLayoutParams()) == null) {
             layoutParams = this.generateDefaultLayoutParams();
             view.setLayoutParams(layoutParams);
          }
          itemViewType = ((layoutParams = layoutParams.height) > null)? View$MeasureSpec.makeMeasureSpec(layoutParams, 0x40000000): View$MeasureSpec.makeMeasureSpec(0, 0);
          view.measure(p0, itemViewType);
          view.forceLayout();
          if (i1 > 0) {
             i = i + dividerHeigh;
          }
          if ((i = i + view.getMeasuredHeight()) >= p1) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return p1;
    }
    public final boolean b(MotionEvent p0,int p1){
       boolean b1;
       View childAt;
       ue1 b3;
       int i;
       int i2;
       ue1 w;
       View childAt2;
       Drawable selector;
       float f3;
       Drawable selector1;
       Field a1;
       Field a2;
       View view = this;
       MotionEvent motionEvent = p0;
       boolean actionMasked = p0.getActionMasked();
       boolean b = false;
       if (actionMasked != 1) {
          if (actionMasked != 2) {
             if (actionMasked != 3) {
                b1 = true;
             }else {
             label_001e :
                b1 = false;
             }
          }else {
             b1 = true;
          label_0018 :
             if ((i = p0.findPointerIndex(p1)) < 0) {
                goto label_001e ;
             }else {
                int i1 = (int)motionEvent.getX(i);
                i = (int)motionEvent.getY(i);
                if ((i2 = view.pointToPosition(i1, i)) == -1) {
                   childAt = 1;
                }else {
                   View childAt1 = view.getChildAt((i2 - this.getFirstVisiblePosition()));
                   float f = (float)i1;
                   float f1 = (float)i;
                   view.A = true;
                   pe1.a(view, f, f1);
                   if (!this.isPressed()) {
                      view.setPressed(true);
                   }
                   this.layoutChildren();
                   if ((w = view.w) != -1 && ((childAt2 = view.getChildAt((w - this.getFirstVisiblePosition()))) != null && (childAt2 != childAt1 && childAt2.isPressed()))) {
                      childAt2.setPressed(b);
                   }
                   view.w = i2;
                   pe1.a(childAt1, (f - (float)childAt1.getLeft()), (f1 - (float)childAt1.getTop()));
                   if (!childAt1.isPressed()) {
                      childAt1.setPressed(true);
                   }
                   boolean i3 = ((selector = this.getSelector()) != null && i2 != -1)? 1: 0;
                   if (i3) {
                      selector.setVisible(b, b);
                   }
                   ue1 a = view.a;
                   a.set(childAt1.getLeft(), childAt1.getTop(), childAt1.getRight(), childAt1.getBottom());
                   a.left = a.left - view.b;
                   a.top = a.top - view.c;
                   a.right = a.right + view.t;
                   a.bottom = a.bottom + view.v;
                   if (w51.D()) {
                      b1 = re1.a(this);
                   }else if((a2 = te1.a) != null){
                      try{
                         b1 = a2.getBoolean(view);
                      }catch(java.lang.IllegalAccessException e0){
                         e0.printStackTrace();
                      }
                      b1 = false;
                   }else {
                   }
                   if (childAt1.isEnabled() != b1) {
                      b1 = b1 ^ true;
                      if (w51.D()) {
                         re1.b(view, b1);
                      }else if((a1 = te1.a) != null){
                         try{
                            a1.set(view, Boolean.valueOf(b1));
                         }catch(java.lang.IllegalAccessException e0){
                            e0.printStackTrace();
                         }
                      }
                      if (i2 != -1) {
                         this.refreshDrawableState();
                      }
                   }
                   if (i3) {
                      float f2 = a.exactCenterX();
                      f3 = a.exactCenterY();
                      i3 = (!this.getVisibility())? true: false;
                      selector.setVisible(i3, false);
                      ce1.e(selector, f2, f3);
                   }
                   if ((selector1 = this.getSelector()) != null && i2 != -1) {
                      ce1.e(selector1, f, f1);
                   }
                   if ((w = view.x) != null) {
                      w.b = false;
                   }
                   this.refreshDrawableState();
                   if (actionMasked == 1) {
                      view.performItemClick(childAt1, i2, view.getItemIdAtPosition(i2));
                   }
                   b1 = true;
                   f3 = 0;
                }
             }
          }
       }else {
          b1 = false;
          goto label_0018 ;
       }
       if (!b1 || b) {
          actionMasked = false;
          view.A = actionMasked;
          view.setPressed(actionMasked);
          this.drawableStateChanged();
          if ((childAt = view.getChildAt((view.w - this.getFirstVisiblePosition()))) != null) {
             childAt.setPressed(actionMasked);
          }
       }
       if (b1) {
          if (view.B == null) {
             view.B = new yl3(view);
          }
          ue1 b2 = view.B;
          b2.G = true;
          b2.d(view, motionEvent);
       }else if((b3 = view.B) != null){
          if (b3.G != null) {
             b3.e();
          }
          b3.G = false;
       }
       return b1;
    }
    public final void dispatchDraw(Canvas p0){
       Drawable selector;
       ue1 ta = this.a;
       if (!ta.isEmpty() && (selector = this.getSelector()) != null) {
          selector.setBounds(ta);
          selector.draw(p0);
       }
       super.dispatchDraw(p0);
       return;
    }
    public final void drawableStateChanged(){
       ue1 tx;
       Drawable selector;
       if (this.C != null) {
          return;
       }
       super.drawableStateChanged();
       if ((tx = this.x) != null) {
          tx.b = true;
       }
       if ((selector = this.getSelector()) != null && (this.A != null && this.isPressed())) {
          selector.setState(this.getDrawableState());
       }
       return;
    }
    public final boolean hasFocus(){
       boolean b = (this.z == null && !super.hasFocus())? false: true;
       return b;
    }
    public final boolean hasWindowFocus(){
       boolean b = (this.z == null && !super.hasWindowFocus())? false: true;
       return b;
    }
    public final boolean isFocused(){
       boolean b = (this.z == null && !super.isFocused())? false: true;
       return b;
    }
    public final boolean isInTouchMode(){
       boolean b = (this.z != null && (this.y != null || super.isInTouchMode()))? true: false;
       return b;
    }
    public final void onDetachedFromWindow(){
       this.C = null;
       super.onDetachedFromWindow();
    }
    public boolean onHoverEvent(MotionEvent p0){
       int sDK_INT;
       int i1;
       Drawable selector;
       if ((sDK_INT = Build$VERSION.SDK_INT) < 26) {
          return super.onHoverEvent(p0);
       }
       int actionMasked = p0.getActionMasked();
       int i = 3;
       if (actionMasked == 10 && this.C == null) {
          em0 uoem0 = new em0(i, this);
          this.C = uoem0;
          this.post(uoem0);
       }
       boolean b = super.onHoverEvent(p0);
       if (actionMasked != 9 && actionMasked != 7) {
          this.setSelection(-1);
       }else if((i1 = this.pointToPosition((int)p0.getX(), (int)p0.getY())) != -1 && i1 != this.getSelectedItemPosition()){
          View childAt = this.getChildAt((i1 - this.getFirstVisiblePosition()));
          if (childAt.isEnabled()) {
             this.requestFocus();
             if (sDK_INT >= 30 && qe1.d) {
                try{
                   Object[] objArray = new Object[]{Integer.valueOf(i1),childAt,Boolean.FALSE,Integer.valueOf(-1),Integer.valueOf(-1)};
                   qe1.a.invoke(this, objArray);
                   Object[] objArray1 = new Object[]{Integer.valueOf(i1)};
                   qe1.b.invoke(this, objArray1);
                   objArray1 = new Object[]{Integer.valueOf(i1)};
                   qe1.c.invoke(this, objArray1);
                }catch(java.lang.IllegalAccessException e10){
                   e10.printStackTrace();
                }catch(java.lang.reflect.InvocationTargetException e10){
                   e10.printStackTrace();
                }
             }else {
                this.setSelectionFromTop(i1, (childAt.getTop() - this.getTop()));
             }
          }
          if ((selector = this.getSelector()) != null && (this.A != null && this.isPressed())) {
             selector.setState(this.getDrawableState());
          }
       }
       return b;
    }
    public final boolean onTouchEvent(MotionEvent p0){
       ue1 tC;
       if (p0.getAction()) {
       }else {
          this.w = this.pointToPosition((int)p0.getX(), (int)p0.getY());
       }
       if ((tC = this.C) != null) {
          em0 b = tC.b;
          b.C = null;
          b.removeCallbacks(tC);
       }
       return super.onTouchEvent(p0);
    }
    public void setListSelectionHidden(boolean p0){
       this.y = p0;
    }
    public void setSelector(Drawable p0){
       se1 ose1 = (p0 != null)? new se1(p0): null;
       this.x = ose1;
       super.setSelector(ose1);
       Rect rect = new Rect();
       if (p0 != null) {
          p0.getPadding(rect);
       }
       this.b = rect.left;
       this.c = rect.top;
       this.t = rect.right;
       this.v = rect.bottom;
       return;
    }
}
