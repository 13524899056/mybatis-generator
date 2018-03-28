package com.jwaoo.community.mapper;

import com.jwaoo.community.model.Favorites;
import com.jwaoo.community.model.FavoritesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FavoritesMapper {
    long countByExample(FavoritesExample example);

    int deleteByExample(FavoritesExample example);

    int insert(Favorites record);

    int insertSelective(Favorites record);

    List<Favorites> selectByExampleWithBLOBsWithRowbounds(FavoritesExample example, RowBounds rowBounds);

    List<Favorites> selectByExampleWithBLOBs(FavoritesExample example);

    List<Favorites> selectByExampleWithRowbounds(FavoritesExample example, RowBounds rowBounds);

    List<Favorites> selectByExample(FavoritesExample example);

    int updateByExampleSelective(@Param("record") Favorites record, @Param("example") FavoritesExample example);

    int updateByExampleWithBLOBs(@Param("record") Favorites record, @Param("example") FavoritesExample example);

    int updateByExample(@Param("record") Favorites record, @Param("example") FavoritesExample example);
}