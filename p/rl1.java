package p.rl1;
import p.wn5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.mv6;
import java.lang.UnsupportedOperationException;

public final class rl1 extends Enum implements wn5	// class@00250b from classes.dex
{
    public static final rl1 a;
    public static final rl1[] b;

    static {
       rl1 orl1 = new rl1();
       rl1.a = orl1;
       rl1[] orl1Array = new rl1[]{orl1};
       rl1.b = orl1Array;
    }
    public void rl1(){
       super("INSTANCE", 0);
    }
    public static rl1 valueOf(String p0){
       return Enum.valueOf(rl1.class, p0);
    }
    public static rl1[] values(){
       return rl1.b.clone();
    }
    public final void a(long p0){
       mv6.f(p0);
    }
    public final int b(int p0){
       return (p0 & 0x02);
    }
    public final void cancel(){
    }
    public final void clear(){
    }
    public final boolean isEmpty(){
       return true;
    }
    public final boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public final Object poll(){
       return null;
    }
    public final String toString(){
       return "EmptySubscription";
    }
}
