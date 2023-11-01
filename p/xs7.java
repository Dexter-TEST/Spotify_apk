package p.xs7;
import java.lang.String;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import com.spotify.zorro.telco.v2.proto.CallbackBody;

public interface abstract xs7	// class@002cde from classes.dex
{

    Completable a(String p0);
    Completable b(String p0,String p1);
    Single c();
    Completable d(String p0,String p1,CallbackBody p2);
}
