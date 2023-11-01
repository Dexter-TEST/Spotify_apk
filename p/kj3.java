package p.kj3;
import java.lang.Enum;
import java.lang.String;
import p.ij3;
import java.lang.Class;
import java.lang.Object;
import p.uj3;
import p.jj3;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class kj3 extends Enum	// class@001c24 from classes.dex
{
    private static final kj3[] $VALUES;
    public static final ij3 Companion;
    public static final kj3 ON_ANY;
    public static final kj3 ON_CREATE;
    public static final kj3 ON_DESTROY;
    public static final kj3 ON_PAUSE;
    public static final kj3 ON_RESUME;
    public static final kj3 ON_START;
    public static final kj3 ON_STOP;

    static {
       kj3 okj3 = new kj3("ON_CREATE", 0);
       kj3.ON_CREATE = okj3;
       kj3 okj31 = new kj3("ON_START", 1);
       kj3.ON_START = okj31;
       kj3 okj32 = new kj3("ON_RESUME", 2);
       kj3.ON_RESUME = okj32;
       kj3 okj33 = new kj3("ON_PAUSE", 3);
       kj3.ON_PAUSE = okj33;
       kj3 okj34 = new kj3("ON_STOP", 4);
       kj3.ON_STOP = okj34;
       kj3 okj35 = new kj3("ON_DESTROY", 5);
       kj3.ON_DESTROY = okj35;
       kj3 okj36 = new kj3("ON_ANY", 6);
       kj3.ON_ANY = okj36;
       kj3[] okj3Array = new kj3[]{okj3,okj31,okj32,okj33,okj34,okj35,okj36};
       kj3.$VALUES = okj3Array;
       kj3.Companion = new ij3();
    }
    public void kj3(String p0,int p1){
       super(p0, p1);
    }
    public static kj3 valueOf(String p0){
       return Enum.valueOf(kj3.class, p0);
    }
    public static kj3[] values(){
       return kj3.$VALUES.clone();
    }
    public final uj3 a(){
       switch (jj3.a[this.ordinal()]){
           case 1:
           case 2:
             return uj3.c;
           case 3:
           case 4:
             return uj3.t;
           case 5:
             return uj3.v;
           case 6:
             return uj3.a;
           default:
             throw new IllegalArgumentException(this+" has no target state");
       }
    }
}
