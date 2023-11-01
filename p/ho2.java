package p.ho2;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import p.ks5;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import p.cy5;
import java.lang.Class;
import p.se5;
import java.lang.reflect.Method;
import java.lang.String;
import p.co5;
import java.util.List;
import java.util.Iterator;
import java.math.BigInteger;
import java.lang.NullPointerException;
import p.io2;
import p.zo4;
import p.js2;
import p.e15;
import p.lv5;
import p.r90;
import p.su0;

public final class ho2 implements InvocationHandler	// class@00188e from classes.dex
{
    public final int a;
    public final Object b;
    public final Serializable c;
    public final Serializable d;
    public final Object e;

    public void ho2(Object p0,ks5 p1,ReentrantLock p2,Condition p3){
       this.a = 0;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void ho2(cy5 p0,Class p1){
       this.a = 1;
       this.e = p0;
       this.d = p1;
       super();
       this.b = se5.c;
       Object[] objArray = new Object[0];
       this.c = objArray;
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       Method method;
       int i = 1;
       int i1 = 0;
       ho2 te = this.e;
       ho2 tc = this.c;
       ho2 tb = this.b;
       ho2 td = this.d;
       switch (this.a){
           case 0:
             co5.o(p1, "method");
             co5.o(p2, "objects");
             if (co5.c(p1.getName(), "onChecksumsReady") && p2.length == i) {
                p0 = p2[i1];
                if (p0 instanceof List) {
                   p0 = p0.iterator();
                   while (p0.hasNext()) {
                      if ((p1 = p0.next()) != null) {
                         Class[] uClassArray = new Class[i1];
                         method = p1.getClass().getMethod("getSplitName", uClassArray);
                         co5.l(method, "c.javaClass.getMethod\(\"getSplitName\"\)");
                         Class[] uClassArray1 = new Class[i1];
                         Method method1 = p1.getClass().getMethod("getType", uClassArray1);
                         co5.l(method1, "c.javaClass.getMethod\(\"getType\"\)");
                         Object[] objArray = new Object[i1];
                         if (method.invoke(p1, objArray) == null && (method = new Object[i1])) {
                            Class[] uClassArray2 = new Class[i1];
                            p0 = p1.getClass().getMethod("getValue", uClassArray2);
                            co5.l(p0, "c.javaClass.getMethod\(\"getValue\"\)");
                            method = new Object[i1];
                            if ((p0 = p0.invoke(p1, method)) != null) {
                               tc.a = new BigInteger(i, p0).toString(16);
                               td.lock();
                               te.signalAll();
                               td.unlock();
                               break ;
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                            }
                         }
                      }
                   }
                }
             }
             break;
           default:
             if (p1.getDeclaringClass() == Object.class) {
                p0 = p1.invoke(this, p2);
             }else if(p2 != null){
                ho2 oho2 = tc;
             }
             if (tb.a == null || !zo4.z(p1)) {
                i = 0;
             }
             if (i) {
                p0 = tb.b(td, p0, p1, p2);
             }else {
                p0 = te.c(p1);
                p0 = p0.a(new e15(p0.a, p2, p0.b, p0.c), p2);
             }
             return p0;
       }
       return null;
    }
}
