package p.rf3;
import java.io.Serializable;
import p.qf3;
import p.pf3;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Locale;
import java.util.TimeZone;
import p.of3;
import java.lang.Class;
import java.lang.Enum;

public final class rf3 implements Serializable	// class@0024d7 from classes.dex
{
    public final String a;
    public final qf3 b;
    public final Locale c;
    public final String t;
    public final Boolean v;
    public final pf3 w;
    public TimeZone x;
    public static final rf3 y;

    static {
       rf3.y = new rf3();
    }
    public void rf3(){
       super("", qf3.a, "", "", pf3.c, null);
    }
    public void rf3(String p0,qf3 p1,String p2,String p3,pf3 p4,Boolean p5){
       Object obj = p2;
       Object obj1 = p3;
       Locale locale = (obj && (p2.length() && !"##default".equals(obj)))? new Locale(obj): null;
       String str = (obj1 && (p3.length() && !"##default".equals(obj1)))? obj1: null;
       super(p0, p1, locale, str, null, p4, p5);
       return;
    }
    public void rf3(String p0,qf3 p1,Locale p2,String p3,TimeZone p4,pf3 p5,Boolean p6){
       super();
       if (p0 == null) {
          p0 = "";
       }
       this.a = p0;
       if (p1 == null) {
          p1 = qf3.a;
       }
       this.b = p1;
       this.c = p2;
       this.x = p4;
       this.t = p3;
       if (p5 == null) {
          p5 = pf3.c;
       }
       this.w = p5;
       this.v = p6;
       return;
    }
    public static boolean a(Serializable p0,Serializable p1){
       boolean b = false;
       if (p0 == null) {
          if (p1 == null) {
             b = true;
          }
          return b;
       }else if(p1 == null){
          return b;
       }else {
          return p0.equals(p1);
       }
    }
    public final Boolean b(of3 p0){
       Boolean fALSE;
       rf3 tw = this.w;
       tw.getClass();
       int i = 1 << p0.ordinal();
       if ((tw.b & i)) {
          fALSE = Boolean.FALSE;
       }else if((i & tw.a)){
          fALSE = Boolean.TRUE;
       }else {
          fALSE = null;
       }
       return fALSE;
    }
    public final TimeZone c(){
       rf3 tx;
       if ((tx = this.x) == null) {
          if ((tx = this.t) == null) {
             return null;
          }else {
             tx = TimeZone.getTimeZone(tx);
             this.x = tx;
          }
       }
       return tx;
    }
    public final boolean d(){
       rf3 tt;
       boolean b = (this.x == null && ((tt = this.t) == null && !tt.isEmpty()))? false: true;
       return b;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (p0.getClass() != rf3.class) {
          return false;
       }
       if (this.b != p0.b || !this.w.equals(p0.w)) {
          return false;
       }
       if (!rf3.a(this.v, p0.v) || (!rf3.a(this.t, p0.t) || (!rf3.a(this.a, p0.a) || (!rf3.a(this.x, p0.x) || !rf3.a(this.c, p0.c))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       rf3 tt;
       rf3 ta;
       int i = ((tt = this.t) == null)? 1: tt.hashCode();
       if ((ta = this.a) != null) {
          i = i ^ ta.hashCode();
       }
       int i1 = this.b.hashCode() + i;
       if ((tt = this.v) != null) {
          i1 = i1 ^ tt.hashCode();
       }
       if ((tt = this.c) != null) {
          i1 = i1 + tt.hashCode();
       }
       tt = this.w;
       return (i1 ^ (tt.b + tt.a));
    }
    public final String toString(){
       Object[] objArray = new Object[]{this.a,this.b,this.v,this.c,this.t,this.w};
       return String.format("JsonFormat.Value\(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s\)", objArray);
    }
}
