package p.ll4;
import p.qb4;
import p.ac;
import java.lang.Object;
import p.cu;
import p.mn4;
import p.j33;
import p.kl4;
import p.qg2;
import p.r45;
import p.v55;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.wk7;
import p.tk7;
import java.lang.String;
import p.qm4;
import p.vk7;
import p.cn4;
import p.dn4;
import p.nm4;
import p.an4;
import p.sm4;
import p.gm4;
import p.hm4;
import p.pm4;
import p.ym4;
import p.zm4;
import p.fn4;
import p.gn4;
import p.hn4;
import p.in4;
import p.jn4;
import p.kn4;
import p.ln4;
import p.vm4;
import p.um4;
import p.mm4;
import p.en4;
import p.jt;
import java.lang.Exception;
import p.xt;
import p.ab3;
import java.lang.Class;
import p.jp3;
import com.spotify.liteinstrumentation.instrumentation.events.proto.LitePageView;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.tu1;

public final class ll4 implements qb4	// class@001d78 from classes.dex
{
    public final ac a;

    public void ll4(ac p0){
       super();
       this.a = p0;
    }
    public final void a(Object p0,Object p1){
       int i = p1;
       int i1 = i;
       j33 oj33 = v3;
       j33 oj331 = new j33(15);
       oj331 = v4;
       j33 oj332 = new j33(26);
       kl4 okl4 = v5;
       kl4 okl41 = new kl4(7);
       okl41 = v6;
       kl4 okl42 = new kl4(10);
       okl42 = v7;
       kl4 okl43 = new kl4(11);
       okl43 = v8;
       kl4 okl44 = new kl4(12);
       okl44 = v9;
       kl4 okl45 = new kl4(13);
       okl45 = v10;
       kl4 okl46 = new kl4(14);
       okl46 = v11;
       kl4 okl47 = new kl4(15);
       okl47 = v12;
       kl4 j33 okl48 = new kl4(16);
       okl48 = new j33(16);
       int i2 = 16;
       j33 oj333 = okl48;
       int i3 = i;
       okl48 = new j33(17);
       okl48 = i;
       int i4 = p0;
       j33 i5 = new j33(18);
       int i6 = i3;
       i5 = v0;
       i3 = i1;
       kl4 j33 oj334 = new j33(19);
       j33 oj335 = oj334;
       oj334 = new j33(20);
       j33 oj336 = oj334;
       oj334 = new j33(21);
       j33 oj337 = oj334;
       oj334 = new j33(22);
       j33 oj338 = oj334;
       oj334 = new j33(23);
       j33 oj339 = oj334;
       oj334 = new j33(24);
       j33 oj3310 = oj334;
       oj334 = new j33(25);
       j33 oj3311 = oj334;
       oj334 = new j33(27);
       j33 oj3312 = oj334;
       oj334 = new j33(28);
       j33 oj3313 = oj334;
       oj334 = new j33(29);
       kl4 okl49 = oj334;
       oj334 = new kl4(0);
       kl4 okl410 = oj334;
       oj334 = new kl4(1);
       kl4 okl411 = oj334;
       oj334 = new kl4(2);
       kl4 okl412 = oj334;
       oj334 = new kl4(3);
       kl4 okl413 = oj334;
       oj334 = new kl4(4);
       kl4 okl414 = oj334;
       oj334 = new kl4(5);
       kl4 okl415 = oj334;
       oj334 = new kl4(6);
       kl4 okl416 = oj334;
       oj334 = new kl4(8);
       kl4 okl417 = oj334;
       oj334 = new kl4(9);
       oj334 = 22;
       int i7 = 28;
       r45 or45 = i3.a(oj33, oj331, okl4, okl41, okl42, okl43, okl44, okl45, okl46, okl47, okl48, oj333, okl48, i5, oj335, oj336, oj337, oj338, oj339, oj3310, oj3311, oj3312, oj3313, okl49, okl410, okl411, okl412, okl413, okl414, okl415, okl416, okl417);
       if (!or45.c()) {
       }else {
          Object obj = or45.b();
          cu uocu = i4;
          wk7 s = wk7.S;
          wk7 owk7 = (TextUtils.isEmpty(uocu.d))? s: new tk7(uocu.d);
          int i8 = i6;
          if (i8 instanceof qm4) {
             if (uocu.q == null) {
                oj334 = 23;
             }
             this.h(obj, owk7, owk7, oj334, "play_pause_button");
          }else if(i8 instanceof cn4){
             this.h(obj, owk7, s, 39, "skip_next_button");
          }else if(i8 instanceof dn4){
             this.h(obj, owk7, s, 40, "skip_prev_button");
          }else if(i8 instanceof nm4){
             if (uocu.u != null) {
                i2 = 15;
             }
             this.h(obj, owk7, owk7, i2, "heart_button");
          }else if(i8 instanceof an4){
             oj334 = (uocu.r != null)? 36: 37;
             this.h(obj, owk7, owk7, oj334, "shuffle_button");
          }else if(i8 instanceof sm4){
             if (uocu.s == null) {
                i7 = 29;
             }
             this.h(obj, owk7, owk7, i7, "repeat_button");
          }else if(i8 instanceof gm4){
             this.h(obj, owk7, owk7, 1, "add_to_playlist_button");
          }else if(i8 instanceof hm4){
             this.h(obj, owk7, owk7, 24, "add_to_queue_button");
          }else if(i8 instanceof pm4){
             this.h(obj, owk7, s, 20, "navigate_up");
          }else if(i8 instanceof ym4){
             this.h(obj, owk7, owk7, 35, "share_button");
          }else if(i8 instanceof zm4){
             this.h(obj, owk7, owk7, 21, "context_menu_button");
          }else {
             okl43 = 19;
             if (i8 instanceof fn4) {
                this.h(obj, owk7, wk7.J, 19, "streaming_quality_button");
             }else if(i8 instanceof gn4){
                this.g(obj, owk7, uocu.h, 19, "view_album_button");
             }else if(i8 instanceof hn4){
                this.g(obj, owk7, uocu.f, 19, "view_artist_button");
             }else if(i8 instanceof in4){
                this.g(obj, owk7, uocu.a, 19, "view_context_button");
             }else if(i8 instanceof jn4){
                this.g(obj, owk7, uocu.d, 19, "view_episode_button");
             }else if(i8 instanceof kn4){
                this.g(obj, owk7, uocu.a, 19, "view_show_button");
             }else if(i8 instanceof ln4){
                this.g(obj, owk7, uocu.d, 19, "view_track_button");
             }else if(i8 instanceof vm4){
                this.h(obj, owk7, owk7, 32, "seek_forward_button");
             }else if(i8 instanceof um4){
                this.h(obj, owk7, owk7, 31, "seek_backward_button");
             }else if(i8 instanceof mm4){
                cu i9 = uocu.i;
                if (!TextUtils.isEmpty(i9)) {
                   s = new tk7(i9);
                }
                this.h(obj, owk7, s, okl43, "cover_art");
             }else if(i8 instanceof en4){
                this.g(obj, owk7, uocu.d, 42, "sleep_timer_button");
             }
          }
       }
       return;
    }
    public final void b(Object p0,jt p1){
    }
    public final void c(Object p0,Object p1,Exception p2){
    }
    public final void d(Object p0){
    }
    public final void e(Object p0,Exception p1){
    }
    public final void f(Object p0,Object p1,xt p2){
    }
    public final void g(v55 p0,vk7 p1,String p2,int p3,String p4){
       this.h(p0, p1, new tk7(p2), p3, p4);
    }
    public final void h(v55 p0,vk7 p1,vk7 p2,int p3,String p4){
       this.a.a(p0, p1, p2, p3, p4);
    }
    public final void i(tk7 p0){
       ll4 ta = this.a;
       ta.getClass();
       jp3 ojp3 = LitePageView.i();
       ojp3.d("enter");
       ojp3.c("lite/now-playing-view");
       ojp3.e(p0.a);
       ta.a.a(ojp3.build());
    }
    public final void j(vk7 p0){
       ll4 ta = this.a;
       ta.getClass();
       jp3 ojp3 = LitePageView.i();
       ojp3.d("exit");
       ojp3.c("lite/now-playing-view");
       ojp3.e(p0.a());
       ta.a.a(ojp3.build());
    }
}
