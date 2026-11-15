# KẾ HOẠCH KIỂM THỬ PHONESTORE (TEST PLAN)

## THÔNG TIN DỰ ÁN

- **Tên dự án:** PhoneStore - Website bán điện thoại trực tuyến
- **Sinh viên:** Nguyễn Đức Tài
- **MSSV:** TS03262
- **Ngôn ngữ lập trình:** Java 17
- **Framework:** Spring Boot 3.3.5
- **Database:** Microsoft SQL Server
- **Testing Framework:** JUnit 5
- **Mocking Framework:** Mockito
- **UI Automation:** Selenium WebDriver 4
- **Build Tool:** Maven
- **URL chạy local:** http://localhost:8081

---

## 1. MỤC TIÊU KIỂM THỬ

- Kiểm thử hoạt động của Backend bằng JUnit 5.
- Kiểm thử Controller và khả năng xử lý yêu cầu.
- Kiểm thử chức năng quản lý sản phẩm.
- Kiểm thử khả năng kết nối giữa Spring Boot và SQL Server.
- Kiểm thử chức năng truy vấn danh sách sản phẩm từ database.
- Kiểm tra khả năng hiển thị thông tin sản phẩm trên website.
- Chuẩn bị tích hợp kiểm thử tự động với GitHub Actions CI/CD.

## 2. PHẠM VI KIỂM THỬ

### 2.1. In-Scope (Trong phạm vi kiểm thử)

- Kiểm thử khởi động ứng dụng Spring Boot.
- Kiểm thử truy cập trang chủ PhoneStore.
- Kiểm thử kết nối SQL Server.
- Kiểm thử truy vấn dữ liệu bảng Products.
- Kiểm thử hiển thị danh sách sản phẩm.
- Kiểm thử hiển thị tên, giá và hình ảnh sản phẩm.
- Kiểm thử trường hợp database không có sản phẩm.
- Kiểm thử chức năng quản lý sản phẩm: xem, thêm, sửa và xóa.
- Kiểm thử ProductController bằng JUnit 5 và Mockito.
- Kiểm thử các trường hợp dữ liệu hợp lệ và không hợp lệ trong phạm vi mã nguồn đã triển khai.

### 2.2. Out-of-Scope (Ngoài phạm vi kiểm thử)

- Kiểm thử hiệu năng chuyên sâu (Performance Testing).
- Kiểm thử bảo mật chuyên sâu (Security Testing).
- Kiểm thử thanh toán trực tuyến.
- Kiểm thử ứng dụng trên thiết bị di động.
- Kiểm thử các chức năng chưa được triển khai.
- Kiểm thử giao diện tự động bằng Selenium cho đến khi có test chạy thành công.

## 3. MÔI TRƯỜNG KIỂM THỬ

| Thành phần   | Công nghệ             |
| ------------ | --------------------- |
| Hệ điều hành | Windows               |
| IDE          | Visual Studio Code    |
| Ngôn ngữ     | Java 17               |
| Framework    | Spring Boot 3.3.5     |
| Database     | Microsoft SQL Server  |
| Build Tool   | Maven                 |
| Unit Testing | JUnit 5               |
| Mocking      | Mockito               |
| UI Testing   | Selenium 4            |
| Trình duyệt  | Google Chrome         |
| Local URL    | http://localhost:8081 |

## 4. PHƯƠNG PHÁP KIỂM THỬ

### 4.1. Unit Testing

Sử dụng JUnit 5 để kiểm thử các thành phần Backend.

- Kiểm tra phương thức xử lý trong Controller.
- Kiểm tra kết quả trả về.
- Kiểm tra dữ liệu được truyền vào Model.
- Kiểm tra các trường hợp dữ liệu hợp lệ và không hợp lệ.
- Sử dụng Mockito để giả lập ProductService.
- Sử dụng ParameterizedTest và CsvSource để kiểm thử nhiều bộ dữ liệu.
- Sử dụng assertThrows để kiểm tra ngoại lệ.

### 4.2. UI Automation Testing

Sử dụng Selenium WebDriver 4 để tự động hóa thao tác trên trình duyệt khi các bài kiểm thử giao diện được triển khai.

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

- Các Test Case trong phạm vi kiểm thử được thực hiện và ghi nhận kết quả.
- Các Test Case đạt yêu cầu được đánh dấu Pass.
- Các Test Case chưa thực hiện được đánh dấu Not Run.
- Các lỗi phát hiện được ghi nhận và xử lý.
- Các bài kiểm thử JUnit 5 chạy thành công.
- Các bài kiểm thử Selenium chỉ được đánh dấu hoàn thành khi thực sự chạy thành công.
- Không còn lỗi nghiêm trọng ảnh hưởng đến chức năng chính.
- Pipeline GitHub Actions phải chạy thành công sau khi được cấu hình.

## 6. KẾT QUẢ KIỂM THỬ

Kết quả Maven Test đã thực hiện:

| Nội dung              |  Kết quả |
| --------------------- | -------: |
| ProductControllerTest | 10 tests |
| SampleControllerTest  |  2 tests |
| LoginTest             |   1 test |
| Tổng số test          |       13 |
| Failures              |        0 |
| Errors                |        0 |
| Skipped               |        1 |
| Build                 |  SUCCESS |

Nhận xét:

- ProductControllerTest chạy thành công 10 test.
- SampleControllerTest chạy thành công 2 test.
- LoginTest có 1 test bị bỏ qua (Skipped).
- Tổng cộng 13 test được ghi nhận, không có Failures và Errors.
- Các bài kiểm thử giao diện và database cần được thực hiện, ghi nhận riêng nếu chưa có kết quả tự động tương ứng.

## 7. QUY ƯỚC TRẠNG THÁI

- **Pass:** Đã thực hiện kiểm thử và kết quả đúng như mong đợi.
- **Fail:** Đã thực hiện kiểm thử nhưng kết quả không đúng.
- **Not Run:** Chưa thực hiện kiểm thử.
- **Skipped:** Bài kiểm thử bị bỏ qua, không được tính là kiểm thử thành công.

## 8. KẾT LUẬN

Kế hoạch kiểm thử PhoneStore tập trung vào kiểm thử Backend, Controller, chức năng quản lý sản phẩm, kết nối SQL Server và khả năng hiển thị dữ liệu trên website.

JUnit 5 và Mockito được sử dụng để hỗ trợ kiểm thử độc lập các thành phần Backend. Selenium WebDriver được định hướng sử dụng cho kiểm thử giao diện tự động.

Kết quả kiểm thử sẽ tiếp tục được cập nhật trong TEST_CASES.md theo tình trạng thực hiện thực tế.
