package com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;
import androidx.fragment.app.Fragment;
import p.ir2;
import p.sc;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.ry7;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import android.widget.TextView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import p.ej5;
import android.widget.ScrollView;
import p.hk4;
import android.view.View$OnClickListener;
import androidx.fragment.app.k;
import androidx.activity.a;
import p.ek3;
import p.qo1;
import p.k15;
import androidx.activity.b;
import android.content.res.Resources;
import java.lang.NullPointerException;

public final class NotificationPermissionFragment extends Fragment	// class@000533 from classes.dex
{
    public final sc a;
    public ej5 b;

    public void NotificationPermissionFragment(){
       super(ir2.w);
    }
    public void NotificationPermissionFragment(sc p0){
       co5.o(p0, "injector");
       super();
       this.a = p0;
    }
    public final void onAttach(Context p0){
       co5.o(p0, "context");
       this.a.a(this);
       super.onAttach(p0);
       co5.N("permissionRequester");
       throw null;
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       co5.N("statusChecker");
       throw null;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view1;
       View view2;
       View view3;
       View view4;
       View view5;
       View view6;
       View view7;
       co5.o(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       boolean b = false;
       View view = p0.inflate(R.layout.notification_opt_in, p1, b);
       int i = 0x7f0a0011;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a0163;
          if ((view2 = ry7.q(view, i)) != null) {
             i = 0x7f0a01bf;
             if ((view3 = ry7.q(view, i)) != null) {
                i = 0x7f0a01d5;
                if ((view4 = ry7.q(view, i)) != null) {
                   i = 0x7f0a04c4;
                   if ((view5 = ry7.q(view, i)) != null) {
                      i = 0x7f0a04cc;
                      if ((view6 = ry7.q(view, i)) != null) {
                         i = 0x7f0a062e;
                         if ((view7 = ry7.q(view, i)) != null) {
                            ej5 i1 = new ej5(view, view1, view2, view3, view4, view5, view6, view7);
                            this.b = i;
                            i.c.setOnClickListener(new hk4(this, b));
                            NotificationPermissionFragment tb = this.b;
                            co5.i(tb);
                            tb.d.setOnClickListener(new hk4(this, 1));
                            ek3 viewLifecycl = this.getViewLifecycleOwner();
                            co5.l(viewLifecycl, "viewLifecycleOwner");
                            this.requireActivity().x.a(viewLifecycl, new qo1(3));
                            tb = this.b;
                            co5.i(tb);
                            ej5 b1 = tb.b;
                            co5.l(b1, "binding.root");
                            return b1;
                         }
                      }
                   }
                }
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void onDestroyView(){
       super.onDestroyView();
       co5.N("permissionRequester");
       throw null;
    }
}
