## 超市收银管理系统

> JavaSE阶段项目

## 一、 系统模块架构图

![收银管理系统](https://gitee.com/ShaoxiongDu/imageBed/raw/master/%E6%94%B6%E9%93%B6%E7%AE%A1%E7%90%86%E7%B3%BB%E7%BB%9F.png)

## 二、实体属性表

### 收银员 Cashier

| 属性名称    | 类型   | 备注     |
| ----------- | ------ | -------- |
| id          | String | 收银员ID |
| account     | String | 账号     |
| password    | String | 密码     |
| name        | String | 姓名     |
| sex         | char   | 性别     |
| age         | int    | 年龄     |
| address     | String | 家庭地址 |
| phoneNumber | String | 手机号   |

### 产品 Product

| 属性名称 | 类型   | 备注       |
| -------- | ------ | ---------- |
| id       | String | 产品编号   |
| name     | String | 产品名称   |
| price    | double | 价格       |
| typeId   | String | 所属类别ID |

#### 商品类别type

| 属性名称 | 类型   | 备注         |
| -------- | ------ | ------------ |
| id       | String | 产品类别编号 |
| name     | String | 产品类别名称 |

### 订单 order

| 属性名称   | 类型                 | 备注                                   |
| ---------- | -------------------- | -------------------------------------- |
| id         | String               | 订单号                                 |
| cashierId  | String               | 收银员ID                               |
| product    | Map<productId,count> | 产品列表 map中key为产品ID，value为数量 |
| totalPrice | double               | 总价                                   |
| date       | DateTime             | 收银日期                               |

### 日志 Log

| 属性名称    | 类型     | 备注                        |
| ----------- | -------- | --------------------------- |
| id          | String   | 日志编号                    |
| title       | String   | 日志概要                    |
| description | String   | 日志详情                    |
| datetime    | DateTime | 记录时间                    |
| success     | boolean  | 是否成功                    |
| logType     | int      | 对应各种类型的日志 方便管理 |





