package p.dl6;
import com.google.common.collect.d;
import java.lang.Object;
import java.lang.Class;
import com.google.common.collect.c;
import p.ys5;
import p.qc7;
import p.vd3;
import java.lang.String;
import java.lang.StringBuilder;

public final class dl6 extends d	// class@00136e from classes.dex
{
    public final Object t;

    public void dl6(Object p0){
       super();
       p0.getClass();
       this.t = p0;
    }
    public final c a(){
       return c.r(this.t);
    }
    public final int b(int p0,Object[] p1){
       p1[p0] = this.t;
       p0++;
       return p0;
    }
    public final boolean contains(Object p0){
       return this.t.equals(p0);
    }
    public final int hashCode(){
       return this.t.hashCode();
    }
    public final boolean k(){
       return false;
    }
    public final qc7 l(){
       return new vd3(this.t);
    }
    public final int size(){
       return 1;
    }
    public final String toString(){
       return "["+this.t.toString()+']';
    }
}
