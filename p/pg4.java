package p.pg4;
import p.vg4;
import android.os.Bundle;
import java.lang.String;
import java.lang.Object;
import android.os.BaseBundle;
import java.lang.Integer;
import java.lang.Long;
import java.lang.NullPointerException;
import java.lang.Float;
import java.lang.Boolean;
import p.co5;
import java.lang.UnsupportedOperationException;
import p.av6;
import p.vv7;
import java.lang.IllegalArgumentException;
import java.lang.Number;

public final class pg4 extends vg4	// class@002258 from classes.dex
{
    public final int m;

    public void pg4(int p0){
       this.m = p0;
       super(true);
    }
    public void pg4(int p0,int p1){
       this.m = p0;
       super(false);
    }
    public final Object a(Bundle p0,String p1){
       switch (this.m){
           case 0:
             return p0.get(p1);
           case 1:
             return p0.get(p1);
           case 2:
             return p0.get(p1);
           case 3:
             if ((p0 = p0.get(p1)) != null) {
                return Float.valueOf(p0.floatValue());
             }
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
             break;
           case 4:
             return p0.get(p1);
           case 5:
             return this.e(p0, p1);
           case 6:
             return p0.get(p1);
           case 7:
             if ((p0 = p0.get(p1)) != null) {
                return Long.valueOf(p0.longValue());
             }
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
             break;
           case 8:
             return this.e(p0, p1);
           case 9:
             return p0.get(p1);
           default:
             return p0.get(p1);
       }
    }
    public final String b(){
       switch (this.m){
           case 0:
             return "boolean[]";
           case 1:
             return "boolean";
           case 2:
             return "float[]";
           case 3:
             return "float";
           case 4:
             return "integer[]";
           case 5:
             return "integer";
           case 6:
             return "long[]";
           case 7:
             return "long";
           case 8:
             return "reference";
           case 9:
             return "string[]";
           default:
             return "string";
       }
    }
    public final Object c(String p0){
       String str1;
       long l;
       boolean b = false;
       String str = "Arrays don\'t support default values.";
       switch (this.m){
           case 0:
             co5.o(p0, "value");
             throw new UnsupportedOperationException(str);
           case 1:
             co5.o(p0, "value");
             if (co5.c(p0, "true")) {
                b = true;
             }else if(co5.c(p0, "false")){
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
             }
             return Boolean.valueOf(b);
             break;
           case 2:
             co5.o(p0, "value");
             throw new UnsupportedOperationException(str);
           case 3:
             co5.o(p0, "value");
             return Float.valueOf(Float.parseFloat(p0));
           case 4:
             co5.o(p0, "value");
             throw new UnsupportedOperationException(str);
           case 5:
             return this.f(p0);
           case 6:
             co5.o(p0, "value");
             throw new UnsupportedOperationException(str);
           case 7:
             co5.o(p0, "value");
             if (av6.g0(p0, "L", b)) {
                str1 = p0.substring(b, (p0.length() - 1));
                co5.l(str1, "this as java.lang.String…ing\(startIndex, endIndex\)");
             }else {
                str1 = p0;
             }
             if (av6.D0(p0, "0x", b)) {
                p0 = str1.substring(2);
                co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
                vv7.f(16);
                l = Long.parseLong(p0, 16);
             }else {
                l = Long.parseLong(str1);
             }
             return Long.valueOf(l);
             break;
           case 8:
             return this.f(p0);
           case 9:
             co5.o(p0, "value");
             throw new UnsupportedOperationException(str);
           default:
             co5.o(p0, "value");
             return p0;
       }
    }
    public final void d(Bundle p0,String p1,Object p2){
       switch (this.m){
           case 0:
             co5.o(p1, "key");
             p0.putBooleanArray(p1, p2);
             return;
           case 1:
             co5.o(p1, "key");
             p0.putBoolean(p1, p2.booleanValue());
             return;
           case 2:
             co5.o(p1, "key");
             p0.putFloatArray(p1, p2);
             return;
           case 3:
             co5.o(p1, "key");
             p0.putFloat(p1, p2.floatValue());
             return;
           case 4:
             co5.o(p1, "key");
             p0.putIntArray(p1, p2);
             return;
           case 5:
             this.g(p0, p1, p2.intValue());
             return;
           case 6:
             co5.o(p1, "key");
             p0.putLongArray(p1, p2);
             return;
           case 7:
             co5.o(p1, "key");
             p0.putLong(p1, p2.longValue());
             return;
           case 8:
             this.g(p0, p1, p2.intValue());
             return;
           case 9:
             co5.o(p1, "key");
             p0.putStringArray(p1, p2);
             return;
           default:
             co5.o(p1, "key");
             p0.putString(p1, p2);
             return;
       }
    }
    public final Integer e(Bundle p0,String p1){
       switch (this.m){
           case 5:
             break;
           default:
             if ((p0 = p0.get(p1)) != null) {
                return Integer.valueOf(p0.intValue());
             }
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
       if ((p0 = p0.get(p1)) != null) {
          return Integer.valueOf(p0.intValue());
       }
       throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
    public final Integer f(String p0){
       int i;
       switch (this.m){
           case 5:
             co5.o(p0, "value");
             if (av6.D0(p0, "0x", false)) {
                p0 = p0.substring(2);
                co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
                vv7.f(16);
                i = Integer.parseInt(p0, 16);
             }else {
                i = Integer.parseInt(p0);
             }
             break;
           default:
             co5.o(p0, "value");
             if (av6.D0(p0, "0x", false)) {
                p0 = p0.substring(2);
                co5.l(p0, "this as java.lang.String\).substring\(startIndex\)");
                vv7.f(16);
                i = Integer.parseInt(p0, 16);
             }else {
                i = Integer.parseInt(p0);
             }
             return Integer.valueOf(i);
       }
       return Integer.valueOf(i);
    }
    public final void g(Bundle p0,String p1,int p2){
       switch (this.m){
           case 5:
           default:
             co5.o(p1, "key");
             p0.putInt(p1, p2);
             return;
       }
       co5.o(p1, "key");
       p0.putInt(p1, p2);
       return;
    }
}
