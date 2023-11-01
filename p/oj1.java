package p.oj1;
import android.text.Editable$Factory;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.String;
import java.lang.CharSequence;
import android.text.Editable;
import p.io6;

public final class oj1 extends Editable$Factory	// class@00212e from classes.dex
{
    public static final Object a;
    public static oj1 b;
    public static Class c;

    static {
       oj1.a = new Object();
    }
    public void oj1(){
       super();
       oj1.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, oj1.class.getClassLoader());
    }
    public final Editable newEditable(CharSequence p0){
       Class c;
       if ((c = oj1.c) != null) {
          return new io6(c, p0);
       }
       return super.newEditable(p0);
    }
}
