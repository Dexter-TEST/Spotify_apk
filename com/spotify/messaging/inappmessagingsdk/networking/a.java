package com.spotify.messaging.inappmessagingsdk.networking.a;
import java.lang.Object;
import p.cr0;
import p.cy5;
import com.spotify.messaging.inappmessagingsdk.networking.b;
import java.lang.Class;
import com.spotify.messaging.inappmessagingsdk.networking.c;
import java.lang.String;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import com.google.common.collect.c;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import p.w87;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import java.lang.Enum;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.util.Locale;
import io.reactivex.rxjava3.core.Single;
import p.up0;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import p.vc5;
import p.yf2;

public final class a	// class@000a4a from classes.dex
{
    public final Object a;
    public final Object b;

    public void a(Object p0,cr0 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public static b a(cy5 p0){
       return p0.b(b.class);
    }
    public static c b(cy5 p0){
       return p0.b(c.class);
    }
    public final Observable c(String p0,String p1,TriggerType p2,boolean p3,c p4,c p5,c p6,boolean p7){
       FormatType uFormatType;
       a uoa = this;
       ArrayList uArrayList = new ArrayList(p4.size());
       Iterator iterator = p4.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().a);
       }
       ArrayList uArrayList1 = new ArrayList(p5.size());
       iterator = p5.iterator();
       while (iterator.hasNext()) {
          uArrayList1.add(iterator.next().name());
       }
       ArrayList uArrayList2 = new ArrayList();
       iterator = p6.iterator();
       while (iterator.hasNext()) {
          if ((uFormatType = iterator.next()) == FormatType.FULLSCREEN) {
             continue ;
          }
          uArrayList2.add(uFormatType.name().toLowerCase(Locale.US));
       }
       a a = uoa.a;
       String str = (p7)? "quicksilverdev": "quicksilver";
       return a.a(str, "application/protobuf", p0, p1, p2.toString(), p3, uArrayList2, uArrayList1, uArrayList).toObservable().zipWith(Observable.just(p4), new up0(7, this));
    }
    public final Observable d(boolean p0,c p1,c p2){
       FormatType uFormatType;
       ArrayList uArrayList = new ArrayList(p2.size());
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().toString());
       }
       ArrayList uArrayList1 = new ArrayList(p1.size());
       Iterator iterator1 = p1.iterator();
       while (iterator1.hasNext()) {
          if ((uFormatType = iterator1.next()) == FormatType.FULLSCREEN) {
             continue ;
          }
          uArrayList1.add(uFormatType.toString().toLowerCase(Locale.US));
       }
       a ta = this.a;
       String str = (p0)? "quicksilverdev": "quicksilver";
       return ta.a(str, "application/protobuf", uArrayList1, uArrayList).toObservable().map(new vc5(16, this));
    }
}
