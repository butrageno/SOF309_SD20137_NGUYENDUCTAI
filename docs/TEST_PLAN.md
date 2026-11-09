# KẾ HOẠCH KIỂM THỬ PHONESTORE (TEST PLAN)

## THÔNG TIN DỰ ÁN

- **Tên dự án:** PhoneStore - Website bán điện thoại trực tuyến
- **Sinh viên:** Nguyễn Đức Tài
- **MSSV:** [Điền MSSV của em]
- **Ngôn ngữ lập trình:** Java 17
- **Framework:** Spring Boot 3.3.5
- **Database:** Microsoft SQL Server
- **Testing Framework:** JUnit 5
- **UI Automation:** Selenium WebDriver 4
- **Build Tool:** Maven
- **URL chạy local:** http://localhost:8081

---

## 1. MỤC TIÊU KIỂM THỬ

- Kiểm thử hoạt động của Backend bằng JUnit 5.
- Kiểm thử Controller và khả năng xử lý yêu cầu HTTP.
- Kiểm thử khả năng kết nối giữa Spring Boot và SQL Server.
- Kiểm thử chức năng truy vấn danh sách sản phẩm từ database.
- Kiểm thử giao diện tự động bằng Selenium WebDriver 4.
- Kiểm tra khả năng hiển thị thông tin sản phẩm trên trình duyệt Google Chrome.
- Chuẩn bị tích hợp kiểm thử tự động với GitHub Actions CI/CD.

## 2. PHẠM VI KIỂM THỬ

### 2.1. In-Scope (Trong phạm vi kiểm thử)

- Kiểm thử khởi động ứng dụng Spring Boot.
- Kiểm thử truy cập trang chủ PhoneStore.
- Kiểm thử kết nối SQL Server.
- Kiểm thử truy vấn dữ liệu bảng Products.
- Kiểm thử hiển thị tên sản phẩm.
- Kiểm thử hiển thị giá sản phẩm.
- Kiểm thử hiển thị hình ảnh sản phẩm.
- Kiểm thử trường hợp database không có sản phẩm.
- Kiểm thử giao diện bằng Selenium WebDriver.
- Kiểm thử Backend bằng JUnit 5.

### 2.2. Out-of-Scope (Ngoài phạm vi kiểm thử)

- Kiểm thử hiệu năng chuyên sâu (Performance Testing).
- Kiểm thử bảo mật chuyên sâu (Security Testing).
- Kiểm thử thanh toán trực tuyến.
- Kiểm thử ứng dụng trên thiết bị di động.
- Kiểm thử các chức năng chưa được triển khai.

## 3. MÔI TRƯỜNG KIỂM THỬ

| Thành phần   | Công nghệ             |
| ------------ | --------------------- |
| Hệ điều hành | Windows               |
| IDE          | Visual Studio Code    |
| Ngôn ngữ     | Java 17               |
| Framework    | Spring Boot 3.3.5     |
| Database     | SQL Server            |
| Build Tool   | Maven                 |
| Unit Testing | JUnit 5               |
| UI Testing   | Selenium 4            |
| Trình duyệt  | Google Chrome         |
| Local URL    | http://localhost:8081 |

## 4. PHƯƠNG PHÁP KIỂM THỬ

### 4.1. Unit Testing

Sử dụng JUnit 5 để kiểm thử các thành phần Backend.

- Kiểm tra phương thức xử lý trong Controller.
- Kiểm tra kết quả trả về.
- Kiểm tra các trường hợp dữ liệu hợp lệ và không hợp lệ.

### 4.2. UI Automation Testing

Sử dụng Selenium WebDriver 4 để tự động hóa thao tác trên trình duyệt.

- Mở website PhoneStore.
- Kiểm tra trang chủ.
- Kiểm tra nội dung sản phẩm.
- Kiểm tra hình ảnh và thông tin hiển thị.

### 4.3. Database Testing

Sử dụng SQL Server để kiểm tra:

- Kết nối database PhoneStoreDB.
- Truy vấn dữ liệu từ bảng Products.
- Đối chiếu dữ liệu trong database với dữ liệu hiển thị trên website.

## 5. TIÊU CHÍ HOÀN THÀNH

- Tất cả Test Case trong phạm vi kiểm thử đã được thực hiện.
- Các Test Case đạt yêu cầu được đánh dấu Pass.
- Các lỗi phát hiện được ghi nhận và xử lý.
- Các bài kiểm thử JUnit 5 chạy thành công.
- Các bài kiểm thử Selenium chạy thành công.
- Không còn lỗi nghiêm trọng ảnh hưởng đến chức năng chính.
- Pipeline GitHub Actions phải chạy thành công sau khi được cấu hình.

## 6. KẾT QUẢ KIỂM THỬ

Kết quả kiểm thử sẽ được ghi nhận trong file TEST_CASES.md.

Các trạng thái bao gồm:

- Pass: Kiểm thử thành công.
