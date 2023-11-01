package p.ht7;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.Object;

public abstract class ht7	// class@0018be from classes.dex
{
    public static final Set a;

    static {
       ht7.a = Collections.newSetFromMap(new WeakHashMap());
    }
    public void ht7(){
       super();
    }
    public static Set a(){
       Set a = ht7.a;
       _monitor_enter(a);
       _monitor_exit(a);
       return a;
    }
}
