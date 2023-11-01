package p.rh4;
import android.view.View;
import java.lang.Object;
import android.view.ViewParent;
import p.bk7;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;
import p.sh4;
import p.th4;

public final class rh4	// class@0024ea from classes.dex
{
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public void rh4(View p0){
       super();
       this.c = p0;
    }
    public final boolean a(float p0,float p1,boolean p2){
       ViewParent viewParent;
       int i = 0;
       if (this.d != null && (viewParent = this.f(i)) != null) {
          rh4 tc = this.c;
          try{
             i = bk7.a(viewParent, tc, p0, p1, p2);
          }catch(java.lang.AbstractMethodError e4){
             Log.e("ViewParentCompat", "ViewParent "+viewParent+" does not implement interface method onNestedFling", e4);
          }
       }
       return i;
    }
    public final boolean b(float p0,float p1){
       ViewParent viewParent;
       int i = 0;
       if (this.d != null && (viewParent = this.f(i)) != null) {
          rh4 tc = this.c;
          try{
             i = bk7.b(viewParent, tc, p0, p1);
          }catch(java.lang.AbstractMethodError e4){
             Log.e("ViewParentCompat", "ViewParent "+viewParent+" does not implement interface method onNestedPreFling", e4);
          }
       }
       return i;
    }
    public final boolean c(int p0,int p1,int[] p2,int[] p3,int p4){
       ViewParent viewParent;
       int i3;
       int i4;
       rh4 orh41;
       rh4 orh4 = this;
       int i = p0;
       int i1 = p1;
       int[] ointArray = p3;
       int i2 = p4;
       boolean b = false;
       if (orh4.d != null) {
          if ((viewParent = this.f(i2)) == null) {
             return b;
          }else if(!i && !i1){
             if (ointArray != null) {
                ointArray[b] = b;
                ointArray[1] = b;
             }
          }else {
             rh4 c = orh4.c;
             if (ointArray) {
                c.getLocationInWindow(ointArray);
                i3 = ointArray[b];
                i4 = ointArray[1];
             }else {
                i3 = 0;
                i4 = 0;
             }
             if (p2 == null) {
                if (orh4.e == null) {
                   int[] ointArray1 = new int[2];
                   orh4.e = ointArray1;
                }
                orh41 = orh4.e;
             }else {
                orh41 = p2;
             }
             orh41[b] = b;
             orh41[1] = b;
             rh4 c1 = orh4.c;
             if (viewParent instanceof sh4) {
                viewParent.c(c1, p0, p1, orh41, p4);
             }else if(!i2){
                try{
                   bk7.c(viewParent, c1, i, i1, orh41);
                }catch(java.lang.AbstractMethodError e0){
                   Log.e("ViewParentCompat", "ViewParent "+viewParent+" does not implement interface method onNestedPreScroll", e0);
                }
             }
             if (ointArray != null) {
                c.getLocationInWindow(ointArray);
                ointArray[b] = ointArray[b] - i3;
                ointArray[1] = ointArray[1] - i4;
             }
             if (orh41[b] || orh41[1]) {
                b = true;
             }
          }
       }
       return b;
    }
    public final void d(int p0,int p1,int p2,int[] p3){
       this.e(0, p0, 0, p1, null, p2, p3);
    }
    public final boolean e(int p0,int p1,int p2,int p3,int[] p4,int p5,int[] p6){
       ViewParent viewParent;
       int i1;
       int i2;
       rh4 orh41;
       rh4 orh4 = this;
       int[] ointArray = p4;
       int i = p5;
       if (orh4.d != null) {
          if ((viewParent = orh4.f(i)) == null) {
             return false;
          }else if(!p0 && (!p1 && (!p2 && !p3))){
             if (ointArray != null) {
                ointArray[0] = false;
                ointArray[1] = false;
             }
          }else {
             rh4 c = orh4.c;
             if (ointArray) {
                c.getLocationInWindow(ointArray);
                i1 = ointArray[0];
                i2 = ointArray[1];
             }else {
                i1 = 0;
                i2 = 0;
             }
             if (p6 == null) {
                if (orh4.e == null) {
                   int[] ointArray1 = new int[2];
                   orh4.e = ointArray1;
                }
                rh4 e = orh4.e;
                e[0] = false;
                e[1] = false;
                orh41 = e;
             }else {
                orh41 = p6;
             }
             rh4 c1 = orh4.c;
             if (viewParent instanceof th4) {
                viewParent.f(c1, p0, p1, p2, p3, p5, orh41);
             }else {
                orh41[0] = orh41[0] + p2;
                orh41[1] = orh41[1] + p3;
                if (viewParent instanceof sh4) {
                   viewParent.g(c1, p0, p1, p2, p3, p5);
                }else if(!i){
                   ViewParent viewParent1 = viewParent;
                   int i3 = p0;
                   int i4 = p1;
                   int i5 = p2;
                   int i6 = p3;
                   try{
                      bk7.d(viewParent1, c1, i3, i4, i5, i6);
                   }catch(java.lang.AbstractMethodError e0){
                      Log.e("ViewParentCompat", "ViewParent "+viewParent+" does not implement interface method onNestedScroll", e0);
                   }
                }
             }
             if (ointArray != null) {
                c.getLocationInWindow(ointArray);
                ointArray[0] = ointArray[0] - i1;
                ointArray[1] = ointArray[1] - i2;
             }
             return 1;
          }
       }
       return false;
    }
    public final ViewParent f(int p0){
       if (!p0) {
          return this.a;
       }
       if (p0 != 1) {
          return null;
       }
       return this.b;
    }
    public final boolean g(int p0,int p1){
       boolean b;
       int i = (this.f(p1) != null)? 1: 0;
       if (i) {
          return true;
       }else if(this.d != null){
          rh4 tc = this.c;
          ViewParent parent = tc.getParent();
          rh4 orh4 = tc;
          while (true) {
             if (parent != null) {
                if (v5 = parent instanceof sh4) {
                   b = parent.i(orh4, tc, p0, p1);
                }else if(!p1){
                   try{
                      b = bk7.f(parent, orh4, tc, p0);
                   }catch(java.lang.AbstractMethodError e8){
                      Log.e("ViewParentCompat", "ViewParent ".append(parent).append(" does not implement interface method onStartNestedScroll").toString(), e8);
                   }
                   b = false;
                }else {
                }
                if (b) {
                   if (p1) {
                      if (p1 == 1) {
                         this.b = parent;
                      }
                   }else {
                      this.a = parent;
                   }
                   if (v5) {
                      parent.a(orh4, tc, p0, p1);
                      break ;
                   }else if(!p1){
                      try{
                         bk7.e(parent, orh4, tc, p0);
                         break ;
                      }catch(java.lang.AbstractMethodError e12){
                         Log.e("ViewParentCompat", "ViewParent "+parent+" does not implement interface method onNestedScrollAccepted", e12);
                         break ;
                      }
                   }
                }else if(parent instanceof View){
                   orh4 = parent;
                }
                parent = parent.getParent();
             }
          }
          return true;
       }
       return false;
    }
    public final void h(int p0){
       ViewParent viewParent;
       if ((viewParent = this.f(p0)) != null) {
          rh4 tc = this.c;
          if (viewParent instanceof sh4) {
             viewParent.b(tc, p0);
          }else if(!p0){
             try{
                bk7.g(viewParent, tc);
             }catch(java.lang.AbstractMethodError e1){
                Log.e("ViewParentCompat", "ViewParent "+viewParent+" does not implement interface method onStopNestedScroll", e1);
             }
          }
          if (p0) {
             if (p0 == 1) {
                this.b = null;
             }
          }else {
             this.a = null;
          }
       }
       return;
    }
}
