package p.tj1;
import java.lang.ThreadLocal;
import p.j8;
import java.lang.Object;
import p.e94;
import p.oz6;
import java.nio.ByteBuffer;
import p.f94;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;

public final class tj1	// class@00277f from classes.dex
{
    public final int a;
    public final j8 b;
    public int c;
    public static final ThreadLocal d;

    static {
       tj1.d = new ThreadLocal();
    }
    public void tj1(j8 p0,int p1){
       super();
       this.c = 0;
       this.b = p0;
       this.a = p1;
    }
    public final int a(int p0){
       int i;
       e94 uoe94 = this.d();
       if (i = uoe94.a(16)) {
          oz6 b = uoe94.b;
          i = i + uoe94.a;
          p0 = b.getInt(((p0 * 4) + ((b.getInt(i) + i) + 4)));
       }else {
          p0 = 0;
       }
       return p0;
    }
    public final int b(){
       int i;
       int intx;
       e94 uoe94 = this.d();
       if (i = uoe94.a(16)) {
          i = i + uoe94.a;
          intx = uoe94.b.getInt((uoe94.b.getInt(i) + i));
       }else {
          intx = 0;
       }
       return intx;
    }
    public final int c(){
       int i;
       e94 uoe94 = this.d();
       int intx = (i = uoe94.a(4))? uoe94.b.getInt((i + uoe94.a)): 0;
       return intx;
    }
    public final e94 d(){
       e94 uoe94;
       int i;
       ThreadLocal d = tj1.d;
       if ((uoe94 = d.get()) == null) {
          uoe94 = new e94();
          d.set(uoe94);
       }
       j8 b = this.b.b;
       if (i = b.a(6)) {
          i = i + b.a;
          i = (this.a * 4) + ((b.b.getInt(i) + i) + 4);
          uoe94.b(b.b, (b.b.getInt(i) + i));
       }
       return uoe94;
    }
    public final String toString(){
       StringBuilder str = super.toString()+", id:"+Integer.toHexString(this.c())+", codepoints:";
       int i = this.b();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          str = str.append(Integer.toHexString(this.a(i1))).append(" ");
       }
       return str;
    }
}
