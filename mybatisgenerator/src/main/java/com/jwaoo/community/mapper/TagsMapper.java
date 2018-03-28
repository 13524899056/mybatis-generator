package com.jwaoo.community.mapper;

import com.jwaoo.community.model.Tags;
import com.jwaoo.community.model.TagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TagsMapper {
    long countByExample(TagsExample example);

    int deleteByExample(TagsExample example);

    int insert(Tags record);

    int insertSelective(Tags record);

    List<Tags> selectByExampleWithRowbounds(TagsExample example, RowBounds rowBounds);

    List<Tags> selectByExample(TagsExample example);

    int updateByExampleSelective(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByExample(@Param("record") Tags record, @Param("example") TagsExample example);
}