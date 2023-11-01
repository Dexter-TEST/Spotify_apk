package p.x46;
import p.mr5;
import androidx.viewpager2.widget.ViewPager2;
import p.hr5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.w46;
import p.tj7;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.zd;
import java.lang.Integer;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Array;
import java.lang.IllegalStateException;
import java.lang.String;
import p.lk5;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Locale;

public final class x46 extends mr5	// class@002c09 from classes.dex
{
    public tj7 a;
    public final ViewPager2 b;
    public final RecyclerView c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final w46 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public void x46(ViewPager2 p0){
       super();
       this.b = p0;
       p0 = p0.A;
       this.c = p0;
       this.d = p0.getLayoutManager();
       this.g = new w46();
       this.d();
    }
    public final void a(RecyclerView p0,int p1){
       int i2;
       w46 a;
       x46 ta;
       x46 te = this.e;
       int i = 1;
       if (te == i && (this.f == i || p1 != i)) {
          int i1 = 4;
          w46 a2 = (te != i && te != i1)? 0: 1;
          if (i2 && p1 == 2) {
             if (this.k != null) {
                this.c(2);
                this.j = i;
             }
             return;
          }else if(te != i && te != i1){
             a = 0;
          }else {
             te = 1;
          }
          x46 tg = this.g;
          if (te && !p1) {
             this.e();
             if (this.k == null) {
                if ((a = tg.a) != -1 && (ta = this.a) != null) {
                   ta.b(a, 0, false);
                }
             }else if(tg.c == null){
                a2 = tg.a;
                if (this.h != a2 && (te = this.a) != null) {
                   te.c(a2);
                }
             }else {
                i = 0;
             }
             if (i) {
                this.c(false);
                this.d();
             }
          }
          if (this.e == 2 && (!p1 && this.l != null)) {
             this.e();
             if (tg.c == null) {
                w46 a1 = tg.a;
                if (this.i != a1) {
                   if (a1 == -1) {
                      a1 = 0;
                   }
                   if ((te = this.a) != null) {
                      te.c(a1);
                   }
                }
                this.c(false);
                this.d();
             }
          }
          return;
       }else {
          this.m = false;
          this.e = i;
          if ((te = this.i) != -1) {
             this.h = te;
             this.i = -1;
          }else if(this.h == -1){
             this.h = this.d.a1();
          }
          this.c(i);
          return;
       }
    }
    public final void b(RecyclerView p0,int p1,int p2){
       x46 ta;
       w46 a;
       x46 ta1;
       this.k = true;
       this.e();
       x46 tg = this.g;
       if (this.j != null) {
          this.j = false;
          if (p2 <= 0) {
             if (!p2) {
                p1 = (p1 < 0)? 1: 0;
                p2 = (this.b.x.P() == 1)? 1: 0;
                if (p1 != p2) {
                label_0029 :
                   a = 0;
                label_002c :
                   p1 = (p1 && tg.c != null)? tg.a + true: tg.a;
                   this.i = p1;
                   if (this.h != p1 && (ta = this.a) != null) {
                      ta.c(p1);
                   }
                }
             }else {
                goto label_0029 ;
             }
          }
          p1 = 1;
          goto label_002c ;
       }else if(this.e == null){
          if ((a = tg.a) == -1) {
             a = 0;
          }
          if ((ta = this.a) != null) {
             ta.c(a);
          }
       }
       if ((a = tg.a) == -1) {
          a = 0;
       }
       w46 b = tg.b;
       w46 c = tg.c;
       if ((ta1 = this.a) != null) {
          ta1.b(a, b, c);
       }
       ta = this.i;
       if (tg.a == ta || (ta == -1 && (tg.c == null && this.f != true))) {
          this.c(false);
          this.d();
       }
       return;
    }
    public final void c(int p0){
       x46 ta;
       if (this.e == 3 && this.f == null) {
          return;
       }
       if (this.f == p0) {
          return;
       }
       this.f = p0;
       if ((ta = this.a) != null) {
          ta.a(p0);
       }
       return;
    }
    public final void d(){
       this.e = 0;
       this.f = 0;
       x46 tg = this.g;
       tg.a = -1;
       tg.b = 0;
       tg.c = 0;
       this.h = -1;
       this.i = -1;
       this.j = false;
       this.k = false;
       this.m = false;
       this.l = false;
    }
    public final void e(){
       View view;
       int i6;
       View view1;
       int left;
       ViewGroup$MarginLayoutParams leftMargin;
       ViewGroup$MarginLayoutParams rightMargin;
       x46 td = this.d;
       int i = td.a1();
       x46 tg = this.g;
       tg.a = i;
       float f = 0;
       int i1 = -1;
       if (i == i1) {
          tg.a = i1;
          tg.b = f;
          tg.c = 0;
          return;
       }else if((view = td.C(i)) == null){
          tg.a = i1;
          tg.b = f;
          tg.c = 0;
          return;
       }else {
          i1 = hr5.Q(view);
          int i2 = hr5.T(view);
          int i3 = hr5.V(view);
          int i4 = hr5.G(view);
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             i1 = i1 + layoutParams.leftMargin;
             i2 = i2 + layoutParams.rightMargin;
             i3 = i3 + layoutParams.topMargin;
             i4 = i4 + layoutParams.bottomMargin;
          }
          int i5 = (view.getHeight() + i3) + i4;
          i4 = (view.getWidth() + i1) + i2;
          i2 = (td.H == null)? 1: 0;
          x46 tc = this.c;
          if (i2) {
             i = (view.getLeft() - i1) - tc.getPaddingLeft();
             i1 = (this.b.x.P() == 1)? 1: 0;
             if (i1) {
                i = - i;
             }
             i5 = i4;
          }else {
             i = (view.getTop() - i3) - tc.getPaddingTop();
          }
          i = - i;
          tg.c = i;
          if (i < 0) {
             zd ozd = new zd(td);
             if (i6 = td.I()) {
                i1 = (td.H == null)? 1: 0;
                int[] ointArray = new int[]{i6,2};
                int[][] ointArray1 = Array.newInstance(Integer.TYPE, ointArray);
                i3 = 0;
                while (true) {
                   if (i3 < i6) {
                      if ((view1 = td.H(i3)) != null) {
                         layoutParams = view1.getLayoutParams();
                         if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                         }else {
                            rightMargin = zd.a;
                         }
                         object oobject = ointArray1[i3];
                         if (i1) {
                            left = view1.getLeft();
                            leftMargin = layoutParams.leftMargin;
                         }else {
                            left = view1.getTop();
                            leftMargin = layoutParams.topMargin;
                         }
                         left = left - leftMargin;
                         oobject[0] = left;
                         oobject = ointArray1[i3];
                         if (i1) {
                            i4 = view1.getRight();
                            rightMargin = layoutParams.rightMargin;
                         }else {
                            i4 = view1.getBottom();
                            rightMargin = layoutParams.bottomMargin;
                         }
                         i4 = i4 + rightMargin;
                         oobject[1] = i4;
                         i3 = i3 + 1;
                      }else {
                         throw new IllegalStateException("null view contained in the view hierarchy");
                      }
                   }else {
                      Arrays.sort(ointArray1, new lk5(1, ozd));
                      i = 1;
                      while (true) {
                         if (i < i6) {
                            if ((i1 = i - 1) != ointArray1[i][0]) {
                               ozd = 0;
                            label_0127 :
                               if (!ozd || td.I() <= 1) {
                                  i = td.I();
                                  i6 = 0;
                                  while (true) {
                                     if (i6 < i) {
                                        if (zd.a(td.H(i6))) {
                                           td = 1;
                                        label_0146 :
                                           if (td) {
                                              td = 1;
                                           label_014b :
                                              if (td) {
                                                 break ;
                                              }else {
                                                 Object[] objArray = new Object[]{Integer.valueOf(tg.c)};
                                                 throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", objArray));
                                              }
                                           }
                                        }else {
                                           i6 = i6 + 1;
                                        }
                                     }else {
                                        td = 0;
                                        goto label_0146 ;
                                     }
                                  }
                                  throw new IllegalStateException("Page\(s\) contain a ViewGroup with a LayoutTransition \(or animateLayoutChanges=\"true\"\), which interferes with the scrolling animation. Make sure to call getLayoutTransition\(\).setAnimateParentHierarchy\(false\) on all ViewGroups with a LayoutTransition before an animation is started.");
                               }
                               td = 0;
                               goto label_014b ;
                            }else {
                               i = i + 1;
                            }
                         }else {
                            object oobject1 = ointArray1[0];
                            i = oobject1[0];
                            i1 = oobject1[1] - i;
                            if (i > 0 || ointArray1[(i6 - 1)][1] < i1) {
                            }
                         }
                      }
                   }
                }
             }
             ozd = 1;
             goto label_0127 ;
          }else if(!i5){
             f = (float)i / (float)i5;
          }
          tg.b = f;
          return;
       }
    }
}
