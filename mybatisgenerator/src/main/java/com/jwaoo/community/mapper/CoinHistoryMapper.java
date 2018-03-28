package com.jwaoo.community.mapper;

import com.jwaoo.community.model.CoinHistory;
import com.jwaoo.community.model.CoinHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CoinHistoryMapper {
    long countByExample(CoinHistoryExample example);

    int deleteByExample(CoinHistoryExample example);

    int insert(CoinHistory record);

    int insertSelective(CoinHistory record);

    List<CoinHistory> selectByExampleWithRowbounds(CoinHistoryExample example, RowBounds rowBounds);

    List<CoinHistory> selectByExample(CoinHistoryExample example);

    int updateByExampleSelective(@Param("record") CoinHistory record, @Param("example") CoinHistoryExample example);

    int updateByExample(@Param("record") CoinHistory record, @Param("example") CoinHistoryExample example);
}