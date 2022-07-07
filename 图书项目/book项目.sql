/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50536
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 50536
 File Encoding         : 65001

 Date: 07/07/2022 18:51:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `bid` int(11) NOT NULL AUTO_INCREMENT COMMENT '图书id',
  `img` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图书图片',
  `bname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图书名',
  `binfo` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图书简介',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '图书价格',
  `num` int(11) NULL DEFAULT NULL COMMENT '库存',
  `addtime` date NULL DEFAULT NULL COMMENT '图书加入时间',
  `sid` int(11) NULL DEFAULT NULL COMMENT '商家的id',
  `type` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图书',
  PRIMARY KEY (`bid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '8951774.jpg', '图书1', '大国战略，二十余位将军强力推荐！！', 10.00, 85, '2022-07-01', 2, '1');
INSERT INTO `book` VALUES (2, '11243026.jpg', '图书2', '血战长津湖，足以改变历史进程！！', 15.00, 99, '2022-07-01', 1, '1');
INSERT INTO `book` VALUES (3, '11213466.jpg', '图书3', '让世界听懂中国', 15.00, 70, '2022-06-28', 1, '1');
INSERT INTO `book` VALUES (4, '11213460.jpg', '图书4', '工作常用表述300例', 15.00, 80, '2022-06-30', 1, '1');
INSERT INTO `book` VALUES (5, '11160839.jpg', '图书5', '介绍这是一本好书5', 52.00, 100, '2022-07-03', 2, '1');
INSERT INTO `book` VALUES (6, '10822767.jpg', '图书6', '庆祝中国成立100周年', 80.00, 50, '2022-06-27', 2, '1');
INSERT INTO `book` VALUES (7, '9516511.jpg', '图书7', '榜样的力量，新时代追梦人', 33.00, 66, '2022-07-12', 1, '1');
INSERT INTO `book` VALUES (8, '9357377.jpg', '图书8', '山谷中的秘密', 23.00, 34, '2022-07-19', 2, '1');
INSERT INTO `book` VALUES (9, '9150454.jpg', '图书9', '毛泽东点评历史人物', 44.00, 23, '2022-07-16', 2, '1');
INSERT INTO `book` VALUES (10, '8717508.jpg', '图书10', '当我遇见一个人', 25.00, 22, '2022-07-27', 1, '1');

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car`  (
  `carid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NULL DEFAULT NULL,
  `bid` int(11) NULL DEFAULT NULL,
  `addtime` date NULL DEFAULT NULL,
  PRIMARY KEY (`carid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (1, 1, 1, '2022-07-07');

-- ----------------------------
-- Table structure for detail
-- ----------------------------
DROP TABLE IF EXISTS `detail`;
CREATE TABLE `detail`  (
  `bid` int(11) NOT NULL COMMENT '图书id',
  `uid` int(11) NOT NULL COMMENT '用户id',
  `bcount` int(20) NULL DEFAULT NULL COMMENT '图书数量',
  `money` decimal(15, 2) NULL DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`bid`, `uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of detail
-- ----------------------------
INSERT INTO `detail` VALUES (1, 1, 10, 100.00);
INSERT INTO `detail` VALUES (2, 1, 1, 15.00);
INSERT INTO `detail` VALUES (3, 1, 2, 30.00);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `oid` int(11) NOT NULL COMMENT '订单编号',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `utel` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户电话',
  `smoeny` decimal(11, 2) NULL DEFAULT NULL COMMENT '订单金额',
  `addtime` datetime NULL DEFAULT NULL COMMENT '下单时间',
  PRIMARY KEY (`oid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES (1, 1, '13455667788', 145.00, '2022-07-07 09:19:11');

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商家id',
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家名',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家密码',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家地址',
  `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商家电话',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES (1, 'shop1', '123456', '大连高新园区', '11111111111');
INSERT INTO `shop` VALUES (2, 'shop2', '123456', '大连甘井子区', '22222222222');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `typeid` int(11) NOT NULL COMMENT '图书类型编号',
  `tname` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图书类型',
  PRIMARY KEY (`typeid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (1, '哲学类');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id 主键   唯一',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名 ',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `phone` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户电话',
  `money` double(100, 2) NULL DEFAULT NULL COMMENT '用户余额',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Mike', '112233', '13455667788', 1000.00);
INSERT INTO `user` VALUES (2, 'Jackson', '009990', '13677778888', 2000.00);
INSERT INTO `user` VALUES (3, 'Tony', '123456', '13244445555', 2000.00);

SET FOREIGN_KEY_CHECKS = 1;
