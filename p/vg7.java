package p.vg7;
import java.lang.Object;

public final class vg7	// class@0029f0 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void vg7(){
       super();
       this.a = 0;
    }
    public final boolean a(){
       vg7 td;
       vg7 tb;
       int i1;
       vg7 ta = this.a;
       int i = 2;
       if ((ta & 0x07)) {
          td = this.d;
          tb = this.b;
          if (td > tb) {
             i1 = 1;
          }else if(td == tb){
             i1 = 2;
          }else {
             i1 = 4;
          }
          if (!(((i1 << 0) & ta))) {
             return 0;
          }
       }
       if ((ta & 0x70)) {
          td = this.d;
          tb = this.c;
          if (td > tb) {
             i1 = 1;
          }else if(td == tb){
             i1 = 2;
          }else {
             i1 = 4;
          }
          if (!(((i1 << 4) & ta))) {
             return 0;
          }
       }
       if ((ta & 0x0700)) {
          td = this.e;
          tb = this.b;
          if (td > tb) {
             i1 = 1;
          }else if(td == tb){
             i1 = 2;
          }else {
             i1 = 4;
          }
          if (!(((i1 << 8) & ta))) {
             return 0;
          }
       }
       if ((ta & 0x7000)) {
          td = this.e;
          tb = this.c;
          if (td > tb) {
             i = 1;
          }else if(td == tb){
             i = 4;
          }
          if (!((ta & (i << 12)))) {
             return 0;
          }
       }
       return true;
    }
}
