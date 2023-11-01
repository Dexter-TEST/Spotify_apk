package com.spotify.core.coreservice.CoreService$shutdown$1;
import java.lang.Runnable;
import com.spotify.core.coreservice.CoreService;
import java.lang.Object;
import com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl;
import java.lang.String;
import p.co5;

final class CoreService$shutdown$1 implements Runnable	// class@00085e from classes.dex
{
    final CoreService this$0;

    public void CoreService$shutdown$1(CoreService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       NativeApplicationScopeImpl nativeApplic;
       if ((nativeApplic = CoreService.access$getNativeCoreApplicationScopeImpl$p(this.this$0)) != null) {
          nativeApplic.prepareForShutdown();
          if ((nativeApplic = CoreService.access$getNativeCoreApplicationScopeImpl$p(this.this$0)) != null) {
             nativeApplic.destroy();
             return;
          }else {
             co5.N("nativeCoreApplicationScopeImpl");
             throw null;
          }
       }else {
          co5.N("nativeCoreApplicationScopeImpl");
          throw null;
       }
    }
}
