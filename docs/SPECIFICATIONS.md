# ĐẶC TẢ NGHIỆP VỤ WEBSITE PHONESTORE (SPECIFICATIONS)

## 1. THÔNG TIN DỰ ÁN

- **Tên đề tài:** PhoneStore - Website bán điện thoại trực tuyến.
- **Ngôn ngữ lập trình:** Java 17.
- **Framework:** Spring Boot 3.3.5.
- **Database:** Microsoft SQL Server.
- **ORM:** Spring Data JPA, Hibernate.
- **Frontend:** HTML, CSS.
- **Build Tool:** Maven.
- **URL chạy local:** http://localhost:8081

### Mục tiêu dự án

Xây dựng website bán điện thoại trực tuyến, cho phép người dùng xem danh sách điện thoại, tìm hiểu thông tin sản phẩm và lựa chọn sản phẩm muốn mua.

Hệ thống sử dụng SQL Server để lưu trữ thông tin sản phẩm.

## 2. ĐỐI TƯỢNG SỬ DỤNG

- **Khách hàng:** Truy cập website, xem danh sách sản phẩm và thông tin điện thoại.
- **Quản trị viên:** Quản lý dữ liệu sản phẩm trong hệ thống (nếu chức năng quản trị được triển khai).

## 3. QUY TẮC NGHIỆP VỤ (BUSINESS RULES)

### 3.1. Hiển thị sản phẩm

- Hệ thống lấy danh sách sản phẩm từ database SQL Server.
- Mỗi sản phẩm gồm các thông tin:
  - ID: Mã sản phẩm.
  - Name: Tên sản phẩm.
  - Price: Giá bán.
  - Image: Đường dẫn hình ảnh.
  - Description: Mô tả sản phẩm.
  - Category: Danh mục sản phẩm.
  - Quantity: Số lượng tồn kho.
- Nếu database không có sản phẩm, hiển thị thông báo: "Hiện chưa có sản phẩm nào!".

### 3.2. Quản lý sản phẩm (CRUD)

**Thêm sản phẩm:**

- Tên sản phẩm là bắt buộc.
- Giá bán phải lớn hơn 0.
- Số lượng phải lớn hơn hoặc bằng 0.
- Mã sản phẩm được tạo tự động.

**Cập nhật sản phẩm:**

- Cho phép cập nhật thông tin sản phẩm.
- Dữ liệu sau khi cập nhật phải được lưu vào SQL Server.

**Xóa sản phẩm:**

- Cho phép xóa sản phẩm theo ID.
- Cần xác nhận trước khi xóa.

**Xem sản phẩm:**

- Hiển thị thông tin sản phẩm từ database.
- Không hiển thị sản phẩm đã bị xóa.

_Lưu ý: Các chức năng CRUD cần được kiểm thử khi đã được triển khai._

## 4. YÊU CẦU GIAO DIỆN

- Giao diện đơn giản, dễ sử dụng.
- Màu sắc chủ đạo: xanh dương và trắng.
- Có thanh điều hướng.
- Có banner giới thiệu cửa hàng.
- Có khu vực hiển thị sản phẩm nổi bật.
- Hình ảnh sản phẩm phải hiển thị đúng.
- Giao diện tương thích với trình duyệt Google Chrome.

## 5. YÊU CẦU HỆ THỐNG

- Website phải khởi động thành công.
- Kết nối được SQL Server.
- Truy vấn dữ liệu sản phẩm chính xác.
- Không xảy ra lỗi khi database chưa có dữ liệu.
- Không xảy ra lỗi khi truy cập trang chủ.
- Các thao tác dữ liệu phải được xử lý an toàn.

## 6. CẤU TRÚC DỮ LIỆU

### Bảng Products

| Trường      | Kiểu dữ liệu  | Ý nghĩa          |
| ----------- | ------------- | ---------------- |
| id          | BIGINT        | Khóa chính       |
| name        | NVARCHAR(255) | Tên sản phẩm     |
| price       | DECIMAL(18,2) | Giá bán          |
| image       | NVARCHAR(500) | Hình ảnh         |
| description | NVARCHAR(MAX) | Mô tả            |
| category    | NVARCHAR(100) | Danh mục         |
| quantity    | INT           | Số lượng tồn kho |

## 7. PHẠM VI KIỂM THỬ

- Kiểm thử khởi động ứng dụng.
- Kiểm thử kết nối SQL Server.
- Kiểm thử truy vấn danh sách sản phẩm.
- Kiểm thử hiển thị thông tin sản phẩm.
- Kiểm thử trường hợp database không có sản phẩm.
- Kiểm thử các chức năng thêm, sửa, xóa nếu đã được triển khai.
- Kiểm thử giao diện trên trình duyệt.

## 8. KẾT QUẢ MONG ĐỢI

Website PhoneStore hoạt động ổn định trên môi trường local, kết nối thành công với SQL Server và hiển thị chính xác dữ liệu sản phẩm từ database.
