package org.freefly.simplesugarmark.mapper;

import org.apache.ibatis.annotations.Param;
import org.freefly.simplesugarmark.bean.SugarMark;
import org.freefly.simplesugarmark.common.PageVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISugarMarkDao {

    /**
     * 创建糖记录
     * @param list
     * @return 创建条数
     */
    int createMarks(List<SugarMark> list);

    /**
     * 更新糖记录
     * @param list
     * @return
     */
    int updateMarks(List<SugarMark> list);

    /**
     * 删除糖记录
     * 此操作一般不做，保留接口
     * @param id
     * @return
     */
    int deleteMarks(int id);

    /**
     * 查询糖记录，并可根据条件查找记录
     * @param var
     * @return
     */
    List<SugarMark> getMarks(@Param("var") SugarMark var, @Param("page")PageVO page);

    int getMarksCount(@Param("var") SugarMark var);
}
