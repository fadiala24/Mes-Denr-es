-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 03 fév. 2022 à 22:59
-- Version du serveur : 10.4.20-MariaDB
-- Version de PHP : 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `api_denree`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

CREATE TABLE `administrateur` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `etat` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `supprimer` bit(1) DEFAULT NULL,
  `telephone` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `administrateur`
--

INSERT INTO `administrateur` (`id`, `email`, `etat`, `login`, `nom`, `password`, `prenom`, `supprimer`, `telephone`) VALUES
(1, 'fatou@gmail.com', 'ACTIVER', NULL, 'Sidibe', 'azertii', 'Fatou', NULL, 2563277),
(2, 'fatouma@gmail.com', 'ACTIVER', NULL, 'Sidibe', 'azertye', 'Fatouma', NULL, 256233277),
(3, 'fatoumata@gmail.com', 'ACTIVER', NULL, 'Sidibe', 'azert', 'Fatoumata', NULL, 25665377),
(4, 'fanta@gmail.com', 'ACTIVER', NULL, 'Sidibe', 'QWERTY', 'Fanta', NULL, 2566598),
(5, 'fadj@gmail.com', 'ACTIVER', NULL, 'Sidibe', 'Uvernet', 'Fadj', NULL, 2554328),
(6, 'fadiala@gmail.com', 'ACTIVER', NULL, 'Traore', 'Utranet', 'Fadiala', NULL, 8994328);

-- --------------------------------------------------------

--
-- Structure de la table `boutiques`
--

CREATE TABLE `boutiques` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `quartier` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `boutiquier_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `boutiques`
--

INSERT INTO `boutiques` (`id`, `adresse`, `nom`, `photo`, `quartier`, `ville`, `boutiquier_id`) VALUES
(1, 'Commune II', 'Simpara', 'photo1', 'Sebenikoro', 'Bamako', NULL),
(2, 'Commune III', 'Mille Merveille', 'photo2', 'Hamdalaye', 'Segou', NULL),
(3, 'Commune IV', 'Millette', 'photo3', 'sebenikoro', 'Bamako', NULL),
(4, 'Commune VII', 'Millet', 'photo3', 'Sebougou', 'Kayes', NULL),
(5, 'Commune VII', 'Millet', 'photo4', 'Sabalibougou', 'Bamako', NULL),
(6, 'Commune VI', 'Riz Brizure', 'photo5', 'Sabalibougou', 'Bamako', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `boutiques_administrateurs`
--

CREATE TABLE `boutiques_administrateurs` (
  `boutiques_id` bigint(20) NOT NULL,
  `administrateurs_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `boutiquier`
--

CREATE TABLE `boutiquier` (
  `id` bigint(20) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` int(11) NOT NULL,
  `produits_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `produits`
--

CREATE TABLE `produits` (
  `id` bigint(20) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `photos` varchar(255) DEFAULT NULL,
  `prix_unitaire` varchar(255) DEFAULT NULL,
  `quantite` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `produits`
--

INSERT INTO `produits` (`id`, `category`, `nom`, `photos`, `prix_unitaire`, `quantite`) VALUES
(1, 'RIZ', 'brisé', NULL, '3000FCa', '12KG'),
(2, 'RIZ', 'Rouge', NULL, '2000FCa', '14KG'),
(3, 'Mil', 'Rougeur', NULL, '1000FCa', '18KG'),
(4, 'Mil', 'Noir', NULL, '1500FCa', '28KG'),
(5, 'Haricot', 'Niger', NULL, '2500FCa', '48KG');

-- --------------------------------------------------------

--
-- Structure de la table `produit_boutique`
--

CREATE TABLE `produit_boutique` (
  `id` bigint(20) NOT NULL,
  `boutiques_id` bigint(20) DEFAULT NULL,
  `produits_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `boutiques`
--
ALTER TABLE `boutiques`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6ekh2ig6atqt4grk4a9ba3c1k` (`boutiquier_id`);

--
-- Index pour la table `boutiques_administrateurs`
--
ALTER TABLE `boutiques_administrateurs`
  ADD KEY `FKth0v05vdhl69q4m53py76m3bu` (`administrateurs_id`),
  ADD KEY `FK5oyumvq1ohv3m2jvvi7jvtw7v` (`boutiques_id`);

--
-- Index pour la table `boutiquier`
--
ALTER TABLE `boutiquier`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK66vp66628v40dbhk1hb9v3kbg` (`produits_id`);

--
-- Index pour la table `produits`
--
ALTER TABLE `produits`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `produit_boutique`
--
ALTER TABLE `produit_boutique`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKk95i1bijlotpl8ng1j3rh3pk1` (`boutiques_id`),
  ADD KEY `FK2jyp0piocwune401wvwdovofl` (`produits_id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `administrateur`
--
ALTER TABLE `administrateur`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `boutiques`
--
ALTER TABLE `boutiques`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `boutiquier`
--
ALTER TABLE `boutiquier`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `produits`
--
ALTER TABLE `produits`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `produit_boutique`
--
ALTER TABLE `produit_boutique`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
