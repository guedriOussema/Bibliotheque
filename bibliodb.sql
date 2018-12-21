-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: bibliodb
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `categorie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorie`
--

LOCK TABLES `categorie` WRITE;
/*!40000 ALTER TABLE `categorie` DISABLE KEYS */;
INSERT INTO `categorie` VALUES (1,'Art musique et cinéma'),(2,'Bandes dessinées'),(3,'Cuisine'),(4,'Dictionnaires Langues'),(5,'Droit & économie'),(6,'Sciences sociales'),(7,'Sciences Techniques Et Medecine'),(8,'Scolaire'),(9,'Sport loisirs et vie pratique');
/*!40000 ALTER TABLE `categorie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `client` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `auteur` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,NULL,'guedrioussemamath@gmail.com','Guedri','Oussema',11111111,'oussema','oussema');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `livre`
--

DROP TABLE IF EXISTS `livre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `livre` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `auteur` varchar(255) DEFAULT NULL,
  `categorie` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `nbre_dispo` int(11) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `prix` float NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livre`
--

LOCK TABLES `livre` WRITE;
/*!40000 ALTER TABLE `livre` DISABLE KEYS */;
INSERT INTO `livre` VALUES (1,'Philippe Thieyre','Art musique et cinéma','Rendre compte de l\'histoire du blues et de sa découverte toire ...',25,'image2.jpg',14,'Parcours blues : En 150 albums'),(3,'Gilbert Montagné, Isabelle Gaudon','Art musique et cinéma','«Je veux essayer d\'entrer dans les tout premiers instants de ma vie...»',25,'image4.jpg',14,'Au jardin de ma vie'),(4,'Dennis O\'Neil, Neal Adams, Bob Haney','Bandes dessinées','Le Joker, Double-Face, Man-Bat, le Professeur Milo...',NULL,'image5.jpg',14,'Batman la légende, Tome 2'),(5,'Ryosuke Takeuchi, Hikaru Miyoshi','Bandes dessinées','Soupçonné du meurtre du comte Drebber, Sherlock Holmes a été arrêté et incarcéré par Scotland Yard.',NULL,'image6.jpg',14,'Moriarty, tome 3'),(6,'Chris Sprouse, Arthur Adams, Alan Moore, Leah Moore','Bandes dessinées','Né sur l\'île d\'Attabar Teru en 1900, Tom Strong a toujours défendu les faibles, les opprimés et la justice.',25,'image7.jpg',14,'Tom Strong, Intégrale Tome 1'),(7,'Pavel Spiridonov','Cuisine','Connaissez-vous la cuisine russe ? Que trouve-t-on sur les tables de cet immense pays, qui commence aux frontières de l\'Europe et déroule ses forêts et ses steppes jusqu\'à l\'océan Pacifique ?',NULL,'image8.jpg',14,'La cuisine russe'),(8,'Marie-Laure Tombini','Cuisine','De délicieux biscuits et gâteaux et une méthode d\'apprentissage unique !',NULL,'image9.jpg',14,'Gâteaux de Noël'),(9,'Sylvie Aït-Ali','Cuisine','Redécouvrez les saveurs d\'autrefois à travers ces 200 recettes de nos grands-mères...',25,'image10.jpg',14,'200 recettes traditionnelles'),(10,'Jean-Loup Chiflet','Dictionnaires Langues','Ce sixième opus de la collection Mots & Cætera est consacré aux exceptions et aux particularités de la langue française.',25,'image11.jpg',14,'Les exceptions de la langue française: On adore les détester'),(11,'Mcfly, Carlito','Dictionnaires Langues','Aujourd\'hui, les mots ont une autre portée, un autre sens qu\'au siècle dernier, et nous avons décidé de leur enlever le costume fatigué de l\'Académie française pour les revêtir d\'un short et d\'une chemise aux motifs tropicaux. ',25,'image12.jpg',14,'Le dictionnaire moderne'),(12,'Raworth Kate','Droit & économie','Crises financières à répétition, inégalités extrêmes de revenus et d\'accès aux ressources, exploitation destructrice de l\'environnement...',25,'image13.jpg',14,'La Theorie du Donut'),(13,'Eric Ferré','Sport loisirs et vie pratique','Dans cet ouvrage figure tout ce que vous avez toujours voulu savoir sur le Stade Rennais (ou presque).',25,'image23.jpg',14,'Le meilleur du Stade rennais'),(14,'Jean-Pierre Ramis, André Warusfel, Xavier Buff, Josselin Garnier, Emmanuel Halberstadt, François Moulin, Jacques Sauloy','Scolaire','Toutes les mathématiques de L1 en un volume',25,'image24.jpg',14,'Mathématiques Tout-en-un pour la Licence 1 - 3e éd'),(15,'Collectif','Sport loisirs et vie pratique','Tous les documents nautiques obligatoires pour une navigation côtière, et toute la cartographie SHOM des côtes françaises !',25,'image22.jpg',14,'Plaisance et Réglementation 2019'),(16,'Wim Hof','Sport loisirs et vie pratique','Personne n\'incarne mieux que Wim Hof les ressources inépuisables du corps humain.',25,'image21.jpg',14,'The Iceman - Suivez le guide !'),(17,'Mathilde Lequin','Sciences sociales','Ce volume analyse différentes manières de penser l\'humain aujourd\'hui,...',25,'image20.jpg',14,'Penser l\'humain'),(18,'Martin Heidegger','Sciences sociales','Ce volume comprend les cinq premiers des trente-quatre Cahiers rédigés par Heidegger depuis le début des années 1930 jusqu\'à la fin de sa vie (la série commence en fait au deuxième de ces Cahiers, le premier ayant été perdu).',25,'image18.jpg',14,'Reflexions II-VI. Cahiers Noirs (1931-1938)'),(19,'Jacques-Alain Miller','Sciences sociales','Qu\'est-ce que l\'os d\'une cure ? Après l\'imaginaire, l\'identification phallique et le fantasme, la dernière réponse est le symptôme, précisément le partenaire-symptôme..',NULL,'image19.jpg',14,'L\'os d\'une cure');
/*!40000 ALTER TABLE `livre` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-21 23:35:56
