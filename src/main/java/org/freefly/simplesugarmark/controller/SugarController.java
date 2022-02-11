package org.freefly.simplesugarmark.controller;

import org.freefly.simplesugarmark.bean.SugarMark;
import org.freefly.simplesugarmark.common.PageVO;
import org.freefly.simplesugarmark.common.ResponseVO;
import org.freefly.simplesugarmark.common.ResultVO;
import org.freefly.simplesugarmark.services.ISugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
//@RequestMapping("/sugar")
public class SugarController {

    @Autowired
    private ISugarService sugarService;

    @GetMapping("/sugar/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping("/getmarks/{curPage}/{pageSize}")
    public ResponseVO getMarks(@PathVariable("curPage") int curPage, @PathVariable("pageSize") int pageSize) {
        System.out.println("do getMarks...");

        PageVO pageVO = new PageVO(curPage,pageSize);
        ResultVO resultVO = sugarService.getMarks(null,pageVO);

        System.out.println(resultVO);

        return ResponseVO.success("ok",resultVO);
    }

    @PostMapping("/getMarksByPost/{curPage}/{pageSize}")
    public ResponseVO getMarksByPost(@PathVariable("curPage") int curPage, @PathVariable("pageSize") int pageSize, @RequestBody SugarMark form) {
        System.out.println("do getMarksByPost...");
        System.out.println(form);

        PageVO pageVO = new PageVO(curPage,pageSize);
        ResultVO resultVO = sugarService.getMarks(form,pageVO);

        System.out.println(resultVO);

        return ResponseVO.success("ok",resultVO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseVO delete(@PathVariable("id") int id) {
        try {
            if(sugarService.deleteMarks(id) > 0) {
                return ResponseVO.success("success");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseVO.error("fail");
    }

    @PutMapping("/update")
    public ResponseVO updateMark(@RequestBody SugarMark vo) {
        List<SugarMark> list = new ArrayList<>();
        vo.setUDate(new Date());
        list.add(vo);
        if(sugarService.updateMarks(list) > 0) {
            return ResponseVO.success("success");
        }
        return ResponseVO.error("fail");
    }

    @PostMapping("/add")
    public ResponseVO createMarks(@RequestBody SugarMark vo) {
        List<SugarMark> list = new ArrayList<>();
        if(vo.getcDate() == null) {
            vo.setCDate(new Date());
        }
        vo.setUDate(new Date());
        list.add(vo);
        if(sugarService.createMarks(list) > 0) {
            return ResponseVO.success("success");
        }
        return ResponseVO.error("fail");
    }

}
