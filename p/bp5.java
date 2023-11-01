package p.bp5;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.Serializable;
import java.io.File;
import java.lang.String;
import java.util.Set;

public final class bp5 implements FilenameFilter	// class@00110e from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void bp5(Object p0,int p1,Serializable p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final boolean accept(File p0,String p1){
       bp5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             boolean b = false;
             if (p1.length() >= 35) {
                b = tb.contains(p1.substring(b, 35));
             }
             return b;
       }
       return p1.startsWith(tb);
    }
}
