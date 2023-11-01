package p.wj6;
import p.yf2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleSource;
import p.nl0;

public final class wj6 extends Enum implements yf2	// class@002b4d from classes.dex
{
    public static final wj6 a;
    public static final wj6[] b;

    static {
       wj6 owj6 = new wj6();
       wj6.a = owj6;
       wj6[] owj6Array = new wj6[]{owj6};
       wj6.b = owj6Array;
    }
    public void wj6(){
       super("INSTANCE", 0);
    }
    public static wj6 valueOf(String p0){
       return Enum.valueOf(wj6.class, p0);
    }
    public static wj6[] values(){
       return wj6.b.clone();
    }
    public final Object apply(Object p0){
       return new nl0(5, p0);
    }
}
