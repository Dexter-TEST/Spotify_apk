package p.pr5;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import p.zr5;
import p.bs5;
import p.as5;
import java.util.WeakHashMap;
import p.n3;
import android.view.View;
import p.wh7;
import java.lang.Class;
import p.yq5;
import p.mi7;
import p.tp2;
import p.or5;
import p.nr5;
import android.util.SparseArray;
import p.w51;
import p.vr5;
import p.o7;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;
import p.en6;
import java.util.Set;
import p.zh2;
import java.util.Arrays;
import p.dr5;
import android.view.ViewParent;
import p.dh7;
import java.lang.IllegalArgumentException;
import p.q71;
import p.xe0;
import p.xq5;
import android.view.ViewGroup;
import p.we0;
import java.lang.IllegalStateException;
import java.lang.RuntimeException;
import p.x67;
import p.w67;
import java.lang.ref.WeakReference;
import p.zn;
import android.view.accessibility.AccessibilityManager;
import android.view.View$AccessibilityDelegate;
import p.l3;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import p.hr5;

public final class pr5	// class@0022b9 from classes.dex
{
    public Object a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;

    public void pr5(RecyclerView p0){
       this.i = p0;
       super();
       ArrayList uArrayList = new ArrayList();
       this.d = uArrayList;
       this.e = null;
       this.f = new ArrayList();
       this.a = Collections.unmodifiableList(uArrayList);
       this.b = 2;
       this.c = 2;
    }
    public final void a(zr5 p0,boolean p1){
       RecyclerView d;
       RecyclerView.k(p0);
       RecyclerView f0 = this.i.F0;
       yq5 oyq5 = null;
       zr5 a = p0.a;
       if (f0 != null) {
          bs5 e = f0.e;
          n3 on3 = (e instanceof as5)? e.e.remove(a): oyq5;
          wh7.o(a, on3);
       }
       if (p1) {
          this.i.getClass();
          if (this.i.F.size() <= 0) {
             if ((d = this.i.D) != null) {
                d.t(p0);
             }
             pr5 ti = this.i;
             if (ti.y0 != null) {
                ti.x.p(p0);
             }
          }else {
             tp2.v(this.i.F.get(0));
             throw oyq5;
          }
       }
       p0.s = oyq5;
       p0.r = oyq5;
       or5 oor5 = this.c();
       oor5.getClass();
       zr5 f = p0.f;
       nr5 a1 = oor5.a(f).a;
       if (oor5.a.get(f).b <= a1.size()) {
          w51.b(a);
       }else {
          p0.o();
          a1.add(p0);
       }
       return;
    }
    public final int b(int p0){
       if (p0 < 0 || p0 >= this.i.y0.b()) {
          throw new IndexOutOfBoundsException(en6.m(this.i, kg4.r("invalid position ", p0, ". State item count is ")+this.i.y0.b()));
       }
       pr5 ti = this.i;
       if (ti.y0.g == null) {
          return p0;
       }
       return ti.v.f(p0, 0);
    }
    public final or5 c(){
       if (this.g == null) {
          this.g = new or5();
          this.e();
       }
       return this.g;
    }
    public final View d(int p0){
       return this.l(p0, Long.MAX_VALUE).a;
    }
    public final void e(){
       if (this.g != null) {
          pr5 ti = this.i;
          if (ti.D != null && ti.isAttachedToWindow()) {
             this.g.c.add(this.i.D);
          }
       }
       return;
    }
    public final void f(yq5 p0,boolean p1){
       pr5 tg = this.g;
       if (tg != null) {
          or5 c = tg.c;
          c.remove(p0);
          if (!c.size() && !p1) {
             int i = 0;
             while (true) {
                c = tg.a;
                if (i < c.size()) {
                   nr5 a = c.get(c.keyAt(i)).a;
                   for (int i1 = 0; i1 < a.size(); i1 = i1 + 1) {
                      w51.b(a.get(i1).a);
                   }
                   i++;
                }
             }
          }
       }
       return;
    }
    public final void g(){
       zh2 d;
       pr5 tf = this.f;
       for (int i = tf.size() - 1; i >= 0; i = i - 1) {
          this.h(i);
       }
       tf.clear();
       if (RecyclerView.W0) {
          RecyclerView x0 = this.i.x0;
          if ((d = x0.d) != null) {
             Arrays.fill(d, -1);
          }
          x0.c = 0;
       }
       return;
    }
    public final void h(int p0){
       pr5 tf = this.f;
       this.a(tf.get(p0), true);
       tf.remove(p0);
    }
    public final void i(View p0){
       zr5 ozr5 = RecyclerView.M(p0);
       if (ozr5.m()) {
          this.i.removeDetachedView(p0, false);
       }
       if (ozr5.l()) {
          ozr5.n.m(ozr5);
       }else if(ozr5.r()){
          ozr5.j = ozr5.j & 0xdf;
       }
       this.j(ozr5);
       if (this.i.g0 != null && !ozr5.j()) {
          this.i.g0.d(ozr5);
       }
       return;
    }
    public final void j(zr5 p0){
       StringBuilder str;
       pr5 tf;
       int i2;
       zr5 c1;
       boolean b = false;
       int i = 1;
       zr5 a = p0.a;
       if (!p0.l() && a.getParent() == null) {
          if (p0.m()) {
             throw new IllegalArgumentException(en6.m(this.i, "Tmp detached view should be removed from RecyclerView before it can be recycled: "+p0));
          }
          if (p0.q()) {
             throw new IllegalArgumentException(en6.m(this.i, "Trying to recycle an ignored view holder. You should first call stopIgnoringView\(view\) before calling recycle."));
          }
          int i1 = (!((p0.j & 0x10)) && dh7.i(a))? 1: 0;
          RecyclerView d = ((d = this.i.D) != null && (i1 && d.q(p0)))? 1: 0;
          if (!d && !p0.j()) {
             str = 0;
          }else if(this.c > null){
             d = ((p0.j & 0x020e))? 1: 0;
             if (!d) {
                tf = this.f;
                if ((i2 = tf.size()) >= this.c && i2 > 0) {
                   this.h(b);
                   i2 = i2 - 1;
                }
                if (RecyclerView.W0 && i2 > 0) {
                   RecyclerView x0 = this.i.x0;
                   zr5 c = p0.c;
                   if (x0.d != null) {
                      int i3 = x0.c * 2;
                      int i4 = 0;
                      while (true) {
                         if (i4 < i3) {
                            if (x0.d[i4] == c) {
                               x0 = 1;
                            label_0099 :
                               if (!x0) {
                                  if ((i2 = i2 - 1) >= 0) {
                                     c1 = tf.get(i2).c;
                                     RecyclerView x01 = this.i.x0;
                                     if (x01.d != null) {
                                        i3 = x01.c * 2;
                                        i4 = 0;
                                        while (true) {
                                           if (i4 < i3) {
                                              if (x01.d[i4] == c1) {
                                                 c1 = 1;
                                              label_00c8 :
                                                 if (c1) {
                                                 }
                                              }else {
                                                 i4 = i4 + 2;
                                              }
                                           }
                                        }
                                     }
                                     c1 = 0;
                                     goto label_00c8 ;
                                  }
                                  i2 = i2 + i;
                               }
                            }else {
                               i4 = i4 + 2;
                            }
                         }
                      }
                   }
                   c1 = 0;
                   goto label_0099 ;
                }
                tf.add(i2, p0);
                tf = 1;
             label_00d1 :
                if (!tf) {
                   this.a(p0, i);
                   b = true;
                }
                i = tf;
             }
          }
          tf = 0;
          goto label_00d1 ;
          this.i.x.p(p0);
          if (!i && (!b && i1)) {
             w51.b(a);
             p0.s = null;
             p0.r = null;
          }
          return;
       }else {
          str = "Scrapped or attached views may not be recycled. isScrap:"+p0.l()+" isAttached:";
          if (a.getParent() != null) {
             b = true;
          }
          throw new IllegalArgumentException(en6.m(this.i, str+b));
       }
    }
    public final void k(View p0){
       RecyclerView g0;
       zr5 ozr5 = RecyclerView.M(p0);
       zr5 j = ozr5.j;
       int i = ((j & 0x0c))? 1: 0;
       if (!i) {
          j = ((j & 0x02))? 1: 0;
          if (j) {
             if ((g0 = this.i.g0) != null) {
                if (ozr5.f().isEmpty()) {
                   g0 = (g0.g != null && !ozr5.i())? 0: 1;
                   if (!g0) {
                      g0 = 0;
                   label_0042 :
                      if (!g0) {
                         g0 = 0;
                      label_0048 :
                         if (!g0) {
                            if (this.e == null) {
                               this.e = new ArrayList();
                            }
                            ozr5.n = this;
                            ozr5.o = true;
                            this.e.add(ozr5);
                         label_009b :
                            return;
                         }
                      }
                   }
                }
                g0 = 1;
                goto label_0042 ;
             }
             g0 = 1;
             goto label_0048 ;
          }
       }
       if (ozr5.i() && (!ozr5.k() && this.i.D.b == null)) {
          throw new IllegalArgumentException(en6.m(this.i, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."));
       }else {
          ozr5.n = this;
          ozr5.o = false;
          this.d.add(ozr5);
          goto label_009b ;
       }
    }
    public final zr5 l(int p0,long p1){
       boolean i;
       pr5 e;
       int i2;
       zr5 ozr51;
       int i4;
       zr5 ozr52;
       vr5 g;
       int i6;
       zr5 ozr53;
       nr5 onr5;
       zr5 ozr54;
       long nanoTime;
       nr5 c;
       RecyclerView d2;
       RecyclerView recyclerView;
       long l;
       nr5 c1;
       zr5 j;
       zn ozn;
       RecyclerView f0;
       View$AccessibilityDelegate uAccessibili;
       zr5 c2;
       RecyclerView d4;
       View view;
       pr5 opr5 = this;
       if ((i = p0) < 0 || i >= opr5.i.y0.b()) {
          throw new IndexOutOfBoundsException(en6.m(opr5.i, "Invalid item position "+i+"\("+i+"\). Item count:"+opr5.i.y0.b()));
       }
       zr5 ozr5 = null;
       int b = false;
       int i1 = 32;
       if (opr5.i.y0.g != null) {
          if ((e = opr5.e) != null && (i2 = e.size())) {
             int i3 = 0;
             while (true) {
                if (i3 < i2) {
                   ozr51 = opr5.e.get(i3);
                   if (!ozr51.r() && ozr51.e() == i) {
                      ozr51.b(i1);
                   }else {
                      i3 = i3 + 1;
                   }
                }else {
                   pr5 i9 = opr5.i;
                   if (i9.D.b != null && ((i3 = i9.v.f(i, b)) > 0 && i3 < opr5.i.D.d())) {
                      long l2 = opr5.i.D.e(i3);
                      int i14 = 0;
                      while (true) {
                         if (i14 < i2) {
                            zr5 ozr56 = opr5.e.get(i14);
                            if (!ozr56.r() && !(ozr56.e - l2)) {
                               ozr56.b(i1);
                               ozr51 = ozr56;
                            }else {
                               i14 = i14 + 1;
                            }
                         }
                      }
                      if (ozr51 != null) {
                         i2 = 1;
                      label_009d :
                         i3 = -1;
                         pr5 f = opr5.f;
                         pr5 d = opr5.d;
                         if (ozr51 == null) {
                            pr5 opr51 = d;
                            i4 = opr51.size();
                            int i5 = 0;
                            while (true) {
                               if (i5 < i4) {
                                  ozr52 = opr51.get(i5);
                                  if (!ozr52.r() && (ozr52.e() == i && (!ozr52.i() && (opr5.i.y0.g != null && ozr52.k())))) {
                                     ozr52.b(i1);
                                  label_00d9 :
                                     ozr51 = ozr52;
                                  label_01c9 :
                                     if (ozr51 != null) {
                                        if (ozr51.k()) {
                                           g = opr5.i.y0.g;
                                        }else if((c2 = ozr51.c) >= null && c2 < opr5.i.D.d()){
                                           pr5 i12 = opr5.i;
                                           if (i12.y0.g != null || i12.D.f(ozr51.c) == ozr51.f) {
                                              d4 = opr5.i.D;
                                              if (d4.b == null || !(ozr51.e - d4.e(ozr51.c))) {
                                                 g = 1;
                                              }
                                           }
                                           g = null;
                                        }else {
                                           throw new IndexOutOfBoundsException(en6.m(opr5.i, "Inconsistency detected. Invalid view holder adapter position"+ozr51));
                                        }
                                        if (g == null) {
                                           ozr51.b(4);
                                           if (ozr51.l()) {
                                              opr5.i.removeDetachedView(ozr51.a, b);
                                              ozr51.n.m(ozr51);
                                           }else if(ozr51.r()){
                                              ozr51.j = ozr51.j & 0xdf;
                                           }
                                           opr5.j(ozr51);
                                           ozr51 = ozr5;
                                        }else {
                                           i2 = 1;
                                        }
                                     }
                                  }else {
                                     i5 = i5 + 1;
                                  }
                               }else {
                                  d2 = opr5.i.w;
                                  xe0 d5 = d2.d;
                                  i5 = d5.size();
                                  int i13 = 0;
                                  while (true) {
                                     if (i13 < i5) {
                                        view = d5.get(i13);
                                        d2.b.getClass();
                                        zr5 ozr55 = RecyclerView.M(view);
                                        if (ozr55.e() == i && (!ozr55.i() && !ozr55.k())) {
                                        label_0118 :
                                           if (view != null) {
                                              ozr51 = RecyclerView.M(view);
                                              d4 = opr5.i.w;
                                              if ((i5 = d4.b.a.indexOfChild(view)) >= 0) {
                                                 xe0 c3 = d4.c;
                                                 if (c3.d(i5)) {
                                                    c3.a(i5);
                                                    d4.m(view);
                                                    if ((i4 = opr5.i.w.j(view)) != i3) {
                                                       opr5.i.w.c(i4);
                                                       opr5.k(view);
                                                       ozr51.b(8224);
                                                       goto label_01c9 ;
                                                    }else {
                                                       throw new IllegalStateException(en6.m(opr5.i, "layout index should not be -1 after unhiding a view:"+ozr51));
                                                    }
                                                 }else {
                                                    throw new RuntimeException("trying to unhide a view that was not hidden"+view);
                                                 }
                                              }else {
                                                 throw new IllegalArgumentException("view is not a child, cannot hide "+view);
                                              }
                                           }else {
                                              opr51 = f;
                                              i4 = opr51.size();
                                              i5 = 0;
                                              while (true) {
                                                 if (i5 < i4) {
                                                    ozr52 = opr51.get(i5);
                                                    if (!ozr52.i() && (ozr52.e() == i && !ozr52.g())) {
                                                       opr51.remove(i5);
                                                       goto label_00d9 ;
                                                    }else {
                                                       i5 = i5 + 1;
                                                    }
                                                 }else {
                                                    ozr51 = ozr5;
                                                    goto label_01c9 ;
                                                 }
                                              }
                                           }
                                        }else {
                                           i13 = i13 + 1;
                                        }
                                     }else {
                                        view = ozr5;
                                        goto label_0118 ;
                                     }
                                  }
                               }
                            }
                         }
                         if (ozr51 == null) {
                            if ((i6 = opr5.i.v.f(i, b)) >= 0 && i6 < opr5.i.D.d()) {
                               int i7 = opr5.i.D.f(i6);
                               RecyclerView d1 = opr5.i.D;
                               if (d1.b != null) {
                                  ArrayList uArrayList = d1.e(i6);
                                  int i8 = d.size() + i3;
                                  while (true) {
                                     if (i8 >= 0) {
                                        ozr53 = d.get(i8);
                                        if (!(ozr53.e - uArrayList) && !ozr53.r()) {
                                           if (i7 == ozr53.f) {
                                              ozr53.b(i1);
                                              if (ozr53.k() && opr5.i.y0.g == null) {
                                                 ozr53.j = (ozr53.j & 0xf1) | 0x02;
                                              }
                                              ozr51 = ozr53;
                                           label_0318 :
                                              if (ozr51 != null) {
                                                 ozr51.c = i6;
                                                 i2 = 1;
                                              }
                                           }else {
                                              d.remove(i8);
                                              ozr53 = ozr53.a;
                                              opr5.i.removeDetachedView(ozr53, b);
                                              ozr53 = RecyclerView.M(ozr53);
                                              ozr53.n = ozr5;
                                              ozr53.o = b;
                                              i4 = ozr53.j & 0xdf;
                                              ozr53.j = i4;
                                              opr5.j(ozr53);
                                           }
                                        }
                                        i8 = i8 - 1;
                                     }else {
                                        b = f.size();
                                        while (true) {
                                           if ((b = b - 1) >= 0) {
                                              j = f.get(b);
                                              if (!(j.e - uArrayList) && !j.g()) {
                                                 if (i7 == j.f) {
                                                    f.remove(b);
                                                    ozr51 = j;
                                                    goto label_0318 ;
                                                 }else {
                                                    opr5.h(b);
                                                 }
                                              }else {
                                                 continue ;
                                              }
                                           }
                                           ozr51 = ozr5;
                                           goto label_0318 ;
                                        }
                                     }
                                  }
                               }
                               if (!ozr51) {
                                  tp2.v(opr5.h);
                               }
                               if (!ozr51) {
                                  if ((onr5 = this.c().a.get(i7)) != null) {
                                     onr5 = onr5.a;
                                     if (!onr5.isEmpty()) {
                                        i1 = onr5.size();
                                        while (true) {
                                           if ((i1 = i1 - 1) >= 0) {
                                              if (!onr5.get(i1).g()) {
                                                 ozr54 = onr5.remove(i1);
                                              label_0358 :
                                                 if (ozr54 != null) {
                                                    ozr54.o();
                                                    int[] s0 = RecyclerView.S0;
                                                 }
                                                 ozr51 = ozr54;
                                              }else {
                                                 continue ;
                                              }
                                           }
                                        }
                                     }
                                  }
                                  ozr54 = ozr5;
                                  goto label_0358 ;
                               }
                               if (ozr51 == null) {
                                  nanoTime = opr5.i.getNanoTime();
                                  if (p1 - Long.MAX_VALUE) {
                                     c = opr5.g.a(i7).c;
                                     uAccessibili = ((c) && ((c + nanoTime) - p1) >= 0)? 0: 1;
                                     if (!c) {
                                        return ozr5;
                                     }
                                  }
                                  i9 = opr5.i;
                                  d2 = i9.D;
                                  d2.getClass();
                                  w67.a("RV CreateView");
                                  ozr51 = d2.o(i7, i9);
                                  if (ozr51.a.getParent() == null) {
                                     ozr51.f = i7;
                                     w67.b();
                                     if (RecyclerView.W0 && (recyclerView = RecyclerView.G(ozr51.a)) != null) {
                                        ozr51.b = new WeakReference(recyclerView);
                                     }
                                     l = opr5.i.getNanoTime() - nanoTime;
                                     onr5 = opr5.g.a(i7);
                                     c1 = onr5.c;
                                     if (c1) {
                                        long l1 = 4;
                                        l = (l / l1) + ((c1 / l1) * 3);
                                     }
                                     onr5.c = l;
                                  }else {
                                     throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate\(..., boolean attachToRoot\)");
                                  }
                               }
                            }else {
                               throw new IndexOutOfBoundsException(en6.m(opr5.i, "Inconsistency detected. Invalid item position "+i+"\(offset:"+i6+"\).state:"+opr5.i.y0.b()));
                            }
                         }
                         if (i2) {
                            pr5 i10 = opr5.i;
                            if (i10.y0.g == null) {
                               j = ozr51.j;
                               recyclerView = ((j & 0x2000))? 1: 0;
                               if (recyclerView) {
                                  ozr51.j = (j & 0xdfff) | 0x00;
                                  if (i10.y0.j != null) {
                                     dr5.b(ozr51);
                                     i10 = opr5.i;
                                     ozr51.f();
                                     i10.g0.getClass();
                                     ozn = new zn(0);
                                     ozn.a(ozr51);
                                     opr5.i.Y(ozr51, ozn);
                                  }
                               }
                            }
                         }
                         if (opr5.i.y0.g != null && ozr51.h()) {
                            ozr51.g = i;
                         }else if(ozr51.h()){
                            ozn = ((ozr51.j & 0x02))? 1: 0;
                            if (ozn || ozr51.i()) {
                            label_049b :
                               b = opr5.i.v.f(i, 0);
                               ozr51.s = ozr5;
                               pr5 i11 = opr5.i;
                               ozr51.r = i11;
                               ozr53 = ozr51.f;
                               l = i11.getNanoTime();
                               if (p1 - Long.MAX_VALUE) {
                                  c1 = opr5.g.a(ozr53).d;
                                  bs5 e1 = ((c1) && ((c1 + l) - p1) >= 0)? 0: 1;
                                  if (i11) {
                                  label_04db :
                                     opr5.i.D.b(ozr51, b);
                                     nanoTime = opr5.i.getNanoTime() - l;
                                     c = opr5.g.a(ozr51.f);
                                     nr5 d3 = c.d;
                                     if (d3) {
                                        nanoTime = (nanoTime / 4) + ((d3 / 4) * 3);
                                     }
                                     c.d = nanoTime;
                                     RecyclerView s = ((s = opr5.i.S) != null && s.isEnabled())? 1: 0;
                                     if (s) {
                                        ozr54 = ozr51.a;
                                        if (!dh7.c(ozr54)) {
                                           dh7.s(ozr54, 1);
                                        }
                                        if ((f0 = opr5.i.F0) != null) {
                                           e1 = f0.e;
                                           if (e1 instanceof as5) {
                                              e1.getClass();
                                              if ((uAccessibili = wh7.c(ozr54)) != null) {
                                                 ozr5 = (uAccessibili instanceof l3)? uAccessibili.a: new n3(uAccessibili);
                                              }
                                              if (ozr5 != null && ozr5 != e1) {
                                                 e1.e.put(ozr54, ozr5);
                                              }
                                           }
                                           wh7.o(ozr54, e1);
                                        }
                                     }
                                     if (opr5.i.y0.g != null) {
                                        ozr51.g = i;
                                     }
                                     i = 1;
                                  label_056c :
                                     ViewGroup$LayoutParams layoutParams = ozr51.a.getLayoutParams();
                                     ozr54 = ozr51.a;
                                     if (layoutParams == null) {
                                        layoutParams = opr5.i.generateDefaultLayoutParams();
                                        ozr54.setLayoutParams(layoutParams);
                                     }else if(!opr5.i.checkLayoutParams(layoutParams)){
                                        layoutParams = opr5.i.generateLayoutParams(layoutParams);
                                        ozr54.setLayoutParams(layoutParams);
                                     }else {
                                     }
                                     layoutParams.a = ozr51;
                                     i = (i2 && i)? true: false;
                                     layoutParams.t = i;
                                     return ozr51;
                                  }
                               }else {
                                  goto label_04db ;
                               }
                            }
                         }else {
                            goto label_049b ;
                         }
                         i = 0;
                         goto label_056c ;
                      }
                   }
                }
             }
          }
          ozr51 = ozr5;
       }else {
          ozr51 = ozr5;
       }
       i2 = 0;
       goto label_009d ;
    }
    public final void m(zr5 p0){
       if (p0.o != null) {
          this.e.remove(p0);
       }else {
          this.d.remove(p0);
       }
       p0.n = null;
       p0.o = false;
       p0.j = p0.j & 0xdf;
       return;
    }
    public final void n(){
       pr5 ti = this.i;
       hr5 b = (ti.E != null)? ti.E.B: 0;
       this.c = this.b + b;
       ti = this.f;
       for (int i = ti.size() - 1; i >= 0 && ti.size() > this.c; i = i - 1) {
          this.h(i);
       }
       return;
    }
}
