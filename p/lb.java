package p.lb;
import p.b5;
import java.lang.Object;
import java.lang.String;

public final class lb implements b5	// class@001d23 from classes.dex
{
    public final int a;
    public static final lb b;
    public static final lb c;
    public static final lb t;

    static {
       lb.b = new lb(0);
       lb.c = new lb(1);
       lb.t = new lb(2);
    }
    public void lb(int p0){
       this.a = p0;
       super();
    }
    public final void run(){
    }
    public final String toString(){
       switch (this.a){
           case 3:
           default:
             return super.toString();
       }
       return "EmptyAction";
    }
}
