package p.ms1;
import p.yf2;
import p.su0;
import java.lang.Object;
import p.fx5;
import java.lang.String;
import java.lang.Long;
import com.spotify.player.esperanto.proto.EsContextPlayerError$ContextPlayerError;
import p.co5;
import p.cp1;
import java.lang.Enum;
import p.uo1;
import p.oy6;
import java.util.Map;
import p.kg4;
import p.su;
import java.lang.IllegalStateException;

public final class ms1 implements yf2, su0	// class@001ef4 from classes.dex
{
    public static final ms1 a;
    public static final ms1 b;

    static {
       ms1.a = new ms1();
       ms1.b = new ms1();
    }
    public void ms1(){
       super();
    }
    public Object a(Object p0){
       return Long.valueOf(p0.J());
    }
    public Object apply(Object p0){
       String str1;
       co5.o(p0, "p0");
       uo1 g0 = uo1.g0;
       switch (p0.f().ordinal()){
           case 0:
             g0 = uo1.a;
             break;
           case 1:
             g0 = uo1.b;
             break;
           case 2:
             g0 = uo1.c;
             break;
           case 3:
             g0 = uo1.t;
             break;
           case 4:
             g0 = uo1.w;
             break;
           case 5:
             g0 = uo1.x;
             break;
           case 6:
             g0 = uo1.y;
             break;
           case 7:
             g0 = uo1.z;
             break;
           case 8:
             g0 = uo1.A;
             break;
           case 9:
             g0 = uo1.B;
             break;
           case 10:
             g0 = uo1.C;
             break;
           case 11:
             g0 = uo1.D;
             break;
           case 12:
             g0 = uo1.M;
             break;
           case 13:
             g0 = uo1.F;
             break;
           case 14:
             g0 = uo1.G;
             break;
           case 15:
             g0 = uo1.I;
             break;
           case 16:
             g0 = uo1.H;
             break;
           case 17:
             g0 = uo1.J;
             break;
           case 18:
             g0 = uo1.L;
             break;
           case 19:
             g0 = uo1.N;
             break;
           case 20:
             g0 = uo1.O;
             break;
           case 21:
             g0 = uo1.P;
             break;
           case 22:
             g0 = uo1.E;
             break;
           case 23:
             g0 = uo1.Q;
             break;
           case 24:
             g0 = uo1.R;
             break;
           case 25:
             g0 = uo1.S;
             break;
           case 26:
             g0 = uo1.T;
             break;
           case 27:
             g0 = uo1.U;
             break;
           case 28:
             g0 = uo1.V;
             break;
           case 29:
             g0 = uo1.Z;
             break;
           case 30:
             g0 = uo1.W;
             break;
           case 31:
             g0 = uo1.X;
             break;
           case 32:
             g0 = uo1.Y;
             break;
           case '!':
             g0 = uo1.f0;
             break;
           case '"':
             g0 = uo1.e0;
             break;
           case '#':
             g0 = uo1.v;
             break;
           case '%':
             g0 = uo1.K;
             break;
           case '&':
             g0 = uo1.a0;
             break;
           case 39:
             g0 = uo1.b0;
             break;
           case '(':
             g0 = uo1.c0;
             break;
           case ')':
             g0 = uo1.d0;
             break;
           default:
       }
       oy6 ooy6 = new oy6(12);
       ooy6.b = g0;
       String str = "";
       ooy6.c = str;
       ooy6.t = str;
       ooy6.v = str;
       if ((str1 = p0.g().get("track_uri")) != null) {
          ooy6.c = str1;
       }
       if ((str1 = p0.g().get("context_uri")) != null) {
          ooy6.t = str1;
       }
       if ((p0 = p0.g().get("reasons")) != null) {
          ooy6.v = p0;
       }
       if (ooy6.b == null) {
          str = " error";
       }
       if (ooy6.c == null) {
          str = str.concat(" trackUri");
       }
       if (ooy6.t == null) {
          str = kg4.l(str, " contextUri");
       }
       if (ooy6.v == null) {
          str = kg4.l(str, " reasons");
       }
       if (str.isEmpty()) {
          return new su(ooy6.b, ooy6.c, ooy6.t, ooy6.v);
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
}
