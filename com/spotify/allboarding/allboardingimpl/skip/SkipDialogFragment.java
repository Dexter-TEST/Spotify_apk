package com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import androidx.fragment.app.f;
import p.ir2;
import p.sc;
import java.lang.Object;
import java.lang.String;
import p.co5;
import androidx.fragment.app.Fragment;
import p.lg4;
import p.tu6;
import p.qf4;
import p.ay6;
import p.m26;
import java.lang.Boolean;
import p.bb7;
import android.content.Context;
import android.os.Bundle;
import p.sl6;
import android.os.BaseBundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.eb4;
import p.jb7;
import p.kb7;
import p.lb7;
import java.lang.Integer;
import java.util.ArrayList;
import p.mb7;
import p.fb7;
import p.gb7;
import p.nb7;
import p.ds3;
import java.lang.Enum;
import p.nl6;
import p.cd2;
import android.widget.TextView;
import java.lang.Number;
import android.widget.Button;
import p.ol6;
import android.view.View$OnClickListener;
import p.db4;
import p.kf6;
import p.fh5;
import p.pl6;

public final class SkipDialogFragment extends f	// class@00050d from classes.dex
{
    public final sc H;
    public bb7 I;
    public sl6 J;

    public void SkipDialogFragment(){
       super(ir2.t);
    }
    public void SkipDialogFragment(sc p0){
       co5.o(p0, "injector");
       super();
       this.H = p0;
    }
    public final void C(boolean p0){
       qf4 oqf4 = tu6.p(this).g();
       co5.i(oqf4);
       oqf4.B.getValue().e(Boolean.valueOf(p0), "skipDialogResult");
       this.v(false, false);
    }
    public final bb7 D(){
       SkipDialogFragment tI;
       if ((tI = this.I) != null) {
          return tI;
       }
       co5.N("pickerLogger");
       throw null;
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       this.H.a(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       p0 = this.requireArguments();
       co5.l(p0, "requireArguments\(\)");
       sl6[] osl6Array = sl6.values();
       int intx = p0.getInt("allboarding-skiptype-arg", 1);
       co5.o(osl6Array, "<this>");
       object oobject = (intx >= 0 && intx <= (osl6Array.length - 1))? osl6Array[intx]: null;
       if (oobject == null) {
          oobject = sl6.b;
       }
       this.J = oobject;
       this.z(0, R.style.Theme.Glue.Dialog);
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       co5.o(p0, "inflater");
       return p0.inflate(R.layout.allboarding_skip_dialog, p1, false);
    }
    public final void onViewCreated(View p0,Bundle p1){
       String str1;
       SkipDialogFragment j;
       int i;
       nl6 i1;
       nl6 d;
       SkipDialogFragment skipDialogFr = this;
       Button obj = p0;
       co5.o(obj, "contentView");
       super.onViewCreated(p0, p1);
       Bundle uBundle = this.requireArguments();
       co5.l(uBundle, "requireArguments\(\)");
       String str = "";
       if ((str1 = uBundle.getString("allboarding-step-arg", str)) == null) {
       }else {
          str = str1;
       }
       eb4 uoeb4 = bb7.a(str);
       jb7 ojb7 = uoeb4.b.b();
       lb7 v12 = new lb7("skip_modal", null, null, null, null);
       ojb7.i.add(v12);
       ojb7.j = true;
       mb7 omb7 = new mb7();
       omb7.c(ojb7.a());
       omb7.b = uoeb4.a;
       this.D().a.a(omb7.a());
       if ((j = skipDialogFr.J) != null) {
          if (i = j.ordinal()) {
             if (i != 1) {
                if (i == 2) {
                   i1 = new nl6(Integer.valueOf(R.string.allboarding_skip_dialog_non_skippable_title), 0x7f12003c, 0x7f12003d, null, false);
                }else {
                   throw new cd2(10);
                }
             }else {
                i1 = new nl6(Integer.valueOf(R.string.allboarding_skip_dialog_title), 0x7f12003a, 0x7f12003f, Integer.valueOf(R.string.allboarding_skip_dialog_continue), true);
             }
          }else {
             nl6 i4 = new nl6(null, 0x7f120032, 0x7f120033, null, false);
          }
          TextView textView = obj.findViewById(R.id.allboarding_skip_dialog_title);
          co5.l(textView, "title");
          int i2 = 0;
          int i3 = ((i1 = i.a) != null)? 1: 0;
          i3 = (i3)? 0: 8;
          textView.setVisibility(i3);
          if (i1 != null) {
             textView.setText(i1.intValue());
          }
          obj.findViewById(R.id.allboarding_skip_dialog_body).setText(i.b);
          Button uButton = obj.findViewById(R.id.allboarding_skip_dialog_skip_button);
          uButton.setText(i.c);
          uButton.setOnClickListener(new ol6(skipDialogFr, str, i));
          this.D().a.a(new kf6(new db4(bb7.a(str), true)).i());
          obj = obj.findViewById(R.id.allboarding_skip_dialog_continue_button);
          co5.l(obj, "secondary");
          uButton = ((d = i.d) != null)? 1: 0;
          if (!uButton) {
             i2 = 8;
          }
          obj.setVisibility(i2);
          if (d != null) {
             obj.setText(d.intValue());
             this.D().a.a(new fh5(new db4(bb7.a(str), true)).e());
          }
          obj.setOnClickListener(new pl6(skipDialogFr, str));
          return;
       }else {
          co5.N("skipType");
          throw null;
       }
    }
}
