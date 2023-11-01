package com.spotify.connectivity.http.AuthInterceptor;
import p.pb3;
import com.spotify.connectivity.http.AuthInterceptor$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.en6;
import p.ob3;
import p.cx5;
import p.yp5;
import java.lang.Class;
import p.zu5;
import p.bv5;

public final class AuthInterceptor implements pb3	// class@000721 from classes.dex
{
    private final String token;
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String AUTHORIZATION_PREFIX = "Bearer ";
    public static final AuthInterceptor$Companion Companion;

    static {
       AuthInterceptor.Companion = new AuthInterceptor$Companion(null);
    }
    public void AuthInterceptor(String p0){
       co5.o(p0, "token");
       super();
       this.token = p0;
    }
    private final String bearer(String p0){
       return en6.n("Bearer ", p0);
    }
    public cx5 intercept(ob3 p0){
       co5.o(p0, "chain");
       yp5 e = p0.e;
       e.getClass();
       zu5 ozu5 = new zu5(e);
       ozu5.a("Authorization", this.bearer(this.token));
       return p0.b(ozu5.b());
    }
}
