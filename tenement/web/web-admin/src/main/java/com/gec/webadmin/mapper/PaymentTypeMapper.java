package com.gec.webadmin.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import com.gec.model.entity.PaymentType;

/**
 * 支付方式表(PaymentType)表数据库访问层
 *
 * @author makejava
 * @since 2025-01-16 16:58:53
 */
public interface PaymentTypeMapper extends BaseMapper<PaymentType> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<PaymentType> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<PaymentType> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<PaymentType> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<PaymentType> entities);

}

