/*
Navicat MySQL Data Transfer

Source Server         : withfunding
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : withfunding

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-05-01 21:12:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ad
-- ----------------------------
DROP TABLE IF EXISTS `ad`;
CREATE TABLE `ad` (
  `uuid` varchar(100) NOT NULL COMMENT 'uuid',
  `position` varchar(100) DEFAULT NULL,
  `path` varchar(800) DEFAULT NULL COMMENT '图片路径',
  `support` varchar(400) DEFAULT NULL COMMENT '赞助商',
  `pay` varchar(400) DEFAULT '所付金额',
  `starttime` varchar(100) DEFAULT NULL COMMENT '开始时间',
  `endtime` varchar(100) DEFAULT NULL COMMENT '结束时间',
  `contact` varchar(100) DEFAULT NULL COMMENT '联系人',
  `msisdn` varchar(100) DEFAULT NULL COMMENT '手机号码',
  `level` varchar(32) DEFAULT '会员等级',
  `userid` varchar(100) DEFAULT NULL COMMENT '用户id',
  `adhref` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `back2` varchar(100) DEFAULT NULL COMMENT '链接',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ad
-- ----------------------------
INSERT INTO `ad` VALUES ('083b2a2112534de095da74565ec5fc38', 'A', 'D://upload/1554132060120.jpg', 'sd', null, '2019-04-16', '2019-05-14', 'ds', 'ds', null, null, null, null);
INSERT INTO `ad` VALUES ('9ce953c6b25a4303be004626ea765af4', 'B', '', 'rrr', null, '2019-04-02', '2019-04-19', 'fd', 'fds', null, null, null, null);
INSERT INTO `ad` VALUES ('ae929ac6c4db43f3b18f76b7fb5f95bd', 'B', '', 'rrr', null, '2019-04-02', '2019-04-19', 'fd', 'fds', null, null, null, null);

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `title` varchar(255) DEFAULT NULL COMMENT '新闻标题',
  `content` varchar(1000) DEFAULT NULL COMMENT '新闻内容',
  `create_time` varchar(20) DEFAULT NULL COMMENT '创建时间',
  `uuid` varchar(32) NOT NULL,
  `is_del` varchar(2) DEFAULT NULL COMMENT '是否删除 1是 0否',
  `type` varchar(10) DEFAULT NULL COMMENT '所属类型 股票 配资 公告'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for platform
-- ----------------------------
DROP TABLE IF EXISTS `platform`;
CREATE TABLE `platform` (
  `uuid` varchar(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '平台名称',
  `eng_name` varchar(255) DEFAULT NULL,
  `vip` varchar(255) DEFAULT NULL COMMENT '是否开通vip',
  `orderno` int(11) DEFAULT NULL COMMENT '排序',
  `href` varchar(255) DEFAULT NULL COMMENT '平台链接',
  `path` varchar(255) DEFAULT NULL COMMENT '图片路径'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of platform
-- ----------------------------
