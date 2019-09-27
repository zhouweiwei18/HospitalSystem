/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2019-09-27 09:17:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `attendance_record`
-- ----------------------------
DROP TABLE IF EXISTS `attendance_record`;
CREATE TABLE `attendance_record` (
  `attdId` int(11) NOT NULL AUTO_INCREMENT COMMENT '考勤记录编号',
  `workerName` varchar(255) DEFAULT NULL COMMENT '人员姓名',
  `workingConditions` varchar(255) DEFAULT NULL COMMENT '上班情况',
  `closingConditionns` varchar(255) DEFAULT NULL COMMENT '下班情况',
  `isdelete` int(11) DEFAULT NULL COMMENT '是否删除：1已删除 ；0未删除',
  PRIMARY KEY (`attdId`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance_record
-- ----------------------------
INSERT INTO `attendance_record` VALUES ('1', '韩商言', '已打卡', '已打卡', '1');
INSERT INTO `attendance_record` VALUES ('2', '魏无羡', '迟到', '已打卡', '1');
INSERT INTO `attendance_record` VALUES ('3', '李现', '已打卡', '已打卡', '1');
INSERT INTO `attendance_record` VALUES ('4', '马天宇', '已打卡', '已打卡', '1');
INSERT INTO `attendance_record` VALUES ('5', '华晨宇', '未打卡', '已打卡', '1');
INSERT INTO `attendance_record` VALUES ('6', '王一博', '未打卡', '早退', '0');
INSERT INTO `attendance_record` VALUES ('7', '胡歌', '已打卡', '未打卡', '0');
INSERT INTO `attendance_record` VALUES ('8', '霍建华', '已打卡', '未打卡', '0');
INSERT INTO `attendance_record` VALUES ('9', '彭于晏', '已打卡', '未打卡', '0');
INSERT INTO `attendance_record` VALUES ('10', '迪丽热巴', '已打卡', '已打卡', '0');
INSERT INTO `attendance_record` VALUES ('11', '罗志祥', '已打卡', '已打卡', '0');
INSERT INTO `attendance_record` VALUES ('12', '肖战', '已打卡', '已打卡', '0');
INSERT INTO `attendance_record` VALUES ('24', '沈浩宇', '已打卡', '已打卡', '0');
INSERT INTO `attendance_record` VALUES ('25', '沈浩宇', '已打卡', '已打卡', '0');
INSERT INTO `attendance_record` VALUES ('26', '1234', '已打卡', '早退', '0');
INSERT INTO `attendance_record` VALUES ('27', '144', '迟到', '已打卡', '0');
INSERT INTO `attendance_record` VALUES ('28', '455', '已打卡', '已打卡', '0');

-- ----------------------------
-- Table structure for `bed`
-- ----------------------------
DROP TABLE IF EXISTS `bed`;
CREATE TABLE `bed` (
  `bedNumber` int(11) NOT NULL AUTO_INCREMENT COMMENT '床号',
  `icuId` int(11) DEFAULT NULL COMMENT '病区id',
  `competentPhysician` int(11) DEFAULT NULL COMMENT '主管医师',
  `watchKeeperId` int(11) DEFAULT NULL COMMENT '值班员ID',
  `therapeuticOutcome` varchar(255) DEFAULT NULL COMMENT '治疗结果',
  `bedEmptyOrNot` int(11) DEFAULT NULL,
  `bedRent` int(11) DEFAULT NULL,
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`bedNumber`),
  KEY `icuId` (`icuId`),
  KEY `competentPhysician` (`competentPhysician`),
  KEY `watchKeeperID` (`watchKeeperId`),
  CONSTRAINT `bed_ibfk_1` FOREIGN KEY (`icuId`) REFERENCES `icu` (`icuId`),
  CONSTRAINT `bed_ibfk_2` FOREIGN KEY (`competentPhysician`) REFERENCES `user` (`userId`),
  CONSTRAINT `bed_ibfk_3` FOREIGN KEY (`watchKeeperId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2006 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bed
-- ----------------------------
INSERT INTO `bed` VALUES ('1001', '1', '1', '2', '良好', '1', '100', null);
INSERT INTO `bed` VALUES ('1004', '2', '6', '8', '良好', '0', '300', null);
INSERT INTO `bed` VALUES ('1015', '3', '7', '5', '良好', '0', '100', null);
INSERT INTO `bed` VALUES ('2002', '4', '4', '3', '良好', '0', '200', null);
INSERT INTO `bed` VALUES ('2005', '5', '9', '12', '良好', '0', '200', null);

-- ----------------------------
-- Table structure for `chargeitem`
-- ----------------------------
DROP TABLE IF EXISTS `chargeitem`;
CREATE TABLE `chargeitem` (
  `chargeId` int(11) NOT NULL AUTO_INCREMENT,
  `patientId` int(11) DEFAULT NULL,
  `medicineFree` int(11) DEFAULT NULL,
  `inspectionFree` double(10,2) DEFAULT NULL,
  `checkFree` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`chargeId`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `chargeitem_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chargeitem
-- ----------------------------
INSERT INTO `chargeitem` VALUES ('1', '1', '25', '3500.00', '20.00');
INSERT INTO `chargeitem` VALUES ('2', '1', '1000', '1300.00', '1600.00');
INSERT INTO `chargeitem` VALUES ('3', '3', '345', null, '123.00');
INSERT INTO `chargeitem` VALUES ('4', '2', '4', null, '2.00');

-- ----------------------------
-- Table structure for `chargestatus`
-- ----------------------------
DROP TABLE IF EXISTS `chargestatus`;
CREATE TABLE `chargestatus` (
  `chargeStatusId` int(11) NOT NULL AUTO_INCREMENT COMMENT '收费号',
  `chargeItemNo` int(11) NOT NULL COMMENT '收费项目号',
  `chargeAmount` int(11) DEFAULT NULL COMMENT '收费金额',
  `settleAmount` double(10,2) DEFAULT NULL COMMENT '结账金额',
  `cashier` int(11) DEFAULT NULL COMMENT '收款员',
  `patientId` int(11) DEFAULT NULL COMMENT '病人id',
  `checkoutStatus` varchar(255) DEFAULT NULL COMMENT '结账情况',
  `isTransfer` varchar(11) DEFAULT NULL COMMENT '是否转账',
  PRIMARY KEY (`chargeStatusId`),
  KEY `chargeId` (`chargeStatusId`),
  KEY `cashier` (`cashier`),
  KEY `patientId` (`patientId`),
  KEY `chargeItemNo` (`chargeItemNo`),
  CONSTRAINT `chargestatus_ibfk_2` FOREIGN KEY (`cashier`) REFERENCES `user` (`userId`),
  CONSTRAINT `chargestatus_ibfk_3` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`),
  CONSTRAINT `chargestatus_ibfk_4` FOREIGN KEY (`chargeItemNo`) REFERENCES `chargeitem` (`chargeId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chargestatus
-- ----------------------------
INSERT INTO `chargestatus` VALUES ('1', '1', '1500', '2500.00', '3', '1', '0', '0');
INSERT INTO `chargestatus` VALUES ('2', '2', '600', '900.00', '2', '1', '0', '0');
INSERT INTO `chargestatus` VALUES ('3', '2', '600', '900.00', '2', '2', '1', '1');

-- ----------------------------
-- Table structure for `check`
-- ----------------------------
DROP TABLE IF EXISTS `check`;
CREATE TABLE `check` (
  `checkId` int(11) NOT NULL AUTO_INCREMENT COMMENT '检查序号',
  `checkDoctor` int(11) DEFAULT NULL COMMENT '检查医师',
  `checkTime` varchar(255) DEFAULT NULL,
  `checkProjectNo` int(11) DEFAULT NULL COMMENT '检查项目id',
  `checkResult` varchar(255) DEFAULT NULL,
  `doctorAdviceId` int(11) DEFAULT NULL,
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`checkId`),
  KEY `checkProjectNo` (`checkProjectNo`),
  KEY `checkDoctor` (`checkDoctor`),
  KEY `doctorAdviceId` (`doctorAdviceId`),
  CONSTRAINT `check_ibfk_1` FOREIGN KEY (`checkProjectNo`) REFERENCES `checkproject` (`checkProjectNo`),
  CONSTRAINT `check_ibfk_2` FOREIGN KEY (`checkDoctor`) REFERENCES `user` (`userId`),
  CONSTRAINT `check_ibfk_3` FOREIGN KEY (`doctorAdviceId`) REFERENCES `doctoradvice` (`doctorAdviceId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of check
-- ----------------------------
INSERT INTO `check` VALUES ('1', '2', '2019-08-03', '3', '非常好', '2', '0');
INSERT INTO `check` VALUES ('2', '3', '2019-08-04', '4', 'ok', '3', '0');

-- ----------------------------
-- Table structure for `checkproject`
-- ----------------------------
DROP TABLE IF EXISTS `checkproject`;
CREATE TABLE `checkproject` (
  `checkProjectNo` int(8) NOT NULL AUTO_INCREMENT COMMENT '检查序号',
  `checkDate` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '检查日期安排',
  `checkPerson` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '检察负责人员',
  `hospitalizationNumber` int(8) DEFAULT NULL COMMENT '住院号',
  `checkContent` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '检查内容',
  `checkResult` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '检查结果',
  `checkprice` double(10,2) DEFAULT NULL COMMENT '检查费用',
  PRIMARY KEY (`checkProjectNo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of checkproject
-- ----------------------------
INSERT INTO `checkproject` VALUES ('1', null, null, null, '尿半乳糖实验', null, null);
INSERT INTO `checkproject` VALUES ('2', null, null, null, '脑脊液常规', null, null);
INSERT INTO `checkproject` VALUES ('3', null, null, null, '心肌酶谱', null, null);
INSERT INTO `checkproject` VALUES ('4', null, null, null, '胆碱酯酶（CHE）', null, null);
INSERT INTO `checkproject` VALUES ('5', null, null, null, '艾滋抗体', null, null);
INSERT INTO `checkproject` VALUES ('6', null, null, null, '降钙素原（PCT）', null, null);

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `departmentId` int(10) NOT NULL AUTO_INCREMENT COMMENT '科室编号',
  `departmentName` varchar(255) DEFAULT NULL COMMENT '科室名称',
  `departmentAddress` varchar(255) DEFAULT NULL COMMENT '科室地址',
  `departmentTelephone` varchar(255) DEFAULT NULL COMMENT '科室电话',
  `userid` int(11) DEFAULT NULL COMMENT '用户ID',
  `isDelete` int(255) DEFAULT NULL COMMENT '删除',
  PRIMARY KEY (`departmentId`),
  KEY `userid` (`userid`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '妇产科', '南京晓庄弘景大道', '15950507893', '1', '1');
INSERT INTO `department` VALUES ('2', '骨科', '金陵科技学院', '13770118152', '5', '1');
INSERT INTO `department` VALUES ('3', '肿瘤科', '南京药科大学', '15242222', '8', '1');
INSERT INTO `department` VALUES ('4', '传染科', '武汉大学', '15950631425', '34', '0');
INSERT INTO `department` VALUES ('5', '麻醉科', '浙江大学', '15950504265', '5', '0');
INSERT INTO `department` VALUES ('6', '儿科', '上海交通大学', '14762221879', '6', '0');
INSERT INTO `department` VALUES ('7', '内科', '北京理工大学', '14525634789', '7', '0');
INSERT INTO `department` VALUES ('8', '外科', '武汉', '14625630147', '8', '0');
INSERT INTO `department` VALUES ('9', '产科', '北京', '15950507896', '2', '0');
INSERT INTO `department` VALUES ('10', 'qqqq', 'sssss', '234567', '4', '1');
INSERT INTO `department` VALUES ('11', '类风湿', '12#103', '15950504651', '7', '1');
INSERT INTO `department` VALUES ('12', '123', '123', '123', '5', '1');
INSERT INTO `department` VALUES ('13', '66', '66', '66', '5', '1');
INSERT INTO `department` VALUES ('14', '1111', '1111', '85645555', '2', '1');

-- ----------------------------
-- Table structure for `doctoradvice`
-- ----------------------------
DROP TABLE IF EXISTS `doctoradvice`;
CREATE TABLE `doctoradvice` (
  `doctorAdviceId` int(10) NOT NULL AUTO_INCREMENT COMMENT '医嘱id',
  `medicalRecord` int(10) DEFAULT NULL COMMENT '病历',
  `startupDate` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '开出时间',
  `processingDate` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '处理日期',
  `doctorAdviceContent` varchar(50) CHARACTER SET utf8 DEFAULT NULL COMMENT '医嘱内容',
  `processingSchemeNo` int(11) DEFAULT NULL,
  `attendingDoctor` int(10) DEFAULT NULL COMMENT '主治医生',
  `patientId` int(10) DEFAULT NULL COMMENT '病人id',
  `diseaseName` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '疾病名称',
  `leaveHospital` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '出院',
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`doctorAdviceId`),
  KEY `processingSchemeNo` (`processingSchemeNo`),
  KEY `patientId` (`patientId`),
  KEY `doctoradvice_ibfk_2` (`attendingDoctor`),
  CONSTRAINT `doctoradvice_ibfk_1` FOREIGN KEY (`processingSchemeNo`) REFERENCES `processingscheme` (`processingSchemeNo`),
  CONSTRAINT `doctoradvice_ibfk_2` FOREIGN KEY (`attendingDoctor`) REFERENCES `user` (`userId`),
  CONSTRAINT `doctoradvice_ibfk_3` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of doctoradvice
-- ----------------------------
INSERT INTO `doctoradvice` VALUES ('1', '6', '2019.8.4', '2019.8.4', '一日丧命散', null, '2', '1', '心脏病', null, '0');
INSERT INTO `doctoradvice` VALUES ('2', '1', '2020.3.3', '2020.3.3', '心病难医', null, '3', '2', '有毒', null, '0');
INSERT INTO `doctoradvice` VALUES ('3', '4', '2019.8.4', '2019.8.4', '含笑半步颠', null, '3', '2', '白血病', null, '0');

-- ----------------------------
-- Table structure for `drugs`
-- ----------------------------
DROP TABLE IF EXISTS `drugs`;
CREATE TABLE `drugs` (
  `drugsId` int(8) NOT NULL AUTO_INCREMENT COMMENT '药品编号',
  `drugStorageid` int(11) DEFAULT NULL,
  `drugsName` varchar(20) DEFAULT NULL COMMENT '药品名称',
  `specifications` varchar(20) DEFAULT NULL COMMENT '规格',
  `amount` varchar(20) DEFAULT NULL COMMENT '单位',
  `price` double(20,2) DEFAULT NULL COMMENT '单价',
  `manufactureDate` varchar(255) DEFAULT NULL COMMENT '生产日期',
  `guaranteeTime` varchar(255) DEFAULT NULL COMMENT '保质期',
  `supplierId` int(11) DEFAULT NULL,
  PRIMARY KEY (`drugsId`),
  KEY `drugStorageid` (`drugStorageid`),
  KEY `supplierId` (`supplierId`),
  CONSTRAINT `drugs_ibfk_1` FOREIGN KEY (`drugStorageid`) REFERENCES `drugstorage` (`drugStorageid`),
  CONSTRAINT `drugs_ibfk_2` FOREIGN KEY (`supplierId`) REFERENCES `supplier` (`supplierId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugs
-- ----------------------------
INSERT INTO `drugs` VALUES ('1', '1', '阿斯匹林', '0', '602', '20.00', '2019/8/2', '3年', '1');
INSERT INTO `drugs` VALUES ('2', '1', '乙酞螺旋霉素', '1', '15', '20.00', '2019/8/2', '3年', '2');
INSERT INTO `drugs` VALUES ('3', '2', '吗丁啉', '0', '20', '30.00', '2019/8/2', '3年', '3');
INSERT INTO `drugs` VALUES ('4', '2', '开塞露', '1', '1', '11.00', '2019/8/2', '3年', '3');
INSERT INTO `drugs` VALUES ('5', '1', '苯海拉明', '1', '1', '15.00', '2019/8/2', '3年', '2');
INSERT INTO `drugs` VALUES ('6', '2', '如风湿膏', '1', '20', '16.00', '2019/8/2', '3年', '4');
INSERT INTO `drugs` VALUES ('8', null, '123', null, '123', '123.00', '123', '123', '10');

-- ----------------------------
-- Table structure for `drugsreceipt`
-- ----------------------------
DROP TABLE IF EXISTS `drugsreceipt`;
CREATE TABLE `drugsreceipt` (
  `receiptId` int(8) NOT NULL AUTO_INCREMENT COMMENT '请领编号',
  `departmentId` int(11) DEFAULT NULL COMMENT '科室号',
  `drugsId` int(10) DEFAULT NULL COMMENT '药品编号',
  `drugsCount` int(10) DEFAULT NULL COMMENT '领药量',
  `drugStorageId` int(11) DEFAULT NULL,
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`receiptId`),
  KEY `departmentId` (`departmentId`),
  KEY `drugsId` (`drugsId`),
  KEY `drugstorageId` (`drugStorageId`),
  CONSTRAINT `drugsreceipt_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`departmentId`),
  CONSTRAINT `drugsreceipt_ibfk_2` FOREIGN KEY (`drugsId`) REFERENCES `drugs` (`drugsId`),
  CONSTRAINT `drugsreceipt_ibfk_3` FOREIGN KEY (`drugStorageId`) REFERENCES `drugstorage` (`drugStorageid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugsreceipt
-- ----------------------------

-- ----------------------------
-- Table structure for `drugstorage`
-- ----------------------------
DROP TABLE IF EXISTS `drugstorage`;
CREATE TABLE `drugstorage` (
  `drugStorageid` int(8) NOT NULL AUTO_INCREMENT COMMENT '药库',
  `category` varchar(10) DEFAULT NULL COMMENT '类别',
  `inChargePerson` int(20) DEFAULT NULL COMMENT '负责人id',
  `area` double(20,2) DEFAULT NULL COMMENT '面积',
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`drugStorageid`),
  KEY `inChargePerson` (`inChargePerson`),
  CONSTRAINT `drugstorage_ibfk_1` FOREIGN KEY (`inChargePerson`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugstorage
-- ----------------------------
INSERT INTO `drugstorage` VALUES ('1', '药品', '13', '100.00', '1');
INSERT INTO `drugstorage` VALUES ('2', '药品', '14', '200.00', '1');

-- ----------------------------
-- Table structure for `generate`
-- ----------------------------
DROP TABLE IF EXISTS `generate`;
CREATE TABLE `generate` (
  `receipt` int(10) NOT NULL COMMENT '请领单',
  `prescription` int(10) DEFAULT NULL COMMENT '处方号',
  `serialNumber` int(8) DEFAULT NULL COMMENT '编号',
  `generate` int(10) DEFAULT NULL COMMENT '生成量',
  PRIMARY KEY (`receipt`),
  KEY `prescription` (`prescription`),
  CONSTRAINT `generate_ibfk_1` FOREIGN KEY (`prescription`) REFERENCES `prescription` (`prescriptionNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of generate
-- ----------------------------

-- ----------------------------
-- Table structure for `hospitalizationadvice`
-- ----------------------------
DROP TABLE IF EXISTS `hospitalizationadvice`;
CREATE TABLE `hospitalizationadvice` (
  `hospitalizationAdviceId` int(11) NOT NULL DEFAULT '0' COMMENT '住院医嘱id',
  `diseaseName` varchar(255) DEFAULT NULL COMMENT '疾病名称',
  `hospitalizationTime` varchar(255) DEFAULT NULL COMMENT '住院时间',
  `adviceContent` varchar(255) DEFAULT NULL,
  `doctorId` int(11) DEFAULT NULL,
  `hospitalizationId` int(11) DEFAULT NULL,
  `situation` varchar(255) DEFAULT NULL COMMENT '情况',
  `diachargeTime` varchar(255) DEFAULT NULL,
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`hospitalizationAdviceId`),
  KEY `hospitalizationId` (`hospitalizationId`),
  KEY `doctorId` (`doctorId`),
  CONSTRAINT `hospitalizationAdvice_ibfk_1` FOREIGN KEY (`hospitalizationId`) REFERENCES `inpatient` (`hospitalizationId`),
  CONSTRAINT `hospitalizationAdvice_ibfk_2` FOREIGN KEY (`doctorId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospitalizationadvice
-- ----------------------------
INSERT INTO `hospitalizationadvice` VALUES ('1', '神经病', '2018.05.01', '无', '1', '20190001', '1', '2019.08.02', null);
INSERT INTO `hospitalizationadvice` VALUES ('2', '脑血栓', '2019.05.02', '无', '2', '20190002', null, '', null);
INSERT INTO `hospitalizationadvice` VALUES ('3', '羊癫疯', '2019.05.03', '无', '3', '20190003', '', '2019.08.01', null);
INSERT INTO `hospitalizationadvice` VALUES ('4', '肺炎', '2019.05.04', '无', '4', '20190004', null, '', null);

-- ----------------------------
-- Table structure for `hospitalizationcheck`
-- ----------------------------
DROP TABLE IF EXISTS `hospitalizationcheck`;
CREATE TABLE `hospitalizationcheck` (
  `hospitalizationCheckNo` int(11) NOT NULL AUTO_INCREMENT,
  `hospitalizationAdviceId` int(11) DEFAULT NULL,
  `inspectionDoctorId` int(11) DEFAULT NULL,
  `inspectionNo` int(11) DEFAULT NULL,
  `inspectionDate` varchar(255) DEFAULT NULL,
  `inspectionResult` varchar(255) DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`hospitalizationCheckNo`),
  KEY `hospitalizationAdviceId` (`hospitalizationAdviceId`),
  KEY `inspectionDoctorId` (`inspectionDoctorId`),
  KEY `inspectionNo` (`inspectionNo`),
  CONSTRAINT `hospitalizationcheck_ibfk_1` FOREIGN KEY (`hospitalizationAdviceId`) REFERENCES `hospitalizationadvice` (`hospitalizationAdviceId`),
  CONSTRAINT `hospitalizationcheck_ibfk_2` FOREIGN KEY (`inspectionDoctorId`) REFERENCES `user` (`userId`),
  CONSTRAINT `hospitalizationcheck_ibfk_3` FOREIGN KEY (`inspectionNo`) REFERENCES `checkproject` (`checkProjectNo`)
) ENGINE=InnoDB AUTO_INCREMENT=10005 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospitalizationcheck
-- ----------------------------
INSERT INTO `hospitalizationcheck` VALUES ('10001', '1', '1', '1', '2019.08.01', '正常', null);
INSERT INTO `hospitalizationcheck` VALUES ('10002', '2', '2', '2', '2019.08.01', '情况好转', null);
INSERT INTO `hospitalizationcheck` VALUES ('10003', '3', '3', '3', '2019.08.01', '正常', null);
INSERT INTO `hospitalizationcheck` VALUES ('10004', '4', '4', '4', '2019.08.01', '未见好转', null);

-- ----------------------------
-- Table structure for `hospitalizationprescription`
-- ----------------------------
DROP TABLE IF EXISTS `hospitalizationprescription`;
CREATE TABLE `hospitalizationprescription` (
  `prescriptionNo` int(10) NOT NULL AUTO_INCREMENT COMMENT '处方号',
  `residentAdviceId` int(10) DEFAULT NULL COMMENT '医嘱序号',
  `drugsId` int(100) DEFAULT NULL COMMENT '处方内容',
  `drugNo` int(10) DEFAULT NULL COMMENT '住院医师',
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`prescriptionNo`),
  KEY `residentAdviceId` (`residentAdviceId`),
  KEY `drugsId` (`drugsId`),
  CONSTRAINT `hospitalizationPrescription_ibfk_1` FOREIGN KEY (`residentAdviceId`) REFERENCES `hospitalizationadvice` (`hospitalizationAdviceId`),
  CONSTRAINT `hospitalizationPrescription_ibfk_2` FOREIGN KEY (`drugsId`) REFERENCES `drugs` (`drugsId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hospitalizationprescription
-- ----------------------------
INSERT INTO `hospitalizationprescription` VALUES ('1', '1', '1', '3', null);
INSERT INTO `hospitalizationprescription` VALUES ('2', '2', '2', '5', null);
INSERT INTO `hospitalizationprescription` VALUES ('3', '3', '3', '5', null);
INSERT INTO `hospitalizationprescription` VALUES ('4', '4', '4', '8', null);

-- ----------------------------
-- Table structure for `hospitallzationfeeitems`
-- ----------------------------
DROP TABLE IF EXISTS `hospitallzationfeeitems`;
CREATE TABLE `hospitallzationfeeitems` (
  `projecdId` int(10) NOT NULL AUTO_INCREMENT COMMENT '项目序号',
  `prescriptionNo` int(10) DEFAULT NULL COMMENT '处方号',
  `hospitalizationId` int(11) DEFAULT NULL COMMENT '住院号',
  `receivableDate` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '收款日期',
  `cashier` int(10) DEFAULT NULL COMMENT '收款员',
  `chargeMoney` double(20,2) DEFAULT NULL COMMENT '收费金额',
  `checkoutStatus` int(1) DEFAULT NULL COMMENT '结账情况',
  PRIMARY KEY (`projecdId`),
  KEY `prescriptionNo` (`prescriptionNo`),
  KEY `hospitalizationId` (`hospitalizationId`),
  KEY `cashier` (`cashier`),
  CONSTRAINT `hospitallzationfeeitems_ibfk_1` FOREIGN KEY (`prescriptionNo`) REFERENCES `hospitalizationprescription` (`prescriptionNo`),
  CONSTRAINT `hospitallzationfeeitems_ibfk_2` FOREIGN KEY (`hospitalizationId`) REFERENCES `inpatient` (`hospitalizationId`),
  CONSTRAINT `hospitallzationfeeitems_ibfk_3` FOREIGN KEY (`cashier`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hospitallzationfeeitems
-- ----------------------------
INSERT INTO `hospitallzationfeeitems` VALUES ('1', '1', '20190001', '2019.08.01', '1', '1000.00', '1');
INSERT INTO `hospitallzationfeeitems` VALUES ('2', '2', '20190002', '2019.08.01', '2', '2000.00', '1');
INSERT INTO `hospitallzationfeeitems` VALUES ('3', '3', '20190003', '2019.08.01', '3', '5000.00', '0');
INSERT INTO `hospitallzationfeeitems` VALUES ('4', '4', '20190004', '2019.08.01', '4', '1656.20', '1');

-- ----------------------------
-- Table structure for `icu`
-- ----------------------------
DROP TABLE IF EXISTS `icu`;
CREATE TABLE `icu` (
  `icuId` int(10) NOT NULL AUTO_INCREMENT COMMENT '病区号',
  `bedNo` int(8) DEFAULT NULL COMMENT '床位数',
  `icuName` varchar(20) DEFAULT NULL COMMENT '病区名',
  `chargePerson` int(20) DEFAULT NULL COMMENT '负责人',
  `occupantsNo` int(8) DEFAULT NULL COMMENT '入住人数',
  `dischargesNo` int(8) DEFAULT NULL COMMENT '出院人数',
  `treatmentRate` double(4,0) DEFAULT NULL COMMENT '治疗率',
  `improvementRate` double(4,0) DEFAULT NULL COMMENT '好转率',
  `unhealedRate` double(4,0) DEFAULT NULL COMMENT '未愈率',
  `mortality` double(4,0) DEFAULT NULL COMMENT '死亡率',
  `diagnosticCoincidence` varchar(20) DEFAULT NULL COMMENT '诊断符合',
  `bedUtilizationRate` double(4,0) DEFAULT NULL COMMENT '床位使用率',
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`icuId`),
  KEY `icu_ibfk_1` (`chargePerson`),
  CONSTRAINT `icu_ibfk_1` FOREIGN KEY (`chargePerson`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of icu
-- ----------------------------
INSERT INTO `icu` VALUES ('1', '15', '鼓楼区', '13', '5', '2', '50', '50', '50', '50', '符合', '50', '1');
INSERT INTO `icu` VALUES ('2', '20', '江宁区', '3', '6', '3', '30', '40', '40', '51', '符合', '21', '1');
INSERT INTO `icu` VALUES ('3', '301', '秦淮区', '5', '224', '12', '30', '41', '23', '23', '符合', '21', '0');
INSERT INTO `icu` VALUES ('4', '22', '苏微实训基地', '32', '4', '2', '20', '30', '23', '23', '符合', '23', '0');
INSERT INTO `icu` VALUES ('5', '33', '天津', '5', '55', '55', '55', '55', '100', '100', '符合', '100', '0');
INSERT INTO `icu` VALUES ('6', '456', '111', '2', '8', '2', '80', '20', '100', '100', '符合', '100', '0');

-- ----------------------------
-- Table structure for `inpatient`
-- ----------------------------
DROP TABLE IF EXISTS `inpatient`;
CREATE TABLE `inpatient` (
  `hospitalizationId` int(8) NOT NULL AUTO_INCREMENT COMMENT '住院号',
  `patientId` int(10) DEFAULT NULL COMMENT '病人id',
  `departmentid` int(8) DEFAULT NULL COMMENT '入院科别',
  `hospitalizationTime` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '入院时间',
  `bedNumber` int(8) DEFAULT NULL COMMENT '床位号',
  `situation` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '情况',
  `transferSituation` int(1) DEFAULT NULL COMMENT '转科情况',
  `dischargeTime` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '出院时间',
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`hospitalizationId`),
  KEY `patientId` (`patientId`),
  KEY `admissionDepartment` (`departmentid`),
  KEY `bedNumber` (`bedNumber`),
  CONSTRAINT `inpatient_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`),
  CONSTRAINT `inpatient_ibfk_2` FOREIGN KEY (`departmentid`) REFERENCES `department` (`departmentId`),
  CONSTRAINT `inpatient_ibfk_3` FOREIGN KEY (`bedNumber`) REFERENCES `bed` (`bedNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=20190005 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of inpatient
-- ----------------------------
INSERT INTO `inpatient` VALUES ('20190001', '1', '1', '2019.05.01', '1001', '1', null, '2019.08.04', null);
INSERT INTO `inpatient` VALUES ('20190002', '2', '2', '2019.05.02', '1004', '1', null, '', null);
INSERT INTO `inpatient` VALUES ('20190003', '3', '3', '2019.05.03', '1015', '0', null, '2019.08.01', null);
INSERT INTO `inpatient` VALUES ('20190004', '4', '4', '2019.05.04', '2002', '0', null, '', null);

-- ----------------------------
-- Table structure for `medicalrecord`
-- ----------------------------
DROP TABLE IF EXISTS `medicalrecord`;
CREATE TABLE `medicalrecord` (
  `medicalRecordId` int(10) NOT NULL AUTO_INCREMENT COMMENT '病案号',
  `patientId` int(10) DEFAULT NULL COMMENT '病人ID',
  ` category` varchar(255) DEFAULT NULL COMMENT '类别',
  `anamnesis` varchar(255) DEFAULT NULL COMMENT '既往病史',
  `doctorAdviceId` int(11) DEFAULT NULL,
  `idDelete` varchar(255) DEFAULT NULL,
  `departmentId` int(10) DEFAULT NULL COMMENT '入院科室',
  `admissionDate` varchar(255) DEFAULT NULL COMMENT '入院日期',
  `admissionDiagnosis` varchar(255) DEFAULT NULL COMMENT '入院诊断',
  `admissionStatus` varchar(255) DEFAULT NULL COMMENT '入院情况',
  `transfer` varchar(255) DEFAULT NULL COMMENT '转院情况',
  `dischargeTime` datetime DEFAULT NULL COMMENT '出院时间',
  `dischargeDiagnosis` varchar(255) DEFAULT NULL COMMENT '出院诊断',
  `dischargeStatus` varchar(255) DEFAULT NULL COMMENT '出院情况',
  PRIMARY KEY (`medicalRecordId`),
  KEY `patientId` (`patientId`),
  KEY `doctorAdviceId` (`doctorAdviceId`),
  CONSTRAINT `medicalrecord_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`),
  CONSTRAINT `medicalrecord_ibfk_2` FOREIGN KEY (`doctorAdviceId`) REFERENCES `doctoradvice` (`doctorAdviceId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medicalrecord
-- ----------------------------
INSERT INTO `medicalrecord` VALUES ('1', '1', '传染病', '神经病', '3', '0', '1', '1999.6.3', null, null, null, null, null, null);
INSERT INTO `medicalrecord` VALUES ('5', '3', null, '无', null, '0', null, null, null, null, null, null, null, null);
INSERT INTO `medicalrecord` VALUES ('6', '5', null, '无', null, '0', null, null, null, null, null, null, null, null);
INSERT INTO `medicalrecord` VALUES ('7', '1', null, '无', null, '0', null, null, null, null, null, null, null, null);
INSERT INTO `medicalrecord` VALUES ('8', '5', null, 'wu', null, '0', null, null, null, null, null, null, null, null);
INSERT INTO `medicalrecord` VALUES ('9', '2', null, '无', '1', '1', null, null, null, null, null, null, null, null);
INSERT INTO `medicalrecord` VALUES ('10', '4', null, '感冒', '1', '0', null, null, null, null, null, null, null, null);
INSERT INTO `medicalrecord` VALUES ('11', '2', null, '无', '1', '1', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menuId` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `menuName` varchar(255) DEFAULT NULL COMMENT '菜单名',
  `menuURL` varchar(255) DEFAULT NULL COMMENT 'URL',
  `menuImage` varchar(255) DEFAULT NULL COMMENT '菜单图像',
  `parentId` int(11) DEFAULT NULL COMMENT '父母id',
  `menuLevel` int(11) DEFAULT NULL COMMENT '菜单等级',
  `menuSort` int(11) DEFAULT NULL COMMENT '菜单分类',
  `menuDelete` int(11) DEFAULT NULL COMMENT '菜单删除',
  PRIMARY KEY (`menuId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '日常管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('2', '门诊管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('3', '住院管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('4', '药品管理', '', null, null, null, null, null);
INSERT INTO `menu` VALUES ('5', '财务管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('6', '行政管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('7', '员工管理', 'pages/user.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('8', '岗位管理', 'pages/position.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('9', '科室管理', 'pages/department.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('10', '值班管理', 'pages/worktime.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('11', '病区管理', 'pages/icu.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('12', '门诊挂号', 'pages/registrationorder.jsp', null, '2', null, null, null);
INSERT INTO `menu` VALUES ('13', '门诊病历', 'pages/medicalrecord.jsp', null, '2', null, null, null);
INSERT INTO `menu` VALUES ('14', '门诊处方', 'pages/prescription.jsp', null, '2', null, null, null);
INSERT INTO `menu` VALUES ('15', '门诊收费', 'pages/chargeitem.jsp', null, '2', null, null, null);
INSERT INTO `menu` VALUES ('16', '门诊检查', 'pages/check.jsp', null, '2', null, null, null);
INSERT INTO `menu` VALUES ('17', '门诊病人', 'pages/patient.jsp', null, '2', null, null, null);
INSERT INTO `menu` VALUES ('18', '医遗管理', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('19', '住院病人', 'pages/inpatient.jsp', null, '3', null, null, null);
INSERT INTO `menu` VALUES ('20', '床位管理', 'pages/bed.jsp', null, '3', null, null, null);
INSERT INTO `menu` VALUES ('21', '医遗管理', 'pages/hospitalizationAdvice.jsp', null, '3', null, null, null);
INSERT INTO `menu` VALUES ('22', '医院处方', 'pages/hospitalizationprescription.jsp', null, '3', null, null, null);
INSERT INTO `menu` VALUES ('23', '医院收费', 'pages/hospitallzationfeeitems.jsp', null, '3', null, null, null);
INSERT INTO `menu` VALUES ('24', '医嘱检查', 'pages/hospitalizationcheck.jsp', null, '3', null, null, null);
INSERT INTO `menu` VALUES ('25', '手术管理', 'pages/operation.jsp', null, '3', null, null, null);
INSERT INTO `menu` VALUES ('26', '药品管理', 'pages/drugs.jsp', null, '4', null, null, null);
INSERT INTO `menu` VALUES ('27', '订单管理', 'pages/order.jsp', null, '4', null, null, null);
INSERT INTO `menu` VALUES ('28', '药品库存', 'pages/drugstorage.jsp', null, '4', null, null, null);
INSERT INTO `menu` VALUES ('29', '供应商', 'pages/supplier.jsp', null, '4', null, null, null);
INSERT INTO `menu` VALUES ('30', '缺药单', null, null, '4', null, null, null);
INSERT INTO `menu` VALUES ('31', '员工工资', 'pages/salary.jsp', null, '5', null, null, null);
INSERT INTO `menu` VALUES ('32', '收费情况', 'pages/chargestatus.jsp', null, '5', null, null, null);
INSERT INTO `menu` VALUES ('33', '差旅安排', null, null, '6', null, null, null);
INSERT INTO `menu` VALUES ('34', '考勤记录', 'pages/attendanceRecord.jsp', null, '6', null, null, null);

-- ----------------------------
-- Table structure for `operation`
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation` (
  ` operationNumber` int(11) NOT NULL AUTO_INCREMENT COMMENT '手术号',
  `hospitalizationAdviceId` int(11) DEFAULT NULL,
  `operationName` varchar(255) DEFAULT NULL COMMENT '手术名称',
  `operationRoomId` int(11) DEFAULT NULL COMMENT '手术室号',
  `hospitalizationId` int(11) DEFAULT NULL COMMENT '住院号',
  `chiefSurgeonId` int(11) DEFAULT NULL COMMENT '主刀医师号',
  ` operationDate` varchar(255) DEFAULT NULL COMMENT '手术日期',
  `anaesthesiaMode` varchar(255) DEFAULT NULL COMMENT '麻醉方式',
  `incisionCondition` varchar(255) DEFAULT NULL COMMENT '切口情况',
  `operationDuration` varchar(255) DEFAULT NULL COMMENT '手术持续时间',
  `surgicalResults` varchar(255) DEFAULT NULL COMMENT '手术结果',
  `operationPrice` double(10,2) DEFAULT NULL,
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (` operationNumber`),
  KEY `hospitalizationAdviceId` (`hospitalizationAdviceId`),
  KEY `operationRoomId` (`operationRoomId`),
  KEY `hospitalizationId` (`hospitalizationId`),
  KEY `chiefSurgeonId` (`chiefSurgeonId`),
  CONSTRAINT `operation_ibfk_1` FOREIGN KEY (`hospitalizationAdviceId`) REFERENCES `hospitalizationadvice` (`hospitalizationAdviceId`),
  CONSTRAINT `operation_ibfk_2` FOREIGN KEY (`operationRoomId`) REFERENCES `operationroom` (`operationRoomId`),
  CONSTRAINT `operation_ibfk_3` FOREIGN KEY (`hospitalizationId`) REFERENCES `inpatient` (`hospitalizationId`),
  CONSTRAINT `operation_ibfk_4` FOREIGN KEY (`chiefSurgeonId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=712006 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operation
-- ----------------------------
INSERT INTO `operation` VALUES ('517003', '3', '恶性骨瘤广泛切除', '1', '20190001', '3', '2019.05.17', '全身麻醉', null, null, '未完全切除', null, null);
INSERT INTO `operation` VALUES ('712005', '2', '骨片切取术', '3', '20190003', '2', '2019.07.12', '全身麻醉', null, null, '成功', null, null);

-- ----------------------------
-- Table structure for `operationroom`
-- ----------------------------
DROP TABLE IF EXISTS `operationroom`;
CREATE TABLE `operationroom` (
  `operationRoomId` int(11) NOT NULL AUTO_INCREMENT,
  `Address` varchar(255) DEFAULT NULL,
  `inChargePerson` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`operationRoomId`),
  KEY `inChargePerson` (`inChargePerson`),
  CONSTRAINT `operationRoom_ibfk_1` FOREIGN KEY (`inChargePerson`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operationroom
-- ----------------------------
INSERT INTO `operationroom` VALUES ('1', '2001', null, null);
INSERT INTO `operationroom` VALUES ('2', '2002', null, null);
INSERT INTO `operationroom` VALUES ('3', '2003', null, null);
INSERT INTO `operationroom` VALUES ('4', '2004', null, null);
INSERT INTO `operationroom` VALUES ('5', '2005', null, null);
INSERT INTO `operationroom` VALUES ('6', '2006', null, null);

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `orderId` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单号',
  `supplierId` int(10) NOT NULL COMMENT '供应商id',
  `orderItems` int(8) DEFAULT NULL COMMENT '订货项数',
  `orderDate` varchar(255) NOT NULL COMMENT '订货日期',
  `deliveryDate` varchar(255) NOT NULL COMMENT '交货日期',
  `agent` int(20) DEFAULT NULL COMMENT '负责人',
  PRIMARY KEY (`orderId`),
  KEY `supplierId` (`supplierId`),
  KEY `agent` (`agent`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`supplierId`) REFERENCES `supplier` (`supplierId`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`agent`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '1', null, '2019.8.4', '2019.8.5', '1');
INSERT INTO `order` VALUES ('2', '2', null, '2019.8.4', '2019.8.5', '3');
INSERT INTO `order` VALUES ('3', '2', null, '2019.8.4', '2019.8.5', '1');
INSERT INTO `order` VALUES ('4', '1', null, '2019.8.4', '2019.8.5', '3');

-- ----------------------------
-- Table structure for `orderdetails`
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails` (
  `orderDetailsId` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单细则id',
  `orderId` int(10) NOT NULL COMMENT '订单号',
  `drugsId` int(10) NOT NULL COMMENT '药品编号',
  `specifications` varchar(20) DEFAULT NULL COMMENT '规格',
  `drugAmount` int(11) DEFAULT NULL,
  `drugPrice` double(10,2) DEFAULT NULL,
  `batchNumber` varchar(8) DEFAULT NULL COMMENT '此类药品的准批号',
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`orderDetailsId`),
  KEY `orderId` (`orderId`),
  KEY `drugsId` (`drugsId`),
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`orderId`) REFERENCES `order` (`orderId`),
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`drugsId`) REFERENCES `drugs` (`drugsId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------
INSERT INTO `orderdetails` VALUES ('1', '1', '1', null, '10', '15.00', '', '1');
INSERT INTO `orderdetails` VALUES ('2', '2', '2', null, '12', '20.00', null, '1');
INSERT INTO `orderdetails` VALUES ('3', '3', '3', null, '14', '30.00', null, '1');
INSERT INTO `orderdetails` VALUES ('4', '4', '4', null, '16', '50.00', null, '1');

-- ----------------------------
-- Table structure for `outpatient_check`
-- ----------------------------
DROP TABLE IF EXISTS `outpatient_check`;
CREATE TABLE `outpatient_check` (
  `outpatientMedicalRecordId` int(10) NOT NULL AUTO_INCREMENT COMMENT '门诊病历id',
  `checkDoctorId` int(10) DEFAULT NULL COMMENT '检查医师姓名',
  `checkTime` varchar(20) DEFAULT NULL COMMENT '检查时间安排',
  `checkContext` varchar(20) DEFAULT NULL COMMENT '检查内容',
  `checkAnalysis` varchar(20) DEFAULT NULL COMMENT '检查结果分析',
  `checkResult` varchar(20) DEFAULT NULL COMMENT '检查结果',
  `checkCharge` double(10,0) DEFAULT NULL COMMENT '检查收费情况',
  PRIMARY KEY (`outpatientMedicalRecordId`),
  KEY `checkDoctorId` (`checkDoctorId`),
  CONSTRAINT `outpatient_check_ibfk_1` FOREIGN KEY (`checkDoctorId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outpatient_check
-- ----------------------------

-- ----------------------------
-- Table structure for `outpatient_medical_record`
-- ----------------------------
DROP TABLE IF EXISTS `outpatient_medical_record`;
CREATE TABLE `outpatient_medical_record` (
  `medicalRecordNo` int(10) NOT NULL AUTO_INCREMENT COMMENT '病历号',
  `registerId` int(10) DEFAULT NULL COMMENT '挂号id',
  `physician` int(10) DEFAULT NULL COMMENT '主治医师',
  `diagnosticTime` varchar(20) DEFAULT NULL COMMENT '诊断时间',
  `medicalRecordContent` varchar(100) DEFAULT NULL COMMENT '病历内容',
  PRIMARY KEY (`medicalRecordNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outpatient_medical_record
-- ----------------------------

-- ----------------------------
-- Table structure for `outpatient_physician_on_duty`
-- ----------------------------
DROP TABLE IF EXISTS `outpatient_physician_on_duty`;
CREATE TABLE `outpatient_physician_on_duty` (
  `outpatientDoctorId` int(8) NOT NULL AUTO_INCREMENT COMMENT '值班医师id',
  `register` int(10) DEFAULT NULL COMMENT '挂号',
  `doctorId` int(10) DEFAULT NULL COMMENT '医师id',
  `dutyDate` varchar(255) DEFAULT NULL COMMENT '值班日期',
  PRIMARY KEY (`outpatientDoctorId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outpatient_physician_on_duty
-- ----------------------------

-- ----------------------------
-- Table structure for `outpatient_test`
-- ----------------------------
DROP TABLE IF EXISTS `outpatient_test`;
CREATE TABLE `outpatient_test` (
  `patientTestNo` int(10) NOT NULL AUTO_INCREMENT COMMENT '病人检验序列号',
  `outpatientMedicalRecordId` int(10) DEFAULT NULL COMMENT '门诊病历id',
  `testDoctor` int(10) DEFAULT NULL COMMENT '检验医师',
  `testTime` varchar(0) DEFAULT NULL COMMENT '检验时间安排',
  `testContext` varchar(100) DEFAULT NULL COMMENT '检验内容',
  `testAnalysis` varchar(100) DEFAULT NULL COMMENT '检验结果分析',
  `testResult` varchar(100) DEFAULT NULL COMMENT '检验结果',
  `testCharge` double(20,0) DEFAULT NULL COMMENT '检验收费情况',
  PRIMARY KEY (`patientTestNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outpatient_test
-- ----------------------------

-- ----------------------------
-- Table structure for `patient`
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `patientId` int(10) NOT NULL AUTO_INCREMENT COMMENT '病人ID',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  `marrage` varchar(100) DEFAULT NULL COMMENT '婚姻情况',
  `occupation` varchar(255) DEFAULT NULL COMMENT '职业',
  `birthPlace` varchar(255) DEFAULT NULL COMMENT '出生地',
  `nation` varchar(255) DEFAULT NULL COMMENT '民族',
  `nationality` varchar(255) DEFAULT NULL COMMENT '国籍',
  `idCard` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `companyAndAddress` varchar(255) DEFAULT NULL COMMENT '单位及地址',
  `telephone` varchar(255) DEFAULT NULL COMMENT '电话',
  `postalCode` int(10) DEFAULT NULL COMMENT '邮政编码',
  `registeredAddress` varchar(255) DEFAULT NULL COMMENT '户口地址',
  `contactsName` varchar(255) DEFAULT NULL COMMENT '联系人姓名',
  `contactsAddress` varchar(255) DEFAULT NULL COMMENT '联系人地址',
  `contactsRelationship` varchar(255) DEFAULT NULL COMMENT '联系人关系',
  `contactsTelephone` varchar(255) DEFAULT NULL COMMENT '联系人电话',
  `isDelete` int(1) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`patientId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('1', '翟高', '男', '2019-07-17', '23', '未婚', '程序员', '南通', '汉', '中国', '320981199703036687', '江苏省南京市软件大道3601号', '15151341625', '210000', null, '瞿国栋', '江苏省南通市', '父亲', '13524789636', '0');
INSERT INTO `patient` VALUES ('2', '薛雨轩', '男', '2019-07-02', '22', '已婚', '销售员', '北京', '汉', '中国', '320981199805202451', '北京市南京路3501号', '18052895674', '100000', null, '许芳', '北京市南京路欣然居11#805', '妻子', '13745685410', '0');
INSERT INTO `patient` VALUES ('3', '尚庆阳', '男', '2019-07-10', '18', '未婚', '学生', '连云港', '汉', '中国', '320981200108135417', '江苏省南京市南京晓庄学院', '15148275130', '210000', '·', '殷婷', '江苏省南通市', '母亲', '13754826521', '0');
INSERT INTO `patient` VALUES ('4', '沈梦溪', '男', '2019-07-03', '28', '未婚', '宇航员', '盐城', '汉', '中国', '320981199801105711', '北京市中关村666号', '13401792750', '100000', '江苏省盐城市东台市许河镇四仓村三组82号', '沈国云', '上海市嘉定区', '母亲', '13524789636', '0');
INSERT INTO `patient` VALUES ('5', '林轩', '女', '2019-07-11', '23', '未婚', '教授', '成都', '汉', '中国', '320981199805202451', '成都百兴区142号', '13869678451', null, null, '林志远', '成都三区云鹤院', '父亲', '13879632451', '0');

-- ----------------------------
-- Table structure for `pharmacydepot`
-- ----------------------------
DROP TABLE IF EXISTS `pharmacydepot`;
CREATE TABLE `pharmacydepot` (
  `pharmacyDepotId` int(8) NOT NULL AUTO_INCREMENT COMMENT '药库号',
  `receiptId` int(8) DEFAULT NULL COMMENT '请领单编号',
  `chargePersonId` int(10) DEFAULT NULL COMMENT '负责人号',
  `category` varchar(20) DEFAULT NULL COMMENT '类别',
  `area` double(20,0) DEFAULT NULL COMMENT '面积',
  PRIMARY KEY (`pharmacyDepotId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pharmacydepot
-- ----------------------------

-- ----------------------------
-- Table structure for `position`
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `isDelete` int(11) DEFAULT NULL,
  `postNumber` int(10) NOT NULL AUTO_INCREMENT COMMENT '岗位编号',
  `postName` varchar(255) DEFAULT NULL COMMENT '岗位名称',
  `departmentId` int(11) DEFAULT NULL COMMENT '科室编号',
  `postSalary` int(11) DEFAULT NULL COMMENT '岗位工资',
  PRIMARY KEY (`postNumber`),
  KEY `departmentId` (`departmentId`),
  CONSTRAINT `position_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`departmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '1', '院长', '4', '4000');
INSERT INTO `position` VALUES ('1', '2', '副院长1', '2', '5000');
INSERT INTO `position` VALUES ('0', '3', '医师', '4', '3000');
INSERT INTO `position` VALUES ('0', '4', '护士', '3', '3500');
INSERT INTO `position` VALUES ('0', '5', '保安', '3', '3500');
INSERT INTO `position` VALUES ('0', '6', '保洁员', '6', '4000');
INSERT INTO `position` VALUES ('0', '7', '厨师', '5', '3000');
INSERT INTO `position` VALUES ('0', '8', '护士长', '6', '4500');
INSERT INTO `position` VALUES ('0', '9', '科长', '4', '5000');
INSERT INTO `position` VALUES ('0', '11', '实习护士', '7', '4000');
INSERT INTO `position` VALUES ('0', '12', '护士', '2', '3500');
INSERT INTO `position` VALUES ('0', '13', '麻醉师', '5', '7000');
INSERT INTO `position` VALUES ('1', '14', '清洁工', '2', '3500');
INSERT INTO `position` VALUES ('0', '15', '护士', '5', '3000');
INSERT INTO `position` VALUES ('0', '16', '警卫', '4', '3000');
INSERT INTO `position` VALUES ('0', '17', '医师', '4', '5000');
INSERT INTO `position` VALUES ('0', '18', '保安队长', '7', '5000');
INSERT INTO `position` VALUES ('0', '19', '护士', '4', '4000');
INSERT INTO `position` VALUES ('0', '20', '实习医生', '3', '4000');
INSERT INTO `position` VALUES ('0', '21', 'shixi医生', '4', '3000');

-- ----------------------------
-- Table structure for `positionmenu`
-- ----------------------------
DROP TABLE IF EXISTS `positionmenu`;
CREATE TABLE `positionmenu` (
  `postId` int(11) DEFAULT NULL COMMENT '岗位编号',
  `menuId` int(11) DEFAULT NULL,
  `postNumber` int(11) DEFAULT NULL COMMENT '这个没用',
  `pmid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  PRIMARY KEY (`pmid`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of positionmenu
-- ----------------------------
INSERT INTO `positionmenu` VALUES ('1', '1', null, '54');
INSERT INTO `positionmenu` VALUES ('1', '7', null, '55');
INSERT INTO `positionmenu` VALUES ('1', '8', null, '56');
INSERT INTO `positionmenu` VALUES ('1', '9', null, '57');
INSERT INTO `positionmenu` VALUES ('1', '10', null, '58');
INSERT INTO `positionmenu` VALUES ('1', '11', null, '59');
INSERT INTO `positionmenu` VALUES ('1', '12', null, '60');
INSERT INTO `positionmenu` VALUES ('1', '13', null, '61');
INSERT INTO `positionmenu` VALUES ('1', '5', null, '62');
INSERT INTO `positionmenu` VALUES ('1', '2', null, '66');
INSERT INTO `positionmenu` VALUES ('1', '3', null, '67');
INSERT INTO `positionmenu` VALUES ('1', '4', null, '68');
INSERT INTO `positionmenu` VALUES ('1', '6', null, '70');
INSERT INTO `positionmenu` VALUES ('1', '14', null, '71');
INSERT INTO `positionmenu` VALUES ('1', '15', null, '72');
INSERT INTO `positionmenu` VALUES ('1', '16', null, '73');
INSERT INTO `positionmenu` VALUES ('1', '17', null, '74');
INSERT INTO `positionmenu` VALUES ('1', '19', null, '76');
INSERT INTO `positionmenu` VALUES ('1', '20', null, '77');
INSERT INTO `positionmenu` VALUES ('1', '21', null, '78');
INSERT INTO `positionmenu` VALUES ('1', '22', null, '79');
INSERT INTO `positionmenu` VALUES ('1', '23', null, '80');
INSERT INTO `positionmenu` VALUES ('1', '24', null, '81');
INSERT INTO `positionmenu` VALUES ('1', '25', null, '82');
INSERT INTO `positionmenu` VALUES ('1', '26', null, '83');
INSERT INTO `positionmenu` VALUES ('1', '27', null, '84');
INSERT INTO `positionmenu` VALUES ('1', '28', null, '85');
INSERT INTO `positionmenu` VALUES ('1', '29', null, '86');
INSERT INTO `positionmenu` VALUES ('1', '31', null, '88');
INSERT INTO `positionmenu` VALUES ('1', '32', null, '89');
INSERT INTO `positionmenu` VALUES ('1', '34', null, '91');
INSERT INTO `positionmenu` VALUES ('12', '1', null, '101');
INSERT INTO `positionmenu` VALUES ('12', '7', null, '102');
INSERT INTO `positionmenu` VALUES ('12', '8', null, '103');
INSERT INTO `positionmenu` VALUES ('12', '9', null, '104');
INSERT INTO `positionmenu` VALUES ('12', '10', null, '105');
INSERT INTO `positionmenu` VALUES ('12', '2', null, '106');
INSERT INTO `positionmenu` VALUES ('12', '12', null, '107');
INSERT INTO `positionmenu` VALUES ('12', '14', null, '108');
INSERT INTO `positionmenu` VALUES ('12', '16', null, '109');
INSERT INTO `positionmenu` VALUES ('12', '18', null, '110');
INSERT INTO `positionmenu` VALUES ('12', '3', null, '111');
INSERT INTO `positionmenu` VALUES ('12', '20', null, '112');

-- ----------------------------
-- Table structure for `prescription`
-- ----------------------------
DROP TABLE IF EXISTS `prescription`;
CREATE TABLE `prescription` (
  `prescriptionNumber` int(10) NOT NULL AUTO_INCREMENT COMMENT '处方号',
  `drugsId` int(11) DEFAULT NULL,
  `drugNo` int(11) DEFAULT NULL,
  `doctorAdviceId` int(10) DEFAULT NULL COMMENT '所属医嘱号',
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`prescriptionNumber`),
  KEY `drugsId` (`drugsId`),
  KEY `doctorAdviceId` (`doctorAdviceId`),
  CONSTRAINT `prescription_ibfk_1` FOREIGN KEY (`drugsId`) REFERENCES `drugs` (`drugsId`),
  CONSTRAINT `prescription_ibfk_2` FOREIGN KEY (`doctorAdviceId`) REFERENCES `doctoradvice` (`doctorAdviceId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prescription
-- ----------------------------
INSERT INTO `prescription` VALUES ('1', '3', null, '2', '0');
INSERT INTO `prescription` VALUES ('2', '3', null, '2', '1');
INSERT INTO `prescription` VALUES ('3', '3', null, '2', '0');
INSERT INTO `prescription` VALUES ('4', '5', null, '1', '1');

-- ----------------------------
-- Table structure for `processingscheme`
-- ----------------------------
DROP TABLE IF EXISTS `processingscheme`;
CREATE TABLE `processingscheme` (
  `processingSchemeNo` int(11) NOT NULL AUTO_INCREMENT COMMENT '处理方案号',
  `physicianId` int(11) DEFAULT NULL COMMENT '医师id',
  `beginTime` varchar(255) DEFAULT NULL COMMENT '开出时间',
  `processingSchemeContext` varchar(255) DEFAULT NULL COMMENT '处理方案内容',
  PRIMARY KEY (`processingSchemeNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of processingscheme
-- ----------------------------

-- ----------------------------
-- Table structure for `registrationorder`
-- ----------------------------
DROP TABLE IF EXISTS `registrationorder`;
CREATE TABLE `registrationorder` (
  `registerId` int(11) NOT NULL AUTO_INCREMENT COMMENT '挂号id',
  `registrationNumber` int(11) DEFAULT NULL COMMENT '挂号编号',
  `registrationDate` varchar(255) DEFAULT NULL COMMENT '挂号日期',
  `registeredFee` double(10,2) DEFAULT NULL COMMENT '挂号费',
  `registrationDepartment` int(11) DEFAULT NULL COMMENT '挂号科室',
  `physicianInCharge` int(11) DEFAULT NULL COMMENT '主治医师',
  `patientId` int(11) DEFAULT NULL,
  `registeredPersonId` int(11) DEFAULT NULL COMMENT '挂号人员',
  PRIMARY KEY (`registerId`),
  KEY `registrationDepartment` (`registrationDepartment`),
  KEY `patientId` (`patientId`),
  KEY `registrationorder_ibfk_2` (`physicianInCharge`),
  KEY `registrationorder_ibfk_4` (`registeredPersonId`),
  CONSTRAINT `registrationorder_ibfk_1` FOREIGN KEY (`registrationDepartment`) REFERENCES `department` (`departmentId`),
  CONSTRAINT `registrationorder_ibfk_2` FOREIGN KEY (`physicianInCharge`) REFERENCES `user` (`userId`),
  CONSTRAINT `registrationorder_ibfk_3` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`),
  CONSTRAINT `registrationorder_ibfk_4` FOREIGN KEY (`registeredPersonId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registrationorder
-- ----------------------------
INSERT INTO `registrationorder` VALUES ('1', '1', '2019-08-03', '666.00', '7', '1', '1', '3');
INSERT INTO `registrationorder` VALUES ('34', '0', '2019-08-13', '66666.00', '3', '1', '2', '6');
INSERT INTO `registrationorder` VALUES ('35', '0', '2019-08-14', '123456.00', '4', '1', '3', '30');
INSERT INTO `registrationorder` VALUES ('36', '0', '2019-08-10', '9999.00', '3', '1', '2', '3');
INSERT INTO `registrationorder` VALUES ('37', '0', '2019-08-08', '123.00', '3', '1', '2', '1');
INSERT INTO `registrationorder` VALUES ('38', '0', '2019-08-08', '14.00', '2', '1', '1', '1');
INSERT INTO `registrationorder` VALUES ('39', '1', '', '200.00', '5', '1', '1', '5');

-- ----------------------------
-- Table structure for `salary`
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `salaryId` int(11) NOT NULL AUTO_INCREMENT,
  `salary` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`salaryId`),
  KEY `uid` (`uid`),
  CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary
-- ----------------------------
INSERT INTO `salary` VALUES ('1', '4000', '1', '1');
INSERT INTO `salary` VALUES ('2', '5000', '4', '0');
INSERT INTO `salary` VALUES ('3', '6000', '3', '0');
INSERT INTO `salary` VALUES ('4', '2600', '6', '0');
INSERT INTO `salary` VALUES ('5', '5000', '8', '0');
INSERT INTO `salary` VALUES ('6', '4500', '8', '0');
INSERT INTO `salary` VALUES ('7', '3600', '28', '0');
INSERT INTO `salary` VALUES ('8', '4800', '7', '0');
INSERT INTO `salary` VALUES ('9', '2000', '2', '0');
INSERT INTO `salary` VALUES ('10', '4000', '13', '1');

-- ----------------------------
-- Table structure for `supplier`
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `supplierId` int(10) NOT NULL AUTO_INCREMENT COMMENT '供应商号',
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `address` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `tel` varchar(15) CHARACTER SET utf8 DEFAULT NULL,
  `creditSituation` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '信贷情况',
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`supplierId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', '周伟伟', '欣然居815', '110', '良好', '0');
INSERT INTO `supplier` VALUES ('2', '涂元卉', '欣然居815', '118', '良好', '0');
INSERT INTO `supplier` VALUES ('3', '徐家骆', '欣然居815', '115', '良好', '1');
INSERT INTO `supplier` VALUES ('4', '于赟萧', '欣然居815', '113', '优秀', '1');
INSERT INTO `supplier` VALUES ('10', '沈浩宇', '2142', '12421', '良好', '1');
INSERT INTO `supplier` VALUES ('12', 'tuyuanhui', '815', '1165', '优秀', '1');
INSERT INTO `supplier` VALUES ('13', '123', '123', '123', 'creditsituation', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户名',
  `userPwd` varchar(255) DEFAULT NULL COMMENT '密码',
  `userSex` varchar(255) DEFAULT NULL COMMENT '性别',
  `userPhoto` varchar(255) DEFAULT NULL COMMENT '头像',
  `userCard` varchar(255) DEFAULT NULL COMMENT '卡片',
  `birthday` varchar(255) DEFAULT NULL COMMENT '出生日期',
  `postId` int(11) DEFAULT NULL COMMENT '岗位编号',
  `state` int(11) DEFAULT NULL COMMENT '用户状态',
  `icuId` int(10) DEFAULT NULL COMMENT '病区号',
  `descc` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '沈浩宇', 'shy', '女', '20190729/20190729112746_327.jpeg', '320922199706054861', '1998.04.06', '11', '1', '3', '妇科主任');
INSERT INTO `user` VALUES ('2', '张三', '789456', '男', '20190729/20190729112756_165.jpeg', '320922199808024568', '1988.08.08', '8', '1', '3', '医师');
INSERT INTO `user` VALUES ('3', '李四', '12345', '男', '20190729/20190729112804_977.jpeg', '320922199808027415', '1998.10.13', '2', '1', '2', '医师');
INSERT INTO `user` VALUES ('4', '王五', '123321755', '男', '20190729/20190729112813_567.jpeg', '320922199808028956', '1987.12.02', '2', '0', '3', '医师');
INSERT INTO `user` VALUES ('5', '赵六', '123zzzz', '男', '20190729/20190729112824_82.jpeg', '320922199808024812', '1996.03.25', '4', '0', '1', '医师');
INSERT INTO `user` VALUES ('6', '白菜', '123zzzz', '男', '20190729/20190729112834_946.jpeg', '320922199808026547', '1976.01.03', '3', '0', '4', '医师');
INSERT INTO `user` VALUES ('7', '王芳', '123', '女', '20190729/20190729112849_909.jpg', '320922199808026254', '1999.09.09', '5', '0', '2', '医师');
INSERT INTO `user` VALUES ('8', '薛武', 'xw123', '男', '20190729/20190729112901_76.jpeg', '320922199808021680', '1998.07.08', '3', '0', '1', '医师');
INSERT INTO `user` VALUES ('9', '黄瓜', '123', '女', '20190729/20190729112911_343.jpeg', '320922199808021463', '2002.02.03', '4', '0', '8', '医师');
INSERT INTO `user` VALUES ('12', '瞿高明', '123', '男', '20190729/20190729112920_588.jpeg', '320922199808024926', '1999.11.11', '6', '0', '6', '产科主任');
INSERT INTO `user` VALUES ('13', '涂元卉', '123', '男', '20190729/20190729112931_503.jpeg', '320922199808024815', '1997.10.05', '3', '0', '3', '主治医师');
INSERT INTO `user` VALUES ('14', 'root', 'root', '男', '20190729/20190729112939_893.jpg', '320922199808024561', '1998.05.30', '1', '0', '1', '院长');
INSERT INTO `user` VALUES ('28', '杰伦', '12345', '女', '20190729/20190729112947_680.jpeg', '320922199808044712', '2019-07-18', '4', '0', '1', '护士');
INSERT INTO `user` VALUES ('29', '伟伟', '123456', '女', '20190729/20190729112957_264.jpg', '320922199808044712', '2019-07-26', '5', '0', '2', '护士');
INSERT INTO `user` VALUES ('30', '李刚', '369369', '女', '20190729/20190729151032_512.jpeg', '320922199808044712', '2019-07-19', '7', '0', null, null);
INSERT INTO `user` VALUES ('31', '瞿高明', '123456', '男', '20190729/20190729174023_501.jpeg', '320922199808044712', '2019-07-18', '1', '0', null, null);
INSERT INTO `user` VALUES ('32', '图图', 'tutu', '男', '20190729/20190729174023_501.jpeg', '320922199808044712', '2019-07-02', '1', '0', null, null);
INSERT INTO `user` VALUES ('33', 'ttt', '123456', '男', '', '320981199801105711', '2019-08-15', '1', '0', null, null);
INSERT INTO `user` VALUES ('34', '123', '123456', '男', '', '320981199801105711', '2019-08-08', '1', '0', null, null);

-- ----------------------------
-- Table structure for `worktime`
-- ----------------------------
DROP TABLE IF EXISTS `worktime`;
CREATE TABLE `worktime` (
  `wkId` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `workTime` varchar(20) DEFAULT NULL,
  `departmentId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`wkId`),
  KEY `departmentId` (`departmentId`),
  KEY `userId` (`userId`),
  CONSTRAINT `workTime_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`departmentId`),
  CONSTRAINT `workTime_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worktime
-- ----------------------------
INSERT INTO `worktime` VALUES ('1', '2019-08-06', '6', '5');
INSERT INTO `worktime` VALUES ('2', '2019-08-22', '3', '4');
INSERT INTO `worktime` VALUES ('3', '2019-08-06', '4', '3');
INSERT INTO `worktime` VALUES ('4', '2021-08-11', '5', '6');
INSERT INTO `worktime` VALUES ('5', '2019-07-28', '8', '31');
INSERT INTO `worktime` VALUES ('6', '2019-08-23', '1', '1');
INSERT INTO `worktime` VALUES ('7', '2019-08-05', '4', '2');
