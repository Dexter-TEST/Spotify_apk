package p.q2;
import p.qc7;
import java.lang.Object;
import p.us5;
import java.lang.Comparable;
import java.lang.Integer;
import java.util.NoSuchElementException;

public abstract class q2 extends qc7	// class@00231f from classes.dex
{
    public Object a;

    public void q2(Object p0){
       super();
       this.a = p0;
    }
    public final boolean hasNext(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public final Object next(){
       q2 ta;
       Integer integer;
       if ((ta = this.a) == null) {
          throw new NoSuchElementException();
       }
       us5 ous5 = this;
       switch (ous5.b){
           case 0:
             integer = ous5.a(ta);
             break;
           default:
             integer = ous5.a(ta);
       }
       this.a = integer;
       return ta;
    }
}
