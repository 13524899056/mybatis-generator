package com.jwaoo.community.mapper;

import com.jwaoo.community.model.Comment;
import com.jwaoo.community.model.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CommentMapper {
    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBsWithRowbounds(CommentExample example, RowBounds rowBounds);

    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    List<Comment> selectByExampleWithRowbounds(CommentExample example, RowBounds rowBounds);

    List<Comment> selectByExample(CommentExample example);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);
}