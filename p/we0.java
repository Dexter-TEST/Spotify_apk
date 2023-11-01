package p.we0;
import p.r16;
import java.lang.Object;
import p.fw;
import android.database.sqlite.SQLiteDatabase;
import p.u16;
import android.content.ContentValues;
import java.lang.Long;
import java.lang.String;
import p.kk5;
import p.nk5;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class we0 implements r16	// class@002b1a from classes.dex
{
    public final int a;
    public long b;
    public Object c;

    public void we0(){
       this.a = 0;
       super();
       this.b = 0;
    }
    public void we0(long p0,fw p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(int p0){
       int i = 64;
       if (p0 >= i) {
          we0 tc = this.c;
          if (tc != null) {
             tc.a((p0 - i));
          }
       }else {
          this.b = this.b & (~ (1 << p0));
       }
       return;
    }
    public final Object apply(Object p0){
       we0 tc = this.c;
       ContentValues uContentValu = new ContentValues();
       uContentValu.put("next_request_ms", Long.valueOf(this.b));
       String[] stringArray = new String[2];
       stringArray[0] = tc.a;
       fw c = tc.c;
       if ((stringArray[1] = String.valueOf(nk5.a(c))) < 1) {
          uContentValu.put("backend_name", tc.a);
          uContentValu.put("priority", Integer.valueOf(nk5.a(c)));
          p0.insert("transport_contexts", null, uContentValu);
       }
       return null;
    }
    public final int b(int p0){
       we0 tc = this.c;
       if (tc == null) {
          if (p0 >= 64) {
             return Long.bitCount(this.b);
          }
          return Long.bitCount((this.b & ((1 << p0) - 1)));
       }else if(p0 < 64){
          return Long.bitCount((this.b & ((1 << p0) - 1)));
       }else {
          return (Long.bitCount(this.b) + tc.b((p0 - 64)));
       }
    }
    public final void c(){
       if (this.c == null) {
          this.c = new we0();
       }
       return;
    }
    public final boolean d(int p0){
       boolean b;
       int i = 64;
       if (p0 >= i) {
          this.c();
          return this.c.d((p0 - i));
       }else if((this.b & (1 << p0))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public final void e(int p0,boolean p1){
       int i = 64;
       if (p0 >= i) {
          this.c();
          this.c.e((p0 - i), p1);
       }else {
          we0 tb = this.b;
          boolean b = ((Long.MIN_VALUE & tb))? true: false;
          long l = (1 << p0) - 1;
          long l1 = tb & l;
          this.b = ((tb & (~ l)) << 1) | l1;
          if (p1) {
             this.h(p0);
          }else {
             this.a(p0);
          }
          if (b || this.c != null) {
             this.c();
             this.c.e(0, b);
          }
       }
       return;
    }
    public final boolean f(int p0){
       int i = 64;
       if (p0 >= i) {
          this.c();
          return this.c.f((p0 - i));
       }else {
          long l = 1;
          long l1 = l << p0;
          we0 tb = this.b;
          p0 = 1;
          boolean b = ((tb & l1))? true: false;
          long l2 = tb & (~ l1);
          this.b = l2;
          l1 = l1 - l;
          l = l2 & l1;
          this.b = l | Long.rotateRight(((~ l1) & l2), p0);
          we0 tc = this.c;
          if (tc != null) {
             if (tc.d(0)) {
                this.h(63);
             }
             this.c.f(0);
          }
          return b;
       }
    }
    public final void g(){
       this.b = 0;
       we0 tc = this.c;
       if (tc != null) {
          tc.g();
       }
       return;
    }
    public final void h(int p0){
       int i = 64;
       if (p0 >= i) {
          this.c();
          this.c.h((p0 - i));
       }else {
          this.b = this.b | (1 << p0);
       }
       return;
    }
    public final String toString(){
       String str;
       switch (this.a){
           case 0:
             str = (this.c == null)? Long.toBinaryString(this.b): this.c.toString()+"xx"+Long.toBinaryString(this.b);
             break;
           default:
             return super.toString();
       }
       return str;
    }
}
