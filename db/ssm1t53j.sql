-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm1t53j
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `biaozhunxinxi`
--

DROP TABLE IF EXISTS `biaozhunxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `biaozhunxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaozhunmingcheng` varchar(200) NOT NULL COMMENT '标准名称',
  `shiyongfanwei` varchar(200) DEFAULT NULL COMMENT '适用范围',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `biaozhunwenjian` varchar(200) DEFAULT NULL COMMENT '标准文件',
  `shipin` varchar(200) DEFAULT NULL COMMENT '视频',
  `biaozhunliucheng` longtext COMMENT '标准流程',
  `shenbaotiaojian` longtext COMMENT '申报条件',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `shengweizhanghao` varchar(200) DEFAULT NULL COMMENT '省卫账号',
  `nicheng` varchar(200) DEFAULT NULL COMMENT '昵称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='标准信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biaozhunxinxi`
--

LOCK TABLES `biaozhunxinxi` WRITE;
/*!40000 ALTER TABLE `biaozhunxinxi` DISABLE KEYS */;
INSERT INTO `biaozhunxinxi` VALUES (41,'2021-02-07 15:46:21','标准信息','高级医师','http://localhost:8080/ssm1t53j/upload/biaozhunxinxi_tupian1.jpg','http://localhost:8080/ssm1t53j/upload/1612713040125.doc','http://localhost:8080/ssm1t53j/upload/1612713045384.mp4','标准流程1这里可以发布一些申请标准流程','申报条件1跟申请条件，还可以上传文件视频学习查看','2021-02-07 23:46:21','001','昵称1'),(42,'2021-02-07 15:46:21','标准名称2','适用范围2','http://localhost:8080/ssm1t53j/upload/biaozhunxinxi_tupian2.jpg','','','标准流程2','申报条件2','2021-02-07 23:46:21','省卫账号2','昵称2'),(43,'2021-02-07 15:46:21','标准名称3','适用范围3','http://localhost:8080/ssm1t53j/upload/biaozhunxinxi_tupian3.jpg','','','标准流程3','申报条件3','2021-02-07 23:46:21','省卫账号3','昵称3'),(44,'2021-02-07 15:46:21','标准名称4','适用范围4','http://localhost:8080/ssm1t53j/upload/biaozhunxinxi_tupian4.jpg','','','标准流程4','申报条件4','2021-02-07 23:46:21','省卫账号4','昵称4'),(45,'2021-02-07 15:46:21','标准名称5','适用范围5','http://localhost:8080/ssm1t53j/upload/biaozhunxinxi_tupian5.jpg','','','标准流程5','申报条件5','2021-02-07 23:46:21','省卫账号5','昵称5'),(46,'2021-02-07 15:46:21','标准名称6','适用范围6','http://localhost:8080/ssm1t53j/upload/biaozhunxinxi_tupian6.jpg','','','标准流程6','申报条件6','2021-02-07 23:46:21','省卫账号6','昵称6');
/*!40000 ALTER TABLE `biaozhunxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612713539416 DEFAULT CHARSET=utf8 COMMENT='在线客服';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (81,'2021-02-07 15:46:21',1,1,'提问1','回复1',1),(82,'2021-02-07 15:46:21',2,2,'提问2','回复2',2),(83,'2021-02-07 15:46:21',3,3,'提问3','回复3',3),(84,'2021-02-07 15:46:21',4,4,'提问4','回复4',4),(85,'2021-02-07 15:46:21',5,5,'提问5','回复5',5),(86,'2021-02-07 15:46:21',6,6,'提问6','回复6',6),(1612713406006,'2021-02-07 15:56:45',11,NULL,'有什么呢问题或者意见也可以在这儿反馈给管理员，也可以申请再次申报反馈',NULL,0),(1612713514039,'2021-02-07 15:58:33',11,1,NULL,'好的 欢迎反馈',0),(1612713539415,'2021-02-07 15:58:58',11,NULL,'好的',NULL,1);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm1t53j/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm1t53j/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm1t53j/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612713429108 DEFAULT CHARSET=utf8 COMMENT='系统论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (92,'2021-02-07 15:46:21','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(93,'2021-02-07 15:46:21','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(94,'2021-02-07 15:46:21','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(95,'2021-02-07 15:46:21','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(96,'2021-02-07 15:46:21','帖子标题6','帖子内容6',6,6,'用户名6','开放'),(1612713367191,'2021-02-07 15:56:06','这里发布疑问 或者问题','<p>请输入内容可以给用户或者跟纪委进行交流的</p>',0,11,'1','开放'),(1612713429107,'2021-02-07 15:57:08',NULL,'好的 ，有什么问题都是可以交流的',1612713367191,21,'001',NULL);
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jieguotongbao`
--

DROP TABLE IF EXISTS `jieguotongbao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jieguotongbao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `shenqingzhicheng` varchar(200) NOT NULL COMMENT '申请职称',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `zhenshixingming` varchar(200) DEFAULT NULL COMMENT '真实姓名',
  `tongzhineirong` longtext COMMENT '通知内容',
  `tongzhiriqi` date DEFAULT NULL COMMENT '通知日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612713167807 DEFAULT CHARSET=utf8 COMMENT='结果通报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jieguotongbao`
--

LOCK TABLES `jieguotongbao` WRITE;
/*!40000 ALTER TABLE `jieguotongbao` DISABLE KEYS */;
INSERT INTO `jieguotongbao` VALUES (71,'2021-02-07 15:46:21','名称1','申请职称1','工号1','真实姓名1','通知内容1','2021-02-07'),(72,'2021-02-07 15:46:21','名称2','申请职称2','工号2','真实姓名2','通知内容2','2021-02-07'),(73,'2021-02-07 15:46:21','名称3','申请职称3','工号3','真实姓名3','通知内容3','2021-02-07'),(74,'2021-02-07 15:46:21','名称4','申请职称4','工号4','真实姓名4','通知内容4','2021-02-07'),(75,'2021-02-07 15:46:21','名称5','高级医师','工号5','真实姓名5','通知内容5','2021-02-07'),(76,'2021-02-07 15:46:21','名称6','中级医师','工号6','真实姓名6','通知内容6','2021-02-07'),(1612713167806,'2021-02-07 15:52:47','高级医师申请','高级医师','1','李铭','恭喜通过审核','2021-02-01');
/*!40000 ALTER TABLE `jieguotongbao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='系统公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (101,'2021-02-07 15:46:21','公告信息','简介1111','http://localhost:8080/ssm1t53j/upload/news_picture1.jpg','<p>内容1可以在这里根据数据进行信息发布，或者是新闻 或者是公告信息都是可以的</p>'),(102,'2021-02-07 15:46:21','标题2','简介2','http://localhost:8080/ssm1t53j/upload/news_picture2.jpg','内容2'),(103,'2021-02-07 15:46:21','标题3','简介3','http://localhost:8080/ssm1t53j/upload/news_picture3.jpg','内容3'),(104,'2021-02-07 15:46:21','标题4','简介4','http://localhost:8080/ssm1t53j/upload/news_picture4.jpg','内容4'),(105,'2021-02-07 15:46:21','标题5','简介5','http://localhost:8080/ssm1t53j/upload/news_picture5.jpg','内容5'),(106,'2021-02-07 15:46:21','标题6','简介6','http://localhost:8080/ssm1t53j/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shenbaoshenhe`
--

DROP TABLE IF EXISTS `shenbaoshenhe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shenbaoshenhe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shenqingzhicheng` varchar(200) DEFAULT NULL COMMENT '申请职称',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `zhenshixingming` varchar(200) DEFAULT NULL COMMENT '真实姓名',
  `chengshi` varchar(200) DEFAULT NULL COMMENT '城市',
  `shenhejieguo` varchar(200) NOT NULL COMMENT '审核结果',
  `beizhu` longtext COMMENT '备注',
  `shenheriqi` date DEFAULT NULL COMMENT '审核日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612713114662 DEFAULT CHARSET=utf8 COMMENT='申报审核';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shenbaoshenhe`
--

LOCK TABLES `shenbaoshenhe` WRITE;
/*!40000 ALTER TABLE `shenbaoshenhe` DISABLE KEYS */;
INSERT INTO `shenbaoshenhe` VALUES (61,'2021-02-07 15:46:21','名称1','申请职称1','工号1','真实姓名1','城市1','通过','备注1','2021-02-07'),(62,'2021-02-07 15:46:21','名称2','申请职称2','工号2','真实姓名2','城市2','通过','备注2','2021-02-07'),(63,'2021-02-07 15:46:21','名称3','申请职称3','工号3','真实姓名3','城市3','通过','备注3','2021-02-07'),(64,'2021-02-07 15:46:21','名称4','申请职称4','工号4','真实姓名4','城市4','通过','备注4','2021-02-07'),(65,'2021-02-07 15:46:21','名称5','申请职称5','工号5','真实姓名5','城市5','通过','备注5','2021-02-07'),(66,'2021-02-07 15:46:21','名称6','申请职称6','工号6','真实姓名6','城市6','通过','备注6','2021-02-07'),(1612713114661,'2021-02-07 15:51:53','高级医师申请','高级医师','1','李铭','上海市','通过','11111','2021-02-01');
/*!40000 ALTER TABLE `shenbaoshenhe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shengweijiwei`
--

DROP TABLE IF EXISTS `shengweijiwei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shengweijiwei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shengweizhanghao` varchar(200) NOT NULL COMMENT '省卫账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `nicheng` varchar(200) DEFAULT NULL COMMENT '昵称',
  `suoshushengfen` varchar(200) DEFAULT NULL COMMENT '所属省份',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `jianjie` longtext COMMENT '简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shengweizhanghao` (`shengweizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='省卫计委';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shengweijiwei`
--

LOCK TABLES `shengweijiwei` WRITE;
/*!40000 ALTER TABLE `shengweijiwei` DISABLE KEYS */;
INSERT INTO `shengweijiwei` VALUES (31,'2021-02-07 15:46:21','001','001','昵称1','所属省份1','13823888881','简介1'),(32,'2021-02-07 15:46:21','省卫计委2','123456','昵称2','所属省份2','13823888882','简介2'),(33,'2021-02-07 15:46:21','省卫计委3','123456','昵称3','所属省份3','13823888883','简介3'),(34,'2021-02-07 15:46:21','省卫计委4','123456','昵称4','所属省份4','13823888884','简介4'),(35,'2021-02-07 15:46:21','省卫计委5','123456','昵称5','所属省份5','13823888885','简介5'),(36,'2021-02-07 15:46:21','省卫计委6','123456','昵称6','所属省份6','13823888886','简介6');
/*!40000 ALTER TABLE `shengweijiwei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiweijiwei`
--

DROP TABLE IF EXISTS `shiweijiwei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiweijiwei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shiweizhanghao` varchar(200) NOT NULL COMMENT '市卫账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `nicheng` varchar(200) NOT NULL COMMENT '昵称',
  `suoshuchengshi` varchar(200) DEFAULT NULL COMMENT '所属城市',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `jianjie` longtext COMMENT '简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shiweizhanghao` (`shiweizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='市卫计委';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiweijiwei`
--

LOCK TABLES `shiweijiwei` WRITE;
/*!40000 ALTER TABLE `shiweijiwei` DISABLE KEYS */;
INSERT INTO `shiweijiwei` VALUES (21,'2021-02-07 15:46:21','001','001','昵称1','所属城市1','13823888881','简介1'),(22,'2021-02-07 15:46:21','市卫计委2','123456','昵称2','所属城市2','13823888882','简介2'),(23,'2021-02-07 15:46:21','市卫计委3','123456','昵称3','所属城市3','13823888883','简介3'),(24,'2021-02-07 15:46:21','市卫计委4','123456','昵称4','所属城市4','13823888884','简介4'),(25,'2021-02-07 15:46:21','市卫计委5','123456','昵称5','所属城市5','13823888885','简介5'),(26,'2021-02-07 15:46:21','市卫计委6','123456','昵称6','所属城市6','13823888886','简介6');
/*!40000 ALTER TABLE `shiweijiwei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','oei4z6j2yg7agehpo5emblv46wi4d7sp','2021-02-07 15:48:26','2021-02-07 16:57:40'),(2,11,'1','yishengzhuanjia','医生专家','elj1yyobml8pes0t1gzdo74i9a89z9ka','2021-02-07 15:49:18','2021-02-07 16:58:50'),(3,31,'001','shengweijiwei','省卫计委','hoa4z4nnpnboeih7om3kagqbbklygwl6','2021-02-07 15:49:50','2021-02-07 16:53:55'),(4,21,'001','shiweijiwei','市卫计委','xk3c9vxjf7v471tbbwbxpezfo1hwzy88','2021-02-07 15:51:36','2021-02-07 16:56:55');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-02-07 15:46:21');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yishengzhuanjia`
--

DROP TABLE IF EXISTS `yishengzhuanjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yishengzhuanjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `nicheng` varchar(200) NOT NULL COMMENT '昵称',
  `zhenshixingming` varchar(200) NOT NULL COMMENT '真实姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `chushengriqi` date DEFAULT NULL COMMENT '出生日期',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `zhengzhimianmao` varchar(200) DEFAULT NULL COMMENT '政治面貌',
  `minzu` varchar(200) DEFAULT NULL COMMENT '民族',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `chengshi` varchar(200) DEFAULT NULL COMMENT '城市',
  `suozaidanwei` varchar(200) DEFAULT NULL COMMENT '所在单位',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  `gongling` varchar(200) DEFAULT NULL COMMENT '工龄',
  `jianjie` longtext COMMENT '简介',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`),
  UNIQUE KEY `nicheng` (`nicheng`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='医生专家';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yishengzhuanjia`
--

LOCK TABLES `yishengzhuanjia` WRITE;
/*!40000 ALTER TABLE `yishengzhuanjia` DISABLE KEYS */;
INSERT INTO `yishengzhuanjia` VALUES (11,'2021-02-07 15:46:21','1','1','李铭','李铭','男','2021-01-31','25','团员','汉族','13823888881','上海市','人民医院','副教授','5','简介1这里可以发布一些简介信息'),(12,'2021-02-07 15:46:21','医生专家2','123456','昵称2','真实姓名2','男','2021-02-07','年龄2','政治面貌2','民族2','13823888882','城市2','所在单位2','职务2','工龄2','简介2'),(13,'2021-02-07 15:46:21','医生专家3','123456','昵称3','真实姓名3','男','2021-02-07','年龄3','政治面貌3','民族3','13823888883','城市3','所在单位3','职务3','工龄3','简介3'),(14,'2021-02-07 15:46:21','医生专家4','123456','昵称4','真实姓名4','男','2021-02-07','年龄4','政治面貌4','民族4','13823888884','城市4','所在单位4','职务4','工龄4','简介4'),(15,'2021-02-07 15:46:21','医生专家5','123456','昵称5','真实姓名5','男','2021-02-07','年龄5','政治面貌5','民族5','13823888885','城市5','所在单位5','职务5','工龄5','简介5'),(16,'2021-02-07 15:46:21','医生专家6','123456','昵称6','真实姓名6','男','2021-02-07','年龄6','政治面貌6','民族6','13823888886','城市6','所在单位6','职务6','工龄6','简介6');
/*!40000 ALTER TABLE `yishengzhuanjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zizhushenbao`
--

DROP TABLE IF EXISTS `zizhushenbao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zizhushenbao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `zhenshixingming` varchar(200) DEFAULT NULL COMMENT '真实姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `chushengriqi` varchar(200) DEFAULT NULL COMMENT '出生日期',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `zhengzhimianmao` varchar(200) DEFAULT NULL COMMENT '政治面貌',
  `minzu` varchar(200) DEFAULT NULL COMMENT '民族',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `chengshi` varchar(200) DEFAULT NULL COMMENT '城市',
  `suozaidanwei` varchar(200) DEFAULT NULL COMMENT '所在单位',
  `zhiwu` varchar(200) DEFAULT NULL COMMENT '职务',
  `gongling` varchar(200) DEFAULT NULL COMMENT '工龄',
  `shenqingzhicheng` varchar(200) NOT NULL COMMENT '申请职称',
  `shenqingwenjian` varchar(200) NOT NULL COMMENT '申请文件',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612712984806 DEFAULT CHARSET=utf8 COMMENT='自主申报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zizhushenbao`
--

LOCK TABLES `zizhushenbao` WRITE;
/*!40000 ALTER TABLE `zizhushenbao` DISABLE KEYS */;
INSERT INTO `zizhushenbao` VALUES (51,'2021-02-07 15:46:21','名称1','工号1','真实姓名1','性别1','出生日期1','年龄1','政治面貌1','民族1','联系方式1','城市1','所在单位1','职务1','工龄1','申请职称1','','2021-02-07'),(52,'2021-02-07 15:46:21','名称2','工号2','真实姓名2','性别2','出生日期2','年龄2','政治面貌2','民族2','联系方式2','城市2','所在单位2','职务2','工龄2','申请职称2','','2021-02-07'),(53,'2021-02-07 15:46:21','名称3','工号3','真实姓名3','性别3','出生日期3','年龄3','政治面貌3','民族3','联系方式3','城市3','所在单位3','职务3','工龄3','申请职称3','','2021-02-07'),(54,'2021-02-07 15:46:21','名称4','工号4','真实姓名4','性别4','出生日期4','年龄4','政治面貌4','民族4','联系方式4','城市4','所在单位4','职务4','工龄4','申请职称4','','2021-02-07'),(55,'2021-02-07 15:46:21','名称5','工号5','真实姓名5','性别5','出生日期5','年龄5','政治面貌5','民族5','联系方式5','城市5','所在单位5','职务5','工龄5','申请职称5','','2021-02-07'),(56,'2021-02-07 15:46:21','名称6','工号6','真实姓名6','性别6','出生日期6','年龄6','政治面貌6','民族6','联系方式6','城市6','所在单位6','职务6','工龄6','申请职称6','','2021-02-07'),(1612712984805,'2021-02-07 15:49:43','高级医师申请','1','李铭','男','2021-01-31','25','团员','汉族','13823888881','上海市','人民医院','副教授','5','高级医师','http://localhost:8080/ssm1t53j/upload/1612712966153.doc','2021-02-01');
/*!40000 ALTER TABLE `zizhushenbao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-08 15:19:21
