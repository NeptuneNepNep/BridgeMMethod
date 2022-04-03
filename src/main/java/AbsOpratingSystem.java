public abstract class AbsOpratingSystem {
    protected VideoFile videoFile;
    public AbsOpratingSystem(VideoFile videoFile) {
                this.videoFile = videoFile;


    }
    public abstract  void play(String fileName);
}
