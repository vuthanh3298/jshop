create database MOBILE_SHOP_MANAGEMENT;--  Quản lí bán điện thoại di động
use MOBILE_SHOP_MANAGEMENT;
-- bảng người dùng: bao gồm 2 loại tài khoản: ADMIN(ADMIN role =1, EMPLOYEE role =2) , USER role = 3
-- bảng phân quyền cho tài khoản
create table ROLE(
ROLE_ID int primary key,
ROLE_NAME varchar(100)
)
;
-- bảng người dùng: Admin, Nhân viên và người dùng
create table USER(
USER_ID varchar(30) primary key,--  mã nhân viên
POSITION varchar(100),-- chức vụ
NAME varchar(100), -- họ và tên
DOB timestamp, -- ngày tháng năm sinh
GENDER boolean, -- giới tính
ADDRESS varchar(255), -- địa chỉ
PHONE_NUMBER varchar(15), -- số điện thoại
EMAIL varchar(30), -- email
NOTE text, -- ghi chú

ROLE_ID int, -- là khóa ngoại tới bảng ROLE
FOREIGN KEY (ROLE_ID) REFERENCES ROLE(ROLE_ID)
)
;
-- Bảng sản phẩm
create table PRODUCT(
PRODUCT_ID varchar(30) primary key,--  mã hàng
NAME varchar(255),-- tên hàng
TYPE varchar(255), -- loại hàng
MANUFACTURER varchar(255), -- hãng sản xuất
UNIT int, -- đơn vị tính ( Cái/ Chục cái/ trăm cái)
WARRANTY_PERIOD timestamp, -- Thời gian bảo hành
INVENTORY int, -- Số lượng hàng tồn
DESCRIBED text, -- mô tả loại hàng
PRICE double -- giá
)
;
-- Bảng hàng đặt 
create table BOOK(
PRODUCT_ID varchar(30),--  mã hàng, là khóa ngoại tới bảng PRODUCT, khóa chính
USER_ID varchar(30), -- mã người đặt, là khóa ngoại tới bảng USER, khóa chính
TIME timestamp, -- thời gian đặt hàng, khóa chính
FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT(PRODUCT_ID),
FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID),
CONSTRAINT PK_BOOK PRIMARY KEY (PRODUCT_ID,USER_ID,TIME),

AMOUNT INT , -- số lượng
ADDRESS varchar(255), -- địa chỉ giao hàng
PAYMENT_METHODS varchar(255), -- Phương thức thanh toán
NOTE text -- ghi chú
)
;





-- giả lập dữ liệu 
-- bảng ROLE
INSERT INTO ROLE (ROLE_ID, ROLE_NAME) VALUES (1,'ADMIN');
INSERT INTO ROLE (ROLE_ID, ROLE_NAME) VALUES (2,'EMPLOYEE');
INSERT INTO ROLE (ROLE_ID, ROLE_NAME) VALUES (3,'USER');

-- bảng USER
INSERT INTO USER (USER_ID, POSITION, NAME, DOB, GENDER, ADDRESS, PHONE_NUMBER, EMAIL, NOTE, ROLE_ID ) 
VALUES ('T01','ADMIN', 'TRUNG QUANG', 01/01/2000, 1, 'TP. Hồ Chí Minh', 0123456789, 'trungquang123@gmail.com', '', 1);
INSERT INTO USER (USER_ID, POSITION, NAME, DOB, GENDER, ADDRESS, PHONE_NUMBER, EMAIL, NOTE, ROLE_ID ) 
VALUES ('T02','EMPLOYEE', 'QUANG TRUNG', 01/01/2002, 1, 'TP. Đà Lạt', 0987654321, 'quangtrung456@gmail.com', '', 2);
INSERT INTO USER (USER_ID, POSITION, NAME, DOB, GENDER, ADDRESS, PHONE_NUMBER, EMAIL, NOTE, ROLE_ID ) 
VALUES ('T03','USER', 'NGUYỄN VĂN A', 01/01/2003, 1, 'TP. Đà Nẵng', 0981234567, 'nguyenvana2003@gmail.com', '', 3);

-- bảng USER
INSERT INTO ROLE (USER_ID, POSITION, NAME, DOB, GENDER, ADDRESS, PHONE_NUMBER, EMAIL, NOTE, ROLE_ID ) 
VALUES (1,'ADMIN', 'TRUNG QUANG', 01/01/2000, 1, 'TP. Hồ Chí Minh', 0123456789, 'trungquang123@gmail.com', '', 1);
-- Bảng sản phẩm
create table PRODUCT(
PRODUCT_ID int primary key auto_increment,--  mã hàng
NAME varchar(255),-- tên hàng
TYPE varchar(255), -- loại hàng
MANUFACTURER varchar(255), -- hãng sản xuất
UNIT int, -- đơn vị tính ( Cái/ Chục cái/ trăm cái)
WARRANTY_PERIOD timestamp, -- Thời gian bảo hành
INVENTORY int, -- Số lượng hàng tồn
DESCRIBED text, -- mô tả loại hàng
PRICE double -- giá
)
;

-- bảng BOOK
INSERT INTO ROLE (PRODUCT_ID, USER_ID, TIME, AMOUNT, ADDRESS, ADDRESS, PAYMENT_METHODS, NOTE ) 
VALUES (1,'ADMIN', 'TRUNG QUANG', 01/01/2000, 1, 'TP. Hồ Chí Minh', 0123456789, 'trungquang123@gmail.com', '', 1);


PRODUCT_ID int,--  mã hàng, là khóa ngoại tới bảng PRODUCT, khóa chính
USER_ID int, -- mã người đặt, là khóa ngoại tới bảng USER, khóa chính
TIME timestamp, -- thời gian đặt hàng, khóa chính
FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT(PRODUCT_ID),
FOREIGN KEY (USER_ID) REFERENCES USER(USER_ID),
CONSTRAINT PK_BOOK PRIMARY KEY (PRODUCT_ID,USER_ID,TIME),

AMOUNT INT , -- số lượng
ADDRESS varchar(255), -- địa chỉ giao hàng
PAYMENT_METHODS varchar(255), -- Phương thức thanh toán
NOTE text -- ghi chú
