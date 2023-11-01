package p.wc3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;

public final class wc3	// class@0003a2 from classes2.dex
{
    public final Method a;
    public final List b;

    public void wc3(Method p0,ArrayList p1){
       super();
       this.a = p0;
       this.b = Collections.unmodifiableList(p1);
    }
    public final String toString(){
       wc3 ta;
       Object[] objArray = new Object[]{ta.getDeclaringClass().getName(),ta.getName(),this.b};
       ta = this.a;
       return String.format("%s.%s\(\) %s", objArray);
    }
}
