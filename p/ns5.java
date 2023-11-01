package p.ns5;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.ps5;
import p.uf0;

public abstract class ns5	// class@00203e from classes.dex
{
    public static final ps5 a;

    static {
       ps5 ops5;
       int i = 0;
       try{
          ops5 = Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
       }catch(java.lang.ClassCastException e0){
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.InstantiationException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
       if (e0 == null) {
          ops5 = new ps5();
       }
       ns5.a = e0;
    }
    public static uf0 a(Class p0){
       ns5.a.getClass();
       return new uf0(p0);
    }
}
