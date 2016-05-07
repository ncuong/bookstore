-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 07, 2016 at 03:52 PM
-- Server version: 5.6.24
-- PHP Version: 5.5.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE IF NOT EXISTS `books` (
  `BOOK_ID` int(10) unsigned NOT NULL,
  `BOOK_NAME` varchar(200) DEFAULT NULL,
  `AUTHER` varchar(100) DEFAULT NULL,
  `SORT_DESCRIPTION` varchar(200) DEFAULT NULL,
  `FULL_DESCRIPTION` text,
  `IMAGE_PATH` varchar(512) DEFAULT NULL,
  `PRICE` int(10) unsigned DEFAULT NULL,
  `CATEGORY_ID` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`BOOK_ID`, `BOOK_NAME`, `AUTHER`, `SORT_DESCRIPTION`, `FULL_DESCRIPTION`, `IMAGE_PATH`, `PRICE`, `CATEGORY_ID`) VALUES
(1, 'Cô gái đến từ hôm qua', 'Nguyễn Nhật Ánh', NULL, NULL, NULL, NULL, 4),
(2, 'Mắt biếc', 'Từ Kế Tường', NULL, NULL, NULL, NULL, 4),
(3, 'Giải tích nâng cao 12', 'Nguyễn Cường', NULL, NULL, NULL, NULL, 1),
(4, 'Toán giải tích 11', 'Hứa Thị Quýt', NULL, NULL, NULL, NULL, 3),
(5, 'Còn chút gì để nhớ', 'Nguyễn Nhật Ánh', NULL, NULL, NULL, NULL, 4),
(7, 'Tôi thấy hoa vàng trên cỏ xanh', 'Nguyễn Nhật Ánh', 'Truyện ngắn dành cho thiếu nhi', 'Chi tiết truyện', 'path', 50000, 4),
(8, 'Đi qua hoa cúc', 'Nguyễn Nhật Ánh', 'Tóm tắt đi qua hoa cúc', 'Chi tiết truyện đi qua hoa cúc', 'path', 50000, 4);

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE IF NOT EXISTS `categories` (
  `CATEGORY_ID` int(10) unsigned NOT NULL,
  `CATEGORY_NAME` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`CATEGORY_ID`, `CATEGORY_NAME`) VALUES
(1, 'Toán'),
(2, 'Vật lý'),
(3, 'Hóa học'),
(4, 'Văn học'),
(5, 'Lịch sử');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE IF NOT EXISTS `orders` (
  `ORDER_ID` int(10) unsigned NOT NULL,
  `CLIENT_NAME` varchar(50) DEFAULT NULL,
  `CLIENT_ADDRESS` varchar(200) DEFAULT NULL,
  `CLIENT_PHONE` varchar(20) DEFAULT NULL,
  `CLIENT_MAIL` varchar(100) DEFAULT NULL,
  `DATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `order_detail`
--

CREATE TABLE IF NOT EXISTS `order_detail` (
  `ORDER_DETAIL_ID` int(10) unsigned NOT NULL,
  `BOOK_ID` int(10) unsigned DEFAULT NULL,
  `ORDER_ID` int(10) unsigned DEFAULT NULL,
  `QUANTITY` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
  `ROLE_ID` int(10) unsigned NOT NULL,
  `ROLE_NAME` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `USER_ID` int(10) unsigned NOT NULL,
  `USER_NAME` varchar(50) DEFAULT NULL,
  `USER_PASSWORD` varchar(512) DEFAULT NULL,
  `USER_EMAIL` varchar(100) DEFAULT NULL,
  `DATE_OF_BIRTH` date DEFAULT NULL,
  `ROLE_ID` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`BOOK_ID`), ADD KEY `CATEGORY_ID` (`CATEGORY_ID`), ADD KEY `AUTHER_ID` (`AUTHER`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`CATEGORY_ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ORDER_ID`);

--
-- Indexes for table `order_detail`
--
ALTER TABLE `order_detail`
  ADD PRIMARY KEY (`ORDER_DETAIL_ID`), ADD KEY `BOOK_ID` (`BOOK_ID`), ADD KEY `ORDER_ID` (`ORDER_ID`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`ROLE_ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`USER_ID`), ADD KEY `ROLE_ID` (`ROLE_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `BOOK_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `CATEGORY_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `order_detail`
--
ALTER TABLE `order_detail`
  MODIFY `ORDER_DETAIL_ID` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `ROLE_ID` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `USER_ID` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
ADD CONSTRAINT `books_ibfk_2` FOREIGN KEY (`CATEGORY_ID`) REFERENCES `categories` (`CATEGORY_ID`);

--
-- Constraints for table `order_detail`
--
ALTER TABLE `order_detail`
ADD CONSTRAINT `order_detail_ibfk_1` FOREIGN KEY (`BOOK_ID`) REFERENCES `books` (`BOOK_ID`),
ADD CONSTRAINT `order_detail_ibfk_2` FOREIGN KEY (`ORDER_ID`) REFERENCES `orders` (`ORDER_ID`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ROLE_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
