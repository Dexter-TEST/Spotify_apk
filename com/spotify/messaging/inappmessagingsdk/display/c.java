package com.spotify.messaging.inappmessagingsdk.display.c;
import p.ng2;
import com.spotify.messaging.inappmessagingsdk.display.MessageInteractor;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import p.jc7;

public final class c implements ng2	// class@000a49 from classes.dex
{
    public final int a;
    public final MessageInteractor b;
    public final String c;

    public void c(MessageInteractor p0,String p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object b(Object p0,Object p1){
       c tc = this.c;
       c tb = this.b;
       switch (this.a){
           case 0:
           default:
             return MessageInteractor.a(tb, tc, p0, p1);
       }
       return MessageInteractor.b(tb, tc, p0, p1);
    }
}
