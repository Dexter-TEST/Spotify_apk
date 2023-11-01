package p.n0;
import p.wn5;
import p.on5;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class n0 implements wn5, on5	// class@001f44 from classes.dex
{

    public void n0(){
       super();
    }
    public final void a(long p0){
    }
    public final int b(int p0){
       return (p0 & 0x02);
    }
    public void cancel(){
    }
    public final void clear(){
    }
    public void dispose(){
    }
    public boolean isDisposed(){
       return false;
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
}
