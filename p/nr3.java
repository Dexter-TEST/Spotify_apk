package p.nr3;
import p.zr3;
import p.or3;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import p.rr3;

public final class nr3 implements zr3	// class@002033 from classes.dex
{
    public final int a;
    public final or3 b;

    public void nr3(or3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void f(String p0,String p1){
       char c = 'E';
       char c1 = 'I';
       nr3 tb = this.b;
       switch (this.a){
           case 0:
             tb.a.a('D', "Spotify", or3.g(p0, p1), null);
             return;
           case 1:
             tb.a.a('V', "Spotify", or3.g(p0, p1), null);
             return;
           case 2:
             tb.a.a(c1, "Spotify", or3.g(p0, p1), null);
             return;
           case 3:
             tb.a.a('W', "Spotify", or3.g(p0, p1), null);
             return;
           case 4:
             tb.a.a(c, "Spotify", or3.g(p0, p1), null);
             return;
           case 5:
             tb.a.a(c1, "Breadcrumb", or3.g(p0, p1), null);
             return;
           default:
             tb.a.a(c, "YELL", or3.g(p0, p1), null);
             return;
       }
    }
    public final void j(String p0,String p1,Throwable p2){
       char c = 'E';
       char c1 = 'I';
       nr3 tb = this.b;
       switch (this.a){
           case 0:
             tb.a.a('D', "Spotify", or3.g(p0, p1), p2);
             return;
           case 1:
             tb.a.a('V', "Spotify", or3.g(p0, p1), p2);
             return;
           case 2:
             tb.a.a(c1, "Spotify", or3.g(p0, p1), p2);
             return;
           case 3:
             tb.a.a('W', "Spotify", or3.g(p0, p1), p2);
             return;
           case 4:
             tb.a.a(c, "Spotify", or3.g(p0, p1), p2);
             return;
           case 5:
             tb.a.a(c1, "Breadcrumb", or3.g(p0, p1), p2);
             return;
           default:
             tb.a.a(c, "YELL", or3.g(p0, p1), p2);
             return;
       }
    }
}
