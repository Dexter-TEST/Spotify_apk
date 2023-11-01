package p.oh6;
import java.util.Map$Entry;
import p.ch3;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class oh6 implements Map$Entry, ch3	// class@002121 from classes.dex
{
    public final String a;
    public Object b;
    public char c;
    public int t;

    public void oh6(Object p0,String p1){
       co5.o(p1, "key");
       co5.o(p0, "value");
       super();
       this.a = p1;
       this.b = p0;
    }
    public final Object getKey(){
       return this.a;
    }
    public final Object getValue(){
       return this.b;
    }
    public final Object setValue(Object p0){
       co5.o(p0, "newValue");
       this.b = p0;
       return p0;
    }
}
