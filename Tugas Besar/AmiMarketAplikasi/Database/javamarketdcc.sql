-- phpMyAdmin SQL Dump
-- version 2.11.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 23, 2013 at 12:30 AM
-- Server version: 5.0.45
-- PHP Version: 5.2.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `javamarketdcc`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `idbarang` int(11) NOT NULL auto_increment,
  `kdbarang` varchar(11) NOT NULL,
  `nmbarang` varchar(50) NOT NULL,
  `satuan` varchar(30) NOT NULL,
  `stok` int(4) NOT NULL,
  `harga` int(15) NOT NULL,
  PRIMARY KEY  (`idbarang`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`idbarang`, `kdbarang`, `nmbarang`, `satuan`, `stok`, `harga`) VALUES
(7, 'B-1', 'LCD Monitor', 'Pcs', 26, 5555),
(9, 'B-2', 'Mouse', 'Pcs', 38, 25000),
(10, 'B-3', 'Keyboard', 'Pcs', 84, 5000);

-- --------------------------------------------------------

--
-- Table structure for table `beli`
--

CREATE TABLE `beli` (
  `idbeli` int(11) NOT NULL auto_increment,
  `nonota` varchar(20) NOT NULL,
  `tgl` date NOT NULL,
  `nm_pembeli` varchar(50) NOT NULL,
  `total` int(20) NOT NULL,
  `bayar` int(20) NOT NULL,
  `kembali` int(20) NOT NULL,
  PRIMARY KEY  (`idbeli`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `beli`
--

INSERT INTO `beli` (`idbeli`, `nonota`, `tgl`, `nm_pembeli`, `total`, `bayar`, `kembali`) VALUES
(1, 'N-1', '2013-03-23', 'fdsfs', 30555, 50000, 19445),
(2, 'N-2', '2013-03-23', 'ami', 60000, 70000, 10000),
(3, 'N-3', '2013-03-23', 'Ozi', 36110, 50000, 13890),
(4, 'N-4', '2013-07-03', 'fdfs', 30000, 60000, 30000),
(5, 'N-5', '2013-07-03', 'rizal', 80000, 100000, 20000),
(6, 'N-6', '2013-07-16', 'dgrtr', 25000, 50000, 25000);

-- --------------------------------------------------------

--
-- Table structure for table `detailbeli`
--

CREATE TABLE `detailbeli` (
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
('N-1', 'B-1', 'LCD Monitor', 5555, 1, 5555),
('N-1', 'B-2', 'Mouse', 25000, 1, 25000),
('N-2', 'B-2', 'Mouse', 25000, 2, 50000),
('N-2', 'B-3', 'Keyboard', 5000, 2, 10000),
('N-3', 'B-1', 'LCD Monitor', 5555, 2, 11110),
('N-3', 'B-2', 'Mouse', 25000, 1, 25000),
('N-4', 'B-2', 'Mouse', 25000, 1, 25000),
('N-4', 'B-3', 'Keyboard', 5000, 1, 5000),
('N-5', 'B-2', 'Mouse', 25000, 3, 75000),
('N-5', 'B-3', 'Keyboard', 5000, 1, 5000),
('N-6', 'B-2', 'Mouse', 25000, 1, 25000),
('N-7', 'B-2', 'Mouse', 25000, 1, 25000),
('N-7', 'B-3', 'Keyboard', 5000, 2, 10000);

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `idpengguna` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `hakakses` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`idpengguna`, `username`, `password`, `hakakses`) VALUES
(24, 'admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', 'Administrator');
