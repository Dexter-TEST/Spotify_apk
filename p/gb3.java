package p.gb3;
import java.lang.Iterable;
import p.ch3;
import java.lang.Object;
import p.io2;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Iterator;
import p.hb3;
import java.lang.StringBuilder;

public class gb3 implements Iterable, ch3	// class@0016d7 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;

    public void gb3(int p0,int p1,int p2){
       super();
       if (!p2) {
          throw new IllegalArgumentException("Step must be non-zero.");
       }
       if (p2 == Integer.MIN_VALUE) {
          throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
       }
       this.a = p0;
       this.b = io2.m(p0, p1, p2);
       this.c = p2;
       return;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof gb3 && (this.isEmpty() && (p0.isEmpty() || (this.a == p0.a && (this.b == p0.b && this.c == p0.c)))))? true: false;
       return b;
    }
    public int hashCode(){
       int i = (this.isEmpty())? -1: (((this.a * 31) + this.b) * 31) + this.c;
       return i;
    }
    public boolean isEmpty(){
       boolean b = true;
       gb3 tb = this.b;
       gb3 ta = this.a;
       if (this.c > null) {
          if (ta <= tb) {
             b = false;
          }
       }else if(ta < tb){
       }
       return b;
    }
    public final Iterator iterator(){
       return new hb3(this.a, this.b, this.c);
    }
    public String toString(){
       gb3 tc;
       String str = " step ";
       gb3 tb = this.b;
       gb3 ta = this.a;
       StringBuilder str1 = ((tc = this.c) > null)? ta+".."+tb+str+tc: ta+" downTo "+tb+str+(- tc);
       return str1;
    }
}
