package p.q13;
import p.r13;
import p.a23;
import android.os.Bundle;
import java.lang.String;
import p.zt2;
import java.lang.Object;
import p.co5;
import java.lang.Boolean;
import java.lang.Class;
import p.io2;
import p.p13;
import java.util.Arrays;
import p.au2;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Set;

public final class q13 extends r13	// class@002310 from classes.dex
{
    public final Bundle a;
    public final a23 b;

    public void q13(a23 p0,Bundle p1){
       this.b = p0;
       this.a = p1;
    }
    public final zt2 b(String p0,boolean p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (io2.j(a23.D(this.b, p0, Boolean.class), Boolean.valueOf(p1))) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.b(p0, p1);
       }
       return ozt2;
    }
    public final zt2 c(String p0,boolean[] p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (Arrays.equals(a23.D(this.b, p0, boolean[].class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.c(p0, p1);
       }
       return ozt2;
    }
    public final a23 d(){
       return this.b;
    }
    public final zt2 e(String p0,au2 p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (io2.j(a23.D(this.b, p0, au2.class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.e(p0, p1);
       }
       return ozt2;
    }
    public final zt2 f(String p0,au2[] p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (Arrays.equals(a23.D(this.b, p0, au2[].class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.f(p0, p1);
       }
       return ozt2;
    }
    public final zt2 g(String p0,byte[] p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (Arrays.equals(a23.D(this.b, p0, byte[].class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.g(p0, p1);
       }
       return ozt2;
    }
    public final zt2 h(String p0,double[] p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (Arrays.equals(a23.D(this.b, p0, double[].class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.h(p0, p1);
       }
       return ozt2;
    }
    public final zt2 i(String p0,double p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (io2.j(a23.D(this.b, p0, Double.class), Double.valueOf(p1))) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.i(p0, p1);
       }
       return ozt2;
    }
    public final zt2 j(String p0,float[] p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (Arrays.equals(a23.D(this.b, p0, float[].class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.j(p0, p1);
       }
       return ozt2;
    }
    public final zt2 k(String p0,float p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (io2.j(a23.D(this.b, p0, Float.class), Float.valueOf(p1))) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.k(p0, p1);
       }
       return ozt2;
    }
    public final zt2 l(int p0,String p1){
       zt2 ozt2;
       co5.o(p1, "key");
       if (io2.j(a23.D(this.b, p1, Integer.class), Integer.valueOf(p0))) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.l(p0, p1);
       }
       return ozt2;
    }
    public final zt2 m(String p0,int[] p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (Arrays.equals(a23.D(this.b, p0, int[].class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.m(p0, p1);
       }
       return ozt2;
    }
    public final zt2 n(String p0,long[] p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (Arrays.equals(a23.D(this.b, p0, long[].class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.n(p0, p1);
       }
       return ozt2;
    }
    public final zt2 o(String p0,long p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (io2.j(a23.D(this.b, p0, Long.class), Long.valueOf(p1))) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.o(p0, p1);
       }
       return ozt2;
    }
    public final zt2 p(Parcelable p0,String p1){
       zt2 ozt2;
       co5.o(p1, "key");
       if (io2.j(a23.D(this.b, p1, Parcelable.class), p0)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.p(p0, p1);
       }
       return ozt2;
    }
    public final zt2 q(String p0,Serializable p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (io2.j(a23.D(this.b, p0, Serializable.class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.q(p0, p1);
       }
       return ozt2;
    }
    public final zt2 r(String p0,String p1){
       zt2 ozt2;
       co5.o(p0, "key");
       if (io2.j(a23.D(this.b, p0, String.class), p1)) {
          ozt2 = this;
       }else {
          ozt2 = new p13(this);
          ozt2.r(p0, p1);
       }
       return ozt2;
    }
    public final p13 s(String p0,String[] p1){
       co5.o(p0, "key");
       p13 op13 = new p13(this);
       op13.s(p0, p1);
       return op13;
    }
    public final boolean t(){
       return this.b.keySet().isEmpty();
    }
}
