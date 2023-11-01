package p.wg3;
import java.io.Closeable;
import java.io.Flushable;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.io.Writer;
import java.util.Arrays;
import java.lang.NullPointerException;
import java.lang.IllegalStateException;
import java.lang.CharSequence;
import java.io.IOException;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class wg3 implements Closeable, Flushable	// class@002b2f from classes.dex
{
    public final Writer a;
    public int[] b;
    public int c;
    public final String t;
    public boolean v;
    public String w;
    public final boolean x;
    public static final String[] y;

    static {
       String[] stringArray = new String[128];
       wg3.y = stringArray;
       int i = 0;
       for (int i1 = 0; i1 <= 31; i1 = i1 + 1) {
          Object[] objArray = new Object[1];
          objArray[i] = Integer.valueOf(i1);
          wg3.y[i1] = String.format("\\u%04x", objArray);
       }
       stringArray = wg3.y;
       stringArray[34] = "\\\"";
       stringArray[92] = "\\\\";
       stringArray[9] = "\\t";
       stringArray[8] = "\\b";
       stringArray[10] = "\\n";
       stringArray[13] = "\\r";
       stringArray[12] = "\\f";
       stringArray = stringArray.clone();
       stringArray[60] = "\\u003c";
       stringArray[62] = "\\u003e";
       stringArray[38] = "\\u0026";
       stringArray[61] = "\\u003d";
       stringArray[39] = "\\u0027";
    }
    public void wg3(Writer p0){
       super();
       int[] ointArray = new int[32];
       this.b = ointArray;
       int i = 0;
       this.c = i;
       if (!ointArray.length) {
          this.b = Arrays.copyOf(ointArray, (i * 2));
       }
       wg3 tc = this.c;
       this.c = tc + 1;
       this.b[tc] = 6;
       this.t = ":";
       this.x = true;
       if (p0 != null) {
          this.a = p0;
          return;
       }else {
          throw new NullPointerException("out == null");
       }
    }
    public void J(){
       this.y(1, 2, ']');
    }
    public void T(){
       this.y(3, 5, '}');
    }
    public final void b(){
       int i = this.i0();
       int i1 = 2;
       if (i != 1) {
          wg3 ta = this.a;
          if (i != i1) {
             if (i != 4) {
                if (i != 6) {
                   if (i == 7) {
                      if (this.v == null) {
                         throw new IllegalStateException("JSON must have only one top-level value.");
                      }
                   }else {
                      throw new IllegalStateException("Nesting problem.");
                   }
                }
                this.b[(this.c - 1)] = 7;
             }else {
                ta.append(this.t);
                this.b[(this.c - 1)] = 5;
             }
          }else {
             ta.append(',');
          }
       }else {
          this.b[(this.c - 1)] = i1;
       }
       return;
    }
    public void close(){
       this.a.close();
       wg3 tc = this.c;
       int i = 1;
       if (tc > i || (tc == i || this.b[(tc - i)] == 7)) {
          throw new IOException("Incomplete document");
       }
       this.c = 0;
       return;
    }
    public void f(){
       this.p0();
       this.b();
       wg3 tc = this.c;
       wg3 tb = this.b;
       if (tc == tb.length) {
          this.b = Arrays.copyOf(tb, (tc * 2));
       }
       tb = this.c;
       this.c = tb + 1;
       this.b[tb] = 1;
       this.a.write(91);
       return;
    }
    public void flush(){
       if (this.c == null) {
          throw new IllegalStateException("JsonWriter is closed.");
       }
       this.a.flush();
       return;
    }
    public void g0(String p0){
       if (p0 == null) {
          throw new NullPointerException("name == null");
       }
       if (this.w != null) {
          throw new IllegalStateException();
       }
       if (this.c == null) {
          throw new IllegalStateException("JsonWriter is closed.");
       }
       this.w = p0;
       return;
    }
    public wg3 h0(){
       if (this.w != null) {
          if (this.x != null) {
             this.p0();
          }else {
             this.w = null;
             return this;
          }
       }
       this.b();
       this.a.write("null");
       return this;
    }
    public final int i0(){
       wg3 tc;
       if ((tc = this.c) != null) {
          return this.b[(tc - 1)];
       }
       throw new IllegalStateException("JsonWriter is closed.");
    }
    public final void j0(String p0){
       char c;
       object oobject;
       String[] y = wg3.y;
       wg3 ta = this.a;
       ta.write(34);
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          if ((c = p0.charAt(i1)) < 128) {
             if ((oobject = y[c]) == null) {
             label_0037 :
                i1 = i1 + 1;
             }
          }else if(c == 8232){
             oobject = "\\u2028";
          }else if(c == 8233){
             oobject = "\\u2029";
          }
          if (i2 < i1) {
             int i3 = i1 - i2;
             ta.write(p0, i2, i3);
          }
          ta.write(oobject);
          i2 = i1 + 1;
          goto label_0037 ;
       }
       if (i2 < i) {
          ta.write(p0, i2, (i - i2));
       }
       ta.write(34);
       return;
    }
    public void k0(long p0){
       this.p0();
       this.b();
       this.a.write(Long.toString(p0));
    }
    public void l0(Boolean p0){
       if (p0 == null) {
          this.h0();
          return;
       }else {
          this.p0();
          this.b();
          String str = (p0.booleanValue())? "true": "false";
          this.a.write(str);
          return;
       }
    }
    public void m0(Number p0){
       if (p0 == null) {
          this.h0();
          return;
       }else {
          this.p0();
          String str = p0.toString();
          if (this.v == null && (str.equals("-Infinity") && (!str.equals("Infinity") && !str.equals("NaN")))) {
             throw new IllegalArgumentException("Numeric values must be finite, but was "+p0);
          }
          this.b();
          this.a.append(str);
          return;
       }
    }
    public void n0(String p0){
       if (p0 == null) {
          this.h0();
          return;
       }else {
          this.p0();
          this.b();
          this.j0(p0);
          return;
       }
    }
    public void o0(boolean p0){
       this.p0();
       this.b();
       String str = (p0)? "true": "false";
       this.a.write(str);
       return;
    }
    public final void p0(){
       int i;
       if (this.w != null) {
          if ((i = this.i0()) == 5) {
             this.a.write(44);
          }else if(i == 3){
             throw new IllegalStateException("Nesting problem.");
          }
          this.b[(this.c - 1)] = 4;
          this.j0(this.w);
          this.w = null;
       }
       return;
    }
    public void x(){
       this.p0();
       this.b();
       wg3 tc = this.c;
       wg3 tb = this.b;
       if (tc == tb.length) {
          this.b = Arrays.copyOf(tb, (tc * 2));
       }
       tb = this.c;
       this.c = tb + 1;
       this.b[tb] = 3;
       this.a.write(123);
       return;
    }
    public final void y(int p0,int p1,char p2){
       int i;
       if ((i = this.i0()) != p1 && i != p0) {
          throw new IllegalStateException("Nesting problem.");
       }
       if (this.w != null) {
          throw new IllegalStateException("Dangling name: "+this.w);
       }
       this.c = this.c - 1;
       this.a.write(p2);
       return;
    }
}
