package p.p42;
import p.o42;
import java.io.FileWriter;
import java.lang.String;
import p.ws6;
import p.m42;
import java.lang.Object;
import p.co5;
import java.io.Writer;
import java.lang.CharSequence;
import java.lang.Appendable;
import p.kf7;
import java.lang.Class;
import java.lang.System;
import p.ic;
import p.et0;
import p.vs6;
import p.ts6;
import java.util.Date;
import p.ss6;

public final class p42 extends o42	// class@0021ea from classes.dex
{
    public final FileWriter a;
    public final String b;
    public final ws6 c;
    public final boolean t;
    public final m42 v;

    public void p42(FileWriter p0,String p1,ws6 p2,boolean p3,m42 p4){
       co5.o(p2, "eventSender");
       co5.o(p4, "fileUtils");
       super(p1);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final Writer append(char p0){
       this.b(p0);
       return this;
    }
    public final Writer append(CharSequence p0){
       this.f(p0);
       return this;
    }
    public final Writer append(CharSequence p0,int p1,int p2){
       this.x(p0, p1, p2);
       return this;
    }
    public final Appendable append(char p0){
       this.b(p0);
       return this;
    }
    public final Appendable append(CharSequence p0){
       this.f(p0);
       return this;
    }
    public final Appendable append(CharSequence p0,int p1,int p2){
       this.x(p0, p1, p2);
       return this;
    }
    public final void b(char p0){
       int i;
       p42 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.append(p0);
          void ovoid = i;
       }catch(java.lang.Exception e14){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          p42 tb = this.b;
          ts6 ots6 = tv.a(tb);
          int i1 = 1;
          int i2 = (!e14)? 1: 0;
          Date uDate = new Date();
          if (e14) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tb), i1);
          }
          vs6 l2 = new vs6(2, ots6, i2, uDate, l1, i);
          this.c.a(l);
       }
       if (!e14) {
          return;
       }else {
          throw e14;
       }
    }
    public final void close(){
       this.a.close();
    }
    public final void f(CharSequence p0){
       int i;
       p42 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.append(p0);
          void ovoid = i;
       }catch(java.lang.Exception e4){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          p42 tb = this.b;
          ts6 ots6 = tv.a(tb);
          int i1 = (!e4 && p0 != null)? p0.length(): 0;
          Date uDate = new Date();
          if (e4) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tb), 1);
          }
          vs6 l2 = new vs6(2, ots6, i1, uDate, l1, i);
          this.c.a(l);
       }
       if (!e4) {
          return;
       }else {
          throw e4;
       }
    }
    public final void flush(){
       this.a.flush();
    }
    public final void write(int p0){
       int i;
       p42 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0);
          void ovoid = i;
       }catch(java.lang.Exception e14){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          p42 tb = this.b;
          ts6 ots6 = tv.a(tb);
          int i1 = 1;
          int i2 = (!e14)? 1: 0;
          Date uDate = new Date();
          if (e14) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tb), i1);
          }
          vs6 l2 = new vs6(2, ots6, i2, uDate, l1, i);
          this.c.a(l);
       }
       if (!e14) {
          return;
       }else {
          throw e14;
       }
    }
    public final void write(String p0){
       int i;
       co5.o(p0, "str");
       p42 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0);
          void ovoid = i;
       }catch(java.lang.Exception e4){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          p42 tb = this.b;
          ts6 ots6 = tv.a(tb);
          int i1 = (!e4)? p0.length(): 0;
          Date uDate = new Date();
          if (e4) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tb), 1);
          }
          vs6 l2 = new vs6(2, ots6, i1, uDate, l1, i);
          this.c.a(l);
       }
       if (!e4) {
          return;
       }else {
          throw e4;
       }
    }
    public final void write(String p0,int p1,int p2){
       int i;
       vs6 this.t;
       co5.o(p0, "str");
       p42 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0, p1, p2);
          void ovoid = i;
       }catch(java.lang.Exception e13){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          p42 tb = this.b;
          ts6 ots6 = tv.a(tb);
          int i1 = (!e13)? p2: 0;
          Date uDate = new Date();
          if (e13) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tb), 1);
          }
          this.t = new vs6(2, ots6, i1, uDate, l1, i);
          this.c.a(this.t);
       }
       if (!e13) {
          return;
       }else {
          throw e13;
       }
    }
    public final void write(char[] p0){
       int i;
       co5.o(p0, "cbuf");
       p42 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0);
          void ovoid = i;
       }catch(java.lang.Exception e4){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          p42 tb = this.b;
          ts6 ots6 = tv.a(tb);
          int i1 = (!e4)? p0.length: 0;
          Date uDate = new Date();
          if (e4) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tb), 1);
          }
          vs6 l2 = new vs6(2, ots6, i1, uDate, l1, i);
          this.c.a(l);
       }
       if (!e4) {
          return;
       }else {
          throw e4;
       }
    }
    public final void write(char[] p0,int p1,int p2){
       int i;
       vs6 this.t;
       co5.o(p0, "cbuf");
       p42 tv = this.v;
       tv.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i = 0;
          this.a.write(p0, p1, p2);
          void ovoid = i;
       }catch(java.lang.Exception e13){
       }
       long l1 = et0.m(tv.a, l);
       if (this.t != null) {
          p42 tb = this.b;
          ts6 ots6 = tv.a(tb);
          int i1 = (!e13)? p2: 0;
          Date uDate = new Date();
          if (e13) {
             ss6 oss6 = new ss6("failed to write data at ".concat(tb), 1);
          }
          this.t = new vs6(2, ots6, i1, uDate, l1, i);
          this.c.a(this.t);
       }
       if (!e13) {
          return;
       }else {
          throw e13;
       }
    }
    public final void x(CharSequence p0,int p1,int p2){
       int i2;
       p42 op42 = this;
       int i = p1;
       int i1 = p2;
       p42 v = op42.v;
       v.a.getClass();
       long l = System.currentTimeMillis();
       try{
          i2 = 0;
          op42.a.append(p0, i, i1);
          void ovoid = i2;
       }catch(java.lang.Exception e0){
       }
       long l1 = et0.m(v.a, l);
       if (op42.t != null) {
          p42 b = op42.b;
          ts6 ots6 = v.a(b);
          int i3 = (!e0)? i1 - i: 0;
          Date uDate = new Date();
          if (e0) {
             ss6 oss6 = new ss6("failed to write data at ".concat(b), 1);
          }
          vs6 l2 = new vs6(2, ots6, i3, uDate, l1, i2);
          op42.c.a(l);
       }
       if (!e0) {
          return;
       }else {
          throw e0;
       }
    }
}
