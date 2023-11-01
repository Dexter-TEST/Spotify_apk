package com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import p.co5;
import androidx.fragment.app.k;
import android.content.Context;
import p.yj2;
import p.zk2;
import p.eo5;
import androidx.activity.a;
import p.ek3;
import p.qo1;
import p.k15;
import androidx.activity.b;
import p.xj2;
import android.widget.TextView;
import p.k8;
import android.view.View$OnClickListener;

public final class ErrorFragment extends Fragment	// class@000509 from classes.dex
{
    public xj2 a;

    public void ErrorFragment(){
       super();
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       co5.o(p0, "inflater");
       yj2 oyj2 = new yj2(LayoutInflater.from(this.requireActivity()).inflate(R.layout.glue_empty_state_button, p1, false));
       eo5.P(oyj2);
       this.a = oyj2;
       ek3 viewLifecycl = this.getViewLifecycleOwner();
       co5.l(viewLifecycl, "viewLifecycleOwner");
       this.requireActivity().x.a(viewLifecycl, new qo1(false));
       return this.u().a;
    }
    public final void onViewCreated(View p0,Bundle p1){
       co5.o(p0, "view");
       super.onViewCreated(p0, p1);
       if (this.a != null) {
          this.u().b.setText(R.string.allboarding_request_error_title);
          this.u().c.setText(R.string.allboarding_request_error_message);
          this.u().t.setText(R.string.allboarding_request_error_dialog_retry);
          this.u().t.setOnClickListener(new k8(7, this));
       }
       return;
    }
    public final xj2 u(){
       ErrorFragment ta;
       if ((ta = this.a) != null) {
          return ta;
       }
       co5.N("emptyState");
       throw null;
    }
}
