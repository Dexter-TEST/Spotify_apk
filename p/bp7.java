package p.bp7;
import java.lang.Object;
import java.util.ArrayList;
import p.vk3;
import p.wq0;
import p.xq0;
import p.ye7;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.StackTraceElement;
import java.lang.Throwable;
import java.util.Arrays;
import java.lang.CharSequence;
import java.io.PrintStream;
import p.az5;
import p.cq0;
import java.util.Iterator;
import p.en6;
import p.kg4;

public final class bp7	// class@001110 from classes.dex
{
    public final ArrayList a;
    public final int b;
    public int c;
    public ArrayList d;
    public int e;
    public static int f;

    public void bp7(int p0){
       super();
       this.a = new ArrayList();
       this.b = -1;
       this.d = null;
       this.e = -1;
       int f = bp7.f;
       bp7.f = f + 1;
       this.b = f;
       this.c = p0;
    }
    public final void a(ArrayList p0){
       int i = this.a.size();
       if (this.e != -1 && i > 0) {
          int i1 = 0;
          while (i1 < p0.size()) {
             bp7 uobp7 = p0.get(i1);
             if (this.e == uobp7.b) {
                this.c(this.c, uobp7);
             }
             i1 = i1 + 1;
          }
       }
       if (!i) {
          p0.remove(this);
       }
       return;
    }
    public final int b(vk3 p0,int p1){
       int i2;
       bp7 ta = this.a;
       int i = 0;
       if (!ta.size()) {
          return i;
       }
       wq0 u = ta.get(i).U;
       p0.t();
       u.c(p0, i);
       for (int i1 = 0; i1 < ta.size(); i1 = i1 + 1) {
          ta.get(i1).c(p0, i);
       }
       if (!p1 && u.z0 > null) {
          ye7.c(u, p0, ta, i);
       }
       i1 = 1;
       if (p1 == i1 && u.A0 > null) {
          ye7.c(u, p0, ta, i1);
       }
       try{
          p0.p();
       }catch(java.lang.Exception e3){
          System.err.println(e3.toString()+"\n"+Arrays.toString(e3.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
       }
       this.d = new ArrayList();
       for (; i < ta.size(); i = i + 1) {
          this.d.add(new az5(ta.get(i), p0));
       }
       if (!p1) {
          p1 = vk3.n(u.I);
          i2 = vk3.n(u.K);
          p0.t();
       }else {
          p1 = vk3.n(u.J);
          i2 = vk3.n(u.L);
          p0.t();
       }
       return (i2 - p1);
    }
    public final void c(int p0,bp7 p1){
       bp7 b;
       Iterator iterator = this.a.iterator();
       while (true) {
          b = p1.b;
          if (iterator.hasNext()) {
             wq0 owq0 = iterator.next();
             bp7 a = p1.a;
             if (!a.contains(owq0)) {
                a.add(owq0);
             }
             if (!p0) {
                owq0.o0 = b;
             }else {
                owq0.p0 = b;
             }
          }else {
             break ;
          }
       }
       this.e = b;
       return;
    }
    public final String toString(){
       bp7 tc;
       String str1;
       String str = "";
       if ((tc = this.c) == null) {
          str1 = "Horizontal";
       }else if(tc == 1){
          str1 = "Vertical";
       }else if(tc == 2){
          str1 = "Both";
       }else {
          str1 = "Unknown";
       }
       str = en6.o(str+str1+" [", this.b, "] <");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          str = en6.s(str, " ").append(iterator.next().i0).toString();
       }
       return kg4.l(str, " >");
    }
}
