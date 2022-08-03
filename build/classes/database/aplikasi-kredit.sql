-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 03, 2022 at 09:17 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aplikasi-kredit`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(100) NOT NULL,
  `jenis_barang` varchar(50) NOT NULL,
  `harga` int(100) DEFAULT NULL,
  `catatan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `jenis_barang`, `harga`, `catatan`) VALUES
(1, 'Uang', 'Uang', 1500, 'Uang banyak'),
(2, 'Motor', 'Barang', 50000000, 'motor');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `nik` int(50) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `alamat` text NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`nik`, `nama`, `no_telp`, `email`, `alamat`, `status`) VALUES
(12345678, 'Reihan Renaldi', '098765678', 'reihan@gmail.com', 'Jl. Lereng Indah', 'aktif'),
(87654321, 'Muhammad Janu', '09876545654', 'janu@gmail.com', 'Jl. Limo', 'aktif');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `NIK` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `no_telepon` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `alamat` text NOT NULL,
  `jabatan` varchar(100) NOT NULL,
  `status` varchar(50) NOT NULL DEFAULT 'aktif'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`NIK`, `nama`, `password`, `no_telepon`, `email`, `alamat`, `jabatan`, `status`) VALUES
('123456765', 'Muhammad Janu', '25d55ad283aa400af464c76d713c07ad', '0987656677', 'janu@gmail.com', 'Jl. Limo', 'karyawan', 'aktif'),
('12345678', 'Reihan Renaldi', '25d55ad283aa400af464c76d713c07ad', '09876545678', 'reihan@gmail.com', 'Jl. Lereng Indah', 'karyawan', 'aktif');

-- --------------------------------------------------------

--
-- Table structure for table `kredit`
--

CREATE TABLE `kredit` (
  `no_kontrak` varchar(100) NOT NULL,
  `customer` int(11) NOT NULL,
  `asset` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `tenor` varchar(50) NOT NULL,
  `jumlah` int(100) NOT NULL,
  `tanggal_kredit` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kredit`
--

INSERT INTO `kredit` (`no_kontrak`, `customer`, `asset`, `harga`, `tenor`, `jumlah`, `tanggal_kredit`) VALUES
('CODE001', 12345678, 2, 50000000, '5', 11000000, '2022-07-28'),
('CODE002', 87654321, 1, 1500, '12', 137, '2022-07-28'),
('CODE003', 12345678, 2, 50000000, '10', 5500000, '2022-07-28'),
('CODE004', 12345678, 2, 50000000, '20', 2750000, '2022-05-01');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` int(11) NOT NULL,
  `no_kontrak` varchar(50) NOT NULL,
  `angsuran` int(50) NOT NULL DEFAULT 0,
  `jumlah` int(50) NOT NULL,
  `denda` int(50) NOT NULL,
  `total` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `no_kontrak`, `angsuran`, `jumlah`, `denda`, `total`) VALUES
(1, 'CODE002', 1, 1000000, 200000, 50000000),
(2, 'CODE004', 1, 2750000, 92000, 2842000),
(3, 'CODE004', 2, 2750000, 63000, 2813000),
(4, 'CODE004', 3, 2750000, 33000, 2783000),
(5, 'CODE004', 4, 2750000, 2000, 2752000),
(6, 'CODE004', 5, 2750000, 2000, 2752000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `kredit`
--
ALTER TABLE `kredit`
  ADD PRIMARY KEY (`no_kontrak`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id_pembayaran` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
