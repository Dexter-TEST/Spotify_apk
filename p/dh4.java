package p.dh4;
import java.lang.Object;
import p.gg4;
import p.uf4;
import java.lang.IllegalStateException;
import java.lang.String;
import android.os.Bundle;
import p.ng4;
import java.util.List;
import java.lang.Iterable;
import p.di7;
import p.dj0;
import p.ch4;
import p.lk7;
import p.c87;
import p.la6;
import p.zf2;
import p.cs3;
import p.v42;
import p.u42;
import p.qf4;
import p.co5;
import p.fp5;
import java.util.ListIterator;
import java.lang.StringBuilder;

public abstract class dh4	// class@001349 from classes.dex
{
    public uf4 a;
    public boolean b;

    public void dh4(){
       super();
    }
    public abstract gg4 a();
    public final uf4 b(){
       dh4 ta;
       if ((ta = this.a) != null) {
          return ta;
       }
       throw new IllegalStateException("You cannot access the Navigator\'s state until the Navigator is attached".toString());
    }
    public gg4 c(gg4 p0,Bundle p1,ng4 p2){
       return p0;
    }
    public void d(List p0,ng4 p1){
       u42 ou42 = new u42(new v42(new c87(dj0.e0(p0), new ch4(this, p1, null, 0)), 0, cs3.c));
       while (ou42.hasNext()) {
          this.b().e(ou42.next());
       }
       return;
    }
    public void e(uf4 p0){
       this.a = p0;
       this.b = true;
    }
    public void f(Bundle p0){
    }
    public Bundle g(){
       return null;
    }
    public void h(qf4 p0,boolean p1){
       co5.o(p0, "popUpTo");
       List value = this.b().e.getValue();
       if (!value.contains(p0)) {
          throw new IllegalStateException("popBackStack was called with "+p0+" which does not exist in back stack "+value.toString());
       }
       ListIterator listIterator = value.listIterator(value.size());
       qf4 oqf4 = null;
       while (this.i()) {
          oqf4 = listIterator.previous();
          if (co5.c(oqf4, p0)) {
             break ;
          }
       }
       if (oqf4 != null) {
          this.b().c(oqf4, p1);
       }
       return;
    }
    public boolean i(){
       return true;
    }
}
