-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 03:57 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `upil`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(11) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kandidat`
--

CREATE TABLE `kandidat` (
  `no_kandidat` int(2) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `misi`
--

CREATE TABLE `misi` (
  `id_misi` int(3) NOT NULL,
  `no_kandidat` int(2) DEFAULT NULL,
  `teks_misi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pemilih`
--

CREATE TABLE `pemilih` (
  `nim` varchar(15) NOT NULL,
  `no_kandidat` int(2) DEFAULT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `visi`
--

CREATE TABLE `visi` (
  `id_visi` int(3) NOT NULL,
  `no_kandidat` int(2) DEFAULT NULL,
  `teks_visi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `kandidat`
--
ALTER TABLE `kandidat`
  ADD PRIMARY KEY (`no_kandidat`);

--
-- Indexes for table `misi`
--
ALTER TABLE `misi`
  ADD PRIMARY KEY (`id_misi`),
  ADD KEY `no_kandidat` (`no_kandidat`);

--
-- Indexes for table `pemilih`
--
ALTER TABLE `pemilih`
  ADD PRIMARY KEY (`nim`),
  ADD KEY `no_kandidat` (`no_kandidat`),
  ADD KEY `no_kandidat_2` (`no_kandidat`);

--
-- Indexes for table `visi`
--
ALTER TABLE `visi`
  ADD PRIMARY KEY (`id_visi`),
  ADD KEY `no_kandidat` (`no_kandidat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kandidat`
--
ALTER TABLE `kandidat`
  MODIFY `no_kandidat` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `misi`
--
ALTER TABLE `misi`
  MODIFY `id_misi` int(3) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `visi`
--
ALTER TABLE `visi`
  MODIFY `id_visi` int(3) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `misi`
--
ALTER TABLE `misi`
  ADD CONSTRAINT `misi_ibfk_1` FOREIGN KEY (`no_kandidat`) REFERENCES `kandidat` (`no_kandidat`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pemilih`
--
ALTER TABLE `pemilih`
  ADD CONSTRAINT `pemilih_ibfk_1` FOREIGN KEY (`no_kandidat`) REFERENCES `kandidat` (`no_kandidat`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `visi`
--
ALTER TABLE `visi`
  ADD CONSTRAINT `visi_ibfk_1` FOREIGN KEY (`no_kandidat`) REFERENCES `kandidat` (`no_kandidat`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
