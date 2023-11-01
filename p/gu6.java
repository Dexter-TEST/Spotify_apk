package p.gu6;
import java.lang.reflect.InvocationHandler;
import java.lang.Class;
import java.lang.Object;
import android.content.Context;
import java.lang.reflect.Method;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
import java.lang.reflect.Field;
import p.iu6;
import p.ku6;

public final class gu6 implements InvocationHandler	// class@001781 from classes.dex
{
    public final int a;
    public final Class b;
    public final Object c;

    public void gu6(Class p0,Object p1,Context p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       Class[] uClassArray;
       Class uClass;
       Class[] uClassArray1;
       Method method;
       Class[] uClassArray2;
       Method method1;
       Class[] uClassArray3;
       Object[] objArray;
       Object[] objArray1;
       Object[] objArray2;
       p0 = Long.valueOf(Long.MIN_VALUE);
       boolean b = true;
       gu6 tc = this.c;
       String str = "getInstallBeginTimestampSeconds";
       String str1 = "getReferrerClickTimestampSeconds";
       gu6 tb = this.b;
       switch (this.a){
           case 0:
             if (p1.getName().equals("onInstallReferrerSetupFinished")) {
                if (p2[0].intValue() == Class.forName("com.sec.android.app.samsungapps.installreferrer.api.InstallReferrerClient$InstallReferrerResponse").getField("OK").getInt(null)) {
                   uClassArray = new Class[0];
                   uClass = Class.forName("com.sec.android.app.samsungapps.installreferrer.api.ReferrerDetails");
                   uClassArray1 = new Class[0];
                   method = uClass.getMethod("getInstallReferrer", uClassArray1);
                   uClassArray2 = new Class[0];
                   method1 = uClass.getMethod(str1, uClassArray2);
                   uClassArray3 = new Class[0];
                   objArray = new Object[0];
                   uClassArray = tb.getMethod("getInstallReferrer", uClassArray).invoke(tc, objArray);
                   objArray = new Object[0];
                   iu6.K = method.invoke(uClassArray, objArray);
                   objArray1 = new Object[0];
                   iu6.I = method1.invoke(uClassArray, objArray1);
                   objArray1 = new Object[0];
                   iu6.J = uClass.getMethod(str, uClassArray3).invoke(uClassArray, objArray1);
                   if (iu6.I == null) {
                      iu6.I = p0;
                   }
                   if (iu6.J == null) {
                      iu6.J = p0;
                   }
                   p0 = new Class[0];
                   objArray2 = new Object[0];
                   tb.getMethod("endConnection", p0).invoke(tc, objArray2);
                   iu6.I.longValue();
                   iu6.J.longValue();
                   iu6.V();
                }else {
                   iu6.H = b;
                   iu6.V();
                }
             }else {
                p1.getName().equals("onInstallReferrerServiceDisconnected");
             }
             break;
           default:
             if (p1.getName().equals("onGetAppsReferrerSetupFinished")) {
                if (p2[0].intValue() == Class.forName("com.miui.referrer.annotation.GetAppsReferrerResponse$Companion").getField("OK").getInt(null)) {
                   uClassArray = new Class[0];
                   uClass = Class.forName("com.miui.referrer.api.GetAppsReferrerDetails");
                   uClassArray1 = new Class[0];
                   method = uClass.getMethod("getInstallReferrer", uClassArray1);
                   uClassArray2 = new Class[0];
                   method1 = uClass.getMethod(str1, uClassArray2);
                   uClassArray3 = new Class[0];
                   objArray = new Object[0];
                   uClassArray = tb.getMethod("getInstallReferrer", uClassArray).invoke(tc, objArray);
                   objArray = new Object[0];
                   ku6.K = method.invoke(uClassArray, objArray);
                   objArray1 = new Object[0];
                   ku6.I = method1.invoke(uClassArray, objArray1);
                   objArray1 = new Object[0];
                   ku6.J = uClass.getMethod(str, uClassArray3).invoke(uClassArray, objArray1);
                   if (ku6.I == null) {
                      ku6.I = p0;
                   }
                   if (ku6.J == null) {
                      ku6.J = p0;
                   }
                   p0 = new Class[0];
                   objArray2 = new Object[0];
                   tb.getMethod("endConnection", p0).invoke(tc, objArray2);
                   ku6.I.longValue();
                   ku6.J.longValue();
                   ku6.V();
                }else {
                   ku6.H = b;
                   ku6.V();
                }
             }else {
                p1.getName().equals("onGetAppsServiceDisconnected");
             }
             return null;
       }
       return null;
    }
}
