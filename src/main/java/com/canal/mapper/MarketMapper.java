package com.canal.mapper;

import com.canal.po.Market;
import com.canal.po.MarketExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MarketMapper {
    int countByExample(MarketExample example);

    int deleteByExample(MarketExample example);

    int deleteByPrimaryKey(Integer petId);

    int insert(Market record);

    int insertSelective(Market record);

    List<Market> selectByExample(MarketExample example);

    Market selectByPrimaryKey(Integer petId);

    int updateByExampleSelective(@Param("record") Market record, @Param("example") MarketExample example);

    int updateByExample(@Param("record") Market record, @Param("example") MarketExample example);

    int updateByPrimaryKeySelective(Market record);

    int updateByPrimaryKey(Market record);
}