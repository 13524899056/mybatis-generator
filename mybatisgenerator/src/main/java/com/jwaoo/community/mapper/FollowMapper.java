package com.jwaoo.community.mapper;

import com.jwaoo.community.model.Follow;
import com.jwaoo.community.model.FollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FollowMapper {
    long countByExample(FollowExample example);

    int deleteByExample(FollowExample example);

    int insert(Follow record);

    int insertSelective(Follow record);

    List<Follow> selectByExampleWithRowbounds(FollowExample example, RowBounds rowBounds);

    List<Follow> selectByExample(FollowExample example);

    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);
}