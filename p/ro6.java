package p.ro6;
import java.util.Iterator;
import p.k07;
import java.lang.CharSequence;
import java.lang.Object;
import p.mi;
import p.en6;
import p.qo6;
import p.uv1;
import p.am2;
import java.lang.String;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public abstract class ro6 implements Iterator	// class@00252b from classes.dex
{
    public int a;
    public String b;
    public final CharSequence c;
    public final mi t;
    public final boolean v;
    public int w;
    public int x;

    public void ro6(k07 p0,CharSequence p1){
       super();
       this.a = 2;
       this.w = 0;
       this.t = p0.d;
       this.v = p0.b;
       this.x = p0.c;
       this.c = p1;
    }
    public final boolean a(){
       int i2;
       ro6 tw1;
       int i4;
       String str;
       ro6 ta = this.a;
       int i = 4;
       boolean b = false;
       int i1 = (ta != i)? 1: 0;
       if (i1) {
          if (i2 = en6.A(ta)) {
             if (i2 != 2) {
                this.a = i;
                ta = this.w;
                while (true) {
                   ro6 tw = this.w;
                   i1 = -1;
                   if (tw != i1) {
                      int i3 = this;
                      qo6 y = i3.y;
                      ro6 c = i3.c;
                      qo6 z = i3.z;
                      switch (y){
                          case 0:
                            i = z.b.y(tw, c);
                            break;
                          default:
                            if ((i = tw + z.b) >= c.length()) {
                               i = -1;
                            }
                      }
                      ro6 tc = this.c;
                      if (i == i1) {
                         i = tc.length();
                         this.w = i1;
                      }else {
                         switch (y){
                             case 0:
                               i4 = i + 1;
                               break;
                             default:
                               i4 = i;
                         }
                         this.w = i4;
                      }
                      if ((tw1 = this.w) == ta) {
                         i4 = tw1 + 1;
                         this.w = i4;
                         if (i4 > tc.length()) {
                            this.w = i1;
                         }
                      }else {
                         while (true) {
                            tw1 = this.t;
                            if (ta < i && tw1.E(tc.charAt(ta))) {
                               i2 = ta + 1;
                            }else {
                               break ;
                            }
                         }
                         while (i > ta) {
                            int i5 = i - 1;
                            if (tw1.E(tc.charAt(i5))) {
                               i = i5;
                            }else if(this.v != null && ta == i){
                               ta = this.w;
                            }else if((c = this.x) == 1){
                               i = tc.length();
                               this.w = i1;
                               while (i > ta) {
                                  i1 = i - 1;
                                  if (tw1.E(tc.charAt(i1))) {
                                     i = i1;
                                  }
                               }
                            }else {
                               this.x = c - 1;
                            }
                            str = tc.subSequence(ta, i).toString();
                         label_00bc :
                            this.b = str;
                            if (this.a != 3) {
                               this.a = 1;
                               b = true;
                            }
                         }
                      }
                   }else {
                      this.a = 3;
                      str = null;
                      goto label_00bc ;
                   }
                }
             }
             return b;
          }else {
             return 1;
          }
       }else {
          throw new IllegalStateException();
       }
    }
    public final Object b(){
       if (!this.a()) {
          throw new NoSuchElementException();
       }
       this.a = 2;
       ro6 tb = this.b;
       this.b = null;
       return tb;
    }
    public final void c(){
       throw new UnsupportedOperationException();
    }
    public final boolean hasNext(){
       return this.a();
    }
    public final Object next(){
       return this.b();
    }
    public final void remove(){
       this.c();
       throw null;
    }
}
