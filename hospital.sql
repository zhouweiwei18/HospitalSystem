/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50612
Source Host           : localhost:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 50612
File Encoding         : 65001

Date: 2019-07-29 20:47:42
*/

SET FOREIGN_KEY_CHECKS=0;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bed
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chargeitem
-- ----------------------------

-- ----------------------------
-- Table structure for `chargestatus`
-- ----------------------------
DROP TABLE IF EXISTS `chargestatus`;
CREATE TABLE `chargestatus` (
  `chargeItemNo` int(11) NOT NULL AUTO_INCREMENT COMMENT '收费项目号',
  `chargeId` int(11) DEFAULT NULL COMMENT '收费号',
  `chargeAmount` int(11) DEFAULT NULL COMMENT '收费金额',
  `settleAmount` double(10,2) DEFAULT NULL COMMENT '结账金额',
  `cashier` int(11) DEFAULT NULL COMMENT '收款员',
  `patientId` int(11) DEFAULT NULL COMMENT '病人id',
  `checkoutStatus` varchar(255) DEFAULT NULL COMMENT '结账情况',
  `isTransfer` int(11) DEFAULT NULL COMMENT '是否转账',
  PRIMARY KEY (`chargeItemNo`),
  KEY `chargeId` (`chargeId`),
  KEY `cashier` (`cashier`),
  KEY `patientId` (`patientId`),
  CONSTRAINT `chargestatus_ibfk_1` FOREIGN KEY (`chargeId`) REFERENCES `chargeitem` (`chargeId`),
  CONSTRAINT `chargestatus_ibfk_2` FOREIGN KEY (`cashier`) REFERENCES `user` (`userId`),
  CONSTRAINT `chargestatus_ibfk_3` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chargestatus
-- ----------------------------

-- ----------------------------
-- Table structure for `check`
-- ----------------------------
DROP TABLE IF EXISTS `check`;
CREATE TABLE `check` (
  `checkId` int(11) DEFAULT NULL COMMENT '检查序号',
  `checkDoctor` int(11) DEFAULT NULL COMMENT '检查医师',
  `checkTime` varchar(255) DEFAULT NULL,
  `checkProjectNo` int(11) DEFAULT NULL COMMENT '检查项目id',
  `checkResult` varchar(255) DEFAULT NULL,
  `doctorAdviceId` int(11) DEFAULT NULL,
  `isDelete` int(1) DEFAULT NULL,
  KEY `checkProjectNo` (`checkProjectNo`),
  KEY `checkDoctor` (`checkDoctor`),
  KEY `doctorAdviceId` (`doctorAdviceId`),
  CONSTRAINT `check_ibfk_1` FOREIGN KEY (`checkProjectNo`) REFERENCES `checkproject` (`checkProjectNo`),
  CONSTRAINT `check_ibfk_2` FOREIGN KEY (`checkDoctor`) REFERENCES `user` (`userId`),
  CONSTRAINT `check_ibfk_3` FOREIGN KEY (`doctorAdviceId`) REFERENCES `doctoradvice` (`doctorAdviceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of check
-- ----------------------------

-- ----------------------------
-- Table structure for `checkproject`
-- ----------------------------
DROP TABLE IF EXISTS `checkproject`;
CREATE TABLE `checkproject` (
  `checkProjectNo` int(8) NOT NULL AUTO_INCREMENT COMMENT '检查序号',
  `checkDate` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '检查日期安排',
  `checkPerson` varchar(10) CHARACTER SET utf8 DEFAULT NULL COMMENT '检察负责人员',
  `hospitalizationNumber` int(8) DEFAULT NULL COMMENT '住院号',
  `checkContent` varchar(50) DEFAULT NULL COMMENT '检查内容',
  `checkResult` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '检查结果',
  `checkprice` double(10,2) DEFAULT NULL COMMENT '检查费用',
  PRIMARY KEY (`checkProjectNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of checkproject
-- ----------------------------

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
  `isDelete` varchar(255) DEFAULT NULL COMMENT '删除',
  PRIMARY KEY (`departmentId`),
  KEY `userid` (`userid`),
  CONSTRAINT `department_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '妇产科', '南京晓庄弘景大道', '15950507893', '32', '0');
INSERT INTO `department` VALUES ('2', '骨科', '金陵科技学院', '13770118152', '2', '1');
INSERT INTO `department` VALUES ('3', '肿瘤科', '南京药科大学', '15240354249', '29', '0');
INSERT INTO `department` VALUES ('4', '传染科', '武汉大学', '15950631425', '4', '0');
INSERT INTO `department` VALUES ('5', '麻醉科', '浙江大学', '15950504265', '30', '0');
INSERT INTO `department` VALUES ('6', '儿科', '上海交通大学', '14762221879', '6', '1');
INSERT INTO `department` VALUES ('7', '内科', '北京理工大学', '14525634789', '7', '1');
INSERT INTO `department` VALUES ('8', '外科', '武汉', '14625630147', '31', '1');

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of doctoradvice
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugs
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugstorage
-- ----------------------------

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

-- ----------------------------
-- Table structure for `hospitalizationcheck`
-- ----------------------------
DROP TABLE IF EXISTS `hospitalizationcheck`;
CREATE TABLE `hospitalizationcheck` (
  `hospitalizationCheckNo` int(8) NOT NULL AUTO_INCREMENT COMMENT '住院检验序号',
  `hospitalizationAdviceId` int(11) DEFAULT NULL COMMENT '住院医嘱',
  `inspectionDoctorId` int(10) DEFAULT NULL COMMENT '检验医师',
  `inspectionNo` int(8) DEFAULT NULL COMMENT '检查项目号',
  `inspectionDate` varchar(20) CHARACTER SET utf8 DEFAULT NULL COMMENT '检验日期',
  `inspectionResult` varchar(100) CHARACTER SET utf8 DEFAULT NULL COMMENT '检验结果',
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`hospitalizationCheckNo`),
  KEY `inspectionDoctorId` (`inspectionDoctorId`),
  KEY `inspectionproject_ibfk_2` (`hospitalizationAdviceId`),
  KEY `inspectionContent` (`inspectionNo`),
  CONSTRAINT `hospitalizationCheck_ibfk_1` FOREIGN KEY (`inspectionDoctorId`) REFERENCES `user` (`userId`),
  CONSTRAINT `hospitalizationCheck_ibfk_2` FOREIGN KEY (`hospitalizationAdviceId`) REFERENCES `hospitalizationadvice` (`hospitalizationAdviceId`),
  CONSTRAINT `hospitalizationCheck_ibfk_3` FOREIGN KEY (`inspectionNo`) REFERENCES `checkproject` (`checkProjectNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hospitalizationcheck
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hospitalizationprescription
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of hospitallzationfeeitems
-- ----------------------------

-- ----------------------------
-- Table structure for `icu`
-- ----------------------------
DROP TABLE IF EXISTS `icu`;
CREATE TABLE `icu` (
  `icuId` int(10) NOT NULL AUTO_INCREMENT COMMENT '病区号',
  `bedNo` int(8) DEFAULT NULL COMMENT '床位数',
  `userId` int(10) DEFAULT NULL COMMENT '用户ID',
  `icuName` varchar(20) DEFAULT NULL COMMENT '病区名',
  `chargePerson` varchar(20) DEFAULT NULL COMMENT '负责人',
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
  KEY `userId` (`userId`),
  CONSTRAINT `icu_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of icu
-- ----------------------------

-- ----------------------------
-- Table structure for `inpatient`
-- ----------------------------
DROP TABLE IF EXISTS `inpatient`;
CREATE TABLE `inpatient` (
  `hospitalizationId` int(8) NOT NULL AUTO_INCREMENT COMMENT '住院号',
  `patientId` int(10) DEFAULT NULL COMMENT '病人id',
  `admissionDepartment` int(8) DEFAULT NULL COMMENT '入院科别',
  `hospitalizationTime` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '入院时间',
  `bedNumber` int(8) DEFAULT NULL COMMENT '床位号',
  `situation` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '情况',
  `transferSituation` int(1) DEFAULT NULL COMMENT '转科情况',
  `dischargeTime` varchar(255) CHARACTER SET utf8 DEFAULT NULL COMMENT '出院时间',
  `isDelete` int(11) DEFAULT NULL,
  PRIMARY KEY (`hospitalizationId`),
  KEY `patientId` (`patientId`),
  KEY `admissionDepartment` (`admissionDepartment`),
  KEY `bedNumber` (`bedNumber`),
  CONSTRAINT `inpatient_ibfk_1` FOREIGN KEY (`patientId`) REFERENCES `patient` (`patientId`),
  CONSTRAINT `inpatient_ibfk_2` FOREIGN KEY (`admissionDepartment`) REFERENCES `department` (`departmentId`),
  CONSTRAINT `inpatient_ibfk_3` FOREIGN KEY (`bedNumber`) REFERENCES `bed` (`bedNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of inpatient
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medicalrecord
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '日常管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('2', '门诊管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('3', '住院管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('4', '药品管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('5', '财务管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('6', '行政管理', null, null, null, null, null, null);
INSERT INTO `menu` VALUES ('7', '员工管理', 'pages/user.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('8', '岗位管理', 'pages/position.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('9', '科室管理', 'pages/department.jsp', null, '1', null, null, null);
INSERT INTO `menu` VALUES ('10', '值班管理', null, null, '1', null, null, null);
INSERT INTO `menu` VALUES ('11', '假期值班日期', null, null, '1', null, null, null);
INSERT INTO `menu` VALUES ('12', '病区管理', null, null, '1', null, null, null);
INSERT INTO `menu` VALUES ('13', '设施管理', null, null, '1', null, null, null);
INSERT INTO `menu` VALUES ('14', '门诊挂号', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('15', '门诊病历', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('16', '门诊处方', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('17', '门诊收费', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('18', '门诊检查', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('19', '门诊病人', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('20', '医遗管理', null, null, '2', null, null, null);
INSERT INTO `menu` VALUES ('21', '住院病人', null, null, '3', null, null, null);
INSERT INTO `menu` VALUES ('22', '床位管理', null, null, '3', null, null, null);
INSERT INTO `menu` VALUES ('23', '医遗管理', null, null, '3', null, null, null);
INSERT INTO `menu` VALUES ('24', '医院处方', null, null, '3', null, null, null);
INSERT INTO `menu` VALUES ('25', '医院收费', null, null, '3', null, null, null);
INSERT INTO `menu` VALUES ('26', '医嘱检查', null, null, '3', null, null, null);
INSERT INTO `menu` VALUES ('27', '手术管理', null, null, '3', null, null, null);
INSERT INTO `menu` VALUES ('28', '药品管理', null, null, '4', null, null, null);
INSERT INTO `menu` VALUES ('29', '订单管理', null, null, '4', null, null, null);
INSERT INTO `menu` VALUES ('30', '药品库存', null, null, '4', null, null, null);
INSERT INTO `menu` VALUES ('31', '供应商', null, null, '4', null, null, null);
INSERT INTO `menu` VALUES ('32', '缺药单', null, null, '4', null, null, null);
INSERT INTO `menu` VALUES ('33', '员工工资', null, null, '5', null, null, null);
INSERT INTO `menu` VALUES ('34', '收费情况', null, null, '5', null, null, null);
INSERT INTO `menu` VALUES ('35', '支出情况', null, null, '5', null, null, null);
INSERT INTO `menu` VALUES ('36', '差旅安排', null, null, '6', null, null, null);
INSERT INTO `menu` VALUES ('37', '考勤记录', null, null, '6', null, null, null);

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operation
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operationroom
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `orderId` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单号',
  `supplierId` int(10) NOT NULL COMMENT '供应商id',
  `orderItems` int(8) DEFAULT NULL COMMENT '订货项数',
  `orderDate` varchar(0) NOT NULL COMMENT '订货日期',
  `deliveryDate` varchar(0) NOT NULL COMMENT '交货日期',
  `agent` int(20) DEFAULT NULL COMMENT '负责人',
  PRIMARY KEY (`orderId`),
  KEY `supplierId` (`supplierId`),
  KEY `agent` (`agent`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`supplierId`) REFERENCES `supplier` (`supplierId`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`agent`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

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
  `batchNumber` varchar(8) NOT NULL COMMENT '此类药品的准批号',
  `isDelete` int(1) DEFAULT NULL,
  PRIMARY KEY (`orderDetailsId`),
  KEY `orderId` (`orderId`),
  KEY `drugsId` (`drugsId`),
  CONSTRAINT `orderdetails_ibfk_1` FOREIGN KEY (`orderId`) REFERENCES `order` (`orderId`),
  CONSTRAINT `orderdetails_ibfk_2` FOREIGN KEY (`drugsId`) REFERENCES `drugs` (`drugsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('1', '翟高', '男', '2019-07-17', '23', '未婚', '程序员', '南通', '汉', '中国', '320981199703036687', '江苏省南京市软件大道3601号', '15151341625', '210000', null, '瞿国栋', '江苏省南通市', '父亲', '13524789636', null);
INSERT INTO `patient` VALUES ('2', '薛雨轩', '男', '2019-07-02', '22', '已婚', '销售员', '北京', '汉', '中国', '320981199805202451', '北京市南京路3501号', '18052895674', '100000', null, '许芳', '北京市南京路欣然居11#805', '妻子', '13745685410', null);
INSERT INTO `patient` VALUES ('3', '尚庆阳', '男', '2019-07-10', '18', '未婚', '学生', '连云港', '汉', '中国', '320981200108135417', '江苏省南京市南京晓庄学院', '15148275130', '210000', '·', '殷婷', '江苏省南通市', '母亲', '13754826521', null);
INSERT INTO `patient` VALUES ('4', '沈梦溪', '男', '2019-07-03', '28', '未婚', '宇航员', '盐城', '汉', '中国', '320981199801105711', '北京市中关村666号', '13401792750', '100000', '江苏省盐城市东台市许河镇四仓村三组82号', '沈国云', '上海市嘉定区', '母亲', '13524789636', null);
INSERT INTO `patient` VALUES ('5', '林轩', '女', '2019-07-11', '23', '未婚', '教授', '成都', '汉', '中国', '320981199805202451', '成都百兴区142号', '13869678451', null, null, '林志远', '成都三区云鹤院', '父亲', '13879632451', null);
INSERT INTO `patient` VALUES ('6', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

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
  `postNumber` int(10) NOT NULL AUTO_INCREMENT COMMENT '岗位编号',
  `postName` varchar(255) DEFAULT NULL COMMENT '岗位名称',
  `departmentId` int(11) DEFAULT NULL COMMENT '科室编号',
  `postSalary` int(11) DEFAULT NULL COMMENT '岗位工资',
  PRIMARY KEY (`postNumber`),
  KEY `departmentId` (`departmentId`),
  CONSTRAINT `position_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`departmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '院长', '1', '4000');
INSERT INTO `position` VALUES ('2', '副院长', '2', '5000');
INSERT INTO `position` VALUES ('3', '医师', '4', '3000');
INSERT INTO `position` VALUES ('4', '护士', '3', '3500');
INSERT INTO `position` VALUES ('5', '保安', '3', '3500');
INSERT INTO `position` VALUES ('6', '保洁员', '6', '4000');
INSERT INTO `position` VALUES ('7', '厨师', '5', '3000');

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
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of positionmenu
-- ----------------------------
INSERT INTO `positionmenu` VALUES ('1', '1', '1111', '1');
INSERT INTO `positionmenu` VALUES ('2', '2', '110', '2');
INSERT INTO `positionmenu` VALUES ('3', '3', '10086', '3');
INSERT INTO `positionmenu` VALUES ('4', '4', '12345', '4');
INSERT INTO `positionmenu` VALUES ('5', '5', '1314520', '5');
INSERT INTO `positionmenu` VALUES ('6', '6', '911', '6');
INSERT INTO `positionmenu` VALUES ('7', '6', '9527', '7');
INSERT INTO `positionmenu` VALUES ('1', '3', '11', '15');
INSERT INTO `positionmenu` VALUES ('1', '2', '11', '16');
INSERT INTO `positionmenu` VALUES ('1', '4', '1', '17');
INSERT INTO `positionmenu` VALUES ('1', '5', '111', '18');
INSERT INTO `positionmenu` VALUES ('1', '6', '11', '19');
INSERT INTO `positionmenu` VALUES ('2', '3', '56', '20');
INSERT INTO `positionmenu` VALUES ('1', '7', null, '21');
INSERT INTO `positionmenu` VALUES ('1', '8', null, '22');
INSERT INTO `positionmenu` VALUES ('1', '9', null, '23');
INSERT INTO `positionmenu` VALUES ('1', '10', null, '24');
INSERT INTO `positionmenu` VALUES ('2', '14', null, '25');
INSERT INTO `positionmenu` VALUES ('2', '15', null, '26');
INSERT INTO `positionmenu` VALUES ('3', '23', null, '27');
INSERT INTO `positionmenu` VALUES ('3', '24', null, '28');
INSERT INTO `positionmenu` VALUES ('2', '23', null, '29');
INSERT INTO `positionmenu` VALUES ('2', '24', null, '30');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prescription
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of registrationorder
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of supplier
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '沈浩宇', 'shy123', '女', '20190729/20190729112746_327.jpeg', '320922199706054861', '1998.04.06', '4', '0', '3', '妇科主任');
INSERT INTO `user` VALUES ('2', '张三', 'zs110', '男', '20190729/20190729112756_165.jpeg', '320922199808024568', '1988.08.08', '2', '0', '3', '医师');
INSERT INTO `user` VALUES ('3', '李四', '12345', '男', '20190729/20190729112804_977.jpeg', '320922199808027415', '1998.10.13', '2', '0', '2', '医师');
INSERT INTO `user` VALUES ('4', '王五', '123321', '男', '20190729/20190729112813_567.jpeg', '320922199808028956', '1987.12.02', '2', '0', '3', '医师');
INSERT INTO `user` VALUES ('5', '赵六', '123zzzz', '男', '20190729/20190729112824_82.jpeg', '320922199808024812', '1996.03.25', '4', '0', '1', '医师');
INSERT INTO `user` VALUES ('6', '白菜', '123zzzz', '男', '20190729/20190729112834_946.jpeg', '320922199808026547', '1976.01.03', '3', '0', '4', '医师');
INSERT INTO `user` VALUES ('7', '王芳', '123', '女', '20190729/20190729112849_909.jpg', '320922199808026254', '1999.09.09', '5', '0', '2', '医师');
INSERT INTO `user` VALUES ('8', '薛武', 'xw123', '男', '20190729/20190729112901_76.jpeg', '320922199808021680', '1998.07.08', '3', '0', '1', '医师');
INSERT INTO `user` VALUES ('9', '黄瓜', '123', '女', '20190729/20190729112911_343.jpeg', '320922199808021463', '2002.02.03', '4', '0', '8', '医师');
INSERT INTO `user` VALUES ('12', '瞿高明', '123', '男', '20190729/20190729112920_588.jpeg', '320922199808024926', '1999.11.11', '6', '0', '6', '产科主任');
INSERT INTO `user` VALUES ('13', '涂元卉', '123', '男', '20190729/20190729112931_503.jpeg', '320922199808024815', '1997.10.05', '3', '0', '3', '主治医师');
INSERT INTO `user` VALUES ('14', 'root', 'root', '男', '20190729/20190729112939_893.jpg', '320922199808024561', '1998.05.30', '1', '0', '1', '院长');
INSERT INTO `user` VALUES ('28', 'zhou', '12345', '女', '20190729/20190729112947_680.jpeg', '320922199808044712', '2019-07-18', '4', '0', '1', '护士');
INSERT INTO `user` VALUES ('29', 'weiwei', '123456', '女', '20190729/20190729112957_264.jpg', '320922199808044712', '2019-07-26', '5', '0', '2', '护士');
INSERT INTO `user` VALUES ('30', '李刚', '369369', '女', '20190729/20190729151032_512.jpeg', '320922199808044712', '2019-07-19', '7', '0', null, null);
INSERT INTO `user` VALUES ('31', 'qhm', '123456', '男', '20190729/20190729174023_501.jpeg', '320922199808044712', '2019-07-18', '1', '0', null, null);
INSERT INTO `user` VALUES ('32', '111', '11111', '男', '20190729/20190729174023_501.jpeg', '320922199808044712', '2019-07-02', '1', '0', null, null);

-- ----------------------------
-- Table structure for `worktime`
-- ----------------------------
DROP TABLE IF EXISTS `worktime`;
CREATE TABLE `worktime` (
  `workTime` varchar(20) DEFAULT NULL,
  `departmentId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  KEY `departmentId` (`departmentId`),
  KEY `userId` (`userId`),
  CONSTRAINT `workTime_ibfk_1` FOREIGN KEY (`departmentId`) REFERENCES `department` (`departmentId`),
  CONSTRAINT `workTime_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worktime
-- ----------------------------
