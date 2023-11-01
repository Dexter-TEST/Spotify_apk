package p.md2;
import p.wh6;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.Class;
import p.cd2;
import p.tp2;
import java.lang.Throwable;
import androidx.fragment.app.Fragment;

public abstract class md2	// class@001e71 from classes.dex
{
    public static final wh6 a;

    static {
       md2.a = new wh6();
    }
    public void md2(){
       super();
    }
    public static Class b(ClassLoader p0,String p1){
       wh6 orDefault;
       Class orDefault1;
       wh6 a = md2.a;
       if ((orDefault = a.getOrDefault(p0, null)) == null) {
          orDefault = new wh6();
          a.put(p0, orDefault);
       }
       if ((orDefault1 = orDefault.getOrDefault(p1, null)) == null) {
          orDefault1 = Class.forName(p1, false, p0);
          orDefault.put(p1, orDefault1);
       }
       return orDefault1;
    }
    public static Class c(ClassLoader p0,String p1){
       int i = 0;
       try{
          return md2.b(p0, p1);
       }catch(java.lang.ClassNotFoundException e4){
          throw new cd2(i, tp2.m(v0, p1, ": make sure class name exists"), e4);
       }catch(java.lang.ClassCastException e4){
          throw new cd2(i, tp2.m(v0, p1, ": make sure class is a valid subclass of Fragment"), e4);
       }
    }
    public abstract Fragment a(ClassLoader p0,String p1);
}
