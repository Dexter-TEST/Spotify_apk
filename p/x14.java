package p.x14;
import p.h1;
import p.y14;
import java.util.regex.Matcher;
import java.lang.Object;
import java.lang.String;
import p.h0;

public final class x14 extends h1	// class@002beb from classes.dex
{
    public final y14 a;

    public void x14(y14 p0){
       this.a = p0;
       super();
    }
    public final int a(){
       return (this.a.a.groupCount() + 1);
    }
    public final boolean contains(Object p0){
       if (!p0 instanceof String) {
          return false;
       }
       return super.contains(p0);
    }
    public final Object get(int p0){
       String str;
       if ((str = this.a.a.group(p0)) == null) {
          str = "";
       }
       return str;
    }
    public final int indexOf(Object p0){
       if (!p0 instanceof String) {
          return -1;
       }
       return super.indexOf(p0);
    }
    public final int lastIndexOf(Object p0){
       if (!p0 instanceof String) {
          return -1;
       }
       return super.lastIndexOf(p0);
    }
}
