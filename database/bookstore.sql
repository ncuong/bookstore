-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2016 at 02:38 AM
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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

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
-- Table structure for table `posts`
--

CREATE TABLE IF NOT EXISTS `posts` (
  `POST_ID` int(10) unsigned NOT NULL,
  `POST_TITLE` varchar(200) DEFAULT NULL,
  `POST_SORT_CONTENT` varchar(200) DEFAULT NULL,
  `POST_CONTENT` text,
  `DATE_MODIFIED` date DEFAULT NULL,
  `POST_CATEGORY_ID` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `posts`
--

INSERT INTO `posts` (`POST_ID`, `POST_TITLE`, `POST_SORT_CONTENT`, `POST_CONTENT`, `DATE_MODIFIED`, `POST_CATEGORY_ID`) VALUES
(1, 'Truyện thứ 1', 'Nội dung ngắn gọn truyện 1', '<p>Nội dung truyện thứ nhất</p>', NULL, 1),
(2, 'Truyện thứ 2', NULL, 'Nội dung truyện thứ 2.', '2016-05-08', 1),
(3, 'Tiêu đề truyện 3', 'f', '<p>fff</p>', NULL, 2),
(4, 'Vô va học tiểu học', NULL, '<p><strong>Khi c&ograve;n b&eacute; V&ocirc; va học chung lớp với Natasa.</strong></p>', NULL, 2),
(5, 'ff', 'ff', '<p>ff</p>', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `post_categories`
--

CREATE TABLE IF NOT EXISTS `post_categories` (
  `POST_CATEGORY_ID` int(10) unsigned NOT NULL,
  `POST_CATEGORY_NAME` varchar(200) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `post_categories`
--

INSERT INTO `post_categories` (`POST_CATEGORY_ID`, `POST_CATEGORY_NAME`) VALUES
(1, 'Việt Nam vô đối'),
(2, 'Truyện cười Vô va'),
(3, 'Truyện Trạng Quỳnh'),
(4, 'Lươm lặt');

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE IF NOT EXISTS `roles` (
  `ROLE_ID` int(10) unsigned NOT NULL,
  `ROLE_NAME` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`ROLE_ID`, `ROLE_NAME`) VALUES
(1, 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `USER_ID` int(10) unsigned NOT NULL,
  `FULL_NAME` varchar(150) DEFAULT NULL,
  `USER_NAME` varchar(50) DEFAULT NULL,
  `PASSWORD` varchar(512) DEFAULT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `ROLE_ID` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`USER_ID`, `FULL_NAME`, `USER_NAME`, `PASSWORD`, `EMAIL`, `ROLE_ID`) VALUES
(1, 'Cuong Nguyen', 'cuongnguyen', '123456', 'cuong_nguyen@hotmail.com', 1),
(2, 'Tai Bui Thi', 'taibt', '123456', 'taibt@gmail.com', 1);

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
-- Indexes for table `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`POST_ID`), ADD KEY `POST_CATEGORY_ID` (`POST_CATEGORY_ID`);

--
-- Indexes for table `post_categories`
--
ALTER TABLE `post_categories`
  ADD PRIMARY KEY (`POST_CATEGORY_ID`);

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
  MODIFY `BOOK_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `CATEGORY_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `posts`
--
ALTER TABLE `posts`
  MODIFY `POST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `post_categories`
--
ALTER TABLE `post_categories`
  MODIFY `POST_CATEGORY_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `ROLE_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `USER_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
ADD CONSTRAINT `books_ibfk_2` FOREIGN KEY (`CATEGORY_ID`) REFERENCES `categories` (`CATEGORY_ID`);

--
-- Constraints for table `posts`
--
ALTER TABLE `posts`
ADD CONSTRAINT `posts_ibfk_1` FOREIGN KEY (`POST_CATEGORY_ID`) REFERENCES `post_categories` (`POST_CATEGORY_ID`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `roles` (`ROLE_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
