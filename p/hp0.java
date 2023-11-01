package p.hp0;
import java.lang.Object;
import p.ip0;
import java.lang.String;
import p.co5;
import java.lang.IllegalArgumentException;
import p.kf0;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.NullPointerException;
import p.k57;

public final class hp0	// class@001895 from classes.dex
{
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public void hp0(){
       super();
       this.a = true;
    }
    public void hp0(ip0 p0){
       super();
       this.a = p0.a;
       this.b = p0.c;
       this.c = p0.d;
       this.d = p0.b;
    }
    public final ip0 a(){
       return new ip0(this.a, this.d, this.b, this.c);
    }
    public final void b(String[] p0){
       co5.o(p0, "cipherSuites");
       if (this.a == null) {
          throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
       }
       int i = (!p0.length)? 1: 0;
       if ((i ^ 1)) {
          this.b = p0.clone();
          return;
       }else {
          throw new IllegalArgumentException("At least one cipher suite is required".toString());
       }
    }
    public final void c(kf0[] p0){
       Object[] objArray;
       co5.o(p0, "cipherSuites");
       if (this.a == null) {
          throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
       }
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(p0[i].a);
       }
       String[] stringArray = new String[0];
       if ((objArray = uArrayList.toArray(stringArray)) == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       }
       this.b(Arrays.copyOf(objArray, objArray.length));
       return;
    }
    public final void d(){
       if (this.a == null) {
          throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
       }
       this.d = true;
       return;
    }
    public final void e(String[] p0){
       co5.o(p0, "tlsVersions");
       if (this.a == null) {
          throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
       }
       int i = (!p0.length)? 1: 0;
       if ((i ^ 1)) {
          this.c = p0.clone();
          return;
       }else {
          throw new IllegalArgumentException("At least one TLS version is required".toString());
       }
    }
    public final void f(k57[] p0){
       Object[] objArray;
       if (this.a == null) {
          throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
       }
       ArrayList uArrayList = new ArrayList(p0.length);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uArrayList.add(p0[i].a);
       }
       String[] stringArray = new String[0];
       if ((objArray = uArrayList.toArray(stringArray)) == null) {
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
       }
       this.e(Arrays.copyOf(objArray, objArray.length));
       return;
    }
}
