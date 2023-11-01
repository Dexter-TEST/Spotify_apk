package p.o87;
import android.view.View;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;
import p.en6;
import p.kg4;
import java.util.Set;
import java.util.Iterator;

public final class o87	// class@0020d0 from classes.dex
{
    public final HashMap a;
    public final View b;
    public final ArrayList c;

    public void o87(View p0){
       super();
       this.a = new HashMap();
       this.c = new ArrayList();
       this.b = p0;
    }
    public final boolean equals(Object p0){
       if (p0 instanceof o87 && (this.b == p0.b && this.a.equals(p0.a))) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       return (this.a.hashCode() + (this.b.hashCode() * 31));
    }
    public final String toString(){
       String str = kg4.l(en6.s("TransitionValues@"+Integer.toHexString(this.hashCode())+":\n", "    view = ")+this.b+"\n", "    values:");
       o87 ta = this.a;
       Iterator iterator = ta.keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          str = "".append(str).append("    ").append(str1).append(": ").append(ta.get(str1)).append("\n").toString();
       }
       return str;
    }
}
