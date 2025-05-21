-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2025 at 10:24 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `barangay`
--

-- --------------------------------------------------------

--
-- Table structure for table `documents`
--

CREATE TABLE `documents` (
  `document_id` int(11) NOT NULL,
  `document_name` varchar(255) NOT NULL,
  `description` text DEFAULT NULL,
  `fee` decimal(10,2) DEFAULT 0.00
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `documents`
--

INSERT INTO `documents` (`document_id`, `document_name`, `description`, `fee`) VALUES
(1, 'Barangay Indigency', 'Certification for individuals with insufficient income or financial need.', 0.00),
(2, 'Barangay Residency', 'Proof of residency in the barangay for various legal and administrative purposes.', 0.00),
(3, 'Barangay Clearance', 'Clearance issued by the barangay for employment, travel, or legal purposes.', 50.00),
(4, 'Barangay Senior', 'Document for senior citizens to avail benefits and discounts.', 0.00),
(5, 'Barangay Solo Parent', 'Certification for solo parents to access welfare benefits.', 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `document_requests`
--

CREATE TABLE `document_requests` (
  `request_id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `resident_id` int(11) DEFAULT NULL,
  `document_id` int(11) NOT NULL,
  `purpose` varchar(255) NOT NULL,
  `request_date` datetime DEFAULT current_timestamp(),
  `status` enum('Pending','Approved','Rejected','Issued') DEFAULT 'Pending',
  `issued_by` int(11) DEFAULT NULL,
  `date_issued` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `document_requests`
--

INSERT INTO `document_requests` (`request_id`, `user_id`, `resident_id`, `document_id`, `purpose`, `request_date`, `status`, `issued_by`, `date_issued`) VALUES
(1, NULL, 1, 2, 'Employment', '2025-05-21 14:57:44', 'Pending', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `log_id` int(11) NOT NULL,
  `log_timestamp` datetime NOT NULL,
  `log_event` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  `log_description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `residents`
--

CREATE TABLE `residents` (
  `resident_id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `middle_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(255) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` enum('Male','Female','Other') NOT NULL,
  `civil_status` enum('Single','Married','Widowed','Divorced') NOT NULL,
  `contact_number` varchar(50) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `purok` varchar(100) DEFAULT NULL,
  `street_address` varchar(255) DEFAULT NULL,
  `registration_date` datetime DEFAULT current_timestamp(),
  `status` enum('Active','Inactive','Deceased') DEFAULT 'Active',
  `image_path` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `residents`
--

INSERT INTO `residents` (`resident_id`, `first_name`, `middle_name`, `last_name`, `date_of_birth`, `gender`, `civil_status`, `contact_number`, `email`, `purok`, `street_address`, `registration_date`, `status`, `image_path`) VALUES
(1, 'Juan', 'D.', 'Cruz', '1990-05-12', 'Male', 'Single', '09171234567', 'juan.cruz@example.com', 'Purok 1', 'Sitio Uno, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(2, 'Maria', 'A.', 'Lopez', '1985-08-24', 'Female', 'Married', '09181234567', 'maria.lopez@example.com', 'Purok 2', 'Sitio Dos, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(3, 'Jose', 'B.', 'Reyes', '1978-11-03', 'Male', 'Married', '09201234567', 'jose.reyes@example.com', 'Purok 3', 'Zone 3, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(4, 'Ana', NULL, 'Santos', '1992-02-14', 'Female', 'Single', '09211234567', 'ana.santos@example.com', 'Purok 4', 'Zone 4, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(5, 'Pedro', 'C.', 'Dela Cruz', '1980-07-30', 'Male', 'Married', '09231234567', 'pedro.dc@example.com', 'Purok 5', 'Sitio Tres, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(6, 'Luisa', 'E.', 'Fernandez', '1995-04-21', 'Female', 'Single', '09161234567', 'luisa.fernandez@example.com', 'Purok 6', 'Sitio Cuatro, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(7, 'Carlos', NULL, 'Garcia', '1989-09-09', 'Male', 'Widowed', '09181237654', 'carlos.garcia@example.com', 'Purok 1', 'Sitio Uno, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(8, 'Rosa', 'M.', 'Mendoza', '1991-12-12', 'Female', 'Single', '09351234567', 'rosa.mendoza@example.com', 'Purok 2', 'Sitio Dos, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(9, 'Ernesto', NULL, 'Torres', '1975-03-01', 'Male', 'Divorced', '09361234567', 'ernesto.torres@example.com', 'Purok 3', 'Zone 3, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(10, 'Isabel', 'F.', 'Ramos', '1987-10-17', 'Female', 'Married', '09371234567', 'isabel.ramos@example.com', 'Purok 4', 'Zone 4, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(11, 'Ricardo', 'G.', 'Villanueva', '1993-01-05', 'Male', 'Single', '09381234567', 'ricardo.v@example.com', 'Purok 5', 'Sitio Tres, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(12, 'Nina', 'H.', 'Aguilar', '1996-06-06', 'Female', 'Single', '09401234567', 'nina.aguilar@example.com', 'Purok 6', 'Sitio Cuatro, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(13, 'Leo', 'I.', 'Domingo', '1982-04-04', 'Male', 'Married', '09411234567', 'leo.domingo@example.com', 'Purok 1', 'Sitio Uno, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(14, 'Grace', NULL, 'Navarro', '1997-07-07', 'Female', 'Single', '09421234567', 'grace.navarro@example.com', 'Purok 2', 'Sitio Dos, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(15, 'Miguel', 'J.', 'Salazar', '1984-08-08', 'Male', 'Married', '09431234567', 'miguel.salazar@example.com', 'Purok 3', 'Zone 3, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(16, 'Clarissa', NULL, 'Abad', '1999-09-09', 'Female', 'Single', '09441234567', 'clarissa.abad@example.com', 'Purok 4', 'Zone 4, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(17, 'Oscar', 'K.', 'Bonifacio', '1970-10-10', 'Male', 'Widowed', '09451234567', 'oscar.bonifacio@example.com', 'Purok 5', 'Sitio Tres, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(18, 'Fatima', 'L.', 'Galvez', '1983-11-11', 'Female', 'Married', '09461234567', 'fatima.galvez@example.com', 'Purok 6', 'Sitio Cuatro, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(19, 'Andres', NULL, 'Del Rosario', '1998-12-12', 'Male', 'Single', '09471234567', 'andres.dr@example.com', 'Purok 1', 'Sitio Uno, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL),
(20, 'Bianca', 'M.', 'Flores', '1994-03-03', 'Female', 'Single', '09481234567', 'bianca.flores@example.com', 'Purok 2', 'Sitio Dos, Brgy. Uno', '2025-05-21 13:48:13', 'Active', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `role` enum('Admin','User') NOT NULL,
  `password` varchar(255) NOT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  `status` enum('Active','Inactive') DEFAULT 'Active'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `first_name`, `last_name`, `email`, `username`, `role`, `password`, `image_path`, `status`) VALUES
(1, 'Ahlde', 'Geonzon', 'ahldegeonzon30@gmail.com', 'ahlde', 'Admin', '0342a32dd9469b371fd499c3ba33be823896040ed898de28b0141d0399d7a164', NULL, 'Active'),
(2, 'Rodeliza', 'La Rosa', 'rode@gmail.com', 'rode', 'User', '0342a32dd9469b371fd499c3ba33be823896040ed898de28b0141d0399d7a164', NULL, 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `documents`
--
ALTER TABLE `documents`
  ADD PRIMARY KEY (`document_id`);

--
-- Indexes for table `document_requests`
--
ALTER TABLE `document_requests`
  ADD PRIMARY KEY (`request_id`),
  ADD KEY `document_id` (`document_id`),
  ADD KEY `resident_id` (`resident_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `issued_by` (`issued_by`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `residents`
--
ALTER TABLE `residents`
  ADD PRIMARY KEY (`resident_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `documents`
--
ALTER TABLE `documents`
  MODIFY `document_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `document_requests`
--
ALTER TABLE `document_requests`
  MODIFY `request_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `residents`
--
ALTER TABLE `residents`
  MODIFY `resident_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `document_requests`
--
ALTER TABLE `document_requests`
  ADD CONSTRAINT `document_requests_ibfk_1` FOREIGN KEY (`document_id`) REFERENCES `documents` (`document_id`),
  ADD CONSTRAINT `document_requests_ibfk_2` FOREIGN KEY (`resident_id`) REFERENCES `residents` (`resident_id`),
  ADD CONSTRAINT `document_requests_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
  ADD CONSTRAINT `document_requests_ibfk_4` FOREIGN KEY (`issued_by`) REFERENCES `users` (`user_id`);

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
