# BỘ KỊCH BẢN KIỂM THỬ PHONESTORE (TEST CASES)

## 1. THÔNG TIN KIỂM THỬ

- **Dự án:** PhoneStore - Website bán điện thoại trực tuyến
- **Môi trường:** Localhost
- **URL:** http://localhost:8081
- **Framework:** Spring Boot 3.3.5
- **Database:** Microsoft SQL Server
- **Testing Framework:** JUnit 5
- **Mocking Framework:** Mockito
- **Build Tool:** Maven

## 2. BẢNG TEST CASE – WEBSITE VÀ DATABASE

| Test Case ID  | Chức năng | Mô tả ca kiểm thử                         | Loại test | Kết quả mong đợi                                   | Trạng thái |
| ------------- | --------- | ----------------------------------------- | --------- | -------------------------------------------------- | ---------- |
| TC_HOME_01    | Trang chủ | Truy cập trang chủ thành công             | Positive  | Trang chủ hiển thị thành công                      | Not Run    |
| TC_HOME_02    | Trang chủ | Truy cập trang chủ khi ứng dụng chưa chạy | Negative  | Trình duyệt thông báo không thể kết nối            | Not Run    |
| TC_DB_01      | Database  | Kết nối SQL Server thành công             | Positive  | Ứng dụng kết nối được PhoneStoreDB                 | Not Run    |
| TC_DB_02      | Database  | Kiểm tra dữ liệu bảng Products            | Positive  | Truy vấn hiển thị dữ liệu sản phẩm                 | Not Run    |
| TC_PRODUCT_01 | Sản phẩm  | Hiển thị danh sách sản phẩm               | Positive  | Các sản phẩm trong database được hiển thị          | Not Run    |
| TC_PRODUCT_02 | Sản phẩm  | Hiển thị tên sản phẩm                     | Positive  | Tên sản phẩm hiển thị chính xác                    | Not Run    |
| TC_PRODUCT_03 | Sản phẩm  | Hiển thị giá sản phẩm                     | Positive  | Giá hiển thị đúng định dạng                        | Not Run    |
| TC_PRODUCT_04 | Sản phẩm  | Hiển thị hình ảnh sản phẩm                | Positive  | Hình ảnh tải thành công                            | Not Run    |
| TC_PRODUCT_05 | Sản phẩm  | Database không có sản phẩm                | Negative  | Hiển thị thông báo chưa có sản phẩm                | Not Run    |
| TC_PRODUCT_06 | Sản phẩm  | Kiểm tra sản phẩm có giá bằng 0           | Negative  | Hệ thống từ chối nếu có quy tắc giá phải lớn hơn 0 | Not Run    |
| TC_UI_01      | Giao diện | Kiểm tra thanh điều hướng                 | Positive  | Menu hiển thị đúng                                 | Not Run    |
| TC_UI_02      | Giao diện | Kiểm tra giao diện trên Chrome            | Positive  | Giao diện hiển thị bình thường                     | Not Run    |

## 3. BẢNG TEST CASE – PRODUCT CONTROLLER

Các test case dưới đây mô tả phạm vi kiểm thử Controller. Cần đối chiếu với từng phương thức trong ProductControllerTest để xác định chính xác mã test và trạng thái riêng.

| Test Case ID     | Chức năng        | Mô tả ca kiểm thử                                  | Loại test         | Kết quả mong đợi                          | Trạng thái |
| ---------------- | ---------------- | -------------------------------------------------- | ----------------- | ----------------------------------------- | ---------- |
| TC_CONTROLLER_01 | Xem sản phẩm     | Kiểm tra phương thức hiển thị danh sách            | Positive          | Trả về view danh sách sản phẩm            | Pass\*     |
| TC_CONTROLLER_02 | Xem sản phẩm     | Kiểm tra dữ liệu sản phẩm được đưa vào Model       | Positive          | Model có thuộc tính products              | Pass\*     |
| TC_CONTROLLER_03 | Thêm sản phẩm    | Kiểm tra hiển thị form thêm sản phẩm               | Positive          | Trả về view form sản phẩm                 | Pass\*     |
| TC_CONTROLLER_04 | Thêm sản phẩm    | Kiểm tra xử lý thêm sản phẩm                       | Positive          | Gọi service thêm sản phẩm và chuyển hướng | Pass\*     |
| TC_CONTROLLER_05 | Sửa sản phẩm     | Kiểm tra hiển thị form sửa sản phẩm                | Positive          | Trả về form với thông tin sản phẩm        | Pass\*     |
| TC_CONTROLLER_06 | Sửa sản phẩm     | Kiểm tra cập nhật sản phẩm                         | Positive          | Gọi service cập nhật và chuyển hướng      | Pass\*     |
| TC_CONTROLLER_07 | Xóa sản phẩm     | Kiểm tra xử lý xóa sản phẩm                        | Positive          | Gọi service xóa và chuyển hướng           | Pass\*     |
| TC_CONTROLLER_08 | Tìm sản phẩm     | Kiểm tra trường hợp tìm thấy sản phẩm              | Positive          | Trả về sản phẩm tương ứng                 | Pass\*     |
| TC_CONTROLLER_09 | Tìm sản phẩm     | Kiểm tra trường hợp không tìm thấy sản phẩm        | Negative          | Xử lý trường hợp sản phẩm không tồn tại   | Pass\*     |
| TC_CONTROLLER_10 | Kiểm thử dữ liệu | Kiểm tra nhiều bộ dữ liệu hoặc trường hợp ngoại lệ | Positive/Negative | Kết quả phù hợp với từng dữ liệu kiểm thử | Pass\*     |

**Lưu ý:** Dấu `*` chỉ kết quả tổng thể của ProductControllerTest đã chạy 10 test thành công. Các mô tả trên là nhóm nội dung dự kiến để đối chiếu, không phải xác nhận rằng từng dòng đã khớp chính xác với một phương thức test cụ thể. Chỉ giữ trạng thái Pass cho từng dòng sau khi kiểm tra mã nguồn test tương ứng.

## 4. KẾT QUẢ CHẠY MAVEN TEST

Kết quả được ghi nhận từ lần chạy Maven gần nhất:

| Test Class            | Tests Run | Failures | Errors | Skipped |
| --------------------- | --------: | -------: | -----: | ------: |
| ProductControllerTest |        10 |        0 |      0 |       0 |
| SampleControllerTest  |         2 |        0 |      0 |       0 |
| LoginTest             |         1 |        0 |      0 |       1 |
| **Tổng cộng**         |    **13** |    **0** |  **0** |   **1** |

**Kết quả:** BUILD SUCCESS.

## 5. QUY ƯỚC TRẠNG THÁI

- **Pass:** Đã thực hiện kiểm thử và kết quả đúng như mong đợi.
- **Fail:** Đã thực hiện kiểm thử nhưng kết quả không đúng.
- **Not Run:** Chưa thực hiện kiểm thử.
- **Skipped:** Bài kiểm thử bị bỏ qua, không được tính là Pass.

## 6. KẾT LUẬN

Bộ Test Case PhoneStore bao gồm kiểm thử trang chủ, database, hiển thị sản phẩm, giao diện và chức năng ProductController.

Kết quả Maven Test gần nhất ghi nhận 13 test, trong đó 0 Failures, 0 Errors và 1 Skipped.

Các test case thủ công cần tiếp tục được thực hiện và cập nhật trạng thái. Các chức năng chưa được triển khai sẽ được bổ sung test case khi có mã nguồn tương ứng.
