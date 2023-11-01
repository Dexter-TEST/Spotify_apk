package com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult$Builder;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResultOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult;
import com.google.protobuf.c;
import java.lang.String;
import p.i80;

public final class EsSession$SendEndSongsResult$Builder extends b implements EsSession$SendEndSongsResultOrBuilder	// class@00062c from classes.dex
{

    private void EsSession$SendEndSongsResult$Builder(){
       super(EsSession$SendEndSongsResult.l());
    }
    public void EsSession$SendEndSongsResult$Builder(int p0){
       super();
    }
    public EsSession$SendEndSongsResult$Builder clearErrorCode(){
       this.copyOnWrite();
       EsSession$SendEndSongsResult.e(this.instance);
       return this;
    }
    public EsSession$SendEndSongsResult$Builder clearErrorDescription(){
       this.copyOnWrite();
       EsSession$SendEndSongsResult.f(this.instance);
       return this;
    }
    public EsSession$SendEndSongsResult$Builder clearSuccess(){
       this.copyOnWrite();
       EsSession$SendEndSongsResult.g(this.instance);
       return this;
    }
    public int getErrorCode(){
       return this.instance.getErrorCode();
    }
    public String getErrorDescription(){
       return this.instance.getErrorDescription();
    }
    public i80 getErrorDescriptionBytes(){
       return this.instance.getErrorDescriptionBytes();
    }
    public boolean getSuccess(){
       return this.instance.getSuccess();
    }
    public EsSession$SendEndSongsResult$Builder setErrorCode(int p0){
       this.copyOnWrite();
       EsSession$SendEndSongsResult.h(this.instance, p0);
       return this;
    }
    public EsSession$SendEndSongsResult$Builder setErrorDescription(String p0){
       this.copyOnWrite();
       EsSession$SendEndSongsResult.i(this.instance, p0);
       return this;
    }
    public EsSession$SendEndSongsResult$Builder setErrorDescriptionBytes(i80 p0){
       this.copyOnWrite();
       EsSession$SendEndSongsResult.j(this.instance, p0);
       return this;
    }
    public EsSession$SendEndSongsResult$Builder setSuccess(boolean p0){
       this.copyOnWrite();
       EsSession$SendEndSongsResult.k(this.instance, p0);
       return this;
    }
}
