/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-01-26 11:43:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=1008 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1001', 'asdada', '123456', '123456');
INSERT INTO `t_user` VALUES ('1002', 'asdada', '123456', '123456');
INSERT INTO `t_user` VALUES ('1003', '22', '123456', '123456');
INSERT INTO `t_user` VALUES ('1004', '22', '123456', '123456');
INSERT INTO `t_user` VALUES ('1005', '22', '123456', '123456');
INSERT INTO `t_user` VALUES ('1006', '22', '123456', '123456');
INSERT INTO `t_user` VALUES ('1007', '22', '123456', '123456');
