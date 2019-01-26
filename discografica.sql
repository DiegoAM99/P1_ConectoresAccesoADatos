-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-01-2019 a las 15:32:04
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `discografica`
--


CREATE DATABASE IF NOT EXISTS `discografica`;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `album`
--

CREATE TABLE IF NOT EXISTS `album` (
  `id` int(115) PRIMARY KEY,
  `Autor` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `anno_publicacion` year(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `album`
--

INSERT INTO `album` (`id`, `Autor`, `anno_publicacion`) VALUES
(1, 'Aitana Ocaña', 2018),
(2, 'Ana War', 2019);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cancion`
--

CREATE TABLE IF NOT EXISTS `cancion` (
  `Titulo` varchar(115) NOT NULL,
  `Duracion` varchar(115) NOT NULL,
  `Letras` varchar(115) NOT NULL,
  `id_album` int(120)  UNIQUE KEY
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cancion`
--

INSERT INTO `cancion` (`Titulo`, `Duracion`, `Letras`, `id_album`) VALUES
('Vas a Quedarte', '4:00', '\"Vas a quedarte...\"', 1),
('Bajito', '2:58', '\"Asi bajito....\"', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cancion`
--
ALTER TABLE `cancion`
ADD UNIQUE KEY `id` (`id_album`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
