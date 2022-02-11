package org.freefly.simplesugarmark.services.Impl;

import org.freefly.simplesugarmark.bean.SugarMark;
import org.freefly.simplesugarmark.common.PageVO;
import org.freefly.simplesugarmark.common.ResultVO;
import org.freefly.simplesugarmark.mapper.ISugarMarkDao;
import org.freefly.simplesugarmark.services.ISugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SugarService implements ISugarService {

    @Autowired
    private ISugarMarkDao dao;

    @Override
    public int createMarks(List<SugarMark> list) {
        return dao.createMarks(list);
    }

    @Override
    public int updateMarks(List<SugarMark> list) {
        return dao.updateMarks(list);
    }

    @Override
    public int deleteMarks(int id) {
        return dao.deleteMarks(id);
    }

    @Override
    public ResultVO getMarks(SugarMark var, PageVO page) {
        ResultVO resultVO = new ResultVO();
        List<SugarMark> list = dao.getMarks(var,page);
        resultVO.setList(list);
        resultVO.setTotal(dao.getMarksCount(var));

        return resultVO;
    }
}
