package p.a23;
import p.au2;
import android.os.Parcelable;
import p.o13;
import android.os.Bundle;
import p.t33;
import java.lang.Object;
import p.q13;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.zt2;
import java.lang.Boolean;
import p.s13;
import p.zf2;
import java.lang.Number;
import java.lang.Double;
import p.t13;
import p.u13;
import java.lang.Float;
import p.v13;
import android.os.BaseBundle;
import p.y13;
import java.lang.Long;
import p.w13;
import java.lang.Integer;
import p.z13;
import p.x13;
import java.util.Set;
import java.util.Iterator;
import java.util.Arrays;
import java.lang.Byte;
import android.os.Parcel;

public class a23 implements au2, Parcelable	// class@000efc from classes.dex
{
    private final q13 a;
    public static final Parcelable$Creator CREATOR;
    public static final o13 b;
    private static final a23 c;

    static {
       a23.b = new o13();
       a23.c = new a23(new Bundle());
       a23.CREATOR = new t33(2);
    }
    public void a23(Bundle p0){
       super();
       this.a = new q13(this, p0);
    }
    public void a23(a23 p0){
       co5.o(p0, "bundle");
       super();
       this.a = p0.a;
    }
    public static final a23 C(){
       return a23.c;
    }
    public static final Object D(a23 p0,String p1,Class p2){
       return p0.Y(p2, p1);
    }
    public static final zt2 N(){
       a23.b.getClass();
       return o13.a();
    }
    public static final a23 P(){
       a23.b.getClass();
       return new a23(new Bundle());
    }
    public static final a23 W(au2 p0){
       a23.b.getClass();
       return o13.b(p0);
    }
    public boolean[] L(String p0){
       co5.o(p0, "key");
       return this.Y(boolean[].class, p0);
    }
    public Boolean M(String p0){
       co5.o(p0, "key");
       return this.Y(Boolean.class, p0);
    }
    public byte[] O(String p0){
       co5.o(p0, "key");
       return this.Y(byte[].class, p0);
    }
    public double[] Q(String p0){
       co5.o(p0, "key");
       return this.Y(double[].class, p0);
    }
    public double R(String p0,double p1){
       Double uDouble;
       co5.o(p0, "key");
       if ((uDouble = this.X(p0, s13.z)) != null) {
          p1 = uDouble.doubleValue();
       }
       return p1;
    }
    public Double S(String p0){
       co5.o(p0, "key");
       return this.X(p0, t13.z);
    }
    public float[] T(String p0){
       co5.o(p0, "key");
       return this.Y(float[].class, p0);
    }
    public float U(String p0,float p1){
       Float uFloat;
       co5.o(p0, "key");
       if ((uFloat = this.X(p0, u13.z)) != null) {
          p1 = uFloat.floatValue();
       }
       return p1;
    }
    public Float V(String p0){
       co5.o(p0, "key");
       return this.X(p0, v13.z);
    }
    public final Number X(String p0,zf2 p1){
       Number number = ((number = this.Y(Number.class, p0)) != null)? p1.invoke(number): null;
       return number;
    }
    public final Object Y(Class p0,String p1){
       p1 = this.a.a.get(p1);
       if (p0.isInstance(p1)) {
       }else {
          p1 = null;
       }
       return p1;
    }
    public int[] Z(String p0){
       co5.o(p0, "key");
       return this.Y(int[].class, p0);
    }
    public zt2 a(){
       return this.a;
    }
    public long[] a0(String p0){
       co5.o(p0, "key");
       return this.Y(long[].class, p0);
    }
    public String b(String p0,String p1){
       co5.o(p0, "key");
       co5.o(p1, "defaultValue");
       if ((p0 = this.Y(String.class, p0)) == null) {
       }else {
          p1 = p0;
       }
       return p1;
    }
    public long b0(String p0,long p1){
       Long longx;
       co5.o(p0, "key");
       if ((longx = this.X(p0, y13.z)) != null) {
          p1 = longx.longValue();
       }
       return p1;
    }
    public int c(String p0,int p1){
       Integer integer;
       co5.o(p0, "key");
       if ((integer = this.X(p0, w13.z)) != null) {
          p1 = integer.intValue();
       }
       return p1;
    }
    public Long c0(String p0){
       co5.o(p0, "key");
       return this.X(p0, z13.z);
    }
    public Integer d(String p0){
       co5.o(p0, "key");
       return this.X(p0, x13.z);
    }
    public int describeContents(){
       return 0;
    }
    public au2[] e(String p0){
       co5.o(p0, "key");
       return this.Y(au2[].class, p0);
    }
    public boolean equals(Object p0){
       Object obj;
       boolean b;
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof a23) {
          return false;
       }
       q13 a = this.a.a;
       p0 = p0.a.a;
       if (!co5.c(a.keySet(), p0.keySet())) {
          return false;
       }
       Iterator iterator = a.keySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          String str = iterator.next();
          if ((obj = a.get(str)) == null) {
             if (p0.get(str) != null) {
                break ;
             }
          }else if(obj.getClass().isArray()){
             Object obj1 = p0.get(str);
             a23.b.getClass();
             Class componentTyp = obj.getClass().getComponentType();
             Class componentTyp1 = (obj1 != null)? obj1.getClass().getComponentType(): null;
             if (!co5.c(componentTyp, componentTyp1)) {
                obj1 = 0;
             }else if(co5.c(componentTyp, String.class)){
                b = Arrays.equals(obj, obj1);
             }else if(co5.c(componentTyp, Long.TYPE)){
                b = Arrays.equals(obj, obj1);
             }else if(co5.c(componentTyp, Double.TYPE)){
                b = Arrays.equals(obj, obj1);
             }else if(co5.c(componentTyp, Boolean.TYPE)){
                b = Arrays.equals(obj, obj1);
             }else if(co5.c(componentTyp, Integer.TYPE)){
                b = Arrays.equals(obj, obj1);
             }else if(co5.c(componentTyp, Float.TYPE)){
                b = Arrays.equals(obj, obj1);
             }else if(co5.c(componentTyp, Byte.TYPE)){
                b = Arrays.equals(obj, obj1);
             }else {
                b = Arrays.equals(obj, obj1);
             }
             if (!obj1) {
                return false;
             }
          }else if(!co5.c(obj, p0.get(str))){
             return false;
          }
       }
       return false;
    }
    public int hashCode(){
       Object obj;
       int i1;
       Iterator iterator = this.keySet().iterator();
       int i = 1;
       while (iterator.hasNext()) {
          if ((obj = this.u(iterator.next())) == null) {
             i1 = 0;
          }else if(obj.getClass().isArray()){
             a23.b.getClass();
             Class componentTyp = obj.getClass().getComponentType();
             if (co5.c(componentTyp, String.class)) {
                i1 = Arrays.hashCode(obj);
             }else if(co5.c(componentTyp, Long.TYPE)){
                i1 = Arrays.hashCode(obj);
             }else if(co5.c(componentTyp, Double.TYPE)){
                i1 = Arrays.hashCode(obj);
             }else if(co5.c(componentTyp, Boolean.TYPE)){
                i1 = Arrays.hashCode(obj);
             }else if(obj instanceof Object[] && obj instanceof au2[]){
                i1 = Arrays.hashCode(obj);
             }else if(co5.c(componentTyp, Integer.TYPE)){
                i1 = Arrays.hashCode(obj);
             }else if(co5.c(componentTyp, Float.TYPE)){
                i1 = Arrays.hashCode(obj);
             }else {
                i1 = obj.hashCode();
             }
             i1 = i1 + 31;
          }else {
             i1 = obj.hashCode();
          }
          i = i * 31;
          i = i + i1;
       }
       return i;
    }
    public String[] j(String p0){
       co5.o(p0, "key");
       return this.Y(String[].class, p0);
    }
    public Set keySet(){
       Set set = this.a.a.keySet();
       co5.l(set, "impl.bundle.keySet\(\)");
       return set;
    }
    public au2 m(String p0){
       co5.o(p0, "key");
       return this.Y(au2.class, p0);
    }
    public String q(String p0){
       co5.o(p0, "key");
       return this.Y(String.class, p0);
    }
    public Object u(String p0){
       co5.o(p0, "key");
       return this.a.a.get(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "parcel");
       p0.writeBundle(this.a.a);
    }
    public boolean y(String p0,boolean p1){
       Boolean uBoolean;
       co5.o(p0, "key");
       if ((uBoolean = this.Y(Boolean.class, p0)) != null) {
          p1 = uBoolean.booleanValue();
       }
       return p1;
    }
}
