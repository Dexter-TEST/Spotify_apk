package p.hu0;
import java.lang.Class;
import p.is3;
import p.ls3;
import java.lang.Object;
import java.lang.String;
import p.xo0;
import java.lang.IllegalStateException;

public abstract class hu0	// class@0018c0 from classes.dex
{
    public static final is3 a;

    static {
       hu0.a = ls3.d(hu0.class);
    }
    public void hu0(){
       super();
    }
    public abstract String a();
    public void b(xo0 p0){
       Object[] objArray = new Object[]{this.a()};
       throw new IllegalStateException(String.format("cannot call connect when in the %s state", objArray));
    }
    public void c(){
       Object[] objArray = new Object[]{this.a()};
       throw new IllegalStateException(String.format("cannot call disconnect when in the %s state", objArray));
    }
    public void d(Object p0){
       hu0.a.i(this.a(), p0, "Dropping event that was dispatched when the program was in the {} state: {}");
    }
    public abstract Object e();
    public void f(Object p0){
       Object[] objArray = new Object[]{this.a()};
       throw new IllegalStateException(String.format("cannot call replaceModel when in the %s state", objArray));
    }
    public void g(){
       Object[] objArray = new Object[]{this.a()};
       throw new IllegalStateException(String.format("cannot call start when in the %s state", objArray));
    }
    public void h(){
       Object[] objArray = new Object[]{this.a()};
       throw new IllegalStateException(String.format("cannot call stop when in the %s state", objArray));
    }
    public void i(Object p0){
       hu0.a.i(this.a(), p0, "Dropping model that was dispatched when the program was in the {} state: {}");
    }
}
