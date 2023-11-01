package p.a27;
import p.yd;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.ze6;
import java.util.concurrent.atomic.AtomicInteger;
import p.vr1;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import p.ph3;
import java.lang.Math;
import android.content.res.TypedArray;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.kg4;
import java.lang.StringBuilder;
import p.tp2;
import p.ye6;
import java.lang.Class;
import p.he3;
import java.lang.CharSequence;
import p.z17;
import java.util.Arrays;

public abstract class a27 implements yd	// class@000f00 from classes.dex
{
    public final int a;
    public final Object b;

    public void a27(int p0){
       this.a = 8;
       super();
       this.b = new LinkedHashMap((int)(((float)3 / 0x3f400000) + 0x3f800000));
    }
    public void a27(int p0,int p1){
       this.a = p0;
       if (p0 != 6) {
          if (p0 != 9) {
             super();
             this.b = new ze6();
             return;
          }else {
             super();
             this.b = new AtomicInteger();
             return;
          }
       }else {
          super();
          this.b = new vr1(0, this);
          return;
       }
    }
    public void a27(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a27(ViewPager2 p0){
       this.a = 2;
       super(2, p0);
    }
    public final List b(){
       return this.b;
    }
    public final boolean c(){
       a27 tb = this.b;
       boolean b = true;
       if (!tb.isEmpty() && (tb.size() != b && tb.get(0).c())) {
          b = false;
       }
       return b;
    }
    public final ze6 d(){
       ze6 e;
       ze6 d;
       a27 tb = this.b;
       a27 uoa27 = tb;
       int i = 0;
       ze6 b = uoa27.b;
       if (uoa27.f != 1) {
          e = uoa27.e;
          b[i] = e;
          d = uoa27.d;
          b[1] = d;
          b[2] = d;
          b[3] = e;
       }else {
          e = uoa27.d;
          b[i] = e;
          b[1] = e;
          d = uoa27.e;
          b[2] = d;
          b[3] = d;
       }
       uoa27 = tb;
       ze6 a = uoa27.a;
       if (uoa27.f != 1) {
          a[i] = Math.max((((0x3f800000 - uoa27.k) - uoa27.l) / 2.00f), 0);
          a[1] = Math.max((((0x3f800000 - uoa27.k) - 0x3a83126f) / 2.00f), 0);
          a[2] = Math.min((((uoa27.k + 0x3f800000) + 0x3a83126f) / 2.00f), 0x3f800000);
          a[3] = Math.min((((uoa27.k + 0x3f800000) + uoa27.l) / 2.00f), 0x3f800000);
       }else {
          a[i] = 0;
          a[1] = Math.min(uoa27.k, 0x3f800000);
          a[2] = Math.min((uoa27.k + uoa27.l), 0x3f800000);
          a[3] = 0x3f800000;
       }
       return tb;
    }
    public a27 e(TypedArray p0){
       a27 uoa27;
       a27 uoa273;
       long l;
       float floatx;
       int i = 3;
       a27 tb = this.b;
       if (p0.hasValue(i)) {
          uoa27 = tb;
          uoa27.n = p0.getBoolean(i, uoa27.n);
       }
       int i1 = 0;
       if (p0.hasValue(i1)) {
          a27 uoa271 = tb;
          uoa271.o = p0.getBoolean(i1, uoa271.o);
       }
       int i2 = 1;
       float f = 0x3f800000;
       int i3 = 0xffffff;
       float f1 = 0x437f0000;
       if (p0.hasValue(i2)) {
          a27 uoa272 = tb;
          uoa272.e = ((int)(Math.min(f, Math.max(0, p0.getFloat(i2, 0.30f))) * f1) << 24) | (uoa272.e & i3);
       }
       int i4 = 11;
       if (p0.hasValue(i4)) {
          uoa273 = tb;
          uoa273.d = ((int)(Math.min(f, Math.max(0, p0.getFloat(i4, f))) * f1) << 24) | (i3 & uoa273.d);
       }
       i4 = 7;
       i3 = 0;
       if (p0.hasValue(i4)) {
          uoa273 = tb;
          l = (long)p0.getInt(i4, (int)uoa273.s);
          if ((l - i3) >= 0) {
             uoa273.s = l;
          }else {
             throw new IllegalArgumentException(kg4.k("Given a negative duration: ", l));
          }
       }
       i4 = 14;
       if (p0.hasValue(i4)) {
          uoa273 = tb;
          uoa273.q = p0.getInt(i4, uoa273.q);
       }
       i4 = 15;
       if (p0.hasValue(i4)) {
          uoa273 = tb;
          l = (long)p0.getInt(i4, (int)uoa273.t);
          if ((l - i3) >= 0) {
             uoa273.t = l;
          }else {
             throw new IllegalArgumentException(kg4.k("Given a negative repeat delay: ", l));
          }
       }
       i4 = 16;
       if (p0.hasValue(i4)) {
          uoa273 = tb;
          uoa273.r = p0.getInt(i4, uoa273.r);
       }
       i4 = 5;
       if (p0.hasValue(i4)) {
          if ((i4 = p0.getInt(i4, tb.c)) != i2) {
             if (i4 != 2) {
                tb.c = (i4 != i)? i1: i;
             }else {
                tb.c = 2;
             }
          }else {
             tb.c = i2;
          }
       }
       i = 17;
       if (p0.hasValue(i)) {
          tb.f = (p0.getInt(i, tb.f) != i2)? i1: i2;
       }
       i = 6;
       if (p0.hasValue(i)) {
          uoa27 = tb;
          floatx = p0.getFloat(i, uoa27.l);
          if ((floatx) >= 0) {
             uoa27.l = floatx;
          }else {
             throw new IllegalArgumentException("Given invalid dropoff value: "+floatx);
          }
       }
       i2 = 9;
       if (p0.hasValue(i2)) {
          uoa27 = tb;
          if ((i = p0.getDimensionPixelSize(i2, uoa27.g)) >= 0) {
             uoa27.g = i;
          }else {
             throw new IllegalArgumentException(tp2.k("Given invalid width: ", i));
          }
       }
       i = 8;
       if (p0.hasValue(i)) {
          uoa27 = tb;
          if ((i = p0.getDimensionPixelSize(i, uoa27.h)) >= 0) {
             uoa27.h = i;
          }else {
             throw new IllegalArgumentException(tp2.k("Given invalid height: ", i));
          }
       }
       i = 13;
       if (p0.hasValue(i)) {
          uoa27 = tb;
          floatx = p0.getFloat(i, uoa27.k);
          if ((floatx) >= 0) {
             uoa27.k = floatx;
          }else {
             throw new IllegalArgumentException("Given invalid intensity value: "+floatx);
          }
       }
       i2 = 19;
       if (p0.hasValue(i2)) {
          uoa27 = tb;
          floatx = p0.getFloat(i2, uoa27.i);
          if ((floatx) >= 0) {
             uoa27.i = floatx;
          }else {
             throw new IllegalArgumentException("Given invalid width ratio: "+floatx);
          }
       }
       i2 = 10;
       if (p0.hasValue(i2)) {
          uoa27 = tb;
          floatx = p0.getFloat(i2, uoa27.j);
          if ((floatx) >= 0) {
             uoa27.j = floatx;
          }else {
             throw new IllegalArgumentException("Given invalid height ratio: "+floatx);
          }
       }
       if (p0.hasValue(18)) {
          tb.m = p0.getFloat(18, tb.m);
       }
       return this;
    }
    public abstract boolean f();
    public abstract String g(String p0);
    public final Class h(){
       return this.b.a;
    }
    public final boolean i(CharSequence p0,int p1){
       a27 tb;
       if (p0 == null || (p1 < 0 || ((p0.length() - p1)) < 0)) {
          throw new IllegalArgumentException();
       }
       if ((tb = this.b) == null) {
          return this.f();
       }
       int i = tb.c(p0, p1);
       boolean b = true;
       if (i) {
          b = (i != b)? this.f(): false;
       }
       return b;
    }
    public final String toString(){
       StringBuilder str;
       switch (this.a){
           case 3:
             str = "";
             a27 tb = this.b;
             if (!tb.isEmpty()) {
                str = str+"values="+Arrays.toString(tb.toArray());
             }
             break;
           default:
             return super.toString();
       }
       return str;
    }
}
