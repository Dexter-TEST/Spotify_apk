package p.x57;
import p.ng3;
import p.w57;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;
import p.qg3;

public final class x57 extends ng3	// class@002c13 from classes.dex
{
    public final x57 d;
    public x57 e;
    public String f;
    public w57 g;
    public boolean h;
    public boolean i;

    public void x57(int p0,x57 p1,w57 p2,boolean p3){
       super(0);
       this.b = p0;
       this.d = p1;
       this.g = p2;
       this.c = -1;
       this.h = p3;
       this.i = false;
    }
    public final String c(){
       return this.f;
    }
    public final void g(StringBuilder p0){
       x57 td;
       ng3 tb;
       int i;
       if ((td = this.d) != null) {
          td.g(p0);
       }
       if ((tb = this.b) == 2) {
          p0 = p0+'{';
          if (this.f != null) {
             char c = '"';
             p0 = p0+c+this.f+c;
          }else {
             p0 = p0+'?';
          }
          p0+'}';
       }else if(tb == 1){
          p0 = p0+'[';
          if ((tb = this.c) < null) {
             i = 0;
          }
          p0+i+']';
       }else {
          p0+"/";
       }
       return;
    }
    public final w57 h(w57 p0){
       ng3 tb;
       if ((tb = this.b) == 2) {
          return p0;
       }
       this.c = this.c + 1;
       if (tb == 1) {
          p0.getClass();
          return p0;
       }else {
          p0.getClass();
          return p0;
       }
    }
    public final x57 i(w57 p0,boolean p1){
       x57 te;
       if ((te = this.e) == null) {
          te = new x57(1, this, p0, p1);
          this.e = te;
          return te;
       }else {
          te.b = 1;
          te.g = p0;
          te.c = -1;
          te.f = null;
          te.h = p1;
          te.i = false;
          return te;
       }
    }
    public final x57 j(w57 p0,boolean p1){
       x57 te;
       if ((te = this.e) == null) {
          te = new x57(2, this, p0, p1);
          this.e = te;
          return te;
       }else {
          te.b = 2;
          te.g = p0;
          te.c = -1;
          te.f = null;
          te.h = p1;
          te.i = false;
          return te;
       }
    }
    public final qg3 k(){
       if (this.h == null) {
          this.h = true;
          if (this.b == 2) {
             return qg3.x;
          }
          return qg3.z;
       }else if(this.i != null && this.b == 2){
          this.i = false;
          return qg3.B;
       }else {
          return null;
       }
    }
    public final String toString(){
       StringBuilder str = new StringBuilder(64);
       this.g(str);
       return str;
    }
}
