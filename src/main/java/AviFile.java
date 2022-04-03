public class AviFile implements VideoFile{


    @Override
    public void decode(String fileName) {
        System.out.println("avi"+fileName);
    }
}
