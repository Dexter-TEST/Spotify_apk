package p.r8;
import p.sk7;
import p.l4;
import java.lang.Object;
import android.util.SparseArray;
import p.cb2;
import android.content.Context;
import p.s8;
import p.o8;
import android.view.ContextThemeWrapper;
import java.lang.String;
import android.content.Intent;
import p.xj0;
import p.vv7;
import android.app.PendingIntent;
import p.sj4;
import p.lo;
import java.lang.CharSequence;
import android.app.Notification;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import p.rj4;
import p.uj4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.StringBuilder;
import p.en6;
import p.ju2;
import java.lang.Class;
import p.q8;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import androidx.appcompat.app.AlertController$RecycleListView;
import p.p8;
import p.n8;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView;
import android.widget.AbsListView;
import android.app.Dialog;
import android.content.DialogInterface$OnCancelListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnKeyListener;
import java.lang.Math;
import p.gh4;
import java.lang.IllegalArgumentException;
import p.tp2;
import p.rk7;
import p.lq5;

public final class r8 implements sk7, l4	// class@00249c from classes.dex
{
    public final int a;
    public int b;
    public Object c;

    public void r8(int p0){
       this.a = p0;
       if (p0 != 4) {
          super();
          this.c = new SparseArray();
          this.b = 0;
          return;
       }else {
          super();
          this.c = cb2.a;
          return;
       }
    }
    public void r8(int p0,int p1){
       this.a = p1;
       if (p1 != 6) {
          if (p1 != 8) {
             super();
             int[] ointArray = new int[p0];
             this.c = ointArray;
             this.b = p0 / 2;
             return;
          }else {
             super();
             char[] uocharArray = new char[p0];
             this.c = uocharArray;
             return;
          }
       }else {
          super();
          byte[] uobyteArray = new byte[p0];
          this.c = uobyteArray;
          this.b = 0;
          return;
       }
    }
    public void r8(int p0,int p1,Object[] p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public void r8(Context p0){
       this.a = 0;
       super(p0, s8.g(p0, 0));
    }
    public void r8(Context p0,int p1){
       this.a = 0;
       super();
       this.c = new o8(new ContextThemeWrapper(p0, s8.g(p0, p1)));
       this.b = p1;
    }
    public void r8(Context p0,long p1){
       this.a = 10;
       super();
       this.b = -1;
       String str = p0.getString(R.string.storage_location_moving_notification_title);
       String str1 = p0.getString(R.string.storage_location_moving_notification_text);
       lo.c(p0);
       sj4 osj4 = new sj4(p0, "channel_id_default");
       osj4.g = PendingIntent.getActivity(p0, 0, xj0.z0(p0, "spotify.intent.action.STORAGE_SETTINGS").setFlags(0x10000000), vv7.d(0));
       osj4.d(str1);
       osj4.e(str);
       osj4.f(2, true);
       osj4.f(8, true);
       osj4.m = 100;
       osj4.n = 0;
       osj4.o = false;
       osj4.j = true;
       sj4 w = osj4.w;
       w.icon = 0x7f07059d;
       w.sound = null;
       w.audioStreamType = -1;
       w.audioAttributes = new AudioAttributes$Builder().setContentType(4).setUsage(5).build();
       rj4 orj4 = new rj4();
       orj4.c = sj4.c(str1);
       osj4.g(orj4);
       w.tickerText = sj4.c(str);
       osj4.t = 1;
       osj4.q = "progress";
       w.when = p1;
       this.c = osj4;
    }
    public void r8(BottomSheetBehavior p0,int p1){
       this.a = 5;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void r8(String p0,int p1){
       String str;
       this.a = 11;
       super();
       this.c = "";
       this.b = -113;
       p0 = en6.r(p0);
       if (p1 == -113) {
          this.b = -113;
          str = " Branch API Error: poor network connectivity. Please try again later.";
       }else {
          int i = -114;
          if (p1 == i) {
             this.b = i;
             str = " Branch API Error: Please enter your branch_key in your project\'s manifest file first.";
          }else {
             i = -104;
             if (p1 == i) {
                this.b = i;
                str = " Did you forget to call init? Make sure you init the session before making Branch calls.";
             }else {
                i = -101;
                if (p1 == i) {
                   this.b = i;
                   str = " Unable to initialize Branch. Check network connectivity or that your branch key is valid.";
                }else {
                   i = -102;
                   if (p1 == i) {
                      this.b = i;
                      str = " Please add \'android.permission.INTERNET\' in your applications manifest file.";
                   }else {
                      i = -105;
                      if (p1 == i) {
                         this.b = i;
                         str = " Unable to create a URL with that alias. If you want to reuse the alias, make sure to submit the same properties for all arguments and that the user is the same owner.";
                      }else {
                         i = -108;
                         if (p1 == i) {
                            this.b = i;
                            str = "BranchApp class can be used only with API level 14 or above. Please make sure your minimum API level supported is 14. If you wish to use API level below 14 consider calling getInstance\(Context\) instead.";
                         }else {
                            i = -109;
                            if (p1 == i) {
                               this.b = i;
                               str = "Branch instance is not created. Make  sure your Application class is an instance of BranchLikedApp.";
                            }else {
                               i = -110;
                               if (p1 == i) {
                                  this.b = i;
                                  str = " Unable create share options. Couldn\'t find applications on device to share the link.";
                               }else {
                                  i = -111;
                                  if (p1 == i) {
                                     this.b = i;
                                     str = " Request to Branch server timed out. Please check your internet connectivity";
                                  }else {
                                     i = -117;
                                     if (p1 == i) {
                                        this.b = i;
                                        str = " Tracking is disabled. Requested operation cannot be completed when tracking is disabled";
                                     }else {
                                        i = -118;
                                        if (p1 == i) {
                                           this.b = i;
                                           str = " Session initialization already happened. To force a new session, set intent extra, \"branch_force_new_session\", to true.";
                                        }else {
                                           int i1 = -112;
                                           if (p1 < 500 && p1 != i1) {
                                              i1 = -115;
                                              if (p1 != 409 && p1 != i1) {
                                                 if (p1 < 400 && p1 != -116) {
                                                    i = -119;
                                                    if (p1 == i) {
                                                       this.b = i;
                                                       str = "Intra-app linking \(i.e. session reinitialization\) requires an intent flag, \"branch_force_new_session\".";
                                                    }else if(p1 == -120){
                                                       this.b = -120;
                                                       str = " Task exceeded timeout.";
                                                    }else {
                                                       this.b = -113;
                                                       str = " Check network connectivity and that you properly initialized.";
                                                    }
                                                 }else {
                                                    this.b = -116;
                                                    str = " The request was invalid.";
                                                 }
                                              }else {
                                                 this.b = i1;
                                                 str = " A resource with this identifier already exists.";
                                              }
                                           }else {
                                              this.b = i1;
                                              str = " Unable to reach the Branch servers, please try again shortly.";
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       this.c = p0+str;
       return;
    }
    public void r8(ju2 p0,int p1){
       this.a = 9;
       super();
       p0.getClass();
       this.c = p0;
       this.b = p1;
    }
    public void r8(ju2 p0,int p1,int p2){
       this.a = 9;
       super(p0, p1);
    }
    public final s8 a(){
       o8 g;
       o8 f;
       q8 m;
       s8 os8 = new s8(this.c.a, this.b);
       r8 tc = this.c;
       o8 e = tc.e;
       s8 w = os8.w;
       if (e != null) {
          w.o = e;
       }else if((e = tc.d) != null){
          w.d = e;
          if ((m = w.m) != null) {
             m.setText(e);
          }
       }
       if ((e = tc.c) != null) {
          w.k = e;
          w.j = 0;
          if ((m = w.l) != null) {
             m.setVisibility(0);
             w.l.setImageDrawable(e);
          }
       }
       if (tc.g != null) {
          AlertController$RecycleListView recycleListV = tc.b.inflate(w.s, null);
          q8 t = (tc.i != null)? w.t: w.u;
          if ((g = tc.g) == null) {
             g = new p8(tc.a, t);
          }
          w.p = g;
          w.q = tc.j;
          if (tc.h != null) {
             recycleListV.setOnItemClickListener(new n8(tc, 0, w));
          }
          if (tc.i != null) {
             recycleListV.setChoiceMode(1);
          }
          w.e = recycleListV;
       }
       this.c.getClass();
       os8.setCancelable(1);
       this.c.getClass();
       os8.setCanceledOnTouchOutside(1);
       this.c.getClass();
       os8.setOnCancelListener(null);
       this.c.getClass();
       os8.setOnDismissListener(null);
       if ((f = this.c.f) != null) {
          os8.setOnKeyListener(f);
       }
       return os8;
    }
    public final Notification b(int p0){
       if (this.b >= p0) {
          return this.c.b();
       }
       this.b = p0;
       r8 tc = this.c;
       tc.m = 100;
       tc.n = Math.min(100, p0);
       tc.o = false;
       return tc.b();
    }
    public final gh4 c(int p0){
       gh4 ogh4;
       if ((ogh4 = this.c.get(p0)) != null) {
          return ogh4;
       }
       throw new IllegalArgumentException(tp2.k("Cannot find the wrapper for global view type ", p0));
    }
    public final boolean d(View p0){
       this.c.E(this.b);
       return true;
    }
    public final rk7 e(gh4 p0){
       return new lq5(this, p0);
    }
    public final String toString(){
       switch (this.a){
           case 8:
             return new String(this.c, 0, this.b);
           case 11:
             return this.c;
           default:
             return super.toString();
       }
    }
}
