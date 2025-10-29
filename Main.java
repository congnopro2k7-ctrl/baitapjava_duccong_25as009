public class Main {

    // Phương thức main là điểm bắt đầu chương trình
    public static void main(String[] args) {
        System.out.println("--- KIỂM THỬ LỚP CYLINDER ---");

        // 1. Tạo Cylinder mặc định (radius=1.0, height=1.0, color="red")
        Cylinder cy1 = new Cylinder();
        System.out.println("\nCylinder 1 (Mặc định):");
        System.out.println(cy1.toString());

        // Kiểm tra các giá trị
        System.out.println("Bán kính (Radius): " + cy1.getRadius()); // 1.0 (Kế thừa)
        System.out.println("Chiều cao (Height): " + cy1.getHeight());   // 1.0 (Riêng)
        System.out.println("Màu sắc (Color): " + cy1.getColor());   // red (Kế thừa)

        // Tính toán
        System.out.println("Diện tích đáy (Base Area): " + cy1.getArea());
        System.out.println("Thể tích (Volume): " + cy1.getVolume()); // 3.14159...

        // 2. Tạo Cylinder với các giá trị khác nhau
        Cylinder cy2 = new Cylinder(3.0, 5.0); // radius=3.0, height=5.0, color="red"
        System.out.println("\nCylinder 2 (Radius=3.0, Height=5.0):");

        // Cập nhật màu sắc
        cy2.setColor("blue");

        System.out.println("Thông tin: " + cy2.toString());

        // Kiểm tra các giá trị sau khi cập nhật
        System.out.println("Bán kính (Radius): " + cy2.getRadius()); // 3.0
        System.out.println("Chiều cao (Height): " + cy2.getHeight());   // 5.0
        System.out.println("Màu sắc (Color): " + cy2.getColor());   // blue

        // Tính toán
        System.out.println("Diện tích đáy (Base Area): " + cy2.getArea()); // π * 3^2 = 28.27...
        System.out.println("Thể tích (Volume): " + cy2.getVolume()); // 28.27... * 5.0 = 141.37...

        // 3. Sử dụng Constructor có cả color
        Cylinder cy3 = new Cylinder(7.0, 2.0, "yellow");
        System.out.println("\nCylinder 3 (Radius=7.0, Height=2.0, Color=yellow):");
        System.out.println("Thể tích (Volume): " + cy3.getVolume());
    }
}
