package com.spotify.messaging.inappmessagingsdk.display.b;
import p.cy5;
import p.t73;
import java.lang.Class;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import p.u73;
import android.os.Bundle;
import java.lang.String;
import p.jl;
import android.os.Parcelable;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterface;
import com.spotify.messaging.inappmessagingsdk.display.InAppMessagingJSInterfaceImpl;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p.w87;
import java.util.Map;
import p.c6;
import p.l83;
import p.r73;
import p.zg0;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;

public abstract class b	// class@000a48 from classes.dex
{

    public static t73 a(cy5 p0){
       return p0.b(t73.class);
    }
    public static u73 b(Fragment p0){
       if (p0.getArguments() == null) {
          jl.d("InAppMessagingDisplayFragment must have fragment arguments");
       }
       return p0.getArguments().getParcelable("message_extra");
    }
    public static InAppMessagingJSInterface c(Fragment p0){
       return new InAppMessagingJSInterfaceImpl(p0.getResources().getDisplayMetrics().density);
    }
    public static MessageInteractor d(u73 p0,w87 p1,Map p2,c6 p3,l83 p4,r73 p5,zg0 p6){
       MessageInteractor v8 = new MessageInteractor(p0, p1, p2, p3, p5, p4, p6);
       return v8;
    }
    public static w87 e(Fragment p0){
       if (p0.getArguments() == null) {
          jl.d("InAppMessagingDisplayFragment must have fragment arguments");
       }
       return p0.getArguments().getParcelable("trigger_extra");
    }
}
