/*
Navicat MySQL Data Transfer
Source Server         : Project
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : program_manage
Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001
Date: 2020-06-09 18:01:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for commit
-- ----------------------------
DROP TABLE IF EXISTS `commit`;
CREATE TABLE `commit` (
  `commitNum` int(11) NOT NULL AUTO_INCREMENT,
  `commitName` char(20) DEFAULT NULL,
  `commitTime` date DEFAULT NULL,
  `userNum` int(11) DEFAULT NULL,
`programNum` int(11) DEFAULT NULL,
`taskNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`commitNum`),
  KEY `FK_Reference_01` (`userNum`),
  CONSTRAINT `FK_Reference_01` FOREIGN KEY (`userNum`) REFERENCES `user` (`userNum`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commit
-- ----------------------------
INSERT INTO `commit` VALUES ('2', 'test', null, '1');
INSERT INTO `commit` VALUES ('3', 'test', null, '2');
INSERT INTO `commit` VALUES ('4', 'second', null, '1');

-- ----------------------------
-- Table structure for program
-- ----------------------------
DROP TABLE IF EXISTS `program`;
CREATE TABLE `program` (
  `programNum` int(11) NOT NULL AUTO_INCREMENT,
  `teamNum` int(11) DEFAULT NULL,
  `userNum` int(11) DEFAULT NULL,
  `programName` char(20) DEFAULT NULL,
  `programStartTime` date DEFAULT NULL,
  `programEndTime` date DEFAULT NULL,
  `programRate` char(20) DEFAULT NULL,
  `programInfomation` char(20) DEFAULT NULL,
  PRIMARY KEY (`programNum`),
  KEY `FK_Reference_5` (`teamNum`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`teamNum`) REFERENCES `team` (`teamNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program
-- ----------------------------

-- ----------------------------
-- Table structure for task
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `taskNum` int(11) NOT NULL AUTO_INCREMENT,
  `userNum` int(11) DEFAULT NULL,
  `programNum` int(11) DEFAULT NULL,
  `taskName` char(20) DEFAULT NULL,
  `taskStartTime` date DEFAULT NULL,
  `taskEndTime` date DEFAULT NULL,
  `taskRate` char(20) DEFAULT NULL,
  `taskLevel` int(11) DEFAULT NULL,
  PRIMARY KEY (`taskNum`),
  KEY `FK_Reference_2` (`userNum`),
  KEY `FK_Reference_4` (`programNum`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`userNum`) REFERENCES `user` (`userNum`),
  CONSTRAINT `FK_Reference_4` FOREIGN KEY (`programNum`) REFERENCES `program` (`programNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `teamNum` int(11) NOT NULL AUTO_INCREMENT,
  `teamName` char(20) DEFAULT NULL,
  `teamManager` char(20) DEFAULT NULL,
  PRIMARY KEY (`teamNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of team
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userNum` int(11) NOT NULL AUTO_INCREMENT,
  `teamNum` int(11) DEFAULT NULL,
  `userName` char(20) DEFAULT NULL,
  `userAccount` int(11) DEFAULT NULL,
  `userPassword` char(20) DEFAULT NULL,
  `userPhone` int(11) DEFAULT NULL,
  `userInformation` char(20) DEFAULT NULL,
  `userSex` char(20) DEFAULT NULL,
  `userEmail` char(20) DEFAULT NULL,
  PRIMARY KEY (`userNum`),
  KEY `FK_Reference_3` (`teamNum`),
  CONSTRAINT `FK_Reference_3` FOREIGN KEY (`teamNum`) REFERENCES `team` (`teamNum`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', null, 'zuo', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('2', null, 'zzt', '151122', '123', null, null, null, null);
INSERT INTO `user` VALUES ('3', null, 'zuotantan', '123456', '123', null, null, null, null);