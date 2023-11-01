package p.j54;
import android.media.MediaDescription;
import android.media.session.MediaSession$QueueItem;

public abstract class j54	// class@001a6d from classes.dex
{

    public static MediaSession$QueueItem a(MediaDescription p0,long p1){
       return new MediaSession$QueueItem(p0, p1);
    }
    public static MediaDescription b(MediaSession$QueueItem p0){
       return p0.getDescription();
    }
    public static long c(MediaSession$QueueItem p0){
       return p0.getQueueId();
    }
}
