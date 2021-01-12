/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : volunteer

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 12/01/2021 14:40:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for old_man_info
-- ----------------------------
DROP TABLE IF EXISTS `old_man_info`;
CREATE TABLE `old_man_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of old_man_info
-- ----------------------------
INSERT INTO `old_man_info` VALUES (1, '王老汉', '12345678');
INSERT INTO `old_man_info` VALUES (2, '赵老头', '212313123');
INSERT INTO `old_man_info` VALUES (3, '刘奶奶', '12313123');
INSERT INTO `old_man_info` VALUES (4, '王阿姨', '1234455');

-- ----------------------------
-- Table structure for step_record
-- ----------------------------
DROP TABLE IF EXISTS `step_record`;
CREATE TABLE `step_record`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `old_man_id` int(11) NULL DEFAULT NULL COMMENT '老人的主键',
  `time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '行走的时间',
  `steps` int(11) NULL DEFAULT NULL COMMENT '步数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of step_record
-- ----------------------------
INSERT INTO `step_record` VALUES (1, 1, '2021-01-01', 1000);
INSERT INTO `step_record` VALUES (2, 1, '2020-09-01', 20000);

-- ----------------------------
-- Table structure for volunteer_info
-- ----------------------------
DROP TABLE IF EXISTS `volunteer_info`;
CREATE TABLE `volunteer_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `gender` int(1) NULL DEFAULT NULL COMMENT '性别 0 为男 1为女',
  `birthday` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出生日期',
  `occupation` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职业',
  `education` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文化程度',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of volunteer_info
-- ----------------------------
INSERT INTO `volunteer_info` VALUES (1, '张三', '1888888', 0, '1998-06-03', '软件设计师', '硕士');
INSERT INTO `volunteer_info` VALUES (2, '李四', '1234567788', 1, '1998-09-18', '教师', '本科');
INSERT INTO `volunteer_info` VALUES (13, '张麻子', '1234566123', 0, '1997-01-02', '律师', '博士');

SET FOREIGN_KEY_CHECKS = 1;
