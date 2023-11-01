package p.p91;
import p.l91;
import p.cp7;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import p.kb1;
import java.lang.String;
import java.lang.StringBuilder;
import p.wq0;
import p.et0;
import java.lang.Integer;

public class p91 implements l91	// class@002216 from classes.dex
{
    public cp7 a;
    public boolean b;
    public boolean c;
    public final cp7 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public kb1 i;
    public boolean j;
    public final ArrayList k;
    public final ArrayList l;

    public void p91(cp7 p0){
       super();
       this.a = null;
       this.b = false;
       this.c = false;
       this.e = 1;
       this.h = 1;
       this.i = null;
       this.j = false;
       this.k = new ArrayList();
       this.l = new ArrayList();
       this.d = p0;
    }
    public final void a(l91 p0){
       p91 ta;
       p91 tl = this.l;
       Iterator iterator = tl.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().j == null) {
                return;
             }
             continue ;
          }else {
             boolean b = true;
             this.c = b;
             if ((ta = this.a) != null) {
                ta.a(this);
             }
             if (this.b != null) {
                this.d.a(this);
                return;
             }else {
                Iterator iterator1 = tl.iterator();
                ta = null;
                int i = 0;
                while (iterator1.hasNext()) {
                   p91 op91 = iterator1.next();
                   if (op91 instanceof kb1) {
                      continue ;
                   }
                   i = i + 1;
                   ta = op91;
                }
                if (ta != null && (i == b && ta.j != null)) {
                   if ((tl = this.i) != null) {
                      if (tl.j != null) {
                         this.f = this.h * tl.g;
                      }else {
                         return;
                      }
                   }
                   this.d((ta.g + this.f));
                }
                if ((tl = this.a) != null) {
                   tl.a(this);
                }
             }
          }
       }
       return;
    }
    public final void b(l91 p0){
       this.k.add(p0);
       if (this.j != null) {
          p0.a(p0);
       }
       return;
    }
    public final void c(){
       this.l.clear();
       this.k.clear();
       this.j = false;
       this.g = 0;
       this.c = false;
       this.b = false;
    }
    public void d(int p0){
       if (this.j != null) {
          return;
       }
       this.j = true;
       this.g = p0;
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(iterator.next());
       }
       return;
    }
    public final String toString(){
       StringBuilder str = this.d.b.i0+":"+et0.v(this.e)+"\(";
       Integer integer = (this.j != null)? Integer.valueOf(this.g): "unresolved";
       return str+integer+"\) <t="+this.l.size()+":d="+this.k.size()+">";
    }
}
