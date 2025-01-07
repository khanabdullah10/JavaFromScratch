package Introduction;

//import java.lang.Runtime;
public class AudioPlayer {
     static int a =10;
    protected boolean openSpeaker(Speaker sp){
        return false;
    }
}
class Stream extends AudioPlayer{
    @Override
    public boolean openSpeaker(Speaker sp) {
        return super.openSpeaker(sp);
    }
}

