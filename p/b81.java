package p.b81;
import p.m36;
import p.x07;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class b81 extends m36	// class@001071 from classes.dex
{
    public static final b81 t;

    static {
       b81.t = new b81();
    }
    public void b81(){
       super(x07.b, x07.c, x07.d);
    }
    public final void close(){
       throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
    public final String toString(){
       return "Dispatchers.Default";
    }
}
