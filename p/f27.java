package p.f27;
import p.yy6;
import p.wl1;
import java.lang.StringBuilder;
import java.lang.String;
import p.ox7;
import p.cx6;

public final class f27 extends yy6	// class@001548 from classes.dex
{
    public final int c;

    public void f27(int p0){
       this.c = p0;
       super(23);
    }
    public final void q(wl1 p0){
       StringBuilder str;
       int i1;
       switch (this.c){
           case 1:
             str = "";
             while (p0.c()) {
                int i = p0.d + 1;
                p0.d = i;
                this.w(p0.b(), str);
                if (!(i1 = str.length() % 3)) {
                   yy6.C(p0, str);
                   if (ox7.A(p0.a, p0.d, this.y()) != this.y()) {
                      p0.e = 0;
                      break ;
                   }
                }
             }
             break;
           default:
             super.q(p0);
             return;
       }
       this.z(p0, str);
       return;
    }
    public final int w(char p0,StringBuilder p1){
       char c = 'Z';
       char c1 = 0;
       int i = 2;
       char c2 = '9';
       switch (this.c){
           case 0:
             if (p0 == ' ') {
                p1+3;
             label_0036 :
                i = 1;
             }else if(p0 >= '0' && p0 <= c2){
                p1+(char)((p0 - '0') + 4);
                goto label_0036 ;
             }else {
                char c3 = 'a';
                if (p0 >= c3 && p0 <= 'z') {
                   p1+(char)((p0 - c3) + 14);
                   goto label_0036 ;
                }else if(p0 < ' '){
                   p1+c1+p0;
                }else {
                   c3 = '!';
                   if (p0 >= c3 && p0 <= '/') {
                      p1+1+(char)(p0 - c3);
                   }else {
                      c3 = ':';
                      if (p0 >= c3 && p0 <= '@') {
                         p1+1+(char)((p0 - c3) + 15);
                      }else {
                         c3 = '[';
                         if (p0 >= c3 && p0 <= '_') {
                            p1+1+(char)((p0 - c3) + 22);
                         }else {
                            c3 = '`';
                            if (p0 == c3) {
                               p1+i+(char)(p0 - c3);
                            }else if(p0 >= 'A' && p0 <= c){
                               p1+i+(char)((p0 - 'A') + 1);
                            }else {
                               c3 = '{';
                               if (p0 >= c3 && p0 <= 127) {
                                  p1+i+(char)((p0 - c3) + 27);
                               }else {
                                  i = i + this.w((char)(p0 - 128), p1+"\x01\x1e");
                               }
                            }
                         }
                      }
                   }
                }
             }
             break;
           default:
             if (p0 != 13) {
                if (p0 != ' ') {
                   if (p0 != '*') {
                      if (p0 != '>') {
                         if (p0 >= '0' && p0 <= c2) {
                            p1+(char)((p0 - '0') + 4);
                         }else if(p0 >= 'A' && p0 <= c){
                            p1+(char)((p0 - 'A') + 14);
                         }else {
                            ox7.t(p0);
                            throw 0;
                         }
                      }else {
                         p1+i;
                      }
                   }else {
                      p1+1;
                   }
                }else {
                   p1+3;
                }
             }else {
                p1+c1;
             }
             return 1;
       }
       return i;
    }
    public final int y(){
       switch (this.c){
           case 0:
           default:
             return 3;
       }
       return 2;
    }
    public final void z(wl1 p0,StringBuilder p1){
       switch (this.c){
           case 1:
             p0.d(p0.a());
             int i = p0.f.b - p0.a();
             p0.d = p0.d - p1.length();
             wl1 a = p0.a;
             if ((((a.length() - p0.g) - p0.d)) > 1 || (i > 1 || (((a.length() - p0.g) - p0.d)) != i)) {
                p0.e(254);
             }
             if (p0.e < null) {
                p0.e = 0;
             }
             break;
           default:
             super.z(p0, p1);
             return;
       }
       return;
    }
}
