package com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.Collections;
import p.az5;
import java.lang.String;
import java.lang.Object;
import java.util.Iterator;
import p.kr3;
import p.zr3;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.Thread;
import p.tr3;
import p.xr3;

public final class Logger	// class@000538 from classes.dex
{
    public static List a;
    public static tr3 b;
    public static xr3 c;

    static {
       Logger.a = Collections.emptyList();
       Logger.b = new az5();
       Logger.c = new az5();
    }
    public static void a(String p0,Object[] p1){
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          Logger.f(iterator.next().d(), p0, p1);
       }
       return;
    }
    public static void b(String p0,Object[] p1){
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          Logger.f(iterator.next().a(), p0, p1);
       }
       return;
    }
    public static void c(Throwable p0,String p1,Object[] p2){
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          Logger.g(iterator.next().a(), p0, p1, p2);
       }
       return;
    }
    public static void core(int p0,String p1,int p2,String p3){
       Logger.core(p0, false, p1, p2, p3);
    }
    public static void core(int p0,boolean p1,String p2,int p3,String p4){
       zr3 ozr3;
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          kr3 okr3 = iterator.next();
          if (p1) {
             ozr3 = okr3.d();
          }else if(p0 && p0 != 1){
             if (p0 != 2) {
                if (p0 != 3) {
                   ozr3 = (p0 != 4)? okr3.f(): okr3.b();
                }else {
                   ozr3 = okr3.c();
                }
             }else {
                ozr3 = okr3.a();
             }
          }else {
             ozr3 = okr3.e();
          }
          Object[] objArray = new Object[0];
          ozr3.f(Thread.currentThread().getName().append('@').append(p2).append(':').append(p3).toString(), Logger.d(p4, objArray));
       }
       return;
    }
    public static void core(String p0){
       Logger.core(false, p0);
    }
    public static void core(boolean p0,String p1){
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          kr3 okr3 = iterator.next();
          zr3 ozr3 = (p0)? okr3.d(): okr3.b();
          Object[] objArray = new Object[0];
          ozr3.f("".append(Thread.currentThread().getName()).append("@core").toString(), Logger.d(p1, objArray));
       }
       return;
    }
    public static String d(String p0,Object[] p1){
       if (p1 != null && p1.length) {
          return Logger.b.c(p0, p1);
       }
       return Logger.b.l(p0);
    }
    public static void e(String p0,Object[] p1){
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          Logger.f(iterator.next().b(), p0, p1);
       }
       return;
    }
    public static void f(zr3 p0,String p1,Object[] p2){
       p0.f(Logger.c.b(), Logger.d(p1, p2));
    }
    public static void g(zr3 p0,Throwable p1,String p2,Object[] p3){
       p0.j(Logger.c.b(), Logger.d(p2, p3), p1);
    }
    public static int h(String p0){
       return String.valueOf(p0).length();
    }
    public static void i(String p0,Object[] p1){
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          Logger.f(iterator.next().c(), p0, p1);
       }
       return;
    }
    public static void j(Throwable p0,String p1,Object[] p2){
       Iterator iterator = Logger.a.iterator();
       while (iterator.hasNext()) {
          Logger.g(iterator.next().c(), p0, p1, p2);
       }
       return;
    }
}
