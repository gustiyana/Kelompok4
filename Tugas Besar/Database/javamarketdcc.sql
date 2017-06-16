-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 05, 2017 at 10:32 
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `javamarketdcc`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
  `idbarang` int(11) NOT NULL AUTO_INCREMENT,
  `kdbarang` varchar(11) NOT NULL,
  `nmbarang` varchar(50) NOT NULL,
  `satuan` varchar(30) NOT NULL,
  `stok` int(4) NOT NULL,
  `harga` int(15) NOT NULL,
  PRIMARY KEY (`idbarang`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`idbarang`, `kdbarang`, `nmbarang`, `satuan`, `stok`, `harga`) VALUES
(7, 'B-1', 'LCD Monitor', 'Pcs', 0, 5555),
(9, 'B-2', 'Mouse', 'Pcs', 6, 25000),
(13, 'B-4', 'Charger', 'Box', 10, 50000);

-- --------------------------------------------------------

--
-- Table structure for table `beli`
--

CREATE TABLE IF NOT EXISTS `beli` (
  `idbeli` int(11) NOT NULL AUTO_INCREMENT,
  `nonota` varchar(20) NOT NULL,
  `tgl` date NOT NULL,
  `total` int(20) NOT NULL,
  `bayar` int(20) NOT NULL,
  `kembali` int(20) NOT NULL,
  PRIMARY KEY (`idbeli`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=51 ;

--
-- Dumping data for table `beli`
--

INSERT INTO `beli` (`idbeli`, `nonota`, `tgl`, `total`, `bayar`, `kembali`) VALUES
(47, 'N-9', '2016-12-27', 5555, 10000, 4445),
(48, 'N-10', '2016-12-27', 11110, 20000, 8890),
(49, 'N-11', '2016-12-27', 25000, 30000, 5000),
(50, 'N-12', '2016-12-27', 36110, 40000, 3890);

-- --------------------------------------------------------

--
-- Table structure for table `detailbeli`
--

CREATE TABLE IF NOT EXISTS `detailbeli` (
  `nonota` varchar(20) NOT NULL,
  `kdbarang` varchar(20) NOT NULL,
  `nmbarang` varchar(50) NOT NULL,
  `harga` int(20) NOT NULL,
  `jml` int(5) NOT NULL,
  `total` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detailbeli`
--

INSERT INTO `detailbeli` (`nonota`, `kdbarang`, `nmbarang`, `harga`, `jml`, `total`) VALUES
('N-2', 'B-2', 'Mouse', 25000, 2, 50000),
('N-8', 'B-2', 'Mouse', 25000, 2, 50000),
('N-9', 'B-1', 'LCD Monitor', 5555, 1, 5555),
('N-10', 'B-1', 'LCD Monitor', 5555, 2, 11110),
('N-11', 'B-2', 'Mouse', 25000, 1, 25000),
('N-12', 'B-2', 'Mouse', 25000, 1, 25000),
('N-12', 'B-1', 'LCD Monitor', 5555, 2, 11110);

-- --------------------------------------------------------

--
-- Table structure for table `kasir`
--

CREATE TABLE IF NOT EXISTS `kasir` (
  `id_kasir` char(8) NOT NULL,
  `nama_kasir` varchar(30) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `alamat` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_kasir`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kasir`
--

INSERT INTO `kasir` (`id_kasir`, `nama_kasir`, `username`, `password`, `alamat`) VALUES
('101', 'Disca Amelia', 'disca', 'disca', 'Kuningan');

-- --------------------------------------------------------

--
-- Table structure for table `pemasok`
--

CREATE TABLE IF NOT EXISTS `pemasok` (
  `id_pemasok` char(8) NOT NULL,
  `nama_pemasok` varchar(15) DEFAULT NULL,
  `alamat_pemasok` varchar(15) DEFAULT NULL,
  `no_telepon` int(11) DEFAULT NULL,
  `nama_barang` varchar(20) DEFAULT NULL,
  `jumlah_barang` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_pemasok`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemasok`
--

INSERT INTO `pemasok` (`id_pemasok`, `nama_pemasok`, `alamat_pemasok`, `no_telepon`, `nama_barang`, `jumlah_barang`) VALUES
('101', 'Disca Amelia', 'Bandung', 2147483647, 'Komputer', 2),
('102', 'Meida Nilandari', 'Sukabumi', 2147483647, 'Magicom', 3),
('103', 'Inar Nilandari', 'Surabaya', 2147483647, 'Kipas Angin', 4);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
