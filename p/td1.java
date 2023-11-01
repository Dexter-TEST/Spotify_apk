package p.td1;
import androidx.fragment.app.f;
import p.sd1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import java.lang.IllegalStateException;
import java.lang.String;
import p.sp6;
import p.lp6;
import android.content.Context;
import android.content.res.Resources;
import p.ej4;
import android.os.Bundle;
import p.rj2;
import p.up0;
import java.lang.Object;
import p.wd5;
import androidx.activity.a;
import p.sd2;
import p.ek3;
import p.k15;
import androidx.activity.b;
import android.app.Dialog;
import p.ft0;
import p.vs0;
import android.os.BaseBundle;
import android.net.Uri;
import p.co5;
import p.rd1;
import p.h25;
import p.te5;

public class td1 extends f	// class@002749 from classes.dex
{
    public wd5 H;
    public rj2 I;
    public static final int J;

    public void td1(){
       super();
    }
    public final sd1 C(){
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof sd1) {
          return parentFragme;
       }
       k activity = this.getActivity();
       if (activity instanceof sd1) {
          return activity;
       }
       throw new IllegalStateException("No host");
    }
    public final lp6 D(sp6 p0){
       return new lp6(this.requireContext(), p0, (float)this.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.I = new rj2(this.getActivity(), new up0(3, this), this.H);
       this.getActivity().x.a(this, new sd2(5, this, true));
    }
    public final Dialog x(Bundle p0){
       Dialog uDialog = this.I.a();
       td1 tI = this.I;
       Bundle arguments = this.getArguments();
       int i = 0;
       ft0 uoft0 = new ft0(i);
       int i1 = 1;
       uoft0.c = i1;
       sp6 b0 = sp6.b0;
       ft0 a = uoft0.a;
       a.f = b0;
       if (arguments != null) {
          String str = arguments.getString("episodeUri", "");
          String str1 = arguments.getString("showUri", "");
          Uri uri = Uri.parse(arguments.getString("imageUri"));
          co5.o(uri, "<set-?>");
          a.e = uri;
          String str2 = arguments.getString("title", "");
          co5.o(str2, "<set-?>");
          a.a = str2;
          String str3 = arguments.getString("subtitle", "");
          co5.o(str3, "<set-?>");
          a.b = str3;
          uoft0.b(R.id.downloaded_episode_remove_download, this.getString(R.string.downloaded_episode_context_menu_remove_download), this.D(sp6.A), new rd1(this, str, i));
          uoft0.b(R.id.downloaded_episode_queue, this.getString(R.string.downloaded_episode_context_menu_queue), this.D(sp6.c0), new rd1(this, str, i1));
          uoft0.b(R.id.downloaded_episode_share, this.getString(R.string.downloaded_episode_context_menu_share), this.D(sp6.h0), new rd1(this, str, 2));
          if (!te5.a(str1)) {
             uoft0.b(R.id.downloaded_episode_show_podcast, this.getString(R.string.downloaded_episode_context_menu_show_podcast), this.D(b0), new rd1(this, str1, 3));
          }
          uoft0.b(R.id.downloaded_episode_show_episode, this.getString(R.string.downloaded_episode_context_menu_show_episode), this.D(b0), new rd1(this, str, 4));
       }
       tI.b(uoft0);
       return uDialog;
    }
}
