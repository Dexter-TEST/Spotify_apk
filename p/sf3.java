package p.sf3;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;

public final class sf3 extends Enum	// class@002619 from classes.dex
{
    public static final HashMap a;
    public static final sf3[] b;

    static {
       int i = 0;
       int i1 = 1;
       sf3[] osf3Array = new sf3[]{new sf3("STRING", i),new sf3("NUMBER", i1),new sf3("INTEGER", 2),new sf3("BOOLEAN", 3),new sf3("OBJECT", 4),new sf3("ARRAY", 5),new sf3("NULL", 6),new sf3("ANY", 7)};
       sf3.b = osf3Array;
       sf3.a = new HashMap();
       sf3[] osf3Array1 = sf3.values();
       int len = osf3Array1.length;
       for (; i < len; i = i + 1) {
          object oobject = osf3Array1[i];
          sf3.a.put(oobject.name().toLowerCase(), oobject);
       }
    }
    public void sf3(String p0,int p1){
       super(p0, p1);
    }
    public static sf3 valueOf(String p0){
       return Enum.valueOf(sf3.class, p0);
    }
    public static sf3[] values(){
       return sf3.b.clone();
    }
}
