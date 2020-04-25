/*
Navicat MariaDB Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 100500
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MariaDB
Target Server Version : 100500
File Encoding         : 65001

Date: 2020-04-25 14:52:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(40) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';

-- ----------------------------
-- Records of student
-- ----------------------------
