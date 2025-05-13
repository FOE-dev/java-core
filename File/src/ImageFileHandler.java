public class ImageFileHandler extends FileHandler implements Compressible {

    public ImageFileHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void read() {
        System.out.println("Xem ảnh: " + fileName);
    }

    @Override
    public void write() {
        System.out.println("Ghi ảnh: " + fileName);
    }

    @Override
    public void delete() {
        System.out.println("Xóa ảnh: " + fileName);
    }

    @Override
    public void compress() {
        System.out.println("Nén ảnh: " + fileName);
    }
}
