/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : tea_design

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 14/05/2019 14:43:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for Pingjiaxinxi
-- ----------------------------
DROP TABLE IF EXISTS `Pingjiaxinxi`;
CREATE TABLE `Pingjiaxinxi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_id` int(11) DEFAULT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `zongfen` int(11) DEFAULT NULL,
  `shijian` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Records of Pingjiaxinxi
-- ----------------------------
BEGIN;
INSERT INTO `Pingjiaxinxi` VALUES (1, 1, 8, 66, '2019-04-25 22:41:06');
INSERT INTO `Pingjiaxinxi` VALUES (2, 1, 8, 62, '2019-04-25 22:44:49');
INSERT INTO `Pingjiaxinxi` VALUES (3, 1, 1, 207, '2019-04-26 15:46:56');
INSERT INTO `Pingjiaxinxi` VALUES (6, 2, 1, 165, '2019-04-26 16:24:04');
COMMIT;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `userPw` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Records of admin
-- ----------------------------
BEGIN;
INSERT INTO `admin` VALUES (2, 'admin111', 'admin1');
INSERT INTO `admin` VALUES (3, 'aaa', 'dsd');
INSERT INTO `admin` VALUES (4, 'dsds', 'dsds');
INSERT INTO `admin` VALUES (5, 'xieyong', 'admin');
INSERT INTO `admin` VALUES (6, 'test', 'test');
INSERT INTO `admin` VALUES (7, '1', '1');
INSERT INTO `admin` VALUES (8, 'admin', 'admin');
INSERT INTO `admin` VALUES (9, 'xieyong', 'admin234');
COMMIT;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `course_score` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Records of course
-- ----------------------------
BEGIN;
INSERT INTO `course` VALUES (1, '大学英语', '3');
INSERT INTO `course` VALUES (2, '大学语文', '3');
COMMIT;

-- ----------------------------
-- Table structure for course_tea
-- ----------------------------
DROP TABLE IF EXISTS `course_tea`;
CREATE TABLE `course_tea` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `course_id` int(10) DEFAULT NULL,
  `teacher_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Records of course_tea
-- ----------------------------
BEGIN;
INSERT INTO `course_tea` VALUES (2, 2, 2);
INSERT INTO `course_tea` VALUES (3, 1, 3);
INSERT INTO `course_tea` VALUES (4, 2, 3);
INSERT INTO `course_tea` VALUES (5, 2, 4);
INSERT INTO `course_tea` VALUES (6, 1, 1);
INSERT INTO `course_tea` VALUES (7, 2, 1);
COMMIT;

-- ----------------------------
-- Table structure for fenshu
-- ----------------------------
DROP TABLE IF EXISTS `fenshu`;
CREATE TABLE `fenshu` (
  `fenshu_id` int(11) NOT NULL AUTO_INCREMENT,
  `fenshu_fenshu` double DEFAULT NULL,
  `fenshu_erjizhibiao_id` int(11) DEFAULT NULL,
  `fenshu_teaId` int(11) DEFAULT NULL,
  `fenshu_stuId` int(11) DEFAULT NULL,
  `shijian` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`fenshu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Table structure for indexTable
-- ----------------------------
DROP TABLE IF EXISTS `indexTable`;
CREATE TABLE `indexTable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `indexName` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `weight` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `parent_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `index_num` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Records of indexTable
-- ----------------------------
BEGIN;
INSERT INTO `indexTable` VALUES (3, '二级类目12', '0.7332', '6', NULL);
INSERT INTO `indexTable` VALUES (6, '二级雷米', '0.234', NULL, NULL);
INSERT INTO `indexTable` VALUES (7, '二级小牧', '0.234', NULL, NULL);
INSERT INTO `indexTable` VALUES (8, '教学质量', '0.1234', '6', NULL);
INSERT INTO `indexTable` VALUES (9, '教学素质', '0.234', NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_xuehao` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `stu_realname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `stu_sex` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `stu_age` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `stu_card` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `stu_zhengzhimianmao` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `login_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `login_pw` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `del` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (1, '111', 'xieyong', '0', '12', '23434', '1', 'admin', 'admin', NULL);
INSERT INTO `student` VALUES (2, '0002', 'lx', '0', '23', '90293', '0', 'lx', 'admin', NULL);
INSERT INTO `student` VALUES (3, '128293', '写要你个', '0', '23', '1223', '1', 'aaa', '2323', NULL);
COMMIT;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tea_id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_bianhao` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `tea_realname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `tea_sex` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `tea_age` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `login_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `login_pw` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `del` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=armscii8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES (1, '1223', 'xieyong', '0', '123', 'xieyong', 'admin', NULL);
INSERT INTO `teacher` VALUES (2, '1223', 'xieyong', '1', '123', 'xieyong123', 'admin', NULL);
INSERT INTO `teacher` VALUES (3, 'A123', 'jason', '0', '24', 'jason', 'admin123', NULL);
INSERT INTO `teacher` VALUES (4, '123331A', 'aaa', '0', '23', 'ada', '123', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
