package p.jl1;
import p.on5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Throwable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Class;
import java.lang.Object;
import java.lang.UnsupportedOperationException;

public final class jl1 extends Enum implements on5	// class@001af9 from classes.dex
{
    public static final jl1 a;
    public static final jl1 b;
    public static final jl1[] c;

    static {
       jl1 ojl1 = new jl1("INSTANCE", 0);
       jl1.a = ojl1;
       jl1 ojl11 = new jl1("NEVER", 1);
       jl1.b = ojl11;
       jl1[] ojl1Array = new jl1[]{ojl1,ojl11};
       jl1.c = ojl1Array;
    }
    public void jl1(String p0,int p1){
       super(p0, p1);
    }
    public static void a(Throwable p0,Observer p1){
       p1.onSubscribe(jl1.a);
       p1.onError(p0);
    }
    public static jl1 valueOf(String p0){
       return Enum.valueOf(jl1.class, p0);
    }
    public static jl1[] values(){
       return jl1.c.clone();
    }
    public final int b(int p0){
       return (p0 & 0x02);
    }
    public final void clear(){
    }
    public void dispose(){
    }
    public boolean isDisposed(){
       boolean b = (this == jl1.a)? true: false;
       return b;
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
