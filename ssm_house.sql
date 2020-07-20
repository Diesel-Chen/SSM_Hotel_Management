/*
 Navicat Premium Data Transfer

 Source Server         : Connection_Mysql
 Source Server Type    : MySQL
 Source Server Version : 50540
 Source Host           : localhost:3306
 Source Schema         : ssm_house

 Target Server Type    : MySQL
 Target Server Version : 50540
 File Encoding         : 65001

 Date: 21/06/2020 19:47:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house`  (
  `hid` int(11) NOT NULL AUTO_INCREMENT,
  `houseName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `houseState` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `housePrice` double NOT NULL,
  `houseNum` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`hid`) USING BTREE,
  UNIQUE INDEX `houseNum`(`houseNum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES (1, '单人间', '预订', 99, 101);
INSERT INTO `house` VALUES (2, '单人间', '空房', 99, 102);
INSERT INTO `house` VALUES (3, '单人间', '脏房', 99, 103);
INSERT INTO `house` VALUES (4, '单人间', '空房', 99, 104);
INSERT INTO `house` VALUES (5, '标准间', '脏房', 199, 201);
INSERT INTO `house` VALUES (6, '标准间', '预订', 199, 202);
INSERT INTO `house` VALUES (7, '标准间', '空房', 199, 203);
INSERT INTO `house` VALUES (8, '标准间', '预订', 199, 204);
INSERT INTO `house` VALUES (9, '标准间', '预订', 199, 205);
INSERT INTO `house` VALUES (10, '标准间', '空房', 199, 206);
INSERT INTO `house` VALUES (11, '大床房', '空房', 299, 301);
INSERT INTO `house` VALUES (12, '大床房', '预订', 299, 302);
INSERT INTO `house` VALUES (13, '大床房', '预订', 299, 303);
INSERT INTO `house` VALUES (14, '大床房', '预订', 299, 304);
INSERT INTO `house` VALUES (15, '大床房', '预订', 299, 305);
INSERT INTO `house` VALUES (16, '大床房', '住人', 299, 306);
INSERT INTO `house` VALUES (17, '大床房', '空房', 299, 307);
INSERT INTO `house` VALUES (18, '套间', '住人', 399, 401);
INSERT INTO `house` VALUES (19, '套间', '空房', 399, 402);
INSERT INTO `house` VALUES (20, '套间', '空房', 399, 403);
INSERT INTO `house` VALUES (21, '套间', '空房', 399, 404);
INSERT INTO `house` VALUES (22, '套间', '空房', 399, 405);
INSERT INTO `house` VALUES (23, '套间', '预订', 399, 406);
INSERT INTO `house` VALUES (24, '总统套房', '空房', 499, 501);
INSERT INTO `house` VALUES (25, '总统套房', '空房', 499, 502);
INSERT INTO `house` VALUES (26, '总统套房', '空房', 499, 503);

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `mid` int(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `passWord` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `nickName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `realName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `identificationNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `telephone` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (1, '17shou', '123', 'Diesel_chenas', '朱晨', '男', '340406199609072813', '15032382351', '875243448@qq.com');
INSERT INTO `member` VALUES (5, 'zhangsan', '123', '小三三', '张三', '男', '34040619969075486', '15032382351', '1212@qq.com');
INSERT INTO `member` VALUES (9, 'lisi', '123', '小皮蛋', '李四四', '女', '34040619969075415', '15632158792', '121564@qq.com');
INSERT INTO `member` VALUES (15, 'liangshanbo', 'liangshanbo', NULL, '梁山伯', NULL, '13098215840235', '13701827134', NULL);
INSERT INTO `member` VALUES (16, 'haha', '123', NULL, '小王', NULL, '13098215840235', '13701827134', NULL);
INSERT INTO `member` VALUES (17, 'test01', '123456', NULL, '测试账户', NULL, '340406199609072813', '13701827134', NULL);
INSERT INTO `member` VALUES (18, 'shoushou', 'shoushou', NULL, '兽兽', NULL, '340406154654665848', '15032382351', NULL);
INSERT INTO `member` VALUES (19, 'tese02', '123456', '晨晨', '测试账户2', '男', '340406199609072813', '15032382351', '');
INSERT INTO `member` VALUES (20, 'ceshizhanghuhu', 'ceshizhanghuhu', NULL, '测试账户户', NULL, '340406199609072813', '15032382351', NULL);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `orderTime` datetime NULL DEFAULT NULL,
  `orderPrice` double(10, 2) NULL DEFAULT NULL,
  `orderStatus` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `comeTime` datetime NULL DEFAULT NULL,
  `departureTime` datetime NULL DEFAULT NULL,
  `houseId` int(11) NULL DEFAULT NULL,
  `memberId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`oid`) USING BTREE,
  INDEX `foreign01`(`houseId`) USING BTREE,
  INDEX `fortign02`(`memberId`) USING BTREE,
  CONSTRAINT `foreign01` FOREIGN KEY (`houseId`) REFERENCES `house` (`hid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fortign02` FOREIGN KEY (`memberId`) REFERENCES `member` (`mid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (10, '2020-06-05 13:17:59', 99.00, '已完成', '2020-05-27 14:00:00', '2020-05-28 14:00:00', 3, 1);
INSERT INTO `orders` VALUES (11, '2020-06-05 13:17:59', 299.00, '待处理', '2020-05-28 14:00:00', '2020-05-29 14:00:00', 12, 1);
INSERT INTO `orders` VALUES (12, '2020-06-05 13:17:59', 399.00, '已取消', '2020-05-14 14:00:00', '2020-05-15 14:00:00', 20, 1);
INSERT INTO `orders` VALUES (13, '2020-06-05 13:17:59', 199.00, '待处理', '2020-05-14 14:00:00', '2020-05-15 14:00:00', 9, 5);
INSERT INTO `orders` VALUES (14, '2020-06-05 13:17:59', 398.00, '待处理', '2020-05-01 14:00:00', '2020-05-03 14:00:00', 8, 1);
INSERT INTO `orders` VALUES (15, '2020-06-05 13:17:59', 1196.00, '待处理', '2020-04-24 14:00:00', '2020-04-28 14:00:00', 14, 1);
INSERT INTO `orders` VALUES (16, '2020-06-05 13:17:59', 597.00, '待处理', '2020-03-04 14:00:00', '2020-03-07 14:00:00', 6, 1);
INSERT INTO `orders` VALUES (17, '2020-06-05 13:17:59', 1794.00, '待处理', '2020-04-22 14:00:00', '2020-04-28 14:00:00', 15, 5);
INSERT INTO `orders` VALUES (18, '2020-06-05 18:12:14', 299.00, '已预订', '2020-06-05 14:00:00', '2020-06-06 14:00:00', 13, 9);
INSERT INTO `orders` VALUES (21, '2020-06-05 18:49:28', 399.00, '已完成', '2020-06-16 14:00:00', '2020-06-17 14:00:00', 21, 9);
INSERT INTO `orders` VALUES (24, '2020-06-06 06:12:42', 1995.00, '已完成', '2020-06-01 14:00:00', '2020-06-06 14:00:00', 18, 15);
INSERT INTO `orders` VALUES (25, '2020-06-06 14:11:14', 3591.00, '待处理', '2020-07-12 14:00:00', '2020-07-21 14:00:00', 23, 1);
INSERT INTO `orders` VALUES (26, '2020-06-06 18:07:49', 598.00, '已完成', '2020-06-06 14:00:00', '2020-06-08 14:00:00', 16, 17);
INSERT INTO `orders` VALUES (27, '2020-06-06 18:31:07', 297.00, '已完成', '2020-06-06 14:00:00', '2020-06-09 14:00:00', 2, 18);
INSERT INTO `orders` VALUES (28, '2020-06-06 18:39:38', 198.00, '已取消', '2020-06-07 14:00:00', '2020-06-09 14:00:00', 4, 19);
INSERT INTO `orders` VALUES (29, '2020-06-06 18:45:51', 597.00, '已完成', '2020-06-07 14:00:00', '2020-06-10 14:00:00', 5, 20);

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `url` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '客户管理', '/user/findAll.do');
INSERT INTO `permission` VALUES (2, '角色管理', '/role/findAll.do');
INSERT INTO `permission` VALUES (3, '资源权限管理', '/permission/findAll.do');
INSERT INTO `permission` VALUES (5, '会员信息管理', '/member/findAllByPage');
INSERT INTO `permission` VALUES (6, '确认预定', '/order/findAllByPage');
INSERT INTO `permission` VALUES (7, '入住办理', '/pages/cashier_CheckIn.jsp');
INSERT INTO `permission` VALUES (8, '离店办理', '/house/findNotVacant');
INSERT INTO `permission` VALUES (9, '订单信息管理', '/order/findAllByPage');
INSERT INTO `permission` VALUES (10, '客房清洁打扫', '/house/findDirty');
INSERT INTO `permission` VALUES (11, '客房信息管理', '/house/findAllByPage');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `roleDesc` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'MANAGER', '酒店经理');
INSERT INTO `role` VALUES (2, 'STAFF1', '前台收银人员');
INSERT INTO `role` VALUES (3, 'STAFF2', '客房勤务人员');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `permissionId` int(11) NOT NULL DEFAULT 0,
  `roleId` int(32) NOT NULL DEFAULT 0,
  PRIMARY KEY (`permissionId`, `roleId`) USING BTREE,
  INDEX `roleId`(`roleId`) USING BTREE,
  CONSTRAINT `role_permission_ibfk_1` FOREIGN KEY (`permissionId`) REFERENCES `permission` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `role_permission_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (1, 1);
INSERT INTO `role_permission` VALUES (2, 1);
INSERT INTO `role_permission` VALUES (3, 1);
INSERT INTO `role_permission` VALUES (5, 2);
INSERT INTO `role_permission` VALUES (6, 2);
INSERT INTO `role_permission` VALUES (7, 2);
INSERT INTO `role_permission` VALUES (8, 2);
INSERT INTO `role_permission` VALUES (9, 2);
INSERT INTO `role_permission` VALUES (10, 3);
INSERT INTO `role_permission` VALUES (11, 3);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `phoneNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '123@qq.com', 'admin', 'admin', '13361845928', 1);
INSERT INTO `users` VALUES (2, '8798@qq.com', 'staff1', '123', '15212345678', 1);
INSERT INTO `users` VALUES (3, 'xzc5@qq.com', 'staff2', '123', '15648856487', 1);
INSERT INTO `users` VALUES (4, '1564@qq.com', 'zhangsan', '123', '150323825135', 1);
INSERT INTO `users` VALUES (5, '123@qq.com', 'test1', '123', '13701827135', 1);

-- ----------------------------
-- Table structure for users_role
-- ----------------------------
DROP TABLE IF EXISTS `users_role`;
CREATE TABLE `users_role`  (
  `userId` int(11) NOT NULL DEFAULT 0,
  `roleId` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`userId`, `roleId`) USING BTREE,
  INDEX `roleId`(`roleId`) USING BTREE,
  CONSTRAINT `users_role_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `users_role_ibfk_2` FOREIGN KEY (`roleId`) REFERENCES `role` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users_role
-- ----------------------------
INSERT INTO `users_role` VALUES (1, 1);
INSERT INTO `users_role` VALUES (2, 1);
INSERT INTO `users_role` VALUES (5, 1);
INSERT INTO `users_role` VALUES (2, 2);
INSERT INTO `users_role` VALUES (5, 2);
INSERT INTO `users_role` VALUES (2, 3);
INSERT INTO `users_role` VALUES (3, 3);
INSERT INTO `users_role` VALUES (5, 3);

SET FOREIGN_KEY_CHECKS = 1;
