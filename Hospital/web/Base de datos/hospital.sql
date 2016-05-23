--
-- Base de datos: `hospital`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `CodMedico` int(11) NOT NULL,
  `NomMedico` varchar(30) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Telefono` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`CodMedico`, `NomMedico`, `Telefono`) VALUES
(1, 'Fernández Padilla, Esther', 259785324),
(2, 'Galán Bazán, Ester María', 184456321),
(3, 'Guzmán Puyol, Estefanía', 182564789),
(4, 'Martín Jurado, Eva', 180478200),
(5, 'Moreno Blanco, Carlos', 191698745),
(6, 'jose', 12345678);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `CodPaciente` int(11) NOT NULL,
  `NomPaciente` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `Direccion` varchar(40) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Telefono` int(9) NOT NULL,
  `Diagnostico` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `Tratamiento` varchar(50) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `Medico` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`CodPaciente`, `NomPaciente`, `Direccion`, `Telefono`, `Diagnostico`, `Tratamiento`, `Medico`) VALUES
(1, 'juan perez', 'campanillas', 1234565, 'Dolor de ojos', 'Gotas', 6),
(2, 'josefo', 'Malaga Capital', 12366547, 'zika', 'Nose', 1),
(3, 'rgfwerf', 'frwfwerf', 12356, 'dfwerfwe', 'frefewrf', 1),
(4, 'vdcsdc', 'sfdfsds', 12003654, 'asdasd', 'sdasdee', 2),
(25, 'hkryuk', 'jetteyaaaaaaaaaaaa', 5562, 'fghrh', 'thrtu', 5),
(45, 'fghjsrh', 'gfdgs', 55666, 'fdgfdg', 'dfsf', 1),
(1236, 'Cano Cuenca, Margarita', 'Los minas', 145978123, 'Sarampion', 'Augmetine', 2),
(1237, 'Doña Enríquez, Adrián Manuel', 'Los alcarizzos', 145977863, 'Sinositis', 'Sinus', 1),
(2255, 'lorenso', 'yjjsf', 445569, 'hdghs', 'hgfdhg', 2),
(34343434, 'fdsfdsfdsafadsf', 'wqewqe', 56456, 'fdgdfgd', 'nvbnvbn', 6);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`CodMedico`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`CodPaciente`),
  ADD KEY `Medico` (`Medico`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `paciente_ibfk_1` FOREIGN KEY (`Medico`) REFERENCES `medico` (`CodMedico`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
