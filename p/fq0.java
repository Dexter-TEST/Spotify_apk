package p.fq0;
import android.view.View;
import android.content.Context;
import java.util.HashMap;
import android.util.AttributeSet;
import java.lang.String;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Object;
import java.lang.Integer;
import p.do5;
import java.lang.reflect.Field;
import java.lang.Class;
import android.content.res.Resources;
import java.util.Arrays;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import p.hq0;
import android.util.SparseArray;
import p.oi;
import android.content.res.TypedArray;
import p.wq0;
import android.graphics.Canvas;

public abstract class fq0 extends View	// class@001616 from classes.dex
{
    public int[] a;
    public int b;
    public final Context c;
    public sp2 t;
    public String v;
    public String w;
    public final HashMap x;

    public void fq0(Context p0){
       super(p0);
       int[] ointArray = new int[32];
       this.a = ointArray;
       this.x = new HashMap();
       this.c = p0;
       this.h(null);
    }
    public void fq0(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[32];
       this.a = ointArray;
       this.x = new HashMap();
       this.c = p0;
       this.h(p1);
    }
    public final void a(String p0){
       fq0 tc;
       ConstraintLayout d;
       int i;
       if (p0 != null && p0.length()) {
          if ((tc = this.c) == null) {
             return;
          }else {
             p0 = p0.trim();
             Object obj = null;
             ConstraintLayout parent = (this.getParent() instanceof ConstraintLayout)? this.getParent(): obj;
             if (this.isInEditMode() && parent != null) {
                Object obj1 = (p0 instanceof String && ((d = parent.D) != null && d.containsKey(p0)))? parent.D.get(p0): obj;
                if (obj1 instanceof Integer) {
                   i = obj1.intValue();
                label_004e :
                   if (!i && parent != null) {
                      i = this.g(parent, p0);
                   }
                   if (!i) {
                      try{
                         i = do5.class.getField(p0).getInt(obj);
                      }catch(java.lang.Exception e0){
                      }
                   }
                   if (!i) {
                      i = e0.getResources().getIdentifier(p0, "id", e0.getPackageName());
                   }
                   if (i) {
                      this.x.put(Integer.valueOf(i), p0);
                      this.b(i);
                   }
                }
             }
             i = 0;
             goto label_004e ;
          }
       }
       return;
    }
    public final void b(int p0){
       if (p0 == this.getId()) {
          return;
       }
       fq0 ta = this.a;
       if (((this.b + 1)) > ta.length) {
          this.a = Arrays.copyOf(ta, (ta.length * 2));
       }
       ta = this.b;
       this.a[ta] = p0;
       this.b = ta + 1;
       return;
    }
    public final void c(String p0){
       if (p0 != null && p0.length()) {
          if (this.c == null) {
             return;
          }else {
             p0 = p0.trim();
             ConstraintLayout parent = (this.getParent() instanceof ConstraintLayout)? this.getParent(): null;
             if (parent == null) {
                return;
             }else {
                int childCount = parent.getChildCount();
                int i = 0;
                while (i < childCount) {
                   View childAt = parent.getChildAt(i);
                   ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                   if (layoutParams instanceof hq0 && (p0.equals(layoutParams.Y) && childAt.getId() != -1)) {
                      this.b(childAt.getId());
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
    public final void d(){
       ViewParent parent;
       if ((parent = this.getParent()) != null && parent instanceof ConstraintLayout) {
          this.e(parent);
       }
       return;
    }
    public final void e(ConstraintLayout p0){
       View view;
       int visibility = this.getVisibility();
       float elevation = this.getElevation();
       int i = 0;
       while (i < this.b) {
          if ((view = p0.a.get(this.a[i])) != null) {
             view.setVisibility(visibility);
             if ((0 - elevation) > 0) {
                float f = view.getTranslationZ() + elevation;
                view.setTranslationZ(f);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void f(ConstraintLayout p0){
    }
    public final int g(ConstraintLayout p0,String p1){
       Resources resources;
       String resourceEntr;
       if (p1 != null && p0 != null) {
          if ((resources = this.c.getResources()) == null) {
             return 0;
          }else {
             int childCount = p0.getChildCount();
             int i = 0;
             while (i < childCount) {
                View childAt = p0.getChildAt(i);
                if (childAt.getId() != -1) {
                   try{
                      resourceEntr = resources.getResourceEntryName(childAt.getId());
                   }catch(android.content.res.Resources$NotFoundException e0){
                      resourceEntr = null;
                   }
                   if (p1.equals(resourceEntr)) {
                      return childAt.getId();
                   }
                }
                i = i + 1;
             }
          }
       }
       return 0;
    }
    public int[] getReferencedIds(){
       return Arrays.copyOf(this.a, this.b);
    }
    public void h(AttributeSet p0){
       int index;
       String str;
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, oi.w);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             if ((index = typedArray.getIndex(i)) == 35) {
                str = typedArray.getString(index);
                this.v = str;
                this.setIds(str);
             }else if(index == 36){
                str = typedArray.getString(index);
                this.w = str;
                this.setReferenceTags(str);
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       return;
    }
    public void i(wq0 p0,boolean p1){
    }
    public void j(){
    }
    public final void k(){
       if (this.t == null) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       if (layoutParams instanceof hq0) {
          layoutParams.p0 = this.t;
       }
       return;
    }
    public void onAttachedToWindow(){
       fq0 tv;
       super.onAttachedToWindow();
       if ((tv = this.v) != null) {
          this.setIds(tv);
       }
       if ((tv = this.w) != null) {
          this.setReferenceTags(tv);
       }
       return;
    }
    public final void onDraw(Canvas p0){
    }
    public void onMeasure(int p0,int p1){
       this.setMeasuredDimension(0, 0);
    }
    public void setIds(String p0){
       int i1;
       this.v = p0;
       if (p0 == null) {
          return;
       }
       int i = 0;
       this.b = i;
       while ((i1 = p0.indexOf(44, i)) != -1) {
          this.a(p0.substring(i, i1));
          i = i1 + 1;
       }
       this.a(p0.substring(i));
       return;
    }
    public void setReferenceTags(String p0){
       int i1;
       this.w = p0;
       if (p0 == null) {
          return;
       }
       int i = 0;
       this.b = i;
       while ((i1 = p0.indexOf(44, i)) != -1) {
          this.c(p0.substring(i, i1));
          i = i1 + 1;
       }
       this.c(p0.substring(i));
       return;
    }
    public void setReferencedIds(int[] p0){
       this.v = null;
       int i = 0;
       this.b = i;
       for (; i < p0.length; i = i + 1) {
          this.b(p0[i]);
       }
       return;
    }
    public final void setTag(int p0,Object p1){
       super.setTag(p0, p1);
       if (p1 == null && this.v == null) {
          this.b(p0);
       }
       return;
    }
}
