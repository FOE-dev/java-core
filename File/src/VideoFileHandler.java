public class VideoFileHandler extends FileHandler {

    public VideoFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void read() {
        System.out.println("Phát video: " + fileName);
    }

    @Override
    public void write() {
        System.out.println("Ghi video: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Xóa video: " + fileName);
    }
}
