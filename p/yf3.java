package p.yf3;
import p.hg3;
import java.io.Closeable;
import java.lang.String;
import p.eg3;
import p.ne;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import java.io.IOException;
import p.wf0;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.AbstractCollection;
import p.xf3;
import java.util.LinkedList;

public class yf3 extends hg3	// class@002da8 from classes.dex
{
    public LinkedList a;

    public void yf3(Closeable p0,String p1){
       super(p1);
       if (p0 instanceof eg3) {
          p0.v0();
       }
       return;
    }
    public void yf3(Closeable p0,String p1,Throwable p2){
       super(p1, null, p2);
       if (p2 instanceof hg3) {
          p2.getClass();
       }else if(p0 instanceof eg3){
          p0.v0();
       }
       return;
    }
    public void yf3(Closeable p0,String p1,ne p2){
       super(p1, p2, null);
    }
    public static yf3 d(IOException p0){
       Object[] objArray = new Object[]{p0.getClass().getName(),wf0.f(p0)};
       return new yf3(null, String.format("Unexpected IOException \(of type %s\): %s", objArray));
    }
    public final String c(){
       yf3 ta;
       String message = super.getMessage();
       if (this.a == null) {
          return message;
       }
       message = (message == null)? "": message;
       message = message+" \(through reference chain: ";
       if ((ta = this.a) != null) {
          Iterator iterator = ta.iterator();
          while (iterator.hasNext()) {
             message = message.append(iterator.next().a());
             if (iterator.hasNext()) {
                message = message.append("->");
             }
          }
       }
       return message+')';
    }
    public final void e(Object p0,String p1){
       xf3 oxf3 = new xf3(p0, p1);
       if (this.a == null) {
          this.a = new LinkedList();
       }
       if (this.a.size() < 1000) {
          this.a.addFirst(oxf3);
       }
       return;
    }
    public final String getLocalizedMessage(){
       return this.c();
    }
    public String getMessage(){
       return this.c();
    }
    public final String toString(){
       return this.getClass().getName()+": "+this.c();
    }
}
