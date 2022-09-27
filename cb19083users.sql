-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Jan 15, 2021 at 05:12 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cb19083`
--

-- --------------------------------------------------------

--
-- Table structure for table `cb19083users`
--

CREATE TABLE `cb19083users` (
  `cb19083id` int(11) NOT NULL,
  `cb19083name` text NOT NULL,
  `cb19083gender` text NOT NULL,
  `cb19083age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cb19083users`
--

INSERT INTO `cb19083users` (`cb19083id`, `cb19083name`, `cb19083gender`, `cb19083age`) VALUES
(1, 'Loga', 'M', 21),
(2, 'Siti', 'F', 17),
(3, 'Chong', 'M', 34),
(4, 'Malini', 'F', 12),
(5, 'Abu', 'M', 25),
(6, 'Ng', 'F', 31),
(7, 'Siva', 'M', 19);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
