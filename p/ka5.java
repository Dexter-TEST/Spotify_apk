package p.ka5;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import p.co5;
import java.util.Map;
import p.ja5;
import p.d3;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import p.dj0;

public final class ka5 implements Serializable	// class@001bd8 from classes.dex
{
    public final HashMap a;

    public void ka5(){
       super();
       this.a = new HashMap();
    }
    public void ka5(HashMap p0){
       co5.o(p0, "appEventMap");
       super();
       HashMap hashMap = new HashMap();
       this.a = hashMap;
       hashMap.putAll(p0);
    }
    private final Object writeReplace(){
       return new ja5(this.a);
    }
    public final void a(d3 p0,List p1){
       List list;
       co5.o(p1, "appEvents");
       ka5 ta = this.a;
       if (!ta.containsKey(p0)) {
          ta.put(p0, dj0.C0(p1));
          return;
       }else if((list = ta.get(p0)) == null){
          list.addAll(p1);
       }
       return;
    }
}
