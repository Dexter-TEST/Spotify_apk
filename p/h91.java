package p.h91;
import java.util.Iterator;
import p.ch3;
import p.i91;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.tp2;
import p.ib3;
import p.av6;
import java.lang.Integer;
import p.ng2;
import p.t65;
import java.lang.Number;
import p.eb3;
import p.co5;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public final class h91 implements Iterator, ch3	// class@001805 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public ib3 t;
    public int v;
    public final i91 w;

    public void h91(i91 p0){
       int i;
       this.w = p0;
       super();
       this.a = -1;
       i91 b = p0.b;
       if ((i = p0.a.length()) < 0) {
          throw new IllegalArgumentException(tp2.l("Cannot coerce value to an empty range: maximum ", i, " is less than minimum 0."));
       }
       if (b < null) {
          b = 0;
       }else if(b > i){
          b = i;
       }
       this.b = b;
       this.c = b;
       return;
    }
    public final void a(){
       i91 c;
       t65 ot65;
       h91 tc = this.c;
       int i = 0;
       if (tc < null) {
          this.a = i;
          this.t = null;
       }else {
          h91 tw = this.w;
          if ((c = tw.c) > null) {
             int i1 = this.v + 1;
             this.v = i1;
             if (i1 < c) {
             label_001a :
                if (tc > tw.a.length()) {
                label_0022 :
                   this.t = new ib3(this.b, av6.j0(tw.a));
                   this.c = -1;
                }else if((ot65 = tw.d.b(tw.a, Integer.valueOf(this.c))) == null){
                   this.t = new ib3(this.b, av6.j0(tw.a));
                   this.c = -1;
                }else {
                   int i2 = ot65.a.intValue();
                   int i3 = ot65.b.intValue();
                   this.t = eb3.J(this.b, i2);
                   i2 = i2 + i3;
                   this.b = i2;
                   if (!i3) {
                      i = 1;
                   }
                   this.c = i2 + i;
                }
             }else {
                goto label_0022 ;
             }
          }else {
             goto label_001a ;
          }
          this.a = 1;
       }
       return;
    }
    public final boolean hasNext(){
       if (this.a == -1) {
          this.a();
       }
       boolean b = true;
       if (this.a != b) {
          b = false;
       }
       return b;
    }
    public final Object next(){
       if (this.a == -1) {
          this.a();
       }
       if (this.a != null) {
          h91 tt = this.t;
          co5.j(tt, "null cannot be cast to non-null type kotlin.ranges.IntRange");
          this.t = null;
          this.a = -1;
          return tt;
       }else {
          throw new NoSuchElementException();
       }
    }
    public final void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
