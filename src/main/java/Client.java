public class Client {
    public static void main(String[] args) {
        AbsOpratingSystem system1 = new Windows(new AviFile());
        //使用操作系统播放avi
        system1.play("罕见");
    }
}
