# BỘ KỊCH BẢN KIỂM THỬ PHONESTORE (TEST CASES)

## 1. THÔNG TIN KIỂM THỬ

- **Dự án:** PhoneStore - Website bán điện thoại trực tuyến
- **Môi trường:** Localhost
- **URL:** http://localhost:8081
- **Framework:** Spring Boot 3.3.5
- **Database:** SQL Server
- **Testing Framework:** JUnit 5, Selenium 4

## 2. BẢNG TEST CASE

| Test Case ID  | Chức năng | Mô tả ca kiểm thử                         | Loại test | Các bước thực hiện                                                 | Dữ liệu kiểm thử      | Kết quả mong đợi                                        | Trạng thái |
| ------------- | --------- | ----------------------------------------- | --------- | ------------------------------------------------------------------ | --------------------- | ------------------------------------------------------- | ---------- |
| TC_HOME_01    | Trang chủ | Truy cập trang chủ thành công             | Positive  | 1. Mở Chrome. 2. Truy cập localhost:8081                           | http://localhost:8081 | Trang chủ hiển thị thành công                           | Not Run    |
| TC_HOME_02    | Trang chủ | Truy cập trang chủ khi ứng dụng chưa chạy | Negative  | 1. Dừng Spring Boot. 2. Truy cập localhost:8081                    | URL localhost         | Trình duyệt thông báo không thể kết nối                 | Not Run    |
| TC_DB_01      | Database  | Kết nối SQL Server thành công             | Positive  | 1. Khởi động Spring Boot. 2. Kiểm tra log kết nối                  | PhoneStoreDB          | Kết nối database thành công                             | Not Run    |
| TC_DB_02      | Database  | Kiểm tra dữ liệu bảng Products            | Positive  | 1. Mở SSMS. 2. Chạy SELECT \* FROM Products                        | PhoneStoreDB          | Truy vấn hiển thị dữ liệu sản phẩm                      | Not Run    |
| TC_PRODUCT_01 | Sản phẩm  | Hiển thị danh sách sản phẩm               | Positive  | 1. Mở trang chủ. 2. Quan sát danh sách điện thoại                  | Dữ liệu Products      | Các sản phẩm trong database được hiển thị               | Not Run    |
| TC_PRODUCT_02 | Sản phẩm  | Hiển thị tên sản phẩm                     | Positive  | 1. Mở trang chủ. 2. Kiểm tra tên sản phẩm                          | iPhone 16 Pro Max     | Tên sản phẩm hiển thị chính xác                         | Not Run    |
| TC_PRODUCT_03 | Sản phẩm  | Hiển thị giá sản phẩm                     | Positive  | 1. Mở trang chủ. 2. Kiểm tra giá                                   | 29990000              | Giá hiển thị đúng định dạng                             | Not Run    |
| TC_PRODUCT_04 | Sản phẩm  | Hiển thị hình ảnh sản phẩm                | Positive  | 1. Mở trang chủ. 2. Kiểm tra hình ảnh                              | URL hình ảnh trong DB | Hình ảnh tải thành công                                 | Not Run    |
| TC_PRODUCT_05 | Sản phẩm  | Database không có sản phẩm                | Negative  | 1. Tạo môi trường kiểm thử với bảng Products rỗng. 2. Mở trang chủ | Danh sách rỗng        | Hiển thị thông báo chưa có sản phẩm                     | Not Run    |
| TC_PRODUCT_06 | Sản phẩm  | Kiểm tra sản phẩm có giá trị giá bằng 0   | Negative  | 1. Thử lưu sản phẩm với giá 0 qua chức năng quản lý (nếu có)       | Price = 0             | Hệ thống từ chối nếu áp dụng quy tắc giá phải lớn hơn 0 | Not Run    |
| TC_UI_01      | Giao diện | Kiểm tra thanh điều hướng                 | Positive  | 1. Mở trang chủ. 2. Quan sát menu                                  | Trang chủ PhoneStore  | Menu hiển thị đúng                                      | Not Run    |
| TC_UI_02      | Giao diện | Kiểm tra giao diện trên Chrome            | Positive  | 1. Mở website bằng Chrome. 2. Quan sát giao diện                   | Google Chrome         | Giao diện hiển thị bình thường                          | Not Run    |

## 3. QUY ƯỚC TRẠNG THÁI

- **Pass:** Đã thực hiện kiểm thử và kết quả đúng như mong đợi.
- **Fail:** Đã thực hiện kiểm thử nhưng kết quả không đúng.
- **Not Run:** Chưa thực hiện kiểm thử.

## 4. KẾT LUẬN

Bộ Test Case tập trung kiểm thử hoạt động của website PhoneStore, khả năng kết nối SQL Server, truy vấn dữ liệu sản phẩm và hiển thị giao diện.

Các chức năng chưa được triển khai sẽ được bổ sung Test Case khi có mã nguồn tương ứng.
