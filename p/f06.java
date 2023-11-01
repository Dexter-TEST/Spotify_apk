package p.f06;
import java.lang.Object;

public final class f06	// class@001533 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public void f06(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = Integer.MIN_VALUE;
       this.d = Integer.MIN_VALUE;
       this.e = 0;
       this.f = 0;
       this.g = false;
       this.h = false;
    }
    public final void a(int p0,int p1){
       this.c = p0;
       this.d = p1;
       this.h = true;
       if (this.g != null) {
          if (p1 != Integer.MIN_VALUE) {
             this.a = p1;
          }
          if (p0 != Integer.MIN_VALUE) {
             this.b = p0;
          }
       }else if(p0 != Integer.MIN_VALUE){
          this.a = p0;
       }
       if (p1 != Integer.MIN_VALUE) {
          this.b = p1;
       }
       return;
    }
}
