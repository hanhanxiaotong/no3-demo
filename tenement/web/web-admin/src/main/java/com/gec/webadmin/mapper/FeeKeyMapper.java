package com.gec.webadmin.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gec.model.entity.FeeKey;
import com.gec.model.vo.FeeKeyVo;
import org.apache.ibatis.annotations.Param;


/**
 * 杂项费用名称表(FeeKey)表数据库访问层
 *
 * @author makejava
 * @since 2025-01-17 19:04:10
 */
public interface FeeKeyMapper extends BaseMapper<FeeKey> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<FeeKey> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FeeKey> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<FeeKey> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<FeeKey> entities);

    List<FeeKeyVo> listfeeinfo();

}

