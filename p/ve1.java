package p.ve1;
import p.la6;
import p.ye1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.util.Iterator;
import p.f93;

public final class ve1 implements la6, ye1	// class@0029d5 from classes.dex
{
    public final la6 a;
    public final int b;

    public void ve1(la6 p0,int p1){
       co5.o(p0, "sequence");
       super();
       this.a = p0;
       this.b = p1;
       int i = (p1 >= 0)? 1: 0;
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException("count must be non-negative, but was "+p1+'.'.toString());
       }
    }
    public final la6 a(int p0){
       int i;
       ve1 ove1 = ((i = this.b + p0) < 0)? new ve1(this, p0): new ve1(this.a, i);
       return ove1;
    }
    public final Iterator iterator(){
       return new f93(this);
    }
}
